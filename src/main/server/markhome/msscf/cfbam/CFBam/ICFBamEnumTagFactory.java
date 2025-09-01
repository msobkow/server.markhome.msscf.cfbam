
// Description: Java 11 Factory interface for EnumTag.

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
 *	CFBamEnumTagFactory interface for EnumTag
 */
public interface ICFBamEnumTagFactory
{

	/**
	 *	Allocate a primary key for EnumTag instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamEnumTagPKey newPKey();

	/**
	 *	Allocate a primary history key for EnumTag instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamEnumTagHPKey newHPKey();

	/**
	 *	Allocate a EnumTagTenantIdx key over EnumTag instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamEnumTagByEnumTagTenantIdxKey newEnumTagTenantIdxKey();

	/**
	 *	Allocate a EnumIdx key over EnumTag instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamEnumTagByEnumIdxKey newEnumIdxKey();

	/**
	 *	Allocate a DefSchemaIdx key over EnumTag instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamEnumTagByDefSchemaIdxKey newDefSchemaIdxKey();

	/**
	 *	Allocate a EnumNameIdx key over EnumTag instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamEnumTagByEnumNameIdxKey newEnumNameIdxKey();

	/**
	 *	Allocate a PrevIdx key over EnumTag instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamEnumTagByPrevIdxKey newPrevIdxKey();

	/**
	 *	Allocate a NextIdx key over EnumTag instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamEnumTagByNextIdxKey newNextIdxKey();

	/**
	 *	Allocate a EnumTag instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamEnumTagBuff newBuff();

	/**
	 *	Allocate a EnumTag history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamEnumTagHBuff newHBuff();

}
