package org.ow2.mindEd.ide.core;


/**
 * Constant identifying the job family identifier for a background JOB.
 */
public class FamilyJobCST {
	/**
	 * Constant identifying the job family identifier for the job that sets the "sourcePath" variable in the properties file.
	 */
	public static final Object FAMILY_CHANGE_PROPERTIES_VAR_SOURCEPATH = new Object();
	
	/**
	 * Constant identifying the job family identifier for job that sets the "includePath" variable in the properties file.
	 * @since 0.8
	 */
	public static final Object FAMILY_CHANGE_PROPERTIES_VAR_INCLUDEPATH = new Object();
	
	/**
	 * Constant identifying the job family identifier for all jobs.
	 */
	public static final Object FAMILY_ALL = new Object();
	
	/**
	 * Constant identifying the job family identifier for the job that sets the "targetComponent" & "binaryName" variable in the properties file.
	 */
	public static final Object FAMILY_CHANGE_PROPERTIES_VAR_COMPILATIONTARGET = new Object();

	/**
	 * Constant identifying the job family identifier for job which remove csource folder".
	 */
	public static final Object FAMILY_REMOVE_CSOURCE_FOLDER = new Object();

	/**
	 * Constant identifying the job family identifier for job which remove project".
	 */
	public static final Object FAMILY_REMOVE_PROJECT = new Object();

	/**
	 * Constant identifying the job family identifier for job which create csource folder".
	 */
	public static final Object FAMILY_CREATE_CSOURCE_FOLDER =  new Object();

	/**
	 * Constant identifying the job family identifier for job which changes the mindc location".
	 */
	public static final Object FAMILY_CHANGE_MINDC_LOCATION = new Object();

	/**
	 * Constant identifying the job family identifier for job which changes the mindc runtime location".
	 */
	public static final Object FAMILY_CHANGE_MINDC_RUNTIME_LOCATION = new Object();
	
	/**
	 * Constant identifying the job family identifier for job which save the file '.mindpath'".
	 */
	public static final Object FAMILY_SAVE_MPE = new Object();
}
