// Description: Java 11 Table Object implementation for CFBam.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBam.*;

public class CFBamMinorVersionTableObj
	implements ICFBamMinorVersionTableObj
{
	protected ICFBamSchemaObj schema;
	private Map<CFIntMinorVersionPKey, ICFIntMinorVersionObj> members;
	private Map<CFIntMinorVersionPKey, ICFIntMinorVersionObj> allMinorVersion;
	private Map< CFIntMinorVersionByTenantIdxKey,
		Map<CFIntMinorVersionPKey, ICFIntMinorVersionObj > > indexByTenantIdx;
	private Map< CFIntMinorVersionByMajorVerIdxKey,
		Map<CFIntMinorVersionPKey, ICFIntMinorVersionObj > > indexByMajorVerIdx;
	private Map< CFIntMinorVersionByNameIdxKey,
		ICFIntMinorVersionObj > indexByNameIdx;
	public static String TABLE_NAME = "MinorVersion";
	public static String TABLE_DBNAME = "mnvrdef";

	public CFBamMinorVersionTableObj() {
		schema = null;
		members = new HashMap<CFIntMinorVersionPKey, ICFIntMinorVersionObj>();
		allMinorVersion = null;
		indexByTenantIdx = null;
		indexByMajorVerIdx = null;
		indexByNameIdx = null;
	}

	public CFBamMinorVersionTableObj( ICFIntSchemaObj argSchema ) {
		schema = (ICFBamSchemaObj)argSchema;
		members = new HashMap<CFIntMinorVersionPKey, ICFIntMinorVersionObj>();
		allMinorVersion = null;
		indexByTenantIdx = null;
		indexByMajorVerIdx = null;
		indexByNameIdx = null;
	}

	public ICFIntSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFIntSchemaObj value ) {
		schema = (ICFBamSchemaObj)value;
	}

	public String getTableName() {
		return( TABLE_NAME );
	}

	public String getTableDbName() {
		return( TABLE_DBNAME );
	}

	public Class getObjQualifyingClass() {
		return( ICFBamTenantObj.class );
	}


	public void minimizeMemory() {
		allMinorVersion = null;
		indexByTenantIdx = null;
		indexByMajorVerIdx = null;
		indexByNameIdx = null;
		List<ICFIntMinorVersionObj> toForget = new LinkedList<ICFIntMinorVersionObj>();
		ICFIntMinorVersionObj cur = null;
		Iterator<ICFIntMinorVersionObj> iter = members.values().iterator();
		while( iter.hasNext() ) {
			cur = iter.next();
			toForget.add( cur );
		}
		iter = toForget.iterator();
		while( iter.hasNext() ) {
			cur = iter.next();
			cur.forget();
		}
	}
	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamMinorVersionObj.
	 */
	public ICFIntMinorVersionObj newInstance() {
		ICFIntMinorVersionObj inst = new CFBamMinorVersionObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamMinorVersionObj.
	 */
	public ICFIntMinorVersionEditObj newEditInstance( ICFIntMinorVersionObj orig ) {
		ICFIntMinorVersionEditObj edit = new CFBamMinorVersionEditObj( orig );
		return( edit );
	}

	public ICFIntMinorVersionObj realiseMinorVersion( ICFIntMinorVersionObj Obj ) {
		ICFIntMinorVersionObj obj = Obj;
		CFIntMinorVersionPKey pkey = obj.getPKey();
		ICFIntMinorVersionObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFIntMinorVersionObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				CFIntMinorVersionByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFIntMinorVersionPKey, ICFIntMinorVersionObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.remove( keepObj.getPKey() );
					if( mapTenantIdx.size() <= 0 ) {
						indexByTenantIdx.remove( keyTenantIdx );
					}
				}
			}

			if( indexByMajorVerIdx != null ) {
				CFIntMinorVersionByMajorVerIdxKey keyMajorVerIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newMajorVerIdxKey();
				keyMajorVerIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMajorVerIdx.setRequiredMajorVersionId( keepObj.getRequiredMajorVersionId() );
				Map<CFIntMinorVersionPKey, ICFIntMinorVersionObj > mapMajorVerIdx = indexByMajorVerIdx.get( keyMajorVerIdx );
				if( mapMajorVerIdx != null ) {
					mapMajorVerIdx.remove( keepObj.getPKey() );
					if( mapMajorVerIdx.size() <= 0 ) {
						indexByMajorVerIdx.remove( keyMajorVerIdx );
					}
				}
			}

			if( indexByNameIdx != null ) {
				CFIntMinorVersionByNameIdxKey keyNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredMajorVersionId( keepObj.getRequiredMajorVersionId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.remove( keyNameIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFIntMinorVersionByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFIntMinorVersionPKey, ICFIntMinorVersionObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMajorVerIdx != null ) {
				CFIntMinorVersionByMajorVerIdxKey keyMajorVerIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newMajorVerIdxKey();
				keyMajorVerIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMajorVerIdx.setRequiredMajorVersionId( keepObj.getRequiredMajorVersionId() );
				Map<CFIntMinorVersionPKey, ICFIntMinorVersionObj > mapMajorVerIdx = indexByMajorVerIdx.get( keyMajorVerIdx );
				if( mapMajorVerIdx != null ) {
					mapMajorVerIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNameIdx != null ) {
				CFIntMinorVersionByNameIdxKey keyNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredMajorVersionId( keepObj.getRequiredMajorVersionId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( allMinorVersion != null ) {
				allMinorVersion.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allMinorVersion != null ) {
				allMinorVersion.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFIntMinorVersionByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFIntMinorVersionPKey, ICFIntMinorVersionObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMajorVerIdx != null ) {
				CFIntMinorVersionByMajorVerIdxKey keyMajorVerIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newMajorVerIdxKey();
				keyMajorVerIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMajorVerIdx.setRequiredMajorVersionId( keepObj.getRequiredMajorVersionId() );
				Map<CFIntMinorVersionPKey, ICFIntMinorVersionObj > mapMajorVerIdx = indexByMajorVerIdx.get( keyMajorVerIdx );
				if( mapMajorVerIdx != null ) {
					mapMajorVerIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNameIdx != null ) {
				CFIntMinorVersionByNameIdxKey keyNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredMajorVersionId( keepObj.getRequiredMajorVersionId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public ICFIntMinorVersionObj createMinorVersion( ICFIntMinorVersionObj Obj ) {
		ICFIntMinorVersionObj obj = Obj;
		CFIntMinorVersionBuff buff = obj.getMinorVersionBuff();
		((ICFBamSchema)schema.getBackingStore()).getTableMinorVersion().createMinorVersion(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public ICFIntMinorVersionObj readMinorVersion( CFIntMinorVersionPKey pkey ) {
		return( readMinorVersion( pkey, false ) );
	}

	public ICFIntMinorVersionObj readMinorVersion( CFIntMinorVersionPKey pkey, boolean forceRead ) {
		ICFIntMinorVersionObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFIntMinorVersionBuff readBuff = ((ICFBamSchema)schema.getBackingStore()).getTableMinorVersion().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getMinorVersionTableObj().newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFIntMinorVersionObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFIntMinorVersionObj readCachedMinorVersion( CFIntMinorVersionPKey pkey ) {
		ICFIntMinorVersionObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeMinorVersion( ICFIntMinorVersionObj obj )
	{
		final String S_ProcName = "CFBamMinorVersionTableObj.reallyDeepDisposeMinorVersion() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFIntMinorVersionPKey pkey = obj.getPKey();
		ICFIntMinorVersionObj existing = readCachedMinorVersion( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFIntMinorVersionByTenantIdxKey keyTenantIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		CFIntMinorVersionByMajorVerIdxKey keyMajorVerIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newMajorVerIdxKey();
		keyMajorVerIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyMajorVerIdx.setRequiredMajorVersionId( existing.getRequiredMajorVersionId() );

		CFIntMinorVersionByNameIdxKey keyNameIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newNameIdxKey();
		keyNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyNameIdx.setRequiredMajorVersionId( existing.getRequiredMajorVersionId() );
		keyNameIdx.setRequiredName( existing.getRequiredName() );


					schema.getSchemaDefTableObj().deepDisposeSchemaDefByMinorVersionIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByTenantIdx != null ) {
			if( indexByTenantIdx.containsKey( keyTenantIdx ) ) {
				indexByTenantIdx.get( keyTenantIdx ).remove( pkey );
				if( indexByTenantIdx.get( keyTenantIdx ).size() <= 0 ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}
		}

		if( indexByMajorVerIdx != null ) {
			if( indexByMajorVerIdx.containsKey( keyMajorVerIdx ) ) {
				indexByMajorVerIdx.get( keyMajorVerIdx ).remove( pkey );
				if( indexByMajorVerIdx.get( keyMajorVerIdx ).size() <= 0 ) {
					indexByMajorVerIdx.remove( keyMajorVerIdx );
				}
			}
		}

		if( indexByNameIdx != null ) {
			indexByNameIdx.remove( keyNameIdx );
		}


	}
	public void deepDisposeMinorVersion( CFIntMinorVersionPKey pkey ) {
		ICFIntMinorVersionObj obj = readCachedMinorVersion( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFIntMinorVersionObj lockMinorVersion( CFIntMinorVersionPKey pkey ) {
		ICFIntMinorVersionObj locked = null;
		CFIntMinorVersionBuff lockBuff = ((ICFBamSchema)schema.getBackingStore()).getTableMinorVersion().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getMinorVersionTableObj().newInstance();
			locked.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFIntMinorVersionObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockMinorVersion", pkey );
		}
		return( locked );
	}

	public List<ICFIntMinorVersionObj> readAllMinorVersion() {
		return( readAllMinorVersion( false ) );
	}

	public List<ICFIntMinorVersionObj> readAllMinorVersion( boolean forceRead ) {
		final String S_ProcName = "readAllMinorVersion";
		if( ( allMinorVersion == null ) || forceRead ) {
			Map<CFIntMinorVersionPKey, ICFIntMinorVersionObj> map = new HashMap<CFIntMinorVersionPKey,ICFIntMinorVersionObj>();
			allMinorVersion = map;
			CFIntMinorVersionBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableMinorVersion().readAllDerived( schema.getAuthorization() );
			CFIntMinorVersionBuff buff;
			ICFIntMinorVersionObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newPKey() );
				obj.setBuff( buff );
				ICFIntMinorVersionObj realised = (ICFIntMinorVersionObj)obj.realise();
			}
		}
		int len = allMinorVersion.size();
		ICFIntMinorVersionObj arr[] = new ICFIntMinorVersionObj[len];
		Iterator<ICFIntMinorVersionObj> valIter = allMinorVersion.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFIntMinorVersionObj> arrayList = new ArrayList<ICFIntMinorVersionObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFIntMinorVersionObj> cmp = new Comparator<ICFIntMinorVersionObj>() {
			public int compare( ICFIntMinorVersionObj lhs, ICFIntMinorVersionObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFIntMinorVersionPKey lhsPKey = lhs.getPKey();
					CFIntMinorVersionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFIntMinorVersionObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFIntMinorVersionObj> readCachedAllMinorVersion() {
		final String S_ProcName = "readCachedAllMinorVersion";
		ArrayList<ICFIntMinorVersionObj> arrayList = new ArrayList<ICFIntMinorVersionObj>();
		if( allMinorVersion != null ) {
			int len = allMinorVersion.size();
			ICFIntMinorVersionObj arr[] = new ICFIntMinorVersionObj[len];
			Iterator<ICFIntMinorVersionObj> valIter = allMinorVersion.values().iterator();
			int idx = 0;
			while( ( idx < len ) && valIter.hasNext() ) {
				arr[idx++] = valIter.next();
			}
			if( idx < len ) {
				throw new CFLibArgumentUnderflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
			}
			else if( valIter.hasNext() ) {
				throw new CFLibArgumentOverflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
			}
			for( idx = 0; idx < len; idx ++ ) {
				arrayList.add( arr[idx] );
			}
		}
		Comparator<ICFIntMinorVersionObj> cmp = new Comparator<ICFIntMinorVersionObj>() {
			public int compare( ICFIntMinorVersionObj lhs, ICFIntMinorVersionObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFIntMinorVersionPKey lhsPKey = lhs.getPKey();
					CFIntMinorVersionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFIntMinorVersionObj readMinorVersionByIdIdx( long TenantId,
		long Id )
	{
		return( readMinorVersionByIdIdx( TenantId,
			Id,
			false ) );
	}

	public ICFIntMinorVersionObj readMinorVersionByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		CFIntMinorVersionPKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFIntMinorVersionObj obj = readMinorVersion( pkey, forceRead );
		return( obj );
	}

	public List<ICFIntMinorVersionObj> readMinorVersionByTenantIdx( long TenantId )
	{
		return( readMinorVersionByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFIntMinorVersionObj> readMinorVersionByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readMinorVersionByTenantIdx";
		CFIntMinorVersionByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFIntMinorVersionPKey, ICFIntMinorVersionObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFIntMinorVersionByTenantIdxKey,
				Map< CFIntMinorVersionPKey, ICFIntMinorVersionObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFIntMinorVersionPKey, ICFIntMinorVersionObj>();
			ICFIntMinorVersionObj obj;
			CFIntMinorVersionBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableMinorVersion().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFIntMinorVersionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getMinorVersionTableObj().newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newPKey() );
				obj.setBuff( buff );
				ICFIntMinorVersionObj realised = (ICFIntMinorVersionObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFIntMinorVersionObj arr[] = new ICFIntMinorVersionObj[len];
		Iterator<ICFIntMinorVersionObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFIntMinorVersionObj> arrayList = new ArrayList<ICFIntMinorVersionObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFIntMinorVersionObj> cmp = new Comparator<ICFIntMinorVersionObj>() {
			public int compare( ICFIntMinorVersionObj lhs, ICFIntMinorVersionObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFIntMinorVersionPKey lhsPKey = lhs.getPKey();
					CFIntMinorVersionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFIntMinorVersionObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFIntMinorVersionObj> readMinorVersionByMajorVerIdx( long TenantId,
		long MajorVersionId )
	{
		return( readMinorVersionByMajorVerIdx( TenantId,
			MajorVersionId,
			false ) );
	}

	public List<ICFIntMinorVersionObj> readMinorVersionByMajorVerIdx( long TenantId,
		long MajorVersionId,
		boolean forceRead )
	{
		final String S_ProcName = "readMinorVersionByMajorVerIdx";
		CFIntMinorVersionByMajorVerIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newMajorVerIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMajorVersionId( MajorVersionId );
		Map<CFIntMinorVersionPKey, ICFIntMinorVersionObj> dict;
		if( indexByMajorVerIdx == null ) {
			indexByMajorVerIdx = new HashMap< CFIntMinorVersionByMajorVerIdxKey,
				Map< CFIntMinorVersionPKey, ICFIntMinorVersionObj > >();
		}
		if( ( ! forceRead ) && indexByMajorVerIdx.containsKey( key ) ) {
			dict = indexByMajorVerIdx.get( key );
		}
		else {
			dict = new HashMap<CFIntMinorVersionPKey, ICFIntMinorVersionObj>();
			ICFIntMinorVersionObj obj;
			CFIntMinorVersionBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableMinorVersion().readDerivedByMajorVerIdx( schema.getAuthorization(),
				TenantId,
				MajorVersionId );
			CFIntMinorVersionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getMinorVersionTableObj().newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newPKey() );
				obj.setBuff( buff );
				ICFIntMinorVersionObj realised = (ICFIntMinorVersionObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByMajorVerIdx.put( key, dict );
		}
		int len = dict.size();
		ICFIntMinorVersionObj arr[] = new ICFIntMinorVersionObj[len];
		Iterator<ICFIntMinorVersionObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFIntMinorVersionObj> arrayList = new ArrayList<ICFIntMinorVersionObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFIntMinorVersionObj> cmp = new Comparator<ICFIntMinorVersionObj>() {
			public int compare( ICFIntMinorVersionObj lhs, ICFIntMinorVersionObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFIntMinorVersionPKey lhsPKey = lhs.getPKey();
					CFIntMinorVersionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFIntMinorVersionObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFIntMinorVersionObj readMinorVersionByNameIdx( long TenantId,
		long MajorVersionId,
		String Name )
	{
		return( readMinorVersionByNameIdx( TenantId,
			MajorVersionId,
			Name,
			false ) );
	}

	public ICFIntMinorVersionObj readMinorVersionByNameIdx( long TenantId,
		long MajorVersionId,
		String Name, boolean forceRead )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< CFIntMinorVersionByNameIdxKey,
				ICFIntMinorVersionObj >();
		}
		CFIntMinorVersionByNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMajorVersionId( MajorVersionId );
		key.setRequiredName( Name );
		ICFIntMinorVersionObj obj = null;
		if( ( ! forceRead ) && indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
		}
		else {
			CFIntMinorVersionBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableMinorVersion().readDerivedByNameIdx( schema.getAuthorization(),
				TenantId,
				MajorVersionId,
				Name );
			if( buff != null ) {
				obj = schema.getMinorVersionTableObj().newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newPKey() );
				obj.setBuff( buff );
				obj = (ICFIntMinorVersionObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFIntMinorVersionObj readCachedMinorVersionByIdIdx( long TenantId,
		long Id )
	{
		ICFIntMinorVersionObj obj = null;
		CFIntMinorVersionPKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedMinorVersion( pkey );
		return( obj );
	}

	public List<ICFIntMinorVersionObj> readCachedMinorVersionByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedMinorVersionByTenantIdx";
		CFIntMinorVersionByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFIntMinorVersionObj> arrayList = new ArrayList<ICFIntMinorVersionObj>();
		if( indexByTenantIdx != null ) {
			Map<CFIntMinorVersionPKey, ICFIntMinorVersionObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFIntMinorVersionObj arr[] = new ICFIntMinorVersionObj[len];
				Iterator<ICFIntMinorVersionObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFIntMinorVersionObj obj;
			Iterator<ICFIntMinorVersionObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFIntMinorVersionObj> cmp = new Comparator<ICFIntMinorVersionObj>() {
			public int compare( ICFIntMinorVersionObj lhs, ICFIntMinorVersionObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFIntMinorVersionPKey lhsPKey = lhs.getPKey();
					CFIntMinorVersionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFIntMinorVersionObj> readCachedMinorVersionByMajorVerIdx( long TenantId,
		long MajorVersionId )
	{
		final String S_ProcName = "readCachedMinorVersionByMajorVerIdx";
		CFIntMinorVersionByMajorVerIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newMajorVerIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMajorVersionId( MajorVersionId );
		ArrayList<ICFIntMinorVersionObj> arrayList = new ArrayList<ICFIntMinorVersionObj>();
		if( indexByMajorVerIdx != null ) {
			Map<CFIntMinorVersionPKey, ICFIntMinorVersionObj> dict;
			if( indexByMajorVerIdx.containsKey( key ) ) {
				dict = indexByMajorVerIdx.get( key );
				int len = dict.size();
				ICFIntMinorVersionObj arr[] = new ICFIntMinorVersionObj[len];
				Iterator<ICFIntMinorVersionObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFIntMinorVersionObj obj;
			Iterator<ICFIntMinorVersionObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFIntMinorVersionObj> cmp = new Comparator<ICFIntMinorVersionObj>() {
			public int compare( ICFIntMinorVersionObj lhs, ICFIntMinorVersionObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFIntMinorVersionPKey lhsPKey = lhs.getPKey();
					CFIntMinorVersionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFIntMinorVersionObj readCachedMinorVersionByNameIdx( long TenantId,
		long MajorVersionId,
		String Name )
	{
		ICFIntMinorVersionObj obj = null;
		CFIntMinorVersionByNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMajorVersionId( MajorVersionId );
		key.setRequiredName( Name );
		if( indexByNameIdx != null ) {
			if( indexByNameIdx.containsKey( key ) ) {
				obj = indexByNameIdx.get( key );
			}
			else {
				Iterator<ICFIntMinorVersionObj> valIter = members.values().iterator();
				while( ( obj == null ) && valIter.hasNext() ) {
					obj = valIter.next();
					if( obj != null ) {
						if( obj.getBuff().compareTo( key ) != 0 ) {
							obj = null;
						}
					}
				}
			}
		}
		else {
			Iterator<ICFIntMinorVersionObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) != 0 ) {
						obj = null;
					}
				}
			}
		}
		return( obj );
	}

	public void deepDisposeMinorVersionByIdIdx( long TenantId,
		long Id )
	{
		ICFIntMinorVersionObj obj = readCachedMinorVersionByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeMinorVersionByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeMinorVersionByTenantIdx";
		ICFIntMinorVersionObj obj;
		List<ICFIntMinorVersionObj> arrayList = readCachedMinorVersionByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFIntMinorVersionObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeMinorVersionByMajorVerIdx( long TenantId,
		long MajorVersionId )
	{
		final String S_ProcName = "deepDisposeMinorVersionByMajorVerIdx";
		ICFIntMinorVersionObj obj;
		List<ICFIntMinorVersionObj> arrayList = readCachedMinorVersionByMajorVerIdx( TenantId,
				MajorVersionId );
		if( arrayList != null )  {
			Iterator<ICFIntMinorVersionObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeMinorVersionByNameIdx( long TenantId,
		long MajorVersionId,
		String Name )
	{
		ICFIntMinorVersionObj obj = readCachedMinorVersionByNameIdx( TenantId,
				MajorVersionId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFIntMinorVersionObj updateMinorVersion( ICFIntMinorVersionObj Obj ) {
		ICFIntMinorVersionObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableMinorVersion().updateMinorVersion( schema.getAuthorization(),
			Obj.getMinorVersionBuff() );
		obj = (ICFIntMinorVersionObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteMinorVersion( ICFIntMinorVersionObj Obj ) {
		ICFIntMinorVersionObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableMinorVersion().deleteMinorVersion( schema.getAuthorization(),
			obj.getMinorVersionBuff() );
		Obj.forget();
	}

	public void deleteMinorVersionByIdIdx( long TenantId,
		long Id )
	{
		CFIntMinorVersionPKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFIntMinorVersionObj obj = readMinorVersion( pkey );
		if( obj != null ) {
			ICFIntMinorVersionEditObj editObj = (ICFIntMinorVersionEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFIntMinorVersionEditObj)obj.beginEdit();
				if( editObj != null ) {
					editStarted = true;
				}
				else {
					editStarted = false;
				}
			}
			else {
				editStarted = false;
			}
			if( editObj != null ) {
				editObj.deleteInstance();
				if( editStarted ) {
					editObj.endEdit();
				}
			}
			obj.forget();
		}
		deepDisposeMinorVersionByIdIdx( TenantId,
				Id );
	}

	public void deleteMinorVersionByTenantIdx( long TenantId )
	{
		CFIntMinorVersionByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFIntMinorVersionByTenantIdxKey,
				Map< CFIntMinorVersionPKey, ICFIntMinorVersionObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFIntMinorVersionPKey, ICFIntMinorVersionObj> dict = indexByTenantIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableMinorVersion().deleteMinorVersionByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFIntMinorVersionObj> iter = dict.values().iterator();
			ICFIntMinorVersionObj obj;
			List<ICFIntMinorVersionObj> toForget = new LinkedList<ICFIntMinorVersionObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTenantIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableMinorVersion().deleteMinorVersionByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeMinorVersionByTenantIdx( TenantId );
	}

	public void deleteMinorVersionByMajorVerIdx( long TenantId,
		long MajorVersionId )
	{
		CFIntMinorVersionByMajorVerIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newMajorVerIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMajorVersionId( MajorVersionId );
		if( indexByMajorVerIdx == null ) {
			indexByMajorVerIdx = new HashMap< CFIntMinorVersionByMajorVerIdxKey,
				Map< CFIntMinorVersionPKey, ICFIntMinorVersionObj > >();
		}
		if( indexByMajorVerIdx.containsKey( key ) ) {
			Map<CFIntMinorVersionPKey, ICFIntMinorVersionObj> dict = indexByMajorVerIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableMinorVersion().deleteMinorVersionByMajorVerIdx( schema.getAuthorization(),
				TenantId,
				MajorVersionId );
			Iterator<ICFIntMinorVersionObj> iter = dict.values().iterator();
			ICFIntMinorVersionObj obj;
			List<ICFIntMinorVersionObj> toForget = new LinkedList<ICFIntMinorVersionObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByMajorVerIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableMinorVersion().deleteMinorVersionByMajorVerIdx( schema.getAuthorization(),
				TenantId,
				MajorVersionId );
		}
		deepDisposeMinorVersionByMajorVerIdx( TenantId,
				MajorVersionId );
	}

	public void deleteMinorVersionByNameIdx( long TenantId,
		long MajorVersionId,
		String Name )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< CFIntMinorVersionByNameIdxKey,
				ICFIntMinorVersionObj >();
		}
		CFIntMinorVersionByNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryMinorVersion().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMajorVersionId( MajorVersionId );
		key.setRequiredName( Name );
		ICFIntMinorVersionObj obj = null;
		if( indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableMinorVersion().deleteMinorVersionByNameIdx( schema.getAuthorization(),
				TenantId,
				MajorVersionId,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableMinorVersion().deleteMinorVersionByNameIdx( schema.getAuthorization(),
				TenantId,
				MajorVersionId,
				Name );
		}
		deepDisposeMinorVersionByNameIdx( TenantId,
				MajorVersionId,
				Name );
	}
}