// Description: Java 11 Instance Edit Object interface for CFBam PopSubDep3.

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

public interface ICFBamPopSubDep3EditObj
	extends ICFBamPopSubDep3Obj,
		ICFBamPopDepEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamPopSubDep3Obj.
	 */
	ICFBamPopSubDep3Obj getOrigAsPopSubDep3();

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
	 *	Get the ICFBamPopSubDep2Obj instance referenced by the PopSubDep2 key.
	 *
	 *	@return	The ICFBamPopSubDep2Obj instance referenced by the PopSubDep2 key.
	 */
	ICFBamPopSubDep2Obj getRequiredContainerPopSubDep2();

	/**
	 *	Set the ICFBamPopSubDep2Obj instance referenced by the PopSubDep2 key.
	 *
	 *	@param	value	the ICFBamPopSubDep2Obj instance to be referenced by the PopSubDep2 key.
	 */
	void setRequiredContainerPopSubDep2( ICFBamPopSubDep2Obj value );
}
