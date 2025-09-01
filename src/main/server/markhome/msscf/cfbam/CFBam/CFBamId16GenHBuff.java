// Description: Java 11 implementation of a Id16Gen history buffer object.

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

public class CFBamId16GenHBuff
	extends CFBamInt16TypeHBuff
	implements Comparable<Object>,
		Serializable
{
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final long DISPENSERTENANTID_INIT_VALUE = 0L;
	public static final long DISPENSERID_INIT_VALUE = 0L;
	public static final short SLICE_INIT_VALUE = (short)0;
	public static final short BLOCKSIZE_INIT_VALUE = (short)1;
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	public static final long DISPENSERTENANTID_MIN_VALUE = 0L;
	public static final long DISPENSERID_MIN_VALUE = 0L;
	public static final short SLICE_MIN_VALUE = (short)0;
	public static final short BLOCKSIZE_MIN_VALUE = (short)1;
	public static final short SLICE_MAX_VALUE = (short)32767;
	public static final short BLOCKSIZE_MAX_VALUE = (short)32767;

	protected Long optionalDispenserTenantId;
	protected Long optionalDispenserId;
	protected short requiredSlice;
	protected short requiredBlockSize;
	public CFBamId16GenHBuff() {
		super();
		optionalDispenserTenantId = null;
		optionalDispenserId = null;
		requiredSlice = CFBamId16GenBuff.SLICE_INIT_VALUE;
		requiredBlockSize = CFBamId16GenBuff.BLOCKSIZE_INIT_VALUE;
	}

	public String getClassCode() {
		return( CFBamId16GenBuff.CLASS_CODE );
	}

	public Long getOptionalDispenserTenantId() {
		return( optionalDispenserTenantId );
	}

	public void setOptionalDispenserTenantId( Long value ) {
		if( value == null ) {
			optionalDispenserTenantId = null;
		}
		else if( value < CFBamId16GenBuff.DISPENSERTENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalDispenserTenantId",
				1,
				"value",
				value,
				CFBamId16GenBuff.DISPENSERTENANTID_MIN_VALUE );
		}
		else {
			optionalDispenserTenantId = value;
		}
	}

	public Long getOptionalDispenserId() {
		return( optionalDispenserId );
	}

	public void setOptionalDispenserId( Long value ) {
		if( value == null ) {
			optionalDispenserId = null;
		}
		else if( value < CFBamId16GenBuff.DISPENSERID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalDispenserId",
				1,
				"value",
				value,
				CFBamId16GenBuff.DISPENSERID_MIN_VALUE );
		}
		else {
			optionalDispenserId = value;
		}
	}

	public short getRequiredSlice() {
		return( requiredSlice );
	}

	public void setRequiredSlice( short value ) {
		if( value < CFBamId16GenBuff.SLICE_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredSlice",
				1,
				"value",
				value,
				CFBamId16GenBuff.SLICE_MIN_VALUE );
		}
		if( value > CFBamId16GenBuff.SLICE_MAX_VALUE ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredSlice",
				1,
				"value",
				value,
				CFBamId16GenBuff.SLICE_MAX_VALUE );
		}
		requiredSlice = value;
	}

	public short getRequiredBlockSize() {
		return( requiredBlockSize );
	}

	public void setRequiredBlockSize( short value ) {
		if( value < CFBamId16GenBuff.BLOCKSIZE_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredBlockSize",
				1,
				"value",
				value,
				CFBamId16GenBuff.BLOCKSIZE_MIN_VALUE );
		}
		if( value > CFBamId16GenBuff.BLOCKSIZE_MAX_VALUE ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredBlockSize",
				1,
				"value",
				value,
				CFBamId16GenBuff.BLOCKSIZE_MAX_VALUE );
		}
		requiredBlockSize = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamId16GenHBuff ) {
			CFBamId16GenHBuff rhs = (CFBamId16GenHBuff)obj;
			if( ! super.equals( obj ) ) {
				return( false );
			}
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getOptionalDispenserTenantId() != null ) {
				if( rhs.getOptionalDispenserTenantId() != null ) {
					if( ! getOptionalDispenserTenantId().equals( rhs.getOptionalDispenserTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDispenserTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalDispenserId() != null ) {
				if( rhs.getOptionalDispenserId() != null ) {
					if( ! getOptionalDispenserId().equals( rhs.getOptionalDispenserId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDispenserId() != null ) {
					return( false );
				}
			}
			if( getRequiredSlice() != rhs.getRequiredSlice() ) {
				return( false );
			}
			if( getRequiredBlockSize() != rhs.getRequiredBlockSize() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamId16GenBuff ) {
			CFBamId16GenBuff rhs = (CFBamId16GenBuff)obj;
			if( ! super.equals( obj ) ) {
				return( false );
			}
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getOptionalDispenserTenantId() != null ) {
				if( rhs.getOptionalDispenserTenantId() != null ) {
					if( ! getOptionalDispenserTenantId().equals( rhs.getOptionalDispenserTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDispenserTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalDispenserId() != null ) {
				if( rhs.getOptionalDispenserId() != null ) {
					if( ! getOptionalDispenserId().equals( rhs.getOptionalDispenserId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDispenserId() != null ) {
					return( false );
				}
			}
			if( getRequiredSlice() != rhs.getRequiredSlice() ) {
				return( false );
			}
			if( getRequiredBlockSize() != rhs.getRequiredBlockSize() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamId16GenByDispIdxKey ) {
			CFBamId16GenByDispIdxKey rhs = (CFBamId16GenByDispIdxKey)obj;
			if( getOptionalDispenserTenantId() != null ) {
				if( rhs.getOptionalDispenserTenantId() != null ) {
					if( ! getOptionalDispenserTenantId().equals( rhs.getOptionalDispenserTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDispenserTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalDispenserId() != null ) {
				if( rhs.getOptionalDispenserId() != null ) {
					if( ! getOptionalDispenserId().equals( rhs.getOptionalDispenserId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDispenserId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else {
			return( super.equals( obj ) );
		}
	}

	public int hashCode() {
		int hashCode = super.hashCode();
		if( getOptionalDispenserTenantId() != null ) {
			hashCode = hashCode + getOptionalDispenserTenantId().hashCode();
		}
		if( getOptionalDispenserId() != null ) {
			hashCode = hashCode + getOptionalDispenserId().hashCode();
		}
		hashCode = ( hashCode * 0x10000 ) + getRequiredSlice();
		hashCode = ( hashCode * 0x10000 ) + getRequiredBlockSize();
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFBamId16GenBuff ) {
			CFBamId16GenBuff rhs = (CFBamId16GenBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamId16GenByDispIdxKey ) {
			CFBamId16GenByDispIdxKey rhs = (CFBamId16GenByDispIdxKey)obj;

			if( getOptionalDispenserTenantId() != null ) {
				Long lhsDispenserTenantId = getOptionalDispenserTenantId();
				if( rhs.getOptionalDispenserTenantId() != null ) {
					Long rhsDispenserTenantId = rhs.getOptionalDispenserTenantId();
					int cmp = lhsDispenserTenantId.compareTo( rhsDispenserTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDispenserTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDispenserId() != null ) {
				Long lhsDispenserId = getOptionalDispenserId();
				if( rhs.getOptionalDispenserId() != null ) {
					Long rhsDispenserId = rhs.getOptionalDispenserId();
					int cmp = lhsDispenserId.compareTo( rhsDispenserId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDispenserId() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else if( obj instanceof CFBamId16GenHBuff ) {
			CFBamId16GenHBuff rhs = (CFBamId16GenHBuff)obj;

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
			if( getRequiredScopeId() < rhs.getRequiredScopeId() ) {
				return( -1 );
			}
			else if( getRequiredScopeId() > rhs.getRequiredScopeId() ) {
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
			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getOptionalShortName() != null ) {
				if( rhs.getOptionalShortName() != null ) {
					int cmp = getOptionalShortName().compareTo( rhs.getOptionalShortName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalShortName() != null ) {
					return( -1 );
				}
			}
			if( getOptionalLabel() != null ) {
				if( rhs.getOptionalLabel() != null ) {
					int cmp = getOptionalLabel().compareTo( rhs.getOptionalLabel() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalLabel() != null ) {
					return( -1 );
				}
			}
			if( getOptionalShortDescription() != null ) {
				if( rhs.getOptionalShortDescription() != null ) {
					int cmp = getOptionalShortDescription().compareTo( rhs.getOptionalShortDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalShortDescription() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					int cmp = getOptionalDescription().compareTo( rhs.getOptionalDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDefaultXmlValue() != null ) {
				if( rhs.getOptionalDefaultXmlValue() != null ) {
					int cmp = getOptionalDefaultXmlValue().compareTo( rhs.getOptionalDefaultXmlValue() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDefaultXmlValue() != null ) {
					return( -1 );
				}
			}
			if( getRequiredIsNullable() ) {
				if( ! rhs.getRequiredIsNullable() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredIsNullable() ) {
					return( -1 );
				}
			}
			if( getOptionalGenerateId() != null ) {
				Boolean lhsGenerateId = getOptionalGenerateId();
				if( rhs.getOptionalGenerateId() ) {
					Boolean rhsGenerateId = rhs.getOptionalGenerateId();
					if( lhsGenerateId ) {
						if( ! rhsGenerateId ) {
							return( 1 );
						}
					}
					else {
						if( rhsGenerateId ) {
							return( -1 );
						}
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalGenerateId() != null ) {
					return( -1 );
				}
			}
			if( getRequiredImplementsPolymorph() ) {
				if( ! rhs.getRequiredImplementsPolymorph() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredImplementsPolymorph() ) {
					return( -1 );
				}
			}
			if( getOptionalPrevTenantId() != null ) {
				Long lhsPrevTenantId = getOptionalPrevTenantId();
				if( rhs.getOptionalPrevTenantId() != null ) {
					Long rhsPrevTenantId = rhs.getOptionalPrevTenantId();
					int cmp = lhsPrevTenantId.compareTo( rhsPrevTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPrevTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalPrevId() != null ) {
				Long lhsPrevId = getOptionalPrevId();
				if( rhs.getOptionalPrevId() != null ) {
					Long rhsPrevId = rhs.getOptionalPrevId();
					int cmp = lhsPrevId.compareTo( rhsPrevId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPrevId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalNextTenantId() != null ) {
				Long lhsNextTenantId = getOptionalNextTenantId();
				if( rhs.getOptionalNextTenantId() != null ) {
					Long rhsNextTenantId = rhs.getOptionalNextTenantId();
					int cmp = lhsNextTenantId.compareTo( rhsNextTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalNextTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalNextId() != null ) {
				Long lhsNextId = getOptionalNextId();
				if( rhs.getOptionalNextId() != null ) {
					Long rhsNextId = rhs.getOptionalNextId();
					int cmp = lhsNextId.compareTo( rhsNextId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalNextId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDbName() != null ) {
				if( rhs.getOptionalDbName() != null ) {
					int cmp = getOptionalDbName().compareTo( rhs.getOptionalDbName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDbName() != null ) {
					return( -1 );
				}
			}
			if( getOptionalInitValue() != null ) {
				Short lhsInitValue = getOptionalInitValue();
				if( rhs.getOptionalInitValue() != null ) {
					Short rhsInitValue = rhs.getOptionalInitValue();
					int cmp = lhsInitValue.compareTo( rhsInitValue );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalInitValue() != null ) {
					return( -1 );
				}
			}
			if( getOptionalMinValue() != null ) {
				Short lhsMinValue = getOptionalMinValue();
				if( rhs.getOptionalMinValue() != null ) {
					Short rhsMinValue = rhs.getOptionalMinValue();
					int cmp = lhsMinValue.compareTo( rhsMinValue );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalMinValue() != null ) {
					return( -1 );
				}
			}
			if( getOptionalMaxValue() != null ) {
				Short lhsMaxValue = getOptionalMaxValue();
				if( rhs.getOptionalMaxValue() != null ) {
					Short rhsMaxValue = rhs.getOptionalMaxValue();
					int cmp = lhsMaxValue.compareTo( rhsMaxValue );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalMaxValue() != null ) {
					return( -1 );
				}
			}
			if( getRequiredSchemaDefId() < rhs.getRequiredSchemaDefId() ) {
				return( -1 );
			}
			else if( getRequiredSchemaDefId() > rhs.getRequiredSchemaDefId() ) {
				return( 1 );
			}
			if( getOptionalDispenserTenantId() != null ) {
				Long lhsDispenserTenantId = getOptionalDispenserTenantId();
				if( rhs.getOptionalDispenserTenantId() != null ) {
					Long rhsDispenserTenantId = rhs.getOptionalDispenserTenantId();
					int cmp = lhsDispenserTenantId.compareTo( rhsDispenserTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDispenserTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDispenserId() != null ) {
				Long lhsDispenserId = getOptionalDispenserId();
				if( rhs.getOptionalDispenserId() != null ) {
					Long rhsDispenserId = rhs.getOptionalDispenserId();
					int cmp = lhsDispenserId.compareTo( rhsDispenserId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDispenserId() != null ) {
					return( -1 );
				}
			}
			if( getRequiredSlice() < rhs.getRequiredSlice() ) {
				return( -1 );
			}
			else if( getRequiredSlice() > rhs.getRequiredSlice() ) {
				return( 1 );
			}
			if( getRequiredBlockSize() < rhs.getRequiredBlockSize() ) {
				return( -1 );
			}
			else if( getRequiredBlockSize() > rhs.getRequiredBlockSize() ) {
				return( 1 );
			}
			return( 0 );
		}
		else {
			return( super.compareTo( obj ) );
		}
	}

	public void set( CFBamValueBuff src ) {
		if( src instanceof CFBamId16GenBuff ) {
			setId16GenBuff( (CFBamId16GenBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamId16GenBuff" );
		}
	}

	public void setId16GenBuff( CFBamId16GenBuff src ) {
		super.setInt16TypeBuff( src );
		setOptionalDispenserTenantId( src.getOptionalDispenserTenantId() );
		setOptionalDispenserId( src.getOptionalDispenserId() );
		setRequiredSlice( src.getRequiredSlice() );
		setRequiredBlockSize( src.getRequiredBlockSize() );
	}

	public void set( CFBamValueHBuff src ) {
		if( src instanceof CFBamId16GenHBuff ) {
			setId16GenBuff( (CFBamId16GenHBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamId16GenHBuff" );
		}
	}

	public void setId16GenBuff( CFBamId16GenHBuff src ) {
		super.setInt16TypeBuff( src );
		setOptionalDispenserTenantId( src.getOptionalDispenserTenantId() );
		setOptionalDispenserId( src.getOptionalDispenserId() );
		setRequiredSlice( src.getRequiredSlice() );
		setRequiredBlockSize( src.getRequiredBlockSize() );
	}
}
