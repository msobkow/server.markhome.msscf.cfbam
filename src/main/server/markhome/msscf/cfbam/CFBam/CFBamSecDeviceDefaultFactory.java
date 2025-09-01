
// Description: Java 11 Default Factory implementation for SecDevice.

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
	 *	CFBamSecDeviceFactory implementation for SecDevice
	 */
public class CFBamSecDeviceDefaultFactory
	extends CFSecSecDeviceDefaultFactory
	implements ICFBamSecDeviceFactory
{
	public CFBamSecDeviceDefaultFactory() {
		super();
	}

	public CFSecSecDevicePKey newPKey() {
		CFSecSecDevicePKey pkey =
			new CFSecSecDevicePKey();
		return( pkey );
	}

	public CFSecSecDeviceHPKey newHPKey() {
		CFSecSecDeviceHPKey hpkey =
			new CFSecSecDeviceHPKey();
		return( hpkey );
	}

	public CFSecSecDeviceByNameIdxKey newNameIdxKey() {
		CFSecSecDeviceByNameIdxKey key =
			new CFSecSecDeviceByNameIdxKey();
		return( key );
	}

	public CFSecSecDeviceByUserIdxKey newUserIdxKey() {
		CFSecSecDeviceByUserIdxKey key =
			new CFSecSecDeviceByUserIdxKey();
		return( key );
	}

	public CFSecSecDeviceBuff newBuff() {
		CFSecSecDeviceBuff buff =
			new CFSecSecDeviceBuff();
		return( buff );
	}

	public CFSecSecDeviceHBuff newHBuff() {
		CFSecSecDeviceHBuff hbuff =
			new CFSecSecDeviceHBuff();
		return( hbuff );
	}
}
