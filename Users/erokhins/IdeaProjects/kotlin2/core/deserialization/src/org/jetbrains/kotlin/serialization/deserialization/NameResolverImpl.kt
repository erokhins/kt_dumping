'strings' @ [31:50] ==> private final val strings: ProtoBuf.StringTable defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl[PropertyDescriptorImpl]

'getString' @ [31:58] ==> public open fun getString(index: Int): (String..String?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.StringTable[JavaMethodDescriptor]

'index' @ [31:68] ==> value-parameter index: Int defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl.getString[ValueParameterDescriptorImpl]

'guessByFirstCharacter' @ [33:45] ==> @NotNull public open fun guessByFirstCharacter(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'strings' @ [33:67] ==> private final val strings: ProtoBuf.StringTable defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl[PropertyDescriptorImpl]

'getString' @ [33:75] ==> public open fun getString(index: Int): (String..String?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.StringTable[JavaMethodDescriptor]

'index' @ [33:85] ==> value-parameter index: Int defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl.getName[ValueParameterDescriptorImpl]

'component1' @ [36:14] ==> public final operator fun component1(): List<String> defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'component2' @ [36:37] ==> public final operator fun component2(): List<String> defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'component3' @ [36:64] ==> public final operator fun component3(): Boolean defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'traverseIds' @ [36:75] ==> private final fun traverseIds(startingIndex: Int): Triple<List<String>, List<String>, Boolean> defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl[SimpleFunctionDescriptorImpl]

'index' @ [36:87] ==> value-parameter index: Int defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl.getClassId[ValueParameterDescriptorImpl]

'ClassId' @ [37:16] ==> public constructor ClassId(@NotNull p0: FqName, @NotNull p1: FqName, p2: Boolean) defined in org.jetbrains.kotlin.name.ClassId[JavaClassConstructorDescriptor]

'fromSegments' @ [37:31] ==> @NotNull public open fun fromSegments(@NotNull p0: (MutableList<(String..String?)>..List<(String..String?)>)): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'packageFqNameSegments' @ [37:44] ==> val packageFqNameSegments: List<String> defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl.getClassId[LocalVariableDescriptor]

'fromSegments' @ [37:75] ==> @NotNull public open fun fromSegments(@NotNull p0: (MutableList<(String..String?)>..List<(String..String?)>)): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'relativeClassNameSegments' @ [37:88] ==> val relativeClassNameSegments: List<String> defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl.getClassId[LocalVariableDescriptor]

'isLocal' @ [37:116] ==> val isLocal: Boolean defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl.getClassId[LocalVariableDescriptor]

'traverseIds' @ [41:35] ==> private final fun traverseIds(startingIndex: Int): Triple<List<String>, List<String>, Boolean> defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl[SimpleFunctionDescriptorImpl]

'index' @ [41:47] ==> value-parameter index: Int defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl.getPackageFqName[ValueParameterDescriptorImpl]

'first' @ [41:54] ==> public final val first: List<String> defined in kotlin.Triple[DeserializedPropertyDescriptor]

'fromSegments' @ [42:23] ==> @NotNull public open fun fromSegments(@NotNull p0: (MutableList<(String..String?)>..List<(String..String?)>)): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'packageNameSegments' @ [42:36] ==> val packageNameSegments: List<String> defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl.getPackageFqName[LocalVariableDescriptor]

'startingIndex' @ [46:21] ==> value-parameter startingIndex: Int defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl.traverseIds[ValueParameterDescriptorImpl]

'LinkedList' @ [47:35] ==> public constructor LinkedList<E : (Any..Any?)>() defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'LinkedList' @ [48:41] ==> public constructor LinkedList<E : (Any..Any?)>() defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'index' @ [51:16] ==> var index: Int defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl.traverseIds[LocalVariableDescriptor]

'-' @ [51:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'qualifiedNames' @ [52:25] ==> private final val qualifiedNames: ProtoBuf.QualifiedNameTable defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl[PropertyDescriptorImpl]

'getQualifiedName' @ [52:40] ==> public open fun getQualifiedName(index: Int): (ProtoBuf.QualifiedNameTable.QualifiedName..ProtoBuf.QualifiedNameTable.QualifiedName?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.QualifiedNameTable[JavaMethodDescriptor]

'index' @ [52:57] ==> var index: Int defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl.traverseIds[LocalVariableDescriptor]

'strings' @ [53:29] ==> private final val strings: ProtoBuf.StringTable defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl[PropertyDescriptorImpl]

'getString' @ [53:37] ==> public open fun getString(index: Int): (String..String?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.StringTable[JavaMethodDescriptor]

'proto' @ [53:47] ==> val proto: (ProtoBuf.QualifiedNameTable.QualifiedName..ProtoBuf.QualifiedNameTable.QualifiedName?) defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl.traverseIds[LocalVariableDescriptor]

'shortName' @ [53:53] ==> public final val ProtoBuf.QualifiedNameTable.QualifiedName.shortName: Int[MyPropertyDescriptor]

'when (proto.kind!!) {
                QualifiedName.Kind.CLASS -> relativeClassNameSegments.addFirst(shortName)
                QualifiedName.Kind.PACKAGE -> packageNameSegments.addFirst(shortName)
                QualifiedName.Kind.LOCAL -> {
                    relativeClassNameSegments.addFirst(shortName)
                    local = true
                }
            }' @ [54:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'proto' @ [54:19] ==> val proto: (ProtoBuf.QualifiedNameTable.QualifiedName..ProtoBuf.QualifiedNameTable.QualifiedName?) defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl.traverseIds[LocalVariableDescriptor]

'kind' @ [54:25] ==> public final val ProtoBuf.QualifiedNameTable.QualifiedName.kind: (ProtoBuf.QualifiedNameTable.QualifiedName.Kind..ProtoBuf.QualifiedNameTable.QualifiedName.Kind?)[MyPropertyDescriptor]

'CLASS' @ [55:36] ==> enum entry CLASS defined in org.jetbrains.kotlin.serialization.ProtoBuf.QualifiedNameTable.QualifiedName.Kind[FakeCallableDescriptorForObject]

'relativeClassNameSegments' @ [55:45] ==> val relativeClassNameSegments: LinkedList<String> defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl.traverseIds[LocalVariableDescriptor]

'addFirst' @ [55:71] ==> public open fun addFirst(p0: (String..String?)): Unit defined in java.util.LinkedList[JavaMethodDescriptor]

'shortName' @ [55:80] ==> val shortName: (String..String?) defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl.traverseIds[LocalVariableDescriptor]

'PACKAGE' @ [56:36] ==> enum entry PACKAGE defined in org.jetbrains.kotlin.serialization.ProtoBuf.QualifiedNameTable.QualifiedName.Kind[FakeCallableDescriptorForObject]

'packageNameSegments' @ [56:47] ==> val packageNameSegments: LinkedList<String> defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl.traverseIds[LocalVariableDescriptor]

'addFirst' @ [56:67] ==> public open fun addFirst(p0: (String..String?)): Unit defined in java.util.LinkedList[JavaMethodDescriptor]

'shortName' @ [56:76] ==> val shortName: (String..String?) defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl.traverseIds[LocalVariableDescriptor]

'LOCAL' @ [57:36] ==> enum entry LOCAL defined in org.jetbrains.kotlin.serialization.ProtoBuf.QualifiedNameTable.QualifiedName.Kind[FakeCallableDescriptorForObject]

'relativeClassNameSegments' @ [58:21] ==> val relativeClassNameSegments: LinkedList<String> defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl.traverseIds[LocalVariableDescriptor]

'addFirst' @ [58:47] ==> public open fun addFirst(p0: (String..String?)): Unit defined in java.util.LinkedList[JavaMethodDescriptor]

'shortName' @ [58:56] ==> val shortName: (String..String?) defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl.traverseIds[LocalVariableDescriptor]

'local' @ [59:21] ==> var local: Boolean defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl.traverseIds[LocalVariableDescriptor]

'index' @ [63:13] ==> var index: Int defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl.traverseIds[LocalVariableDescriptor]

'proto' @ [63:21] ==> val proto: (ProtoBuf.QualifiedNameTable.QualifiedName..ProtoBuf.QualifiedNameTable.QualifiedName?) defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl.traverseIds[LocalVariableDescriptor]

'parentQualifiedName' @ [63:27] ==> public final val ProtoBuf.QualifiedNameTable.QualifiedName.parentQualifiedName: Int[MyPropertyDescriptor]

'Triple' @ [65:16] ==> public constructor Triple<out A, out B, out C>(first: LinkedList<String>, second: LinkedList<String>, third: Boolean) defined in kotlin.Triple[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> LinkedList<String>
    <out B> -> LinkedList<String>
    <out C> -> Boolean

'packageNameSegments' @ [65:23] ==> val packageNameSegments: LinkedList<String> defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl.traverseIds[LocalVariableDescriptor]

'relativeClassNameSegments' @ [65:44] ==> val relativeClassNameSegments: LinkedList<String> defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl.traverseIds[LocalVariableDescriptor]

'local' @ [65:71] ==> var local: Boolean defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl.traverseIds[LocalVariableDescriptor]

