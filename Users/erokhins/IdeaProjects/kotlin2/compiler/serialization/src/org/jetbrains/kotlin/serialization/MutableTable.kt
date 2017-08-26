'Suppress' @ [17:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'builder' @ [26:36] ==> public final val builder: Element defined in org.jetbrains.kotlin.serialization.TableElementWrapper[PropertyDescriptorImpl]

'build' @ [26:44] ==> public abstract fun build(): (MessageLite..MessageLite?) defined in org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder[JavaMethodDescriptor]

'toByteArray' @ [26:52] ==> public abstract fun toByteArray(): (ByteArray..ByteArray?) defined in org.jetbrains.kotlin.protobuf.MessageLite[JavaMethodDescriptor]

'hashCode' @ [27:40] ==> public open fun hashCode(p0: (ByteArray..ByteArray?)): Int defined in java.util.Arrays[JavaMethodDescriptor]

'bytes' @ [27:49] ==> private final val bytes: ByteArray defined in org.jetbrains.kotlin.serialization.TableElementWrapper[PropertyDescriptorImpl]

'hashCode' @ [29:31] ==> private final val hashCode: Int defined in org.jetbrains.kotlin.serialization.TableElementWrapper[PropertyDescriptorImpl]

'other' @ [31:40] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.serialization.TableElementWrapper.equals[ValueParameterDescriptorImpl]

'equals' @ [31:82] ==> public open fun equals(p0: (ByteArray..ByteArray?), p1: (ByteArray..ByteArray?)): Boolean defined in java.util.Arrays[JavaMethodDescriptor]

'bytes' @ [31:89] ==> private final val bytes: ByteArray defined in org.jetbrains.kotlin.serialization.TableElementWrapper[PropertyDescriptorImpl]

'other' @ [31:96] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.serialization.TableElementWrapper.equals[ValueParameterDescriptorImpl]

'bytes' @ [31:102] ==> private final val bytes: ByteArray defined in org.jetbrains.kotlin.serialization.TableElementWrapper[PropertyDescriptorImpl]

'Interner' @ [39:28] ==> public constructor Interner<T : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.Interner[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> TableElementWrapper<Element>

'interner' @ [46:13] ==> private final val interner: Interner<TableElementWrapper<Element>> defined in org.jetbrains.kotlin.serialization.MutableTable[PropertyDescriptorImpl]

'intern' @ [46:22] ==> public open fun intern(@NotNull p0: TableElementWrapper<Element>): Int defined in org.jetbrains.kotlin.utils.Interner[JavaMethodDescriptor]

'TableElementWrapper' @ [46:29] ==> public constructor TableElementWrapper<Element : GeneratedMessageLite.Builder<*, Element>>(builder: Element) defined in org.jetbrains.kotlin.serialization.TableElementWrapper[ClassConstructorDescriptorImpl]
Inferred types:
    <Element : GeneratedMessageLite.Builder<*, Element>> -> Element

'type' @ [46:49] ==> value-parameter type: Element defined in org.jetbrains.kotlin.serialization.MutableTable.get[ValueParameterDescriptorImpl]

'Suppress' @ [48:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'if (interner.isEmpty) null
            else createTableBuilder().apply {
                for (obj in interner.allInternedObjects) {
                    addElement(this, obj.builder)
                }
            }.build() as Table' @ [50:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Table?, elseBranch: Table?): Table?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Table?

'interner' @ [50:17] ==> private final val interner: Interner<TableElementWrapper<Element>> defined in org.jetbrains.kotlin.serialization.MutableTable[PropertyDescriptorImpl]

'isEmpty' @ [50:26] ==> public final val <T : (Any..Any?)> Interner<TableElementWrapper<Element>>.isEmpty: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> TableElementWrapper<Element>

'createTableBuilder' @ [51:18] ==> protected abstract fun createTableBuilder(): TableBuilder defined in org.jetbrains.kotlin.serialization.MutableTable[SimpleFunctionDescriptorImpl]

'apply' @ [51:39] ==> @InlineOnly public inline fun <T> TableBuilder.apply(block: TableBuilder.() -> Unit): TableBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TableBuilder

'interner' @ [52:29] ==> private final val interner: Interner<TableElementWrapper<Element>> defined in org.jetbrains.kotlin.serialization.MutableTable[PropertyDescriptorImpl]

'allInternedObjects' @ [52:38] ==> public final val <T : (Any..Any?)> Interner<TableElementWrapper<Element>>.allInternedObjects: (MutableList<(TableElementWrapper<Element>..TableElementWrapper<Element>?)>..List<(TableElementWrapper<Element>..TableElementWrapper<Element>?)>)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> TableElementWrapper<Element>

'addElement' @ [53:21] ==> protected abstract fun addElement(builder: TableBuilder, element: Element): Unit defined in org.jetbrains.kotlin.serialization.MutableTable[SimpleFunctionDescriptorImpl]

'this' @ [53:32] ==> <this> defined in org.jetbrains.kotlin.serialization.MutableTable.serialize.<anonymous>[ReceiverParameterDescriptorImpl]

'obj' @ [53:38] ==> val obj: (TableElementWrapper<Element>..TableElementWrapper<Element>?) defined in org.jetbrains.kotlin.serialization.MutableTable.serialize.<anonymous>[LocalVariableDescriptor]

'builder' @ [53:42] ==> public final val builder: Element defined in org.jetbrains.kotlin.serialization.TableElementWrapper[PropertyDescriptorImpl]

'build' @ [55:15] ==> public abstract fun build(): (MessageLite..MessageLite?) defined in org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder[JavaMethodDescriptor]

'MutableTable<ProtoBuf.Type.Builder, ProtoBuf.TypeTable, ProtoBuf.TypeTable.Builder>' @ [58:26] ==> public constructor MutableTable<Element : GeneratedMessageLite.Builder<*, ProtoBuf.Type.Builder>, Table : GeneratedMessageLite, TableBuilder : GeneratedMessageLite.Builder<ProtoBuf.TypeTable, ProtoBuf.TypeTable.Builder>>() defined in org.jetbrains.kotlin.serialization.MutableTable[ClassConstructorDescriptorImpl]
Inferred types:
    <Element : GeneratedMessageLite.Builder<*, Element>> -> Builder
    <Table : GeneratedMessageLite> -> TypeTable
    <TableBuilder : GeneratedMessageLite.Builder<Table, TableBuilder>> -> Builder

'newBuilder' @ [59:88] ==> public open fun newBuilder(): (ProtoBuf.TypeTable.Builder..ProtoBuf.TypeTable.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeTable[JavaMethodDescriptor]

'builder' @ [62:9] ==> value-parameter builder: ProtoBuf.TypeTable.Builder defined in org.jetbrains.kotlin.serialization.MutableTypeTable.addElement[ValueParameterDescriptorImpl]

'addType' @ [62:17] ==> public open fun addType(p0: (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?)): (ProtoBuf.TypeTable.Builder..ProtoBuf.TypeTable.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeTable.Builder[JavaMethodDescriptor]

'element' @ [62:25] ==> value-parameter element: ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.MutableTypeTable.addElement[ValueParameterDescriptorImpl]

'MutableTable<ProtoBuf.SinceKotlinInfo.Builder, ProtoBuf.SinceKotlinInfoTable, ProtoBuf.SinceKotlinInfoTable.Builder>' @ [66:37] ==> public constructor MutableTable<Element : GeneratedMessageLite.Builder<*, ProtoBuf.SinceKotlinInfo.Builder>, Table : GeneratedMessageLite, TableBuilder : GeneratedMessageLite.Builder<ProtoBuf.SinceKotlinInfoTable, ProtoBuf.SinceKotlinInfoTable.Builder>>() defined in org.jetbrains.kotlin.serialization.MutableTable[ClassConstructorDescriptorImpl]
Inferred types:
    <Element : GeneratedMessageLite.Builder<*, Element>> -> Builder
    <Table : GeneratedMessageLite> -> SinceKotlinInfoTable
    <TableBuilder : GeneratedMessageLite.Builder<Table, TableBuilder>> -> Builder

'newBuilder' @ [67:110] ==> public open fun newBuilder(): (ProtoBuf.SinceKotlinInfoTable.Builder..ProtoBuf.SinceKotlinInfoTable.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.SinceKotlinInfoTable[JavaMethodDescriptor]

'builder' @ [70:9] ==> value-parameter builder: ProtoBuf.SinceKotlinInfoTable.Builder defined in org.jetbrains.kotlin.serialization.MutableSinceKotlinInfoTable.addElement[ValueParameterDescriptorImpl]

'addInfo' @ [70:17] ==> public open fun addInfo(p0: (ProtoBuf.SinceKotlinInfo.Builder..ProtoBuf.SinceKotlinInfo.Builder?)): (ProtoBuf.SinceKotlinInfoTable.Builder..ProtoBuf.SinceKotlinInfoTable.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.SinceKotlinInfoTable.Builder[JavaMethodDescriptor]

'element' @ [70:25] ==> value-parameter element: ProtoBuf.SinceKotlinInfo.Builder defined in org.jetbrains.kotlin.serialization.MutableSinceKotlinInfoTable.addElement[ValueParameterDescriptorImpl]

