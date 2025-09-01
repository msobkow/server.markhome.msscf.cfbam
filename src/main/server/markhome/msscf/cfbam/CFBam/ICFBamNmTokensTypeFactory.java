
// Description: Java 11 Factory interface for NmTokensType.

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
 *	CFBamNmTokensTypeFactory interface for NmTokensType
 */
public interface ICFBamNmTokensTypeFactory
{

	/**
	 *	Allocate a SchemaIdx key over NmTokensType instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamNmTokensTypeBySchemaIdxKey newSchemaIdxKey();

	/**
	 *	Allocate a NmTokensType instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamNmTokensTypeBuff newBuff();

	/**
	 *	Allocate a NmTokensType history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamNmTokensTypeHBuff newHBuff();

}
