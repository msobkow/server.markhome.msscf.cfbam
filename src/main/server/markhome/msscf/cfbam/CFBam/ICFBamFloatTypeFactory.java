
// Description: Java 11 Factory interface for FloatType.

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
 *	CFBamFloatTypeFactory interface for FloatType
 */
public interface ICFBamFloatTypeFactory
{

	/**
	 *	Allocate a SchemaIdx key over FloatType instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamFloatTypeBySchemaIdxKey newSchemaIdxKey();

	/**
	 *	Allocate a FloatType instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamFloatTypeBuff newBuff();

	/**
	 *	Allocate a FloatType history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamFloatTypeHBuff newHBuff();

}
