// Description: Java 11 Instance Edit Object interface for CFBam ServerObjFunc.

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

public interface ICFBamServerObjFuncEditObj
	extends ICFBamServerObjFuncObj,
		ICFBamServerMethodEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamServerObjFuncObj.
	 */
	ICFBamServerObjFuncObj getOrigAsServerObjFunc();

	/**
	 *	Get the ICFBamTableObj instance referenced by the RetTable key.
	 *
	 *	@return	The ICFBamTableObj instance referenced by the RetTable key.
	 */
	ICFBamTableObj getOptionalLookupRetTable();

	/**
	 *	Set the ICFBamTableObj instance referenced by the RetTable key.
	 *
	 *	@param	value	the ICFBamTableObj instance to be referenced by the RetTable key.
	 */
	void setOptionalLookupRetTable( ICFBamTableObj value );
}
