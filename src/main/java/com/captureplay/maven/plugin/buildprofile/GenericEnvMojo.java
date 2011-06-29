package com.captureplay.maven.plugin.buildprofile;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;


public class GenericEnvMojo extends AbstractMojo {
	/**
	 * Directory where the resources we want to work with are found.
	 * 
	 * @parameter expression="${project.build.outputDirectory}"
	 * @required
	 */
	private String resourceDir;
	
//	/**
//	 * List of individual resources to check.
//	 * 
//	 * @parameter
//	 */
//	private Properties resources;
	
	private String env;
	
	public void execute() throws MojoExecutionException, MojoFailureException {
		FileKicker.configureForEnv(env, resourceDir);
//		
//		if (resources != null) {
//			for (String res : resources) {
//				File resFile = new File(res);
//				String dir = res.substring(0, res.lastIndexOf("/"));
//				System.out.println(dir + ":" + res);
//						
//			}
//		}
	}

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}

}
