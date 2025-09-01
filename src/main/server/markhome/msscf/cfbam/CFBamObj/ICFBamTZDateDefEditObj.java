// Description: Java 11 Instance Edit Object interface for CFBam TZDateDef.

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

public interface ICFBamTZDateDefEditObj
	extends ICFBamTZDateDefObj,
		ICFBamAtomEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamTZDateDefObj.
	 */
	ICFBamTZDateDefObj getOrigAsTZDateDef();

	/**
	 *	Get the optional String attribute Dummy.
	 *
	 *	@return	The String value of the attribute Dummy.
	 */
	String getOptionalDummy();

	/**
	 *	Set the optional String attribute Dummy.
	 *
	 *	@param	value	the String value of the attribute Dummy.
	 */
	void setOptionalDummy( String value );
}
