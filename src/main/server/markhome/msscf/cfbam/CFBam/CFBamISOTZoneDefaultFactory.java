
// Description: Java 11 Default Factory implementation for ISOTZone.

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
	 *	CFBamISOTZoneFactory implementation for ISOTZone
	 */
public class CFBamISOTZoneDefaultFactory
	extends CFSecISOTZoneDefaultFactory
	implements ICFBamISOTZoneFactory
{
	public CFBamISOTZoneDefaultFactory() {
		super();
	}

	public CFSecISOTZonePKey newPKey() {
		CFSecISOTZonePKey pkey =
			new CFSecISOTZonePKey();
		return( pkey );
	}

	public CFSecISOTZoneHPKey newHPKey() {
		CFSecISOTZoneHPKey hpkey =
			new CFSecISOTZoneHPKey();
		return( hpkey );
	}

	public CFSecISOTZoneByOffsetIdxKey newOffsetIdxKey() {
		CFSecISOTZoneByOffsetIdxKey key =
			new CFSecISOTZoneByOffsetIdxKey();
		return( key );
	}

	public CFSecISOTZoneByUTZNameIdxKey newUTZNameIdxKey() {
		CFSecISOTZoneByUTZNameIdxKey key =
			new CFSecISOTZoneByUTZNameIdxKey();
		return( key );
	}

	public CFSecISOTZoneByIso8601IdxKey newIso8601IdxKey() {
		CFSecISOTZoneByIso8601IdxKey key =
			new CFSecISOTZoneByIso8601IdxKey();
		return( key );
	}

	public CFSecISOTZoneBuff newBuff() {
		CFSecISOTZoneBuff buff =
			new CFSecISOTZoneBuff();
		return( buff );
	}

	public CFSecISOTZoneHBuff newHBuff() {
		CFSecISOTZoneHBuff hbuff =
			new CFSecISOTZoneHBuff();
		return( hbuff );
	}
}
