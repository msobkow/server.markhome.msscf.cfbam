// Description: Java 11 Instance Edit Object interface for CFBam ClearSubDep1.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBam.*;

public interface ICFBamClearSubDep1EditObj
	extends ICFBamClearSubDep1Obj,
		ICFBamClearDepEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamClearSubDep1Obj.
	 */
	ICFBamClearSubDep1Obj getOrigAsClearSubDep1();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The String value of the attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Set the required String attribute Name.
	 *
	 *	@param	value	the String value of the attribute Name.
	 */
	void setRequiredName( String value );

	/**
	 *	Get the ICFBamClearTopDepObj instance referenced by the ClearTopDep key.
	 *
	 *	@return	The ICFBamClearTopDepObj instance referenced by the ClearTopDep key.
	 */
	ICFBamClearTopDepObj getRequiredContainerClearTopDep();

	/**
	 *	Set the ICFBamClearTopDepObj instance referenced by the ClearTopDep key.
	 *
	 *	@param	value	the ICFBamClearTopDepObj instance to be referenced by the ClearTopDep key.
	 */
	void setRequiredContainerClearTopDep( ICFBamClearTopDepObj value );
}
