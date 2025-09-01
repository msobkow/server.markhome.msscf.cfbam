// Description: Java 11 Instance Edit Object interface for CFBam Int32Type.

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

public interface ICFBamInt32TypeEditObj
	extends ICFBamInt32TypeObj,
		ICFBamInt32DefEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFBamInt32TypeObj.
	 */
	ICFBamInt32TypeObj getOrigAsInt32Type();

	/**
	 *	Get the ICFBamSchemaDefObj instance referenced by the SchemaDef key.
	 *
	 *	@return	The ICFBamSchemaDefObj instance referenced by the SchemaDef key.
	 */
	ICFBamSchemaDefObj getRequiredContainerSchemaDef();

	/**
	 *	Set the ICFBamSchemaDefObj instance referenced by the SchemaDef key.
	 *
	 *	@param	value	the ICFBamSchemaDefObj instance to be referenced by the SchemaDef key.
	 */
	void setRequiredContainerSchemaDef( ICFBamSchemaDefObj value );
}
