
// Description: Java 11 Factory interface for UInt16Type.

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
 *	CFBamUInt16TypeFactory interface for UInt16Type
 */
public interface ICFBamUInt16TypeFactory
{

	/**
	 *	Allocate a SchemaIdx key over UInt16Type instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamUInt16TypeBySchemaIdxKey newSchemaIdxKey();

	/**
	 *	Allocate a UInt16Type instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamUInt16TypeBuff newBuff();

	/**
	 *	Allocate a UInt16Type history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamUInt16TypeHBuff newHBuff();

}
