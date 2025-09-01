
// Description: Java 11 Factory interface for SchemaRef.

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
 *	CFBamSchemaRefFactory interface for SchemaRef
 */
public interface ICFBamSchemaRefFactory
{

	/**
	 *	Allocate a SchemaIdx key over SchemaRef instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamSchemaRefBySchemaIdxKey newSchemaIdxKey();

	/**
	 *	Allocate a UNameIdx key over SchemaRef instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamSchemaRefByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a RefSchemaIdx key over SchemaRef instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamSchemaRefByRefSchemaIdxKey newRefSchemaIdxKey();

	/**
	 *	Allocate a PrevIdx key over SchemaRef instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamSchemaRefByPrevIdxKey newPrevIdxKey();

	/**
	 *	Allocate a NextIdx key over SchemaRef instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamSchemaRefByNextIdxKey newNextIdxKey();

	/**
	 *	Allocate a SchemaRef instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamSchemaRefBuff newBuff();

	/**
	 *	Allocate a SchemaRef history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamSchemaRefHBuff newHBuff();

}
