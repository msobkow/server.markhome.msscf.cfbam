
// Description: Java 11 Default Factory implementation for DelTopDep.

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
	 *	CFBamDelTopDepFactory implementation for DelTopDep
	 */
public class CFBamDelTopDepDefaultFactory
	implements ICFBamDelTopDepFactory
{
	public CFBamDelTopDepDefaultFactory() {
	}

	public CFBamDelTopDepByDelTopDepTblIdxKey newDelTopDepTblIdxKey() {
		CFBamDelTopDepByDelTopDepTblIdxKey key =
			new CFBamDelTopDepByDelTopDepTblIdxKey();
		return( key );
	}

	public CFBamDelTopDepByUNameIdxKey newUNameIdxKey() {
		CFBamDelTopDepByUNameIdxKey key =
			new CFBamDelTopDepByUNameIdxKey();
		return( key );
	}

	public CFBamDelTopDepByPrevIdxKey newPrevIdxKey() {
		CFBamDelTopDepByPrevIdxKey key =
			new CFBamDelTopDepByPrevIdxKey();
		return( key );
	}

	public CFBamDelTopDepByNextIdxKey newNextIdxKey() {
		CFBamDelTopDepByNextIdxKey key =
			new CFBamDelTopDepByNextIdxKey();
		return( key );
	}

	public CFBamDelTopDepBuff newBuff() {
		CFBamDelTopDepBuff buff =
			new CFBamDelTopDepBuff();
		return( buff );
	}

	public CFBamDelTopDepHBuff newHBuff() {
		CFBamDelTopDepHBuff hbuff =
			new CFBamDelTopDepHBuff();
		return( hbuff );
	}
}
