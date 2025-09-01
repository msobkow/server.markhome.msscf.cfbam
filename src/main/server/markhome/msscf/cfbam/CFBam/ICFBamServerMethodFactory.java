
// Description: Java 11 Factory interface for ServerMethod.

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
 *	CFBamServerMethodFactory interface for ServerMethod
 */
public interface ICFBamServerMethodFactory
{

	/**
	 *	Allocate a UNameIdx key over ServerMethod instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamServerMethodByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a MethTableIdx key over ServerMethod instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamServerMethodByMethTableIdxKey newMethTableIdxKey();

	/**
	 *	Allocate a DefSchemaIdx key over ServerMethod instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamServerMethodByDefSchemaIdxKey newDefSchemaIdxKey();

	/**
	 *	Allocate a ServerMethod instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamServerMethodBuff newBuff();

	/**
	 *	Allocate a ServerMethod history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamServerMethodHBuff newHBuff();

}
