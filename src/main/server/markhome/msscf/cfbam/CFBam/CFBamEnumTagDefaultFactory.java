
// Description: Java 11 Default Factory implementation for EnumTag.

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
	 *	CFBamEnumTagFactory implementation for EnumTag
	 */
public class CFBamEnumTagDefaultFactory
	implements ICFBamEnumTagFactory
{
	public CFBamEnumTagDefaultFactory() {
	}

	public CFBamEnumTagPKey newPKey() {
		CFBamEnumTagPKey pkey =
			new CFBamEnumTagPKey();
		return( pkey );
	}

	public CFBamEnumTagHPKey newHPKey() {
		CFBamEnumTagHPKey hpkey =
			new CFBamEnumTagHPKey();
		return( hpkey );
	}

	public CFBamEnumTagByEnumTagTenantIdxKey newEnumTagTenantIdxKey() {
		CFBamEnumTagByEnumTagTenantIdxKey key =
			new CFBamEnumTagByEnumTagTenantIdxKey();
		return( key );
	}

	public CFBamEnumTagByEnumIdxKey newEnumIdxKey() {
		CFBamEnumTagByEnumIdxKey key =
			new CFBamEnumTagByEnumIdxKey();
		return( key );
	}

	public CFBamEnumTagByDefSchemaIdxKey newDefSchemaIdxKey() {
		CFBamEnumTagByDefSchemaIdxKey key =
			new CFBamEnumTagByDefSchemaIdxKey();
		return( key );
	}

	public CFBamEnumTagByEnumNameIdxKey newEnumNameIdxKey() {
		CFBamEnumTagByEnumNameIdxKey key =
			new CFBamEnumTagByEnumNameIdxKey();
		return( key );
	}

	public CFBamEnumTagByPrevIdxKey newPrevIdxKey() {
		CFBamEnumTagByPrevIdxKey key =
			new CFBamEnumTagByPrevIdxKey();
		return( key );
	}

	public CFBamEnumTagByNextIdxKey newNextIdxKey() {
		CFBamEnumTagByNextIdxKey key =
			new CFBamEnumTagByNextIdxKey();
		return( key );
	}

	public CFBamEnumTagBuff newBuff() {
		CFBamEnumTagBuff buff =
			new CFBamEnumTagBuff();
		return( buff );
	}

	public CFBamEnumTagHBuff newHBuff() {
		CFBamEnumTagHBuff hbuff =
			new CFBamEnumTagHBuff();
		return( hbuff );
	}
}
