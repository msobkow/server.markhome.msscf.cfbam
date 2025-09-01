
// Description: Java 11 Factory interface for NmTokenType.

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
 *	CFBamNmTokenTypeFactory interface for NmTokenType
 */
public interface ICFBamNmTokenTypeFactory
{

	/**
	 *	Allocate a SchemaIdx key over NmTokenType instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamNmTokenTypeBySchemaIdxKey newSchemaIdxKey();

	/**
	 *	Allocate a NmTokenType instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamNmTokenTypeBuff newBuff();

	/**
	 *	Allocate a NmTokenType history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamNmTokenTypeHBuff newHBuff();

}
