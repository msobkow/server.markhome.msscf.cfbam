
// Description: Java 11 Factory interface for Table.

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
 *	CFBamTableFactory interface for Table
 */
public interface ICFBamTableFactory
{

	/**
	 *	Allocate a SchemaDefIdx key over Table instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamTableBySchemaDefIdxKey newSchemaDefIdxKey();

	/**
	 *	Allocate a DefSchemaIdx key over Table instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamTableByDefSchemaIdxKey newDefSchemaIdxKey();

	/**
	 *	Allocate a UNameIdx key over Table instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamTableByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a SchemaCdIdx key over Table instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamTableBySchemaCdIdxKey newSchemaCdIdxKey();

	/**
	 *	Allocate a PrimaryIndexIdx key over Table instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamTableByPrimaryIndexIdxKey newPrimaryIndexIdxKey();

	/**
	 *	Allocate a LookupIndexIdx key over Table instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamTableByLookupIndexIdxKey newLookupIndexIdxKey();

	/**
	 *	Allocate a AltIndexIdx key over Table instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamTableByAltIndexIdxKey newAltIndexIdxKey();

	/**
	 *	Allocate a QualTableIdx key over Table instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamTableByQualTableIdxKey newQualTableIdxKey();

	/**
	 *	Allocate a Table instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTableBuff newBuff();

	/**
	 *	Allocate a Table history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTableHBuff newHBuff();

}
