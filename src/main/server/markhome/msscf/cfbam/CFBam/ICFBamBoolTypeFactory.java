
// Description: Java 11 Factory interface for BoolType.

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
 *	CFBamBoolTypeFactory interface for BoolType
 */
public interface ICFBamBoolTypeFactory
{

	/**
	 *	Allocate a SchemaIdx key over BoolType instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamBoolTypeBySchemaIdxKey newSchemaIdxKey();

	/**
	 *	Allocate a BoolType instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamBoolTypeBuff newBuff();

	/**
	 *	Allocate a BoolType history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamBoolTypeHBuff newHBuff();

}
