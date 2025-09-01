
// Description: Java 11 Factory interface for Int64Type.

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
 *	CFBamInt64TypeFactory interface for Int64Type
 */
public interface ICFBamInt64TypeFactory
{

	/**
	 *	Allocate a SchemaIdx key over Int64Type instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamInt64TypeBySchemaIdxKey newSchemaIdxKey();

	/**
	 *	Allocate a Int64Type instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamInt64TypeBuff newBuff();

	/**
	 *	Allocate a Int64Type history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamInt64TypeHBuff newHBuff();

}
