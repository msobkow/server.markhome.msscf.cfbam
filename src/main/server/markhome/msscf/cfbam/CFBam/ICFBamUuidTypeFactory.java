
// Description: Java 11 Factory interface for UuidType.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBam;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;

/*
 *	CFBamUuidTypeFactory interface for UuidType
 */
public interface ICFBamUuidTypeFactory
{

	/**
	 *	Allocate a SchemaIdx key over UuidType instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamUuidTypeBySchemaIdxKey newSchemaIdxKey();

	/**
	 *	Allocate a UuidType instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamUuidTypeBuff newBuff();

	/**
	 *	Allocate a UuidType history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamUuidTypeHBuff newHBuff();

}
