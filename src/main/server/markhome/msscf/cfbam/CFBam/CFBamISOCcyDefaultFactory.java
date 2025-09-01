
// Description: Java 11 Default Factory implementation for ISOCcy.

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
	 *	CFBamISOCcyFactory implementation for ISOCcy
	 */
public class CFBamISOCcyDefaultFactory
	extends CFSecISOCcyDefaultFactory
	implements ICFBamISOCcyFactory
{
	public CFBamISOCcyDefaultFactory() {
		super();
	}

	public CFSecISOCcyPKey newPKey() {
		CFSecISOCcyPKey pkey =
			new CFSecISOCcyPKey();
		return( pkey );
	}

	public CFSecISOCcyHPKey newHPKey() {
		CFSecISOCcyHPKey hpkey =
			new CFSecISOCcyHPKey();
		return( hpkey );
	}

	public CFSecISOCcyByCcyCdIdxKey newCcyCdIdxKey() {
		CFSecISOCcyByCcyCdIdxKey key =
			new CFSecISOCcyByCcyCdIdxKey();
		return( key );
	}

	public CFSecISOCcyByCcyNmIdxKey newCcyNmIdxKey() {
		CFSecISOCcyByCcyNmIdxKey key =
			new CFSecISOCcyByCcyNmIdxKey();
		return( key );
	}

	public CFSecISOCcyBuff newBuff() {
		CFSecISOCcyBuff buff =
			new CFSecISOCcyBuff();
		return( buff );
	}

	public CFSecISOCcyHBuff newHBuff() {
		CFSecISOCcyHBuff hbuff =
			new CFSecISOCcyHBuff();
		return( hbuff );
	}
}
