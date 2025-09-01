
// Description: Java 11 Default Factory implementation for Table.

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
	 *	CFBamTableFactory implementation for Table
	 */
public class CFBamTableDefaultFactory
	implements ICFBamTableFactory
{
	public CFBamTableDefaultFactory() {
	}

	public CFBamTableBySchemaDefIdxKey newSchemaDefIdxKey() {
		CFBamTableBySchemaDefIdxKey key =
			new CFBamTableBySchemaDefIdxKey();
		return( key );
	}

	public CFBamTableByDefSchemaIdxKey newDefSchemaIdxKey() {
		CFBamTableByDefSchemaIdxKey key =
			new CFBamTableByDefSchemaIdxKey();
		return( key );
	}

	public CFBamTableByUNameIdxKey newUNameIdxKey() {
		CFBamTableByUNameIdxKey key =
			new CFBamTableByUNameIdxKey();
		return( key );
	}

	public CFBamTableBySchemaCdIdxKey newSchemaCdIdxKey() {
		CFBamTableBySchemaCdIdxKey key =
			new CFBamTableBySchemaCdIdxKey();
		return( key );
	}

	public CFBamTableByPrimaryIndexIdxKey newPrimaryIndexIdxKey() {
		CFBamTableByPrimaryIndexIdxKey key =
			new CFBamTableByPrimaryIndexIdxKey();
		return( key );
	}

	public CFBamTableByLookupIndexIdxKey newLookupIndexIdxKey() {
		CFBamTableByLookupIndexIdxKey key =
			new CFBamTableByLookupIndexIdxKey();
		return( key );
	}

	public CFBamTableByAltIndexIdxKey newAltIndexIdxKey() {
		CFBamTableByAltIndexIdxKey key =
			new CFBamTableByAltIndexIdxKey();
		return( key );
	}

	public CFBamTableByQualTableIdxKey newQualTableIdxKey() {
		CFBamTableByQualTableIdxKey key =
			new CFBamTableByQualTableIdxKey();
		return( key );
	}

	public CFBamTableBuff newBuff() {
		CFBamTableBuff buff =
			new CFBamTableBuff();
		return( buff );
	}

	public CFBamTableHBuff newHBuff() {
		CFBamTableHBuff hbuff =
			new CFBamTableHBuff();
		return( hbuff );
	}
}
