// Description: Java 11 Instance Edit Object interface for CFBam DelSubDep1.

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

public interface ICFBamDelSubDep1EditObj
	extends ICFBamDelSubDep1Obj,
		ICFBamDelDepEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamDelSubDep1Obj.
	 */
	ICFBamDelSubDep1Obj getOrigAsDelSubDep1();

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
	 *	Get the ICFBamDelTopDepObj instance referenced by the DelTopDep key.
	 *
	 *	@return	The ICFBamDelTopDepObj instance referenced by the DelTopDep key.
	 */
	ICFBamDelTopDepObj getRequiredContainerDelTopDep();

	/**
	 *	Set the ICFBamDelTopDepObj instance referenced by the DelTopDep key.
	 *
	 *	@param	value	the ICFBamDelTopDepObj instance to be referenced by the DelTopDep key.
	 */
	void setRequiredContainerDelTopDep( ICFBamDelTopDepObj value );
}
