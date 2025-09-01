
// Description: Java 11 Factory interface for Int16Type.

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
 *	CFBamInt16TypeFactory interface for Int16Type
 */
public interface ICFBamInt16TypeFactory
{

	/**
	 *	Allocate a SchemaIdx key over Int16Type instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamInt16TypeBySchemaIdxKey newSchemaIdxKey();

	/**
	 *	Allocate a Int16Type instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamInt16TypeBuff newBuff();

	/**
	 *	Allocate a Int16Type history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamInt16TypeHBuff newHBuff();

}
