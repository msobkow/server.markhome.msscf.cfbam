
// Description: Java 11 Default Factory implementation for Value.

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
	 *	CFBamValueFactory implementation for Value
	 */
public class CFBamValueDefaultFactory
	implements ICFBamValueFactory
{
	public CFBamValueDefaultFactory() {
	}

	public CFBamValuePKey newPKey() {
		CFBamValuePKey pkey =
			new CFBamValuePKey();
		return( pkey );
	}

	public CFBamValueHPKey newHPKey() {
		CFBamValueHPKey hpkey =
			new CFBamValueHPKey();
		return( hpkey );
	}

	public CFBamValueByUNameIdxKey newUNameIdxKey() {
		CFBamValueByUNameIdxKey key =
			new CFBamValueByUNameIdxKey();
		return( key );
	}

	public CFBamValueByValTentIdxKey newValTentIdxKey() {
		CFBamValueByValTentIdxKey key =
			new CFBamValueByValTentIdxKey();
		return( key );
	}

	public CFBamValueByScopeIdxKey newScopeIdxKey() {
		CFBamValueByScopeIdxKey key =
			new CFBamValueByScopeIdxKey();
		return( key );
	}

	public CFBamValueByDefSchemaIdxKey newDefSchemaIdxKey() {
		CFBamValueByDefSchemaIdxKey key =
			new CFBamValueByDefSchemaIdxKey();
		return( key );
	}

	public CFBamValueByPrevIdxKey newPrevIdxKey() {
		CFBamValueByPrevIdxKey key =
			new CFBamValueByPrevIdxKey();
		return( key );
	}

	public CFBamValueByNextIdxKey newNextIdxKey() {
		CFBamValueByNextIdxKey key =
			new CFBamValueByNextIdxKey();
		return( key );
	}

	public CFBamValueByContPrevIdxKey newContPrevIdxKey() {
		CFBamValueByContPrevIdxKey key =
			new CFBamValueByContPrevIdxKey();
		return( key );
	}

	public CFBamValueByContNextIdxKey newContNextIdxKey() {
		CFBamValueByContNextIdxKey key =
			new CFBamValueByContNextIdxKey();
		return( key );
	}

	public CFBamValueBuff newBuff() {
		CFBamValueBuff buff =
			new CFBamValueBuff();
		return( buff );
	}

	public CFBamValueHBuff newHBuff() {
		CFBamValueHBuff hbuff =
			new CFBamValueHBuff();
		return( hbuff );
	}
}
