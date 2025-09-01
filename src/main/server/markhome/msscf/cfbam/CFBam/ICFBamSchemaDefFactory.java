
// Description: Java 11 Factory interface for SchemaDef.

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
 *	CFBamSchemaDefFactory interface for SchemaDef
 */
public interface ICFBamSchemaDefFactory
{

	/**
	 *	Allocate a CTenantIdx key over SchemaDef instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamSchemaDefByCTenantIdxKey newCTenantIdxKey();

	/**
	 *	Allocate a MinorVersionIdx key over SchemaDef instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamSchemaDefByMinorVersionIdxKey newMinorVersionIdxKey();

	/**
	 *	Allocate a UNameIdx key over SchemaDef instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamSchemaDefByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a AuthEMailIdx key over SchemaDef instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamSchemaDefByAuthEMailIdxKey newAuthEMailIdxKey();

	/**
	 *	Allocate a ProjectURLIdx key over SchemaDef instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamSchemaDefByProjectURLIdxKey newProjectURLIdxKey();

	/**
	 *	Allocate a PubURIIdx key over SchemaDef instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamSchemaDefByPubURIIdxKey newPubURIIdxKey();

	/**
	 *	Allocate a SchemaDef instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamSchemaDefBuff newBuff();

	/**
	 *	Allocate a SchemaDef history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamSchemaDefHBuff newHBuff();

}
