
// Description: Java 11 Factory interface for Chain.

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
 *	CFBamChainFactory interface for Chain
 */
public interface ICFBamChainFactory
{

	/**
	 *	Allocate a primary key for Chain instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamChainPKey newPKey();

	/**
	 *	Allocate a primary history key for Chain instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamChainHPKey newHPKey();

	/**
	 *	Allocate a TenantIdx key over Chain instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamChainByTenantIdxKey newTenantIdxKey();

	/**
	 *	Allocate a ChainTableIdx key over Chain instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamChainByChainTableIdxKey newChainTableIdxKey();

	/**
	 *	Allocate a DefSchemaIdx key over Chain instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamChainByDefSchemaIdxKey newDefSchemaIdxKey();

	/**
	 *	Allocate a UNameIdx key over Chain instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamChainByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a PrevRelIdx key over Chain instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamChainByPrevRelIdxKey newPrevRelIdxKey();

	/**
	 *	Allocate a NextRelIdx key over Chain instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamChainByNextRelIdxKey newNextRelIdxKey();

	/**
	 *	Allocate a Chain instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamChainBuff newBuff();

	/**
	 *	Allocate a Chain history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamChainHBuff newHBuff();

}
