
// Description: Java 11 Factory interface for DoubleType.

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
 *	CFBamDoubleTypeFactory interface for DoubleType
 */
public interface ICFBamDoubleTypeFactory
{

	/**
	 *	Allocate a SchemaIdx key over DoubleType instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamDoubleTypeBySchemaIdxKey newSchemaIdxKey();

	/**
	 *	Allocate a DoubleType instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamDoubleTypeBuff newBuff();

	/**
	 *	Allocate a DoubleType history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamDoubleTypeHBuff newHBuff();

}
