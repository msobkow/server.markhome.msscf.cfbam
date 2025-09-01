
// Description: Java 11 Default Factory implementation for URLProtocol.

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
	 *	CFBamURLProtocolFactory implementation for URLProtocol
	 */
public class CFBamURLProtocolDefaultFactory
	extends CFIntURLProtocolDefaultFactory
	implements ICFBamURLProtocolFactory
{
	public CFBamURLProtocolDefaultFactory() {
		super();
	}

	public CFIntURLProtocolPKey newPKey() {
		CFIntURLProtocolPKey pkey =
			new CFIntURLProtocolPKey();
		return( pkey );
	}

	public CFIntURLProtocolHPKey newHPKey() {
		CFIntURLProtocolHPKey hpkey =
			new CFIntURLProtocolHPKey();
		return( hpkey );
	}

	public CFIntURLProtocolByUNameIdxKey newUNameIdxKey() {
		CFIntURLProtocolByUNameIdxKey key =
			new CFIntURLProtocolByUNameIdxKey();
		return( key );
	}

	public CFIntURLProtocolByIsSecureIdxKey newIsSecureIdxKey() {
		CFIntURLProtocolByIsSecureIdxKey key =
			new CFIntURLProtocolByIsSecureIdxKey();
		return( key );
	}

	public CFIntURLProtocolBuff newBuff() {
		CFIntURLProtocolBuff buff =
			new CFIntURLProtocolBuff();
		return( buff );
	}

	public CFIntURLProtocolHBuff newHBuff() {
		CFIntURLProtocolHBuff hbuff =
			new CFIntURLProtocolHBuff();
		return( hbuff );
	}
}
