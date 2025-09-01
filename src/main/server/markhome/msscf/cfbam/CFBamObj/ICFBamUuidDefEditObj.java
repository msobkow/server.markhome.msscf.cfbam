// Description: Java 11 Instance Edit Object interface for CFBam UuidDef.

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

public interface ICFBamUuidDefEditObj
	extends ICFBamUuidDefObj,
		ICFBamAtomEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamUuidDefObj.
	 */
	ICFBamUuidDefObj getOrigAsUuidDef();

	/**
	 *	Get the optional UUID attribute InitValue.
	 *
	 *	@return	The UUID value of the attribute InitValue.
	 */
	UUID getOptionalInitValue();

	/**
	 *	Set the optional UUID attribute InitValue.
	 *
	 *	@param	value	the UUID value of the attribute InitValue.
	 */
	void setOptionalInitValue( UUID value );
}
