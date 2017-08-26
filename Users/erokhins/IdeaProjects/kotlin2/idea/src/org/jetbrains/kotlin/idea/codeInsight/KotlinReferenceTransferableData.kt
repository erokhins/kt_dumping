'KotlinReferenceData' @ [30:32] ==> public companion object defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData[FakeCallableDescriptorForObject]

'dataFlavor' @ [30:52] ==> public final val dataFlavor: DataFlavor? defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData.Companion[PropertyDescriptorImpl]

'data' @ [32:37] ==> public final val data: Array<KotlinReferenceData> defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceTransferableData[PropertyDescriptorImpl]

'size' @ [32:42] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'index' @ [35:17] ==> value-parameter index: Int defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceTransferableData.getOffsets[ValueParameterDescriptorImpl]

'data' @ [36:19] ==> public final val data: Array<KotlinReferenceData> defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceTransferableData[PropertyDescriptorImpl]

'offsets' @ [37:13] ==> value-parameter offsets: IntArray defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceTransferableData.getOffsets[ValueParameterDescriptorImpl]

'i' @ [37:21] ==> var i: Int defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceTransferableData.getOffsets[LocalVariableDescriptor]

'd' @ [37:28] ==> val d: KotlinReferenceData defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceTransferableData.getOffsets[LocalVariableDescriptor]

'startOffset' @ [37:30] ==> public final var startOffset: Int defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData[PropertyDescriptorImpl]

'offsets' @ [38:13] ==> value-parameter offsets: IntArray defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceTransferableData.getOffsets[ValueParameterDescriptorImpl]

'i' @ [38:21] ==> var i: Int defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceTransferableData.getOffsets[LocalVariableDescriptor]

'd' @ [38:28] ==> val d: KotlinReferenceData defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceTransferableData.getOffsets[LocalVariableDescriptor]

'endOffset' @ [38:30] ==> public final var endOffset: Int defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData[PropertyDescriptorImpl]

'i' @ [40:16] ==> var i: Int defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceTransferableData.getOffsets[LocalVariableDescriptor]

'index' @ [44:17] ==> value-parameter index: Int defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceTransferableData.setOffsets[ValueParameterDescriptorImpl]

'data' @ [45:19] ==> public final val data: Array<KotlinReferenceData> defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceTransferableData[PropertyDescriptorImpl]

'd' @ [46:13] ==> val d: KotlinReferenceData defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceTransferableData.setOffsets[LocalVariableDescriptor]

'startOffset' @ [46:15] ==> public final var startOffset: Int defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData[PropertyDescriptorImpl]

'offsets' @ [46:29] ==> value-parameter offsets: IntArray defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceTransferableData.setOffsets[ValueParameterDescriptorImpl]

'i' @ [46:37] ==> var i: Int defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceTransferableData.setOffsets[LocalVariableDescriptor]

'd' @ [47:13] ==> val d: KotlinReferenceData defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceTransferableData.setOffsets[LocalVariableDescriptor]

'endOffset' @ [47:15] ==> public final var endOffset: Int defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData[PropertyDescriptorImpl]

'offsets' @ [47:27] ==> value-parameter offsets: IntArray defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceTransferableData.setOffsets[ValueParameterDescriptorImpl]

'i' @ [47:35] ==> var i: Int defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceTransferableData.setOffsets[LocalVariableDescriptor]

'i' @ [49:16] ==> var i: Int defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceTransferableData.setOffsets[LocalVariableDescriptor]

'KotlinReferenceTransferableData' @ [52:35] ==> public constructor KotlinReferenceTransferableData(data: Array<KotlinReferenceData>) defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceTransferableData[ClassConstructorDescriptorImpl]

'Array' @ [52:67] ==> public constructor Array<T>(size: Int, init: (Int) -> KotlinReferenceData) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> KotlinReferenceData

'data' @ [52:73] ==> public final val data: Array<KotlinReferenceData> defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceTransferableData[PropertyDescriptorImpl]

'size' @ [52:78] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'data' @ [52:87] ==> public final val data: Array<KotlinReferenceData> defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceTransferableData[PropertyDescriptorImpl]

'it' @ [52:92] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceTransferableData.clone.<anonymous>[ValueParameterDescriptorImpl]

'clone' @ [52:96] ==> public open fun clone(): KotlinReferenceData defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData[SimpleFunctionDescriptorImpl]

'when (descriptor.getImportableDescriptor()) {
                    is ClassDescriptor ->
                        KotlinReferenceData.Kind.CLASS

                    is PackageViewDescriptor ->
                        KotlinReferenceData.Kind.PACKAGE

                    is FunctionDescriptor ->
                        if (descriptor.isExtension) KotlinReferenceData.Kind.EXTENSION_FUNCTION else KotlinReferenceData.Kind.NON_EXTENSION_CALLABLE

                    is PropertyDescriptor ->
                        if (descriptor.isExtension) KotlinReferenceData.Kind.EXTENSION_PROPERTY else KotlinReferenceData.Kind.NON_EXTENSION_CALLABLE

                    else ->
                        null
                }' @ [71:24] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinReferenceData.Kind?, entry1: KotlinReferenceData.Kind?, entry2: KotlinReferenceData.Kind?, entry3: KotlinReferenceData.Kind?, entry4: KotlinReferenceData.Kind?): KotlinReferenceData.Kind?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Kind?

'descriptor' @ [71:30] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData.Kind.Companion.fromDescriptor[ValueParameterDescriptorImpl]

'getImportableDescriptor' @ [71:41] ==> public fun DeclarationDescriptor.getImportableDescriptor(): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'KotlinReferenceData' @ [73:25] ==> public companion object defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData[FakeCallableDescriptorForObject]

'CLASS' @ [73:50] ==> enum entry CLASS defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData.Kind[FakeCallableDescriptorForObject]

'KotlinReferenceData' @ [76:25] ==> public companion object defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData[FakeCallableDescriptorForObject]

'PACKAGE' @ [76:50] ==> enum entry PACKAGE defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData.Kind[FakeCallableDescriptorForObject]

'if (descriptor.isExtension) KotlinReferenceData.Kind.EXTENSION_FUNCTION else KotlinReferenceData.Kind.NON_EXTENSION_CALLABLE' @ [79:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinReferenceData.Kind, elseBranch: KotlinReferenceData.Kind): KotlinReferenceData.Kind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Kind

'descriptor' @ [79:29] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData.Kind.Companion.fromDescriptor[ValueParameterDescriptorImpl]

'isExtension' @ [79:40] ==> public val DeclarationDescriptor.isExtension: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'KotlinReferenceData' @ [79:53] ==> public companion object defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData[FakeCallableDescriptorForObject]

'EXTENSION_FUNCTION' @ [79:78] ==> enum entry EXTENSION_FUNCTION defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData.Kind[FakeCallableDescriptorForObject]

'KotlinReferenceData' @ [79:102] ==> public companion object defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData[FakeCallableDescriptorForObject]

'NON_EXTENSION_CALLABLE' @ [79:127] ==> enum entry NON_EXTENSION_CALLABLE defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData.Kind[FakeCallableDescriptorForObject]

'if (descriptor.isExtension) KotlinReferenceData.Kind.EXTENSION_PROPERTY else KotlinReferenceData.Kind.NON_EXTENSION_CALLABLE' @ [82:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinReferenceData.Kind, elseBranch: KotlinReferenceData.Kind): KotlinReferenceData.Kind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Kind

'descriptor' @ [82:29] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData.Kind.Companion.fromDescriptor[ValueParameterDescriptorImpl]

'isExtension' @ [82:40] ==> public val DeclarationDescriptor.isExtension: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'KotlinReferenceData' @ [82:53] ==> public companion object defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData[FakeCallableDescriptorForObject]

'EXTENSION_PROPERTY' @ [82:78] ==> enum entry EXTENSION_PROPERTY defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData.Kind[FakeCallableDescriptorForObject]

'KotlinReferenceData' @ [82:102] ==> public companion object defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData[FakeCallableDescriptorForObject]

'NON_EXTENSION_CALLABLE' @ [82:127] ==> enum entry NON_EXTENSION_CALLABLE defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData.Kind[FakeCallableDescriptorForObject]

'super' @ [93:20] ==> <this> defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData[LazyClassReceiverParameterDescriptor]

'clone' @ [93:26] ==> protected open fun clone(): Any defined in kotlin.Cloneable[SimpleFunctionDescriptorImpl]

'RuntimeException' @ [96:19] ==> public final fun <init>(): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'lazy' @ [101:40] ==> public fun <T> lazy(initializer: () -> DataFlavor?): Lazy<DataFlavor?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DataFlavor?

'KotlinReferenceData' @ [103:33] ==> public companion object defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData[FakeCallableDescriptorForObject]

'java' @ [103:60] ==> public val <T> KClass<KotlinReferenceData>.java: Class<KotlinReferenceData> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinReferenceData

'DataFlavor' @ [104:17] ==> public constructor DataFlavor(p0: (String..String?), p1: (String..String?), p2: (ClassLoader..ClassLoader?)) defined in java.awt.datatransfer.DataFlavor[JavaClassConstructorDescriptor]

'+' @ [104:28] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'javaJVMLocalObjectMimeType' @ [104:39] ==> public const final val javaJVMLocalObjectMimeType: String defined in java.awt.datatransfer.DataFlavor[JavaPropertyDescriptor]

'dataClass' @ [104:80] ==> val dataClass: Class<KotlinReferenceData> defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData.Companion.dataFlavor.<anonymous>[LocalVariableDescriptor]

'name' @ [104:90] ==> public final val <T : (Any..Any?)> Class<KotlinReferenceData>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinReferenceData

'dataClass' @ [106:28] ==> val dataClass: Class<KotlinReferenceData> defined in org.jetbrains.kotlin.idea.codeInsight.KotlinReferenceData.Companion.dataFlavor.<anonymous>[LocalVariableDescriptor]

'classLoader' @ [106:38] ==> public final val <T : (Any..Any?)> Class<KotlinReferenceData>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinReferenceData

