
// Description: Java 11 Factory interface for Int32Type.

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
 *	CFBamInt32TypeFactory interface for Int32Type
 */
public interface ICFBamInt32TypeFactory
{

	/**
	 *	Allocate a SchemaIdx key over Int32Type instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamInt32TypeBySchemaIdxKey newSchemaIdxKey();

	/**
	 *	Allocate a Int32Type instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamInt32TypeBuff newBuff();

	/**
	 *	Allocate a Int32Type history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamInt32TypeHBuff newHBuff();

}
