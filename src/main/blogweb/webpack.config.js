const path = require('path');
const HtmlWebpackPlugin = require('html-webpack-plugin'); // 通过 npm 安装
const MiniCssExtractPlugin = require('mini-css-extract-plugin');// 通过 npm 安装
//const ExtractTextPlugin = require('extract-text-webpack-plugin');// 通过 npm 安装
const { CleanWebpackPlugin } = require('clean-webpack-plugin');// 通过 npm 安装
const VueLoaderPlugin=require("vue-loader/lib/plugin");// 通过 npm 安装

var config = {
	entry: { 
		main: './src/js/main.js' 
	},
	output: { 
		path: path.resolve(__dirname, '../resources/static/Vblog/dist'),
		publicPath: '../',
		filename: 'js/[name].bundle.js' 
	},
	mode:'none',
	module:{
		rules:[
			{ 
				test: /\.vue$/, 
				use:[
					{loader: 'vue-loader'}
				]				
			},
			{ 
				test: /\.js$/, 
				loader: 'babel-loader',
				exclude: /node_ modules/ 
			},
			{ 	
				test: /\.css$/, 
				use:[
					{
						loader: MiniCssExtractPlugin.loader,
						options: {
							publicPath: '../',							
						},
					},				
					{
						loader: 'css-loader',											
					},
					{
						loader: 'postcss-loader',								
					}							
				]
			},
			{ 
				test: /\.(jpg|jpeg|png|gif|svg)$/,
		        use:  [
					/*{
					    loader: 'file-loader',
					    options: {
							outputPath : 'img',
							name: '[name].[ext]',
						},
				    },*/
		           {
		             loader: 'url-loader',
		             options: {
		               name: '[name].[ext]',
		               limit: 1024, //当大小大于1024时候使用 file-loader(默认),小于则使用base64
					   outputPath : 'img',
		             }
		           },
				   
		        ]
				
			}		 
		]						
	},
	plugins: [
	    new HtmlWebpackPlugin({ 
			template:path.join(__dirname, './src/html/main.html'),
	        filename:'./html/mian.html',
	        chunks:['main'],
	        inject:true,
	    }),
		new MiniCssExtractPlugin({
			filename: 'css/[name].bundle.css',
		}),	
		new CleanWebpackPlugin(),//实例化，参数为目录
		new VueLoaderPlugin(),
    ]
}; 
module.exports = config;

