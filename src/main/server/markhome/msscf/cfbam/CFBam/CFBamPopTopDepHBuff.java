// Description: Java 11 implementation of a PopTopDep history buffer object.

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
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;

public class CFBamPopTopDepHBuff
	extends CFBamPopDepHBuff
	implements Comparable<Object>,
		Serializable
{
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final long CONTRELATIONTENANTID_INIT_VALUE = 0L;
	public static final long CONTRELATIONID_INIT_VALUE = 0L;
	public static final String NAME_INIT_VALUE = new String( "" );
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	public static final long CONTRELATIONTENANTID_MIN_VALUE = 0L;
	public static final long CONTRELATIONID_MIN_VALUE = 0L;

	protected long requiredContRelationTenantId;
	protected long requiredContRelationId;
	protected String requiredName;
	public CFBamPopTopDepHBuff() {
		super();
		requiredContRelationTenantId = CFBamPopTopDepBuff.CONTRELATIONTENANTID_INIT_VALUE;
		requiredContRelationId = CFBamPopTopDepBuff.CONTRELATIONID_INIT_VALUE;
		requiredName = new String( CFBamPopTopDepBuff.NAME_INIT_VALUE );
	}

	public String getClassCode() {
		return( CFBamPopTopDepBuff.CLASS_CODE );
	}

	public long getRequiredContRelationTenantId() {
		return( requiredContRelationTenantId );
	}

	public void setRequiredContRelationTenantId( long value ) {
		if( value < CFBamPopTopDepBuff.CONTRELATIONTENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredContRelationTenantId",
				1,
				"value",
				value,
				CFBamPopTopDepBuff.CONTRELATIONTENANTID_MIN_VALUE );
		}
		requiredContRelationTenantId = value;
	}

	public long getRequiredContRelationId() {
		return( requiredContRelationId );
	}

	public void setRequiredContRelationId( long value ) {
		if( value < CFBamPopTopDepBuff.CONTRELATIONID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredContRelationId",
				1,
				"value",
				value,
				CFBamPopTopDepBuff.CONTRELATIONID_MIN_VALUE );
		}
		requiredContRelationId = value;
	}

	public String getRequiredName() {
		return( requiredName );
	}

	public void setRequiredName( String value ) {
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"setRequiredName",
				1,
				"value" );
		}
		if( value.length() > 192 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredName",
				1,
				"value.length()",
				value.length(),
				192 );
		}
		requiredName = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamPopTopDepHBuff ) {
			CFBamPopTopDepHBuff rhs = (CFBamPopTopDepHBuff)obj;
			if( ! super.equals( obj ) ) {
				return( false );
			}
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredContRelationTenantId() != rhs.getRequiredContRelationTenantId() ) {
				return( false );
			}
			if( getRequiredContRelationId() != rhs.getRequiredContRelationId() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamPopTopDepBuff ) {
			CFBamPopTopDepBuff rhs = (CFBamPopTopDepBuff)obj;
			if( ! super.equals( obj ) ) {
				return( false );
			}
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredContRelationTenantId() != rhs.getRequiredContRelationTenantId() ) {
				return( false );
			}
			if( getRequiredContRelationId() != rhs.getRequiredContRelationId() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamPopTopDepByContRelIdxKey ) {
			CFBamPopTopDepByContRelIdxKey rhs = (CFBamPopTopDepByContRelIdxKey)obj;
			if( getRequiredContRelationTenantId() != rhs.getRequiredContRelationTenantId() ) {
				return( false );
			}
			if( getRequiredContRelationId() != rhs.getRequiredContRelationId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamPopTopDepByUNameIdxKey ) {
			CFBamPopTopDepByUNameIdxKey rhs = (CFBamPopTopDepByUNameIdxKey)obj;
			if( getRequiredContRelationTenantId() != rhs.getRequiredContRelationTenantId() ) {
				return( false );
			}
			if( getRequiredContRelationId() != rhs.getRequiredContRelationId() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else {
			return( super.equals( obj ) );
		}
	}

	public int hashCode() {
		int hashCode = super.hashCode();
		hashCode = hashCode + (int)( getRequiredContRelationTenantId() );
		hashCode = hashCode + (int)( getRequiredContRelationId() );
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFBamPopTopDepBuff ) {
			CFBamPopTopDepBuff rhs = (CFBamPopTopDepBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamPopTopDepByContRelIdxKey ) {
			CFBamPopTopDepByContRelIdxKey rhs = (CFBamPopTopDepByContRelIdxKey)obj;

			if( getRequiredContRelationTenantId() < rhs.getRequiredContRelationTenantId() ) {
				return( -1 );
			}
			else if( getRequiredContRelationTenantId() > rhs.getRequiredContRelationTenantId() ) {
				return( 1 );
			}
			if( getRequiredContRelationId() < rhs.getRequiredContRelationId() ) {
				return( -1 );
			}
			else if( getRequiredContRelationId() > rhs.getRequiredContRelationId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof CFBamPopTopDepByUNameIdxKey ) {
			CFBamPopTopDepByUNameIdxKey rhs = (CFBamPopTopDepByUNameIdxKey)obj;

			if( getRequiredContRelationTenantId() < rhs.getRequiredContRelationTenantId() ) {
				return( -1 );
			}
			else if( getRequiredContRelationTenantId() > rhs.getRequiredContRelationTenantId() ) {
				return( 1 );
			}
			if( getRequiredContRelationId() < rhs.getRequiredContRelationId() ) {
				return( -1 );
			}
			else if( getRequiredContRelationId() > rhs.getRequiredContRelationId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}			return( 0 );
		}
		else if( obj instanceof CFBamPopTopDepHBuff ) {
			CFBamPopTopDepHBuff rhs = (CFBamPopTopDepHBuff)obj;

			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			{
				long lhsAuditClusterId = getAuditClusterId();
				long rhsAuditClusterId = rhs.getAuditClusterId();
				if( lhsAuditClusterId < rhsAuditClusterId ) {
					return( -1 );
				}
				else if( lhsAuditClusterId > rhsAuditClusterId ) {
					return( 1 );
				}
			}
			{
				Calendar lhsAuditStamp = getAuditStamp();
				Calendar rhsAuditStamp = rhs.getAuditStamp();
				if( lhsAuditStamp == null ) {
					if( rhsAuditStamp != null ) {
						return( -1 );
					}
				}
				else if( rhsAuditStamp == null ) {
					return( 1 );
				}
				else {
					int cmpstat = lhsAuditStamp.compareTo( rhsAuditStamp );
					if( cmpstat != 0 ) {
						return( cmpstat );
					}
				}
			}
			{
				short lhsAuditActionId = getAuditActionId();
				short rhsAuditActionId = rhs.getAuditActionId();
				if( lhsAuditActionId < rhsAuditActionId ) {
					return( -1 );
				}
				else if( lhsAuditActionId > rhsAuditActionId ) {
					return( 1 );
				}
			}
			{
				int lhsRequiredRevision = getRequiredRevision();
				int rhsRequiredRevision = rhs.getRequiredRevision();
				if( lhsRequiredRevision < rhsRequiredRevision ) {
					return( -1 );
				}
				else if( lhsRequiredRevision > rhsRequiredRevision ) {
					return( 1 );
				}
			}
			{
				UUID lhsAuditSessionId = getAuditSessionId();
				UUID rhsAuditSessionId = rhs.getAuditSessionId();
				if( lhsAuditSessionId == null ) {
					if( rhsAuditSessionId != null ) {
						return( -1 );
					}
				}
				else if( rhsAuditSessionId == null ) {
					return( 1 );
				}
				else {
					int cmpstat = lhsAuditSessionId.compareTo( rhsAuditSessionId );
					if( cmpstat != 0 ) {
						return( cmpstat );
					}
				}
			}
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredId() < rhs.getRequiredId() ) {
				return( -1 );
			}
			else if( getRequiredId() > rhs.getRequiredId() ) {
				return( 1 );
			}
			if( getOptionalDefSchemaTenantId() != null ) {
				Long lhsDefSchemaTenantId = getOptionalDefSchemaTenantId();
				if( rhs.getOptionalDefSchemaTenantId() != null ) {
					Long rhsDefSchemaTenantId = rhs.getOptionalDefSchemaTenantId();
					int cmp = lhsDefSchemaTenantId.compareTo( rhsDefSchemaTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDefSchemaId() != null ) {
				Long lhsDefSchemaId = getOptionalDefSchemaId();
				if( rhs.getOptionalDefSchemaId() != null ) {
					Long rhsDefSchemaId = rhs.getOptionalDefSchemaId();
					int cmp = lhsDefSchemaId.compareTo( rhsDefSchemaId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDefSchemaId() != null ) {
					return( -1 );
				}
			}
			if( getRequiredRelationTenantId() < rhs.getRequiredRelationTenantId() ) {
				return( -1 );
			}
			else if( getRequiredRelationTenantId() > rhs.getRequiredRelationTenantId() ) {
				return( 1 );
			}
			if( getRequiredRelationId() < rhs.getRequiredRelationId() ) {
				return( -1 );
			}
			else if( getRequiredRelationId() > rhs.getRequiredRelationId() ) {
				return( 1 );
			}
			if( getRequiredContRelationTenantId() < rhs.getRequiredContRelationTenantId() ) {
				return( -1 );
			}
			else if( getRequiredContRelationTenantId() > rhs.getRequiredContRelationTenantId() ) {
				return( 1 );
			}
			if( getRequiredContRelationId() < rhs.getRequiredContRelationId() ) {
				return( -1 );
			}
			else if( getRequiredContRelationId() > rhs.getRequiredContRelationId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else {
			return( super.compareTo( obj ) );
		}
	}

	public void set( CFBamScopeBuff src ) {
		if( src instanceof CFBamPopTopDepBuff ) {
			setPopTopDepBuff( (CFBamPopTopDepBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamPopTopDepBuff" );
		}
	}

	public void setPopTopDepBuff( CFBamPopTopDepBuff src ) {
		super.setPopDepBuff( src );
		setRequiredContRelationTenantId( src.getRequiredContRelationTenantId() );
		setRequiredContRelationId( src.getRequiredContRelationId() );
		setRequiredName( src.getRequiredName() );
	}

	public void set( CFBamScopeHBuff src ) {
		if( src instanceof CFBamPopTopDepHBuff ) {
			setPopTopDepBuff( (CFBamPopTopDepHBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamPopTopDepHBuff" );
		}
	}

	public void setPopTopDepBuff( CFBamPopTopDepHBuff src ) {
		super.setPopDepBuff( src );
		setRequiredContRelationTenantId( src.getRequiredContRelationTenantId() );
		setRequiredContRelationId( src.getRequiredContRelationId() );
		setRequiredName( src.getRequiredName() );
	}
}
