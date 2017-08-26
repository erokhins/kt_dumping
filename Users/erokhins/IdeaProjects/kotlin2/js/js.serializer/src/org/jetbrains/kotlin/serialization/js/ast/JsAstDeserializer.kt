'JsRootScope' @ [33:25] ==> public constructor JsRootScope(p0: (JsProgram..JsProgram?)) defined in org.jetbrains.kotlin.js.backend.ast.JsRootScope[JavaClassConstructorDescriptor]

'program' @ [33:37] ==> value-parameter program: JsProgram defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.<init>[ValueParameterDescriptorImpl]

'mutableListOf' @ [34:31] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'mutableListOf' @ [35:29] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<JsAstProtoBuf.Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'mutableListOf' @ [36:29] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<JsName?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName?

'ArrayDeque' @ [37:44] ==> public constructor ArrayDeque<E : (Any..Any?)>() defined in java.util.ArrayDeque[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'deserialize' @ [40:16] ==> public final fun deserialize(proto: JsAstProtoBuf.Chunk): JsProgramFragment defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'parseFrom' @ [40:34] ==> public open fun parseFrom(input: (CodedInputStream..CodedInputStream?)): (JsAstProtoBuf.Chunk..JsAstProtoBuf.Chunk?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Chunk[JavaMethodDescriptor]

'newInstance' @ [40:61] ==> public open fun newInstance(p0: (InputStream..InputStream?)): (CodedInputStream..CodedInputStream?) defined in org.jetbrains.kotlin.protobuf.CodedInputStream[JavaMethodDescriptor]

'input' @ [40:73] ==> value-parameter input: InputStream defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'apply' @ [40:80] ==> @InlineOnly public inline fun <T> (CodedInputStream..CodedInputStream?).apply(block: (CodedInputStream..CodedInputStream?).() -> Unit): (CodedInputStream..CodedInputStream?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.protobuf.CodedInputStream..org.jetbrains.kotlin.protobuf.CodedInputStream?)

'setRecursionLimit' @ [40:88] ==> public open fun setRecursionLimit(p0: Int): Int defined in org.jetbrains.kotlin.protobuf.CodedInputStream[JavaMethodDescriptor]

'stringTable' @ [44:9] ==> private final val stringTable: MutableList<String> defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[PropertyDescriptorImpl]

'proto' @ [44:24] ==> value-parameter proto: JsAstProtoBuf.Chunk defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'stringTable' @ [44:30] ==> public final val JsAstProtoBuf.Chunk.stringTable: (JsAstProtoBuf.StringTable..JsAstProtoBuf.StringTable?)[MyPropertyDescriptor]

'entryList' @ [44:42] ==> public final val JsAstProtoBuf.StringTable.entryList: (ProtocolStringList..ProtocolStringList?)[MyPropertyDescriptor]

'nameTable' @ [45:9] ==> private final val nameTable: MutableList<JsAstProtoBuf.Name> defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[PropertyDescriptorImpl]

'proto' @ [45:22] ==> value-parameter proto: JsAstProtoBuf.Chunk defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'nameTable' @ [45:28] ==> public final val JsAstProtoBuf.Chunk.nameTable: (JsAstProtoBuf.NameTable..JsAstProtoBuf.NameTable?)[MyPropertyDescriptor]

'entryList' @ [45:38] ==> public final val JsAstProtoBuf.NameTable.entryList: (MutableList<(JsAstProtoBuf.Name..JsAstProtoBuf.Name?)>..List<(JsAstProtoBuf.Name..JsAstProtoBuf.Name?)>?)[MyPropertyDescriptor]

'nameCache' @ [46:9] ==> private final val nameCache: MutableList<JsName?> defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[PropertyDescriptorImpl]

'nameTable' @ [46:22] ==> private final val nameTable: MutableList<JsAstProtoBuf.Name> defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[PropertyDescriptorImpl]

'map' @ [46:32] ==> public inline fun <T, R> Iterable<JsAstProtoBuf.Name>.map(transform: (JsAstProtoBuf.Name) -> Nothing?): List<Nothing?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name
    <R> -> Nothing?

'deserialize' @ [48:20] ==> private final fun deserialize(proto: JsAstProtoBuf.Fragment): JsProgramFragment defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [48:32] ==> value-parameter proto: JsAstProtoBuf.Chunk defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'fragment' @ [48:38] ==> public final val JsAstProtoBuf.Chunk.fragment: (JsAstProtoBuf.Fragment..JsAstProtoBuf.Fragment?)[MyPropertyDescriptor]

'stringTable' @ [51:13] ==> private final val stringTable: MutableList<String> defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[PropertyDescriptorImpl]

'clear' @ [51:25] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'nameTable' @ [52:13] ==> private final val nameTable: MutableList<JsAstProtoBuf.Name> defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[PropertyDescriptorImpl]

'clear' @ [52:23] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'nameCache' @ [53:13] ==> private final val nameCache: MutableList<JsName?> defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[PropertyDescriptorImpl]

'clear' @ [53:23] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'JsProgramFragment' @ [58:24] ==> public constructor JsProgramFragment(@NotNull p0: JsScope) defined in org.jetbrains.kotlin.js.backend.ast.JsProgramFragment[JavaClassConstructorDescriptor]

'scope' @ [58:42] ==> private final val scope: JsRootScope defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[PropertyDescriptorImpl]

'fragment' @ [60:9] ==> val fragment: JsProgramFragment defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[LocalVariableDescriptor]

'importedModules' @ [60:18] ==> public final val JsProgramFragment.importedModules: (MutableList<(JsImportedModule..JsImportedModule?)>..List<(JsImportedModule..JsImportedModule?)>)[MyPropertyDescriptor]

'proto' @ [60:37] ==> value-parameter proto: JsAstProtoBuf.Fragment defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'importedModuleList' @ [60:43] ==> public final val JsAstProtoBuf.Fragment.importedModuleList: (MutableList<(JsAstProtoBuf.ImportedModule..JsAstProtoBuf.ImportedModule?)>..List<(JsAstProtoBuf.ImportedModule..JsAstProtoBuf.ImportedModule?)>?)[MyPropertyDescriptor]

'map' @ [60:62] ==> public inline fun <T, R> Iterable<(JsAstProtoBuf.ImportedModule..JsAstProtoBuf.ImportedModule?)>.map(transform: ((JsAstProtoBuf.ImportedModule..JsAstProtoBuf.ImportedModule?)) -> JsImportedModule): List<JsImportedModule> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.ImportedModule..org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.ImportedModule?)
    <R> -> JsImportedModule

'JsImportedModule' @ [61:14] ==> public constructor JsImportedModule(externalName: String, internalName: JsName, plainReference: JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsImportedModule[DeserializedClassConstructorDescriptor]

'deserializeString' @ [62:21] ==> private final fun deserializeString(id: Int): String defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'importedModuleProto' @ [62:39] ==> value-parameter importedModuleProto: (JsAstProtoBuf.ImportedModule..JsAstProtoBuf.ImportedModule?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize.<anonymous>[ValueParameterDescriptorImpl]

'externalNameId' @ [62:59] ==> public final val JsAstProtoBuf.ImportedModule.externalNameId: Int[MyPropertyDescriptor]

'deserializeName' @ [63:21] ==> private final fun deserializeName(id: Int): JsName defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'importedModuleProto' @ [63:37] ==> value-parameter importedModuleProto: (JsAstProtoBuf.ImportedModule..JsAstProtoBuf.ImportedModule?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize.<anonymous>[ValueParameterDescriptorImpl]

'internalNameId' @ [63:57] ==> public final val JsAstProtoBuf.ImportedModule.internalNameId: Int[MyPropertyDescriptor]

'if (importedModuleProto.hasPlainReference()) deserialize(importedModuleProto.plainReference) else null' @ [64:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression?, elseBranch: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression?

'importedModuleProto' @ [64:25] ==> value-parameter importedModuleProto: (JsAstProtoBuf.ImportedModule..JsAstProtoBuf.ImportedModule?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize.<anonymous>[ValueParameterDescriptorImpl]

'hasPlainReference' @ [64:45] ==> public open fun hasPlainReference(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.ImportedModule[JavaMethodDescriptor]

'deserialize' @ [64:66] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'importedModuleProto' @ [64:78] ==> value-parameter importedModuleProto: (JsAstProtoBuf.ImportedModule..JsAstProtoBuf.ImportedModule?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize.<anonymous>[ValueParameterDescriptorImpl]

'plainReference' @ [64:98] ==> public final val JsAstProtoBuf.ImportedModule.plainReference: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'fragment' @ [68:9] ==> val fragment: JsProgramFragment defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[LocalVariableDescriptor]

'imports' @ [68:18] ==> public final val JsProgramFragment.imports: (MutableMap<(String..String?), (JsExpression..JsExpression?)>..Map<(String..String?), (JsExpression..JsExpression?)>)[MyPropertyDescriptor]

'proto' @ [68:29] ==> value-parameter proto: JsAstProtoBuf.Fragment defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'importEntryList' @ [68:35] ==> public final val JsAstProtoBuf.Fragment.importEntryList: (MutableList<(JsAstProtoBuf.Import..JsAstProtoBuf.Import?)>..List<(JsAstProtoBuf.Import..JsAstProtoBuf.Import?)>?)[MyPropertyDescriptor]

'associate' @ [68:51] ==> public inline fun <T, K, V> Iterable<(JsAstProtoBuf.Import..JsAstProtoBuf.Import?)>.associate(transform: ((JsAstProtoBuf.Import..JsAstProtoBuf.Import?)) -> Pair<String, JsExpression>): Map<String, JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Import..org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Import?)
    <K> -> String
    <V> -> JsExpression

'deserializeString' @ [69:13] ==> private final fun deserializeString(id: Int): String defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'importProto' @ [69:31] ==> value-parameter importProto: (JsAstProtoBuf.Import..JsAstProtoBuf.Import?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize.<anonymous>[ValueParameterDescriptorImpl]

'signatureId' @ [69:43] ==> public final val JsAstProtoBuf.Import.signatureId: Int[MyPropertyDescriptor]

'deserialize' @ [69:59] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'importProto' @ [69:71] ==> value-parameter importProto: (JsAstProtoBuf.Import..JsAstProtoBuf.Import?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [69:83] ==> public final val JsAstProtoBuf.Import.expression: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'proto' @ [72:13] ==> value-parameter proto: JsAstProtoBuf.Fragment defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'hasDeclarationBlock' @ [72:19] ==> public open fun hasDeclarationBlock(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Fragment[JavaMethodDescriptor]

'fragment' @ [73:13] ==> val fragment: JsProgramFragment defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[LocalVariableDescriptor]

'declarationBlock' @ [73:22] ==> public final val JsProgramFragment.declarationBlock: JsGlobalBlock[MyPropertyDescriptor]

'statements' @ [73:39] ==> public final val JsGlobalBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'deserializeGlobalBlock' @ [73:53] ==> private final fun deserializeGlobalBlock(proto: JsAstProtoBuf.GlobalBlock): JsGlobalBlock defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [73:76] ==> value-parameter proto: JsAstProtoBuf.Fragment defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'declarationBlock' @ [73:82] ==> public final val JsAstProtoBuf.Fragment.declarationBlock: (JsAstProtoBuf.GlobalBlock..JsAstProtoBuf.GlobalBlock?)[MyPropertyDescriptor]

'statements' @ [73:100] ==> public final val JsGlobalBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'proto' @ [75:13] ==> value-parameter proto: JsAstProtoBuf.Fragment defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'hasInitializerBlock' @ [75:19] ==> public open fun hasInitializerBlock(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Fragment[JavaMethodDescriptor]

'fragment' @ [76:13] ==> val fragment: JsProgramFragment defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[LocalVariableDescriptor]

'initializerBlock' @ [76:22] ==> public final val JsProgramFragment.initializerBlock: JsGlobalBlock[MyPropertyDescriptor]

'statements' @ [76:39] ==> public final val JsGlobalBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'deserializeGlobalBlock' @ [76:53] ==> private final fun deserializeGlobalBlock(proto: JsAstProtoBuf.GlobalBlock): JsGlobalBlock defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [76:76] ==> value-parameter proto: JsAstProtoBuf.Fragment defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'initializerBlock' @ [76:82] ==> public final val JsAstProtoBuf.Fragment.initializerBlock: (JsAstProtoBuf.GlobalBlock..JsAstProtoBuf.GlobalBlock?)[MyPropertyDescriptor]

'statements' @ [76:100] ==> public final val JsGlobalBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'proto' @ [78:13] ==> value-parameter proto: JsAstProtoBuf.Fragment defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'hasExportBlock' @ [78:19] ==> public open fun hasExportBlock(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Fragment[JavaMethodDescriptor]

'fragment' @ [79:13] ==> val fragment: JsProgramFragment defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[LocalVariableDescriptor]

'exportBlock' @ [79:22] ==> public final val JsProgramFragment.exportBlock: JsGlobalBlock[MyPropertyDescriptor]

'statements' @ [79:34] ==> public final val JsGlobalBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'deserializeGlobalBlock' @ [79:48] ==> private final fun deserializeGlobalBlock(proto: JsAstProtoBuf.GlobalBlock): JsGlobalBlock defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [79:71] ==> value-parameter proto: JsAstProtoBuf.Fragment defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'exportBlock' @ [79:77] ==> public final val JsAstProtoBuf.Fragment.exportBlock: (JsAstProtoBuf.GlobalBlock..JsAstProtoBuf.GlobalBlock?)[MyPropertyDescriptor]

'statements' @ [79:90] ==> public final val JsGlobalBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'fragment' @ [82:9] ==> val fragment: JsProgramFragment defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[LocalVariableDescriptor]

'nameBindings' @ [82:18] ==> public final val JsProgramFragment.nameBindings: (MutableList<(JsNameBinding..JsNameBinding?)>..List<(JsNameBinding..JsNameBinding?)>)[MyPropertyDescriptor]

'proto' @ [82:34] ==> value-parameter proto: JsAstProtoBuf.Fragment defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'nameBindingList' @ [82:40] ==> public final val JsAstProtoBuf.Fragment.nameBindingList: (MutableList<(JsAstProtoBuf.NameBinding..JsAstProtoBuf.NameBinding?)>..List<(JsAstProtoBuf.NameBinding..JsAstProtoBuf.NameBinding?)>?)[MyPropertyDescriptor]

'map' @ [82:56] ==> public inline fun <T, R> Iterable<(JsAstProtoBuf.NameBinding..JsAstProtoBuf.NameBinding?)>.map(transform: ((JsAstProtoBuf.NameBinding..JsAstProtoBuf.NameBinding?)) -> JsNameBinding): List<JsNameBinding> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.NameBinding..org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.NameBinding?)
    <R> -> JsNameBinding

'JsNameBinding' @ [83:13] ==> public constructor JsNameBinding(key: String, name: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsNameBinding[DeserializedClassConstructorDescriptor]

'deserializeString' @ [83:27] ==> private final fun deserializeString(id: Int): String defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'nameBindingProto' @ [83:45] ==> value-parameter nameBindingProto: (JsAstProtoBuf.NameBinding..JsAstProtoBuf.NameBinding?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize.<anonymous>[ValueParameterDescriptorImpl]

'signatureId' @ [83:62] ==> public final val JsAstProtoBuf.NameBinding.signatureId: Int[MyPropertyDescriptor]

'deserializeName' @ [83:76] ==> private final fun deserializeName(id: Int): JsName defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'nameBindingProto' @ [83:92] ==> value-parameter nameBindingProto: (JsAstProtoBuf.NameBinding..JsAstProtoBuf.NameBinding?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize.<anonymous>[ValueParameterDescriptorImpl]

'nameId' @ [83:109] ==> public final val JsAstProtoBuf.NameBinding.nameId: Int[MyPropertyDescriptor]

'fragment' @ [86:9] ==> val fragment: JsProgramFragment defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[LocalVariableDescriptor]

'classes' @ [86:18] ==> public final val JsProgramFragment.classes: (MutableMap<(JsName..JsName?), (JsClassModel..JsClassModel?)>..Map<(JsName..JsName?), (JsClassModel..JsClassModel?)>)[MyPropertyDescriptor]

'proto' @ [86:29] ==> value-parameter proto: JsAstProtoBuf.Fragment defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'classModelList' @ [86:35] ==> public final val JsAstProtoBuf.Fragment.classModelList: (MutableList<(JsAstProtoBuf.ClassModel..JsAstProtoBuf.ClassModel?)>..List<(JsAstProtoBuf.ClassModel..JsAstProtoBuf.ClassModel?)>?)[MyPropertyDescriptor]

'associate' @ [86:50] ==> public inline fun <T, K, V> Iterable<(JsAstProtoBuf.ClassModel..JsAstProtoBuf.ClassModel?)>.associate(transform: ((JsAstProtoBuf.ClassModel..JsAstProtoBuf.ClassModel?)) -> Pair<JsName, JsClassModel>): Map<JsName, JsClassModel> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.ClassModel..org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.ClassModel?)
    <K> -> JsName
    <V> -> JsClassModel

'deserialize' @ [86:74] ==> private final fun deserialize(proto: JsAstProtoBuf.ClassModel): JsClassModel defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'clsProto' @ [86:86] ==> value-parameter clsProto: (JsAstProtoBuf.ClassModel..JsAstProtoBuf.ClassModel?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [86:96] ==> @InlineOnly public inline fun <T, R> JsClassModel.let(block: (JsClassModel) -> Pair<JsName, JsClassModel>): Pair<JsName, JsClassModel> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsClassModel
    <R> -> Pair<JsName, JsClassModel>

'it' @ [86:102] ==> value-parameter it: JsClassModel defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [86:105] ==> public final val name: JsName defined in org.jetbrains.kotlin.js.backend.ast.JsClassModel[DeserializedPropertyDescriptor]

'it' @ [86:113] ==> value-parameter it: JsClassModel defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'proto' @ [88:33] ==> value-parameter proto: JsAstProtoBuf.Fragment defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'moduleExpressionList' @ [88:39] ==> public final val JsAstProtoBuf.Fragment.moduleExpressionList: (MutableList<(JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)>..List<(JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)>?)[MyPropertyDescriptor]

'map' @ [88:60] ==> public inline fun <T, R> Iterable<(JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)>.map(transform: ((JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)) -> JsExpression): List<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression..org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression?)
    <R> -> JsExpression

'deserialize' @ [88:66] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'it' @ [88:78] ==> value-parameter it: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize.<anonymous>[ValueParameterDescriptorImpl]

'fragment' @ [89:9] ==> val fragment: JsProgramFragment defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[LocalVariableDescriptor]

'inlineModuleMap' @ [89:18] ==> public final val JsProgramFragment.inlineModuleMap: (MutableMap<(String..String?), (JsExpression..JsExpression?)>..Map<(String..String?), (JsExpression..JsExpression?)>)[MyPropertyDescriptor]

'proto' @ [89:37] ==> value-parameter proto: JsAstProtoBuf.Fragment defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'inlineModuleList' @ [89:43] ==> public final val JsAstProtoBuf.Fragment.inlineModuleList: (MutableList<(JsAstProtoBuf.InlineModule..JsAstProtoBuf.InlineModule?)>..List<(JsAstProtoBuf.InlineModule..JsAstProtoBuf.InlineModule?)>?)[MyPropertyDescriptor]

'associate' @ [89:60] ==> public inline fun <T, K, V> Iterable<(JsAstProtoBuf.InlineModule..JsAstProtoBuf.InlineModule?)>.associate(transform: ((JsAstProtoBuf.InlineModule..JsAstProtoBuf.InlineModule?)) -> Pair<String, JsExpression>): Map<String, JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.InlineModule..org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.InlineModule?)
    <K> -> String
    <V> -> JsExpression

'deserializeString' @ [90:13] ==> private final fun deserializeString(id: Int): String defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'inlineModuleProto' @ [90:31] ==> value-parameter inlineModuleProto: (JsAstProtoBuf.InlineModule..JsAstProtoBuf.InlineModule?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize.<anonymous>[ValueParameterDescriptorImpl]

'signatureId' @ [90:49] ==> public final val JsAstProtoBuf.InlineModule.signatureId: Int[MyPropertyDescriptor]

'moduleExpressions' @ [90:65] ==> val moduleExpressions: List<JsExpression> defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[LocalVariableDescriptor]

'inlineModuleProto' @ [90:83] ==> value-parameter inlineModuleProto: (JsAstProtoBuf.InlineModule..JsAstProtoBuf.InlineModule?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize.<anonymous>[ValueParameterDescriptorImpl]

'expressionId' @ [90:101] ==> public final val JsAstProtoBuf.InlineModule.expressionId: Int[MyPropertyDescriptor]

'fragment' @ [93:29] ==> val fragment: JsProgramFragment defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[LocalVariableDescriptor]

'nameBindings' @ [93:38] ==> public final val JsProgramFragment.nameBindings: (MutableList<(JsNameBinding..JsNameBinding?)>..List<(JsNameBinding..JsNameBinding?)>)[MyPropertyDescriptor]

'nameBinding' @ [94:13] ==> val nameBinding: (JsNameBinding..JsNameBinding?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[LocalVariableDescriptor]

'name' @ [94:25] ==> public final var name: JsName defined in org.jetbrains.kotlin.js.backend.ast.JsNameBinding[DeserializedPropertyDescriptor]

'imported' @ [94:30] ==> public var JsName.imported: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'nameBinding' @ [94:41] ==> val nameBinding: (JsNameBinding..JsNameBinding?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[LocalVariableDescriptor]

'key' @ [94:53] ==> public final val key: String defined in org.jetbrains.kotlin.js.backend.ast.JsNameBinding[DeserializedPropertyDescriptor]

'fragment' @ [94:60] ==> val fragment: JsProgramFragment defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[LocalVariableDescriptor]

'imports' @ [94:69] ==> public final val JsProgramFragment.imports: (MutableMap<(String..String?), (JsExpression..JsExpression?)>..Map<(String..String?), (JsExpression..JsExpression?)>)[MyPropertyDescriptor]

'fragment' @ [97:16] ==> val fragment: JsProgramFragment defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[LocalVariableDescriptor]

'if (proto.hasSuperNameId()) deserializeName(proto.superNameId) else null' @ [101:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsName?, elseBranch: JsName?): JsName?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsName?

'proto' @ [101:29] ==> value-parameter proto: JsAstProtoBuf.ClassModel defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'hasSuperNameId' @ [101:35] ==> public open fun hasSuperNameId(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.ClassModel[JavaMethodDescriptor]

'deserializeName' @ [101:53] ==> private final fun deserializeName(id: Int): JsName defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [101:69] ==> value-parameter proto: JsAstProtoBuf.ClassModel defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'superNameId' @ [101:75] ==> public final val JsAstProtoBuf.ClassModel.superNameId: Int[MyPropertyDescriptor]

'JsClassModel' @ [102:16] ==> public constructor JsClassModel(name: JsName, superName: JsName?) defined in org.jetbrains.kotlin.js.backend.ast.JsClassModel[DeserializedClassConstructorDescriptor]

'deserializeName' @ [102:29] ==> private final fun deserializeName(id: Int): JsName defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [102:45] ==> value-parameter proto: JsAstProtoBuf.ClassModel defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'nameId' @ [102:51] ==> public final val JsAstProtoBuf.ClassModel.nameId: Int[MyPropertyDescriptor]

'superName' @ [102:60] ==> val superName: JsName? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[LocalVariableDescriptor]

'apply' @ [102:71] ==> @InlineOnly public inline fun <T> JsClassModel.apply(block: JsClassModel.() -> Unit): JsClassModel defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsClassModel

'proto' @ [103:17] ==> value-parameter proto: JsAstProtoBuf.ClassModel defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'hasPostDeclarationBlock' @ [103:23] ==> public open fun hasPostDeclarationBlock(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.ClassModel[JavaMethodDescriptor]

'postDeclarationBlock' @ [104:17] ==> public final val postDeclarationBlock: JsGlobalBlock defined in org.jetbrains.kotlin.js.backend.ast.JsClassModel[DeserializedPropertyDescriptor]

'statements' @ [104:38] ==> public final val JsGlobalBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'deserializeGlobalBlock' @ [104:52] ==> private final fun deserializeGlobalBlock(proto: JsAstProtoBuf.GlobalBlock): JsGlobalBlock defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [104:75] ==> value-parameter proto: JsAstProtoBuf.ClassModel defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'postDeclarationBlock' @ [104:81] ==> public final val JsAstProtoBuf.ClassModel.postDeclarationBlock: (JsAstProtoBuf.GlobalBlock..JsAstProtoBuf.GlobalBlock?)[MyPropertyDescriptor]

'statements' @ [104:103] ==> public final val JsGlobalBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'withLocation' @ [110:25] ==> private final fun <T : JsNode> withLocation(fileId: Int?, location: JsAstProtoBuf.Location?, action: () -> JsStatement): JsStatement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : JsNode> -> JsStatement

'if (proto.hasFileId()) proto.fileId else null' @ [111:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int?, elseBranch: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int?

'proto' @ [111:30] ==> value-parameter proto: JsAstProtoBuf.Statement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'hasFileId' @ [111:36] ==> public open fun hasFileId(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement[JavaMethodDescriptor]

'proto' @ [111:49] ==> value-parameter proto: JsAstProtoBuf.Statement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'fileId' @ [111:55] ==> public final val JsAstProtoBuf.Statement.fileId: Int[MyPropertyDescriptor]

'if (proto.hasLocation()) proto.location else null' @ [112:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsAstProtoBuf.Location?, elseBranch: JsAstProtoBuf.Location?): JsAstProtoBuf.Location?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Location?

'proto' @ [112:32] ==> value-parameter proto: JsAstProtoBuf.Statement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'hasLocation' @ [112:38] ==> public open fun hasLocation(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement[JavaMethodDescriptor]

'proto' @ [112:53] ==> value-parameter proto: JsAstProtoBuf.Statement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'location' @ [112:59] ==> public final val JsAstProtoBuf.Statement.location: (JsAstProtoBuf.Location..JsAstProtoBuf.Location?)[MyPropertyDescriptor]

'deserializeNoMetadata' @ [113:28] ==> private final fun deserializeNoMetadata(proto: JsAstProtoBuf.Statement): JsStatement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [113:50] ==> value-parameter proto: JsAstProtoBuf.Statement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'statement' @ [115:13] ==> val statement: JsStatement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[LocalVariableDescriptor]

'statement' @ [116:13] ==> val statement: JsStatement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[LocalVariableDescriptor]

'synthetic' @ [116:23] ==> public var HasMetadata.synthetic: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'proto' @ [116:35] ==> value-parameter proto: JsAstProtoBuf.Statement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'synthetic' @ [116:41] ==> public final val JsAstProtoBuf.Statement.synthetic: Boolean[MyPropertyDescriptor]

'statement' @ [118:16] ==> val statement: JsStatement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[LocalVariableDescriptor]

'when (proto.statementCase) {
        StatementCase.RETURN_STATEMENT -> {
            val returnProto = proto.returnStatement
            JsReturn(if (returnProto.hasValue()) deserialize(returnProto.value) else null)
        }

        StatementCase.THROW_STATEMENT -> {
            val throwProto = proto.throwStatement
            JsThrow(deserialize(throwProto.exception))
        }

        StatementCase.BREAK_STATEMENT -> {
            val breakProto = proto.breakStatement
            JsBreak(if (breakProto.hasLabelId()) JsNameRef(deserializeName(breakProto.labelId)) else null)
        }

        StatementCase.CONTINUE_STATEMENT -> {
            val continueProto = proto.continueStatement
            JsContinue(if (continueProto.hasLabelId()) JsNameRef(deserializeName(continueProto.labelId)) else null)
        }

        StatementCase.DEBUGGER -> {
            JsDebugger()
        }

        StatementCase.EXPRESSION -> {
            val expressionProto = proto.expression
            JsExpressionStatement(deserialize(expressionProto.expression)).also {
                if (expressionProto.hasExportedTagId()) {
                    it.exportedTag = deserializeString(expressionProto.exportedTagId)
                }
            }
        }

        StatementCase.VARS -> {
            deserializeVars(proto.vars)
        }

        StatementCase.BLOCK -> {
            val blockProto = proto.block
            val block = JsBlock()
            block.statements += blockProto.statementList.map { deserialize(it) }
            block
        }

        StatementCase.GLOBAL_BLOCK -> {
            deserializeGlobalBlock(proto.globalBlock)
        }

        StatementCase.LABEL -> {
            val labelProto = proto.label
            JsLabel(deserializeName(labelProto.nameId), deserialize(labelProto.innerStatement))
        }

        StatementCase.IF_STATEMENT -> {
            val ifProto = proto.ifStatement
            JsIf(
                    deserialize(ifProto.condition),
                    deserialize(ifProto.thenStatement),
                    if (ifProto.hasElseStatement()) deserialize(ifProto.elseStatement) else null
            )
        }

        StatementCase.SWITCH_STATEMENT -> {
            val switchProto = proto.switchStatement
            JsSwitch(
                    deserialize(switchProto.expression),
                    switchProto.entryList.map { entryProto ->
                        val member = if (entryProto.hasLabel()) {
                            JsCase().apply { caseExpression = deserialize(entryProto.label) }
                        }
                        else {
                            JsDefault()
                        }
                        member.statements += entryProto.statementList.map { deserialize(it) }
                        member
                    }
            )
        }

        StatementCase.WHILE_STATEMENT -> {
            val whileProto = proto.whileStatement
            JsWhile(deserialize(whileProto.condition), deserialize(whileProto.body))
        }

        StatementCase.DO_WHILE_STATEMENT -> {
            val doWhileProto = proto.doWhileStatement
            JsDoWhile(deserialize(doWhileProto.condition), deserialize(doWhileProto.body))
        }

        StatementCase.FOR_STATEMENT -> {
            val forProto = proto.forStatement
            val initVars = if (forProto.hasVariables()) deserialize(forProto.variables) as JsVars else null
            val initExpr = if (forProto.hasExpression()) deserialize(forProto.expression) else null
            val condition = if (forProto.hasCondition()) deserialize(forProto.condition) else null
            val increment = if (forProto.hasIncrement()) deserialize(forProto.increment) else null
            val body = deserialize(forProto.body)
            if (initVars != null) {
                JsFor(initVars, condition, increment, body)
            }
            else {
                JsFor(initExpr!!, condition, increment, body)
            }
        }

        StatementCase.FOR_IN_STATEMENT -> {
            val forInProto = proto.forInStatement
            val iterName = if (forInProto.hasNameId()) deserializeName(forInProto.nameId) else null
            val iterExpr = if (forInProto.hasExpression()) deserialize(forInProto.expression) else null
            val iterable = deserialize(forInProto.iterable)
            val body = deserialize(forInProto.body)
            JsForIn(iterName, iterExpr, iterable, body)
        }

        StatementCase.TRY_STATEMENT -> {
            val tryProto = proto.tryStatement
            val tryBlock = deserialize(tryProto.tryBlock) as JsBlock
            val catchBlock = if (tryProto.hasCatchBlock()) {
                val catchProto = tryProto.catchBlock
                JsCatch(deserializeName(catchProto.parameter.nameId)).apply {
                    body = deserialize(catchProto.body) as JsBlock
                }
            }
            else {
                null
            }
            val finallyBlock = if (tryProto.hasFinallyBlock()) deserialize(tryProto.finallyBlock) as JsBlock else null
            JsTry(tryBlock, catchBlock, finallyBlock)
        }

        StatementCase.EMPTY -> JsEmpty

        StatementCase.STATEMENT_NOT_SET,
        null -> error("Statement not set")
    }' @ [121:72] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsStatement, entry1: JsStatement, entry2: JsStatement, entry3: JsStatement, entry4: JsStatement, entry5: JsStatement, entry6: JsStatement, entry7: JsStatement, entry8: JsStatement, entry9: JsStatement, entry10: JsStatement, entry11: JsStatement, entry12: JsStatement, entry13: JsStatement, entry14: JsStatement, entry15: JsStatement, entry16: JsStatement, entry17: JsStatement, entry18: JsStatement): JsStatement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsStatement

'proto' @ [121:78] ==> value-parameter proto: JsAstProtoBuf.Statement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'statementCase' @ [121:84] ==> public final val JsAstProtoBuf.Statement.statementCase: (JsAstProtoBuf.Statement.StatementCase..JsAstProtoBuf.Statement.StatementCase?)[MyPropertyDescriptor]

'RETURN_STATEMENT' @ [122:23] ==> enum entry RETURN_STATEMENT defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement.StatementCase[FakeCallableDescriptorForObject]

'proto' @ [123:31] ==> value-parameter proto: JsAstProtoBuf.Statement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'returnStatement' @ [123:37] ==> public final val JsAstProtoBuf.Statement.returnStatement: (JsAstProtoBuf.Return..JsAstProtoBuf.Return?)[MyPropertyDescriptor]

'JsReturn' @ [124:13] ==> public constructor JsReturn(p0: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsReturn[JavaClassConstructorDescriptor]

'if (returnProto.hasValue()) deserialize(returnProto.value) else null' @ [124:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression?, elseBranch: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression?

'returnProto' @ [124:26] ==> val returnProto: (JsAstProtoBuf.Return..JsAstProtoBuf.Return?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'hasValue' @ [124:38] ==> public open fun hasValue(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Return[JavaMethodDescriptor]

'deserialize' @ [124:50] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'returnProto' @ [124:62] ==> val returnProto: (JsAstProtoBuf.Return..JsAstProtoBuf.Return?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'value' @ [124:74] ==> public final val JsAstProtoBuf.Return.value: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'THROW_STATEMENT' @ [127:23] ==> enum entry THROW_STATEMENT defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement.StatementCase[FakeCallableDescriptorForObject]

'proto' @ [128:30] ==> value-parameter proto: JsAstProtoBuf.Statement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'throwStatement' @ [128:36] ==> public final val JsAstProtoBuf.Statement.throwStatement: (JsAstProtoBuf.Throw..JsAstProtoBuf.Throw?)[MyPropertyDescriptor]

'JsThrow' @ [129:13] ==> public constructor JsThrow(p0: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsThrow[JavaClassConstructorDescriptor]

'deserialize' @ [129:21] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'throwProto' @ [129:33] ==> val throwProto: (JsAstProtoBuf.Throw..JsAstProtoBuf.Throw?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'exception' @ [129:44] ==> public final val JsAstProtoBuf.Throw.exception: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'BREAK_STATEMENT' @ [132:23] ==> enum entry BREAK_STATEMENT defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement.StatementCase[FakeCallableDescriptorForObject]

'proto' @ [133:30] ==> value-parameter proto: JsAstProtoBuf.Statement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'breakStatement' @ [133:36] ==> public final val JsAstProtoBuf.Statement.breakStatement: (JsAstProtoBuf.Break..JsAstProtoBuf.Break?)[MyPropertyDescriptor]

'JsBreak' @ [134:13] ==> public constructor JsBreak(p0: (JsNameRef..JsNameRef?)) defined in org.jetbrains.kotlin.js.backend.ast.JsBreak[JavaClassConstructorDescriptor]

'if (breakProto.hasLabelId()) JsNameRef(deserializeName(breakProto.labelId)) else null' @ [134:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsNameRef?, elseBranch: JsNameRef?): JsNameRef?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsNameRef?

'breakProto' @ [134:25] ==> val breakProto: (JsAstProtoBuf.Break..JsAstProtoBuf.Break?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'hasLabelId' @ [134:36] ==> public open fun hasLabelId(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Break[JavaMethodDescriptor]

'JsNameRef' @ [134:50] ==> public constructor JsNameRef(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'deserializeName' @ [134:60] ==> private final fun deserializeName(id: Int): JsName defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'breakProto' @ [134:76] ==> val breakProto: (JsAstProtoBuf.Break..JsAstProtoBuf.Break?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'labelId' @ [134:87] ==> public final val JsAstProtoBuf.Break.labelId: Int[MyPropertyDescriptor]

'CONTINUE_STATEMENT' @ [137:23] ==> enum entry CONTINUE_STATEMENT defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement.StatementCase[FakeCallableDescriptorForObject]

'proto' @ [138:33] ==> value-parameter proto: JsAstProtoBuf.Statement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'continueStatement' @ [138:39] ==> public final val JsAstProtoBuf.Statement.continueStatement: (JsAstProtoBuf.Continue..JsAstProtoBuf.Continue?)[MyPropertyDescriptor]

'JsContinue' @ [139:13] ==> public constructor JsContinue(@Nullable p0: JsNameRef?) defined in org.jetbrains.kotlin.js.backend.ast.JsContinue[JavaClassConstructorDescriptor]

'if (continueProto.hasLabelId()) JsNameRef(deserializeName(continueProto.labelId)) else null' @ [139:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsNameRef?, elseBranch: JsNameRef?): JsNameRef?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsNameRef?

'continueProto' @ [139:28] ==> val continueProto: (JsAstProtoBuf.Continue..JsAstProtoBuf.Continue?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'hasLabelId' @ [139:42] ==> public open fun hasLabelId(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Continue[JavaMethodDescriptor]

'JsNameRef' @ [139:56] ==> public constructor JsNameRef(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'deserializeName' @ [139:66] ==> private final fun deserializeName(id: Int): JsName defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'continueProto' @ [139:82] ==> val continueProto: (JsAstProtoBuf.Continue..JsAstProtoBuf.Continue?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'labelId' @ [139:96] ==> public final val JsAstProtoBuf.Continue.labelId: Int[MyPropertyDescriptor]

'DEBUGGER' @ [142:23] ==> enum entry DEBUGGER defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement.StatementCase[FakeCallableDescriptorForObject]

'JsDebugger' @ [143:13] ==> public constructor JsDebugger() defined in org.jetbrains.kotlin.js.backend.ast.JsDebugger[JavaClassConstructorDescriptor]

'EXPRESSION' @ [146:23] ==> enum entry EXPRESSION defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement.StatementCase[FakeCallableDescriptorForObject]

'proto' @ [147:35] ==> value-parameter proto: JsAstProtoBuf.Statement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'expression' @ [147:41] ==> public final val JsAstProtoBuf.Statement.expression: (JsAstProtoBuf.ExpressionStatement..JsAstProtoBuf.ExpressionStatement?)[MyPropertyDescriptor]

'JsExpressionStatement' @ [148:13] ==> public constructor JsExpressionStatement(@NotNull p0: JsExpression) defined in org.jetbrains.kotlin.js.backend.ast.JsExpressionStatement[JavaClassConstructorDescriptor]

'deserialize' @ [148:35] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'expressionProto' @ [148:47] ==> val expressionProto: (JsAstProtoBuf.ExpressionStatement..JsAstProtoBuf.ExpressionStatement?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'expression' @ [148:63] ==> public final val JsAstProtoBuf.ExpressionStatement.expression: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'also' @ [148:76] ==> @InlineOnly @SinceKotlin public inline fun <T> JsExpressionStatement.also(block: (JsExpressionStatement) -> Unit): JsExpressionStatement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpressionStatement

'expressionProto' @ [149:21] ==> val expressionProto: (JsAstProtoBuf.ExpressionStatement..JsAstProtoBuf.ExpressionStatement?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'hasExportedTagId' @ [149:37] ==> public open fun hasExportedTagId(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.ExpressionStatement[JavaMethodDescriptor]

'it' @ [150:21] ==> value-parameter it: JsExpressionStatement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata.<anonymous>[ValueParameterDescriptorImpl]

'exportedTag' @ [150:24] ==> public var JsExpressionStatement.exportedTag: String? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'deserializeString' @ [150:38] ==> private final fun deserializeString(id: Int): String defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'expressionProto' @ [150:56] ==> val expressionProto: (JsAstProtoBuf.ExpressionStatement..JsAstProtoBuf.ExpressionStatement?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'exportedTagId' @ [150:72] ==> public final val JsAstProtoBuf.ExpressionStatement.exportedTagId: Int[MyPropertyDescriptor]

'VARS' @ [155:23] ==> enum entry VARS defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement.StatementCase[FakeCallableDescriptorForObject]

'deserializeVars' @ [156:13] ==> private final fun deserializeVars(proto: JsAstProtoBuf.Vars): JsVars defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [156:29] ==> value-parameter proto: JsAstProtoBuf.Statement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'vars' @ [156:35] ==> public final val JsAstProtoBuf.Statement.vars: (JsAstProtoBuf.Vars..JsAstProtoBuf.Vars?)[MyPropertyDescriptor]

'BLOCK' @ [159:23] ==> enum entry BLOCK defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement.StatementCase[FakeCallableDescriptorForObject]

'proto' @ [160:30] ==> value-parameter proto: JsAstProtoBuf.Statement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'block' @ [160:36] ==> public final val JsAstProtoBuf.Statement.block: (JsAstProtoBuf.Block..JsAstProtoBuf.Block?)[MyPropertyDescriptor]

'JsBlock' @ [161:25] ==> public constructor JsBlock() defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'block' @ [162:13] ==> val block: JsBlock defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'statements' @ [162:19] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'blockProto' @ [162:33] ==> val blockProto: (JsAstProtoBuf.Block..JsAstProtoBuf.Block?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'statementList' @ [162:44] ==> public final val JsAstProtoBuf.Block.statementList: (MutableList<(JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?)>..List<(JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?)>?)[MyPropertyDescriptor]

'map' @ [162:58] ==> public inline fun <T, R> Iterable<(JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?)>.map(transform: ((JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?)) -> JsStatement): List<JsStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement..org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement?)
    <R> -> JsStatement

'deserialize' @ [162:64] ==> private final fun deserialize(proto: JsAstProtoBuf.Statement): JsStatement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'it' @ [162:76] ==> value-parameter it: (JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata.<anonymous>[ValueParameterDescriptorImpl]

'block' @ [163:13] ==> val block: JsBlock defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'GLOBAL_BLOCK' @ [166:23] ==> enum entry GLOBAL_BLOCK defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement.StatementCase[FakeCallableDescriptorForObject]

'deserializeGlobalBlock' @ [167:13] ==> private final fun deserializeGlobalBlock(proto: JsAstProtoBuf.GlobalBlock): JsGlobalBlock defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [167:36] ==> value-parameter proto: JsAstProtoBuf.Statement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'globalBlock' @ [167:42] ==> public final val JsAstProtoBuf.Statement.globalBlock: (JsAstProtoBuf.GlobalBlock..JsAstProtoBuf.GlobalBlock?)[MyPropertyDescriptor]

'LABEL' @ [170:23] ==> enum entry LABEL defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement.StatementCase[FakeCallableDescriptorForObject]

'proto' @ [171:30] ==> value-parameter proto: JsAstProtoBuf.Statement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'label' @ [171:36] ==> public final val JsAstProtoBuf.Statement.label: (JsAstProtoBuf.Label..JsAstProtoBuf.Label?)[MyPropertyDescriptor]

'JsLabel' @ [172:13] ==> public constructor JsLabel(p0: (JsName..JsName?), p1: (JsStatement..JsStatement?)) defined in org.jetbrains.kotlin.js.backend.ast.JsLabel[JavaClassConstructorDescriptor]

'deserializeName' @ [172:21] ==> private final fun deserializeName(id: Int): JsName defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'labelProto' @ [172:37] ==> val labelProto: (JsAstProtoBuf.Label..JsAstProtoBuf.Label?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'nameId' @ [172:48] ==> public final val JsAstProtoBuf.Label.nameId: Int[MyPropertyDescriptor]

'deserialize' @ [172:57] ==> private final fun deserialize(proto: JsAstProtoBuf.Statement): JsStatement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'labelProto' @ [172:69] ==> val labelProto: (JsAstProtoBuf.Label..JsAstProtoBuf.Label?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'innerStatement' @ [172:80] ==> public final val JsAstProtoBuf.Label.innerStatement: (JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?)[MyPropertyDescriptor]

'IF_STATEMENT' @ [175:23] ==> enum entry IF_STATEMENT defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement.StatementCase[FakeCallableDescriptorForObject]

'proto' @ [176:27] ==> value-parameter proto: JsAstProtoBuf.Statement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'ifStatement' @ [176:33] ==> public final val JsAstProtoBuf.Statement.ifStatement: (JsAstProtoBuf.If..JsAstProtoBuf.If?)[MyPropertyDescriptor]

'JsIf' @ [177:13] ==> public constructor JsIf(@NotNull p0: JsExpression, @NotNull p1: JsStatement, @Nullable p2: JsStatement?) defined in org.jetbrains.kotlin.js.backend.ast.JsIf[JavaClassConstructorDescriptor]

'deserialize' @ [178:21] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'ifProto' @ [178:33] ==> val ifProto: (JsAstProtoBuf.If..JsAstProtoBuf.If?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'condition' @ [178:41] ==> public final val JsAstProtoBuf.If.condition: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'deserialize' @ [179:21] ==> private final fun deserialize(proto: JsAstProtoBuf.Statement): JsStatement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'ifProto' @ [179:33] ==> val ifProto: (JsAstProtoBuf.If..JsAstProtoBuf.If?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'thenStatement' @ [179:41] ==> public final val JsAstProtoBuf.If.thenStatement: (JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?)[MyPropertyDescriptor]

'if (ifProto.hasElseStatement()) deserialize(ifProto.elseStatement) else null' @ [180:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsStatement?, elseBranch: JsStatement?): JsStatement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsStatement?

'ifProto' @ [180:25] ==> val ifProto: (JsAstProtoBuf.If..JsAstProtoBuf.If?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'hasElseStatement' @ [180:33] ==> public open fun hasElseStatement(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.If[JavaMethodDescriptor]

'deserialize' @ [180:53] ==> private final fun deserialize(proto: JsAstProtoBuf.Statement): JsStatement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'ifProto' @ [180:65] ==> val ifProto: (JsAstProtoBuf.If..JsAstProtoBuf.If?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'elseStatement' @ [180:73] ==> public final val JsAstProtoBuf.If.elseStatement: (JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?)[MyPropertyDescriptor]

'SWITCH_STATEMENT' @ [184:23] ==> enum entry SWITCH_STATEMENT defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement.StatementCase[FakeCallableDescriptorForObject]

'proto' @ [185:31] ==> value-parameter proto: JsAstProtoBuf.Statement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'switchStatement' @ [185:37] ==> public final val JsAstProtoBuf.Statement.switchStatement: (JsAstProtoBuf.Switch..JsAstProtoBuf.Switch?)[MyPropertyDescriptor]

'JsSwitch' @ [186:13] ==> public constructor JsSwitch(p0: (JsExpression..JsExpression?), p1: (MutableList<(JsSwitchMember..JsSwitchMember?)>..List<(JsSwitchMember..JsSwitchMember?)>?)) defined in org.jetbrains.kotlin.js.backend.ast.JsSwitch[JavaClassConstructorDescriptor]

'deserialize' @ [187:21] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'switchProto' @ [187:33] ==> val switchProto: (JsAstProtoBuf.Switch..JsAstProtoBuf.Switch?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'expression' @ [187:45] ==> public final val JsAstProtoBuf.Switch.expression: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'switchProto' @ [188:21] ==> val switchProto: (JsAstProtoBuf.Switch..JsAstProtoBuf.Switch?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'entryList' @ [188:33] ==> public final val JsAstProtoBuf.Switch.entryList: (MutableList<(JsAstProtoBuf.SwitchEntry..JsAstProtoBuf.SwitchEntry?)>..List<(JsAstProtoBuf.SwitchEntry..JsAstProtoBuf.SwitchEntry?)>?)[MyPropertyDescriptor]

'map' @ [188:43] ==> public inline fun <T, R> Iterable<(JsAstProtoBuf.SwitchEntry..JsAstProtoBuf.SwitchEntry?)>.map(transform: ((JsAstProtoBuf.SwitchEntry..JsAstProtoBuf.SwitchEntry?)) -> JsSwitchMember): List<JsSwitchMember> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.SwitchEntry..org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.SwitchEntry?)
    <R> -> JsSwitchMember

'if (entryProto.hasLabel()) {
                            JsCase().apply { caseExpression = deserialize(entryProto.label) }
                        }
                        else {
                            JsDefault()
                        }' @ [189:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsSwitchMember, elseBranch: JsSwitchMember): JsSwitchMember[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsSwitchMember

'entryProto' @ [189:42] ==> value-parameter entryProto: (JsAstProtoBuf.SwitchEntry..JsAstProtoBuf.SwitchEntry?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata.<anonymous>[ValueParameterDescriptorImpl]

'hasLabel' @ [189:53] ==> public open fun hasLabel(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.SwitchEntry[JavaMethodDescriptor]

'JsCase' @ [190:29] ==> public constructor JsCase() defined in org.jetbrains.kotlin.js.backend.ast.JsCase[JavaClassConstructorDescriptor]

'apply' @ [190:38] ==> @InlineOnly public inline fun <T> JsCase.apply(block: JsCase.() -> Unit): JsCase defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsCase

'caseExpression' @ [190:46] ==> public final var JsCase.caseExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'deserialize' @ [190:63] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'entryProto' @ [190:75] ==> value-parameter entryProto: (JsAstProtoBuf.SwitchEntry..JsAstProtoBuf.SwitchEntry?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata.<anonymous>[ValueParameterDescriptorImpl]

'label' @ [190:86] ==> public final val JsAstProtoBuf.SwitchEntry.label: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'JsDefault' @ [193:29] ==> public constructor JsDefault() defined in org.jetbrains.kotlin.js.backend.ast.JsDefault[JavaClassConstructorDescriptor]

'member' @ [195:25] ==> val member: JsSwitchMember defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata.<anonymous>[LocalVariableDescriptor]

'statements' @ [195:32] ==> public final val JsSwitchMember.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>?)[MyPropertyDescriptor]

'entryProto' @ [195:46] ==> value-parameter entryProto: (JsAstProtoBuf.SwitchEntry..JsAstProtoBuf.SwitchEntry?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata.<anonymous>[ValueParameterDescriptorImpl]

'statementList' @ [195:57] ==> public final val JsAstProtoBuf.SwitchEntry.statementList: (MutableList<(JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?)>..List<(JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?)>?)[MyPropertyDescriptor]

'map' @ [195:71] ==> public inline fun <T, R> Iterable<(JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?)>.map(transform: ((JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?)) -> JsStatement): List<JsStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement..org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement?)
    <R> -> JsStatement

'deserialize' @ [195:77] ==> private final fun deserialize(proto: JsAstProtoBuf.Statement): JsStatement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'it' @ [195:89] ==> value-parameter it: (JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'member' @ [196:25] ==> val member: JsSwitchMember defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata.<anonymous>[LocalVariableDescriptor]

'WHILE_STATEMENT' @ [201:23] ==> enum entry WHILE_STATEMENT defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement.StatementCase[FakeCallableDescriptorForObject]

'proto' @ [202:30] ==> value-parameter proto: JsAstProtoBuf.Statement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'whileStatement' @ [202:36] ==> public final val JsAstProtoBuf.Statement.whileStatement: (JsAstProtoBuf.While..JsAstProtoBuf.While?)[MyPropertyDescriptor]

'JsWhile' @ [203:13] ==> public constructor JsWhile(p0: (JsExpression..JsExpression?), p1: (JsStatement..JsStatement?)) defined in org.jetbrains.kotlin.js.backend.ast.JsWhile[JavaClassConstructorDescriptor]

'deserialize' @ [203:21] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'whileProto' @ [203:33] ==> val whileProto: (JsAstProtoBuf.While..JsAstProtoBuf.While?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'condition' @ [203:44] ==> public final val JsAstProtoBuf.While.condition: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'deserialize' @ [203:56] ==> private final fun deserialize(proto: JsAstProtoBuf.Statement): JsStatement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'whileProto' @ [203:68] ==> val whileProto: (JsAstProtoBuf.While..JsAstProtoBuf.While?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'body' @ [203:79] ==> public final val JsAstProtoBuf.While.body: (JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?)[MyPropertyDescriptor]

'DO_WHILE_STATEMENT' @ [206:23] ==> enum entry DO_WHILE_STATEMENT defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement.StatementCase[FakeCallableDescriptorForObject]

'proto' @ [207:32] ==> value-parameter proto: JsAstProtoBuf.Statement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'doWhileStatement' @ [207:38] ==> public final val JsAstProtoBuf.Statement.doWhileStatement: (JsAstProtoBuf.DoWhile..JsAstProtoBuf.DoWhile?)[MyPropertyDescriptor]

'JsDoWhile' @ [208:13] ==> public constructor JsDoWhile(p0: (JsExpression..JsExpression?), p1: (JsStatement..JsStatement?)) defined in org.jetbrains.kotlin.js.backend.ast.JsDoWhile[JavaClassConstructorDescriptor]

'deserialize' @ [208:23] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'doWhileProto' @ [208:35] ==> val doWhileProto: (JsAstProtoBuf.DoWhile..JsAstProtoBuf.DoWhile?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'condition' @ [208:48] ==> public final val JsAstProtoBuf.DoWhile.condition: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'deserialize' @ [208:60] ==> private final fun deserialize(proto: JsAstProtoBuf.Statement): JsStatement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'doWhileProto' @ [208:72] ==> val doWhileProto: (JsAstProtoBuf.DoWhile..JsAstProtoBuf.DoWhile?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'body' @ [208:85] ==> public final val JsAstProtoBuf.DoWhile.body: (JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?)[MyPropertyDescriptor]

'FOR_STATEMENT' @ [211:23] ==> enum entry FOR_STATEMENT defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement.StatementCase[FakeCallableDescriptorForObject]

'proto' @ [212:28] ==> value-parameter proto: JsAstProtoBuf.Statement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'forStatement' @ [212:34] ==> public final val JsAstProtoBuf.Statement.forStatement: (JsAstProtoBuf.For..JsAstProtoBuf.For?)[MyPropertyDescriptor]

'if (forProto.hasVariables()) deserialize(forProto.variables) as JsVars else null' @ [213:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsVars?, elseBranch: JsVars?): JsVars?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsVars?

'forProto' @ [213:32] ==> val forProto: (JsAstProtoBuf.For..JsAstProtoBuf.For?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'hasVariables' @ [213:41] ==> public open fun hasVariables(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.For[JavaMethodDescriptor]

'deserialize' @ [213:57] ==> private final fun deserialize(proto: JsAstProtoBuf.Statement): JsStatement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'forProto' @ [213:69] ==> val forProto: (JsAstProtoBuf.For..JsAstProtoBuf.For?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'variables' @ [213:78] ==> public final val JsAstProtoBuf.For.variables: (JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?)[MyPropertyDescriptor]

'if (forProto.hasExpression()) deserialize(forProto.expression) else null' @ [214:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression?, elseBranch: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression?

'forProto' @ [214:32] ==> val forProto: (JsAstProtoBuf.For..JsAstProtoBuf.For?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'hasExpression' @ [214:41] ==> public open fun hasExpression(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.For[JavaMethodDescriptor]

'deserialize' @ [214:58] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'forProto' @ [214:70] ==> val forProto: (JsAstProtoBuf.For..JsAstProtoBuf.For?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'expression' @ [214:79] ==> public final val JsAstProtoBuf.For.expression: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'if (forProto.hasCondition()) deserialize(forProto.condition) else null' @ [215:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression?, elseBranch: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression?

'forProto' @ [215:33] ==> val forProto: (JsAstProtoBuf.For..JsAstProtoBuf.For?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'hasCondition' @ [215:42] ==> public open fun hasCondition(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.For[JavaMethodDescriptor]

'deserialize' @ [215:58] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'forProto' @ [215:70] ==> val forProto: (JsAstProtoBuf.For..JsAstProtoBuf.For?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'condition' @ [215:79] ==> public final val JsAstProtoBuf.For.condition: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'if (forProto.hasIncrement()) deserialize(forProto.increment) else null' @ [216:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression?, elseBranch: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression?

'forProto' @ [216:33] ==> val forProto: (JsAstProtoBuf.For..JsAstProtoBuf.For?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'hasIncrement' @ [216:42] ==> public open fun hasIncrement(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.For[JavaMethodDescriptor]

'deserialize' @ [216:58] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'forProto' @ [216:70] ==> val forProto: (JsAstProtoBuf.For..JsAstProtoBuf.For?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'increment' @ [216:79] ==> public final val JsAstProtoBuf.For.increment: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'deserialize' @ [217:24] ==> private final fun deserialize(proto: JsAstProtoBuf.Statement): JsStatement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'forProto' @ [217:36] ==> val forProto: (JsAstProtoBuf.For..JsAstProtoBuf.For?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'body' @ [217:45] ==> public final val JsAstProtoBuf.For.body: (JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?)[MyPropertyDescriptor]

'if (initVars != null) {
                JsFor(initVars, condition, increment, body)
            }
            else {
                JsFor(initExpr!!, condition, increment, body)
            }' @ [218:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsFor, elseBranch: JsFor): JsFor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsFor

'initVars' @ [218:17] ==> val initVars: JsVars? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'JsFor' @ [219:17] ==> public constructor JsFor(p0: (JsVars..JsVars?), p1: (JsExpression..JsExpression?), p2: (JsExpression..JsExpression?), p3: (JsStatement..JsStatement?)) defined in org.jetbrains.kotlin.js.backend.ast.JsFor[JavaClassConstructorDescriptor]

'initVars' @ [219:23] ==> val initVars: JsVars? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'condition' @ [219:33] ==> val condition: JsExpression? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'increment' @ [219:44] ==> val increment: JsExpression? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'body' @ [219:55] ==> val body: JsStatement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'JsFor' @ [222:17] ==> public constructor JsFor(p0: (JsExpression..JsExpression?), p1: (JsExpression..JsExpression?), p2: (JsExpression..JsExpression?), p3: (JsStatement..JsStatement?)) defined in org.jetbrains.kotlin.js.backend.ast.JsFor[JavaClassConstructorDescriptor]

'initExpr' @ [222:23] ==> val initExpr: JsExpression? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'condition' @ [222:35] ==> val condition: JsExpression? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'increment' @ [222:46] ==> val increment: JsExpression? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'body' @ [222:57] ==> val body: JsStatement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'FOR_IN_STATEMENT' @ [226:23] ==> enum entry FOR_IN_STATEMENT defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement.StatementCase[FakeCallableDescriptorForObject]

'proto' @ [227:30] ==> value-parameter proto: JsAstProtoBuf.Statement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'forInStatement' @ [227:36] ==> public final val JsAstProtoBuf.Statement.forInStatement: (JsAstProtoBuf.ForIn..JsAstProtoBuf.ForIn?)[MyPropertyDescriptor]

'if (forInProto.hasNameId()) deserializeName(forInProto.nameId) else null' @ [228:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsName?, elseBranch: JsName?): JsName?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsName?

'forInProto' @ [228:32] ==> val forInProto: (JsAstProtoBuf.ForIn..JsAstProtoBuf.ForIn?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'hasNameId' @ [228:43] ==> public open fun hasNameId(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.ForIn[JavaMethodDescriptor]

'deserializeName' @ [228:56] ==> private final fun deserializeName(id: Int): JsName defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'forInProto' @ [228:72] ==> val forInProto: (JsAstProtoBuf.ForIn..JsAstProtoBuf.ForIn?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'nameId' @ [228:83] ==> public final val JsAstProtoBuf.ForIn.nameId: Int[MyPropertyDescriptor]

'if (forInProto.hasExpression()) deserialize(forInProto.expression) else null' @ [229:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression?, elseBranch: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression?

'forInProto' @ [229:32] ==> val forInProto: (JsAstProtoBuf.ForIn..JsAstProtoBuf.ForIn?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'hasExpression' @ [229:43] ==> public open fun hasExpression(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.ForIn[JavaMethodDescriptor]

'deserialize' @ [229:60] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'forInProto' @ [229:72] ==> val forInProto: (JsAstProtoBuf.ForIn..JsAstProtoBuf.ForIn?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'expression' @ [229:83] ==> public final val JsAstProtoBuf.ForIn.expression: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'deserialize' @ [230:28] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'forInProto' @ [230:40] ==> val forInProto: (JsAstProtoBuf.ForIn..JsAstProtoBuf.ForIn?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'iterable' @ [230:51] ==> public final val JsAstProtoBuf.ForIn.iterable: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'deserialize' @ [231:24] ==> private final fun deserialize(proto: JsAstProtoBuf.Statement): JsStatement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'forInProto' @ [231:36] ==> val forInProto: (JsAstProtoBuf.ForIn..JsAstProtoBuf.ForIn?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'body' @ [231:47] ==> public final val JsAstProtoBuf.ForIn.body: (JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?)[MyPropertyDescriptor]

'JsForIn' @ [232:13] ==> public constructor JsForIn(p0: (JsName..JsName?), p1: (JsExpression..JsExpression?), p2: (JsExpression..JsExpression?), p3: (JsStatement..JsStatement?)) defined in org.jetbrains.kotlin.js.backend.ast.JsForIn[JavaClassConstructorDescriptor]

'iterName' @ [232:21] ==> val iterName: JsName? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'iterExpr' @ [232:31] ==> val iterExpr: JsExpression? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'iterable' @ [232:41] ==> val iterable: JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'body' @ [232:51] ==> val body: JsStatement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'TRY_STATEMENT' @ [235:23] ==> enum entry TRY_STATEMENT defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement.StatementCase[FakeCallableDescriptorForObject]

'proto' @ [236:28] ==> value-parameter proto: JsAstProtoBuf.Statement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'tryStatement' @ [236:34] ==> public final val JsAstProtoBuf.Statement.tryStatement: (JsAstProtoBuf.Try..JsAstProtoBuf.Try?)[MyPropertyDescriptor]

'deserialize' @ [237:28] ==> private final fun deserialize(proto: JsAstProtoBuf.Statement): JsStatement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'tryProto' @ [237:40] ==> val tryProto: (JsAstProtoBuf.Try..JsAstProtoBuf.Try?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'tryBlock' @ [237:49] ==> public final val JsAstProtoBuf.Try.tryBlock: (JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?)[MyPropertyDescriptor]

'if (tryProto.hasCatchBlock()) {
                val catchProto = tryProto.catchBlock
                JsCatch(deserializeName(catchProto.parameter.nameId)).apply {
                    body = deserialize(catchProto.body) as JsBlock
                }
            }
            else {
                null
            }' @ [238:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsCatch?, elseBranch: JsCatch?): JsCatch?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsCatch?

'tryProto' @ [238:34] ==> val tryProto: (JsAstProtoBuf.Try..JsAstProtoBuf.Try?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'hasCatchBlock' @ [238:43] ==> public open fun hasCatchBlock(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Try[JavaMethodDescriptor]

'tryProto' @ [239:34] ==> val tryProto: (JsAstProtoBuf.Try..JsAstProtoBuf.Try?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'catchBlock' @ [239:43] ==> public final val JsAstProtoBuf.Try.catchBlock: (JsAstProtoBuf.Catch..JsAstProtoBuf.Catch?)[MyPropertyDescriptor]

'JsCatch' @ [240:17] ==> public constructor JsCatch(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsCatch[JavaClassConstructorDescriptor]

'deserializeName' @ [240:25] ==> private final fun deserializeName(id: Int): JsName defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'catchProto' @ [240:41] ==> val catchProto: (JsAstProtoBuf.Catch..JsAstProtoBuf.Catch?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'parameter' @ [240:52] ==> public final val JsAstProtoBuf.Catch.parameter: (JsAstProtoBuf.Parameter..JsAstProtoBuf.Parameter?)[MyPropertyDescriptor]

'nameId' @ [240:62] ==> public final val JsAstProtoBuf.Parameter.nameId: Int[MyPropertyDescriptor]

'apply' @ [240:71] ==> @InlineOnly public inline fun <T> JsCatch.apply(block: JsCatch.() -> Unit): JsCatch defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsCatch

'body' @ [241:21] ==> public final var JsCatch.body: (JsBlock..JsBlock?)[MyPropertyDescriptor]

'deserialize' @ [241:28] ==> private final fun deserialize(proto: JsAstProtoBuf.Statement): JsStatement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'catchProto' @ [241:40] ==> val catchProto: (JsAstProtoBuf.Catch..JsAstProtoBuf.Catch?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'body' @ [241:51] ==> public final val JsAstProtoBuf.Catch.body: (JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?)[MyPropertyDescriptor]

'if (tryProto.hasFinallyBlock()) deserialize(tryProto.finallyBlock) as JsBlock else null' @ [247:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsBlock?, elseBranch: JsBlock?): JsBlock?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsBlock?

'tryProto' @ [247:36] ==> val tryProto: (JsAstProtoBuf.Try..JsAstProtoBuf.Try?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'hasFinallyBlock' @ [247:45] ==> public open fun hasFinallyBlock(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Try[JavaMethodDescriptor]

'deserialize' @ [247:64] ==> private final fun deserialize(proto: JsAstProtoBuf.Statement): JsStatement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'tryProto' @ [247:76] ==> val tryProto: (JsAstProtoBuf.Try..JsAstProtoBuf.Try?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'finallyBlock' @ [247:85] ==> public final val JsAstProtoBuf.Try.finallyBlock: (JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?)[MyPropertyDescriptor]

'JsTry' @ [248:13] ==> public constructor JsTry(p0: (JsBlock..JsBlock?), @Nullable p1: JsCatch?, @Nullable p2: JsBlock?) defined in org.jetbrains.kotlin.js.backend.ast.JsTry[JavaClassConstructorDescriptor]

'tryBlock' @ [248:19] ==> val tryBlock: JsBlock defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'catchBlock' @ [248:29] ==> val catchBlock: JsCatch? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'finallyBlock' @ [248:41] ==> val finallyBlock: JsBlock? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'EMPTY' @ [251:23] ==> enum entry EMPTY defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement.StatementCase[FakeCallableDescriptorForObject]

'JsEmpty' @ [251:32] ==> public object JsEmpty : SourceInfoAwareJsNode, JsStatement defined in org.jetbrains.kotlin.js.backend.ast[FakeCallableDescriptorForObject]

'STATEMENT_NOT_SET' @ [253:23] ==> enum entry STATEMENT_NOT_SET defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement.StatementCase[FakeCallableDescriptorForObject]

'error' @ [254:17] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'withLocation' @ [258:26] ==> private final fun <T : JsNode> withLocation(fileId: Int?, location: JsAstProtoBuf.Location?, action: () -> JsExpression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : JsNode> -> JsExpression

'if (proto.hasFileId()) proto.fileId else null' @ [259:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int?, elseBranch: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int?

'proto' @ [259:30] ==> value-parameter proto: JsAstProtoBuf.Expression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'hasFileId' @ [259:36] ==> public open fun hasFileId(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression[JavaMethodDescriptor]

'proto' @ [259:49] ==> value-parameter proto: JsAstProtoBuf.Expression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'fileId' @ [259:55] ==> public final val JsAstProtoBuf.Expression.fileId: Int[MyPropertyDescriptor]

'if (proto.hasLocation()) proto.location else null' @ [260:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsAstProtoBuf.Location?, elseBranch: JsAstProtoBuf.Location?): JsAstProtoBuf.Location?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Location?

'proto' @ [260:32] ==> value-parameter proto: JsAstProtoBuf.Expression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'hasLocation' @ [260:38] ==> public open fun hasLocation(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression[JavaMethodDescriptor]

'proto' @ [260:53] ==> value-parameter proto: JsAstProtoBuf.Expression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'location' @ [260:59] ==> public final val JsAstProtoBuf.Expression.location: (JsAstProtoBuf.Location..JsAstProtoBuf.Location?)[MyPropertyDescriptor]

'deserializeNoMetadata' @ [261:28] ==> private final fun deserializeNoMetadata(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [261:50] ==> value-parameter proto: JsAstProtoBuf.Expression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'expression' @ [263:9] ==> val expression: JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[LocalVariableDescriptor]

'synthetic' @ [263:20] ==> public var HasMetadata.synthetic: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'proto' @ [263:32] ==> value-parameter proto: JsAstProtoBuf.Expression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'synthetic' @ [263:38] ==> public final val JsAstProtoBuf.Expression.synthetic: Boolean[MyPropertyDescriptor]

'expression' @ [264:9] ==> val expression: JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[LocalVariableDescriptor]

'sideEffects' @ [264:20] ==> public var HasMetadata.sideEffects: SideEffectKind defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'map' @ [264:34] ==> private final fun map(sideEffects: JsAstProtoBuf.SideEffects): SideEffectKind defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [264:38] ==> value-parameter proto: JsAstProtoBuf.Expression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[ValueParameterDescriptorImpl]

'sideEffects' @ [264:44] ==> public final val JsAstProtoBuf.Expression.sideEffects: (JsAstProtoBuf.SideEffects..JsAstProtoBuf.SideEffects?)[MyPropertyDescriptor]

'expression' @ [265:16] ==> val expression: JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserialize[LocalVariableDescriptor]

'when (proto.expressionCase) {
        ExpressionCase.THIS_LITERAL -> JsThisRef()
        ExpressionCase.NULL_LITERAL -> JsNullLiteral()
        ExpressionCase.TRUE_LITERAL -> JsBooleanLiteral(true)
        ExpressionCase.FALSE_LITERAL -> JsBooleanLiteral(false)
        ExpressionCase.STRING_LITERAL -> JsStringLiteral(deserializeString(proto.stringLiteral))
        ExpressionCase.INT_LITERAL -> JsIntLiteral(proto.intLiteral)
        ExpressionCase.DOUBLE_LITERAL -> JsDoubleLiteral(proto.doubleLiteral)
        ExpressionCase.SIMPLE_NAME_REFERENCE -> JsNameRef(deserializeName(proto.simpleNameReference))

        ExpressionCase.REG_EXP_LITERAL -> {
            val regExpProto = proto.regExpLiteral
            JsRegExp().apply {
                pattern = deserializeString(regExpProto.patternStringId)
                if (regExpProto.hasFlagsStringId()) {
                    flags = deserializeString(regExpProto.flagsStringId)
                }
            }
        }

        ExpressionCase.ARRAY_LITERAL -> {
            val arrayProto = proto.arrayLiteral
            JsArrayLiteral(arrayProto.elementList.map { deserialize(it) })
        }

        ExpressionCase.OBJECT_LITERAL -> {
            val objectProto = proto.objectLiteral
            JsObjectLiteral(
                    objectProto.entryList.map { entryProto ->
                        JsPropertyInitializer(deserialize(entryProto.key), deserialize(entryProto.value))
                    },
                    objectProto.multiline
            )
        }

        ExpressionCase.FUNCTION -> {
            val functionProto = proto.function
            JsFunction(scope, deserialize(functionProto.body) as JsBlock, "").apply {
                parameters += functionProto.parameterList.map { deserializeParameter(it) }
                if (functionProto.hasNameId()) {
                    name = deserializeName(functionProto.nameId)
                }
                isLocal = functionProto.local
            }
        }

        ExpressionCase.DOC_COMMENT -> {
            val docCommentProto = proto.docComment
            JsDocComment(docCommentProto.tagList.associate { tagProto ->
                val name = deserializeString(tagProto.nameId)
                val value: Any = if (tagProto.hasExpression()) {
                    deserialize(tagProto.expression)
                }
                else {
                    deserializeString(tagProto.valueStringId)
                }
                name to value
            })
        }

        ExpressionCase.BINARY -> {
            val binaryProto = proto.binary
            JsBinaryOperation(map(binaryProto.type), deserialize(binaryProto.left), deserialize(binaryProto.right))
        }

        ExpressionCase.UNARY -> {
            val unaryProto = proto.unary
            val type = map(unaryProto.type)
            val operand = deserialize(unaryProto.operand)
            if (unaryProto.postfix) JsPostfixOperation(type, operand) else JsPrefixOperation(type, operand)
        }

        ExpressionCase.CONDITIONAL -> {
            val conditionalProto = proto.conditional
            JsConditional(
                    deserialize(conditionalProto.testExpression),
                    deserialize(conditionalProto.thenExpression),
                    deserialize(conditionalProto.elseExpression)
            )
        }

        ExpressionCase.ARRAY_ACCESS -> {
            val arrayAccessProto = proto.arrayAccess
            JsArrayAccess(deserialize(arrayAccessProto.array), deserialize(arrayAccessProto.index))
        }

        ExpressionCase.NAME_REFERENCE -> {
            val nameRefProto = proto.nameReference
            val qualifier = if (nameRefProto.hasQualifier()) deserialize(nameRefProto.qualifier) else null
            JsNameRef(deserializeName(nameRefProto.nameId), qualifier).apply {
                if (nameRefProto.hasInlineStrategy()) {
                    inlineStrategy = map(nameRefProto.inlineStrategy)
                }
            }
        }

        ExpressionCase.PROPERTY_REFERENCE -> {
            val propertyRefProto = proto.propertyReference
            val qualifier = if (propertyRefProto.hasQualifier()) deserialize(propertyRefProto.qualifier) else null
            JsNameRef(deserializeString(propertyRefProto.stringId), qualifier).apply {
                if (propertyRefProto.hasInlineStrategy()) {
                    inlineStrategy = map(propertyRefProto.inlineStrategy)
                }
            }
        }

        ExpressionCase.INVOCATION -> {
            val invocationProto = proto.invocation
            JsInvocation(
                    deserialize(invocationProto.qualifier),
                    invocationProto.argumentList.map { deserialize(it) }
            ).apply {
                if (invocationProto.hasInlineStrategy()) {
                    inlineStrategy = map(invocationProto.inlineStrategy)
                }
            }
        }

        ExpressionCase.INSTANTIATION -> {
            val instantiationProto = proto.instantiation
            JsNew(
                    deserialize(instantiationProto.qualifier),
                    instantiationProto.argumentList.map { deserialize(it) }
            )
        }

        null,
        ExpressionCase.EXPRESSION_NOT_SET -> error("Unknown expression")
    }' @ [268:74] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsExpression, entry1: JsExpression, entry2: JsExpression, entry3: JsExpression, entry4: JsExpression, entry5: JsExpression, entry6: JsExpression, entry7: JsExpression, entry8: JsExpression, entry9: JsExpression, entry10: JsExpression, entry11: JsExpression, entry12: JsExpression, entry13: JsExpression, entry14: JsExpression, entry15: JsExpression, entry16: JsExpression, entry17: JsExpression, entry18: JsExpression, entry19: JsExpression, entry20: JsExpression, entry21: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsExpression

'proto' @ [268:80] ==> value-parameter proto: JsAstProtoBuf.Expression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'expressionCase' @ [268:86] ==> public final val JsAstProtoBuf.Expression.expressionCase: (JsAstProtoBuf.Expression.ExpressionCase..JsAstProtoBuf.Expression.ExpressionCase?)[MyPropertyDescriptor]

'THIS_LITERAL' @ [269:24] ==> enum entry THIS_LITERAL defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression.ExpressionCase[FakeCallableDescriptorForObject]

'JsThisRef' @ [269:40] ==> public constructor JsThisRef() defined in org.jetbrains.kotlin.js.backend.ast.JsThisRef[JavaClassConstructorDescriptor]

'NULL_LITERAL' @ [270:24] ==> enum entry NULL_LITERAL defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression.ExpressionCase[FakeCallableDescriptorForObject]

'JsNullLiteral' @ [270:40] ==> public constructor JsNullLiteral() defined in org.jetbrains.kotlin.js.backend.ast.JsNullLiteral[JavaClassConstructorDescriptor]

'TRUE_LITERAL' @ [271:24] ==> enum entry TRUE_LITERAL defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression.ExpressionCase[FakeCallableDescriptorForObject]

'JsBooleanLiteral' @ [271:40] ==> public constructor JsBooleanLiteral(p0: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsBooleanLiteral[JavaClassConstructorDescriptor]

'FALSE_LITERAL' @ [272:24] ==> enum entry FALSE_LITERAL defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression.ExpressionCase[FakeCallableDescriptorForObject]

'JsBooleanLiteral' @ [272:41] ==> public constructor JsBooleanLiteral(p0: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsBooleanLiteral[JavaClassConstructorDescriptor]

'STRING_LITERAL' @ [273:24] ==> enum entry STRING_LITERAL defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression.ExpressionCase[FakeCallableDescriptorForObject]

'JsStringLiteral' @ [273:42] ==> public constructor JsStringLiteral(p0: (String..String?)) defined in org.jetbrains.kotlin.js.backend.ast.JsStringLiteral[JavaClassConstructorDescriptor]

'deserializeString' @ [273:58] ==> private final fun deserializeString(id: Int): String defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [273:76] ==> value-parameter proto: JsAstProtoBuf.Expression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'stringLiteral' @ [273:82] ==> public final val JsAstProtoBuf.Expression.stringLiteral: Int[MyPropertyDescriptor]

'INT_LITERAL' @ [274:24] ==> enum entry INT_LITERAL defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression.ExpressionCase[FakeCallableDescriptorForObject]

'JsIntLiteral' @ [274:39] ==> public constructor JsIntLiteral(p0: Int) defined in org.jetbrains.kotlin.js.backend.ast.JsIntLiteral[JavaClassConstructorDescriptor]

'proto' @ [274:52] ==> value-parameter proto: JsAstProtoBuf.Expression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'intLiteral' @ [274:58] ==> public final val JsAstProtoBuf.Expression.intLiteral: Int[MyPropertyDescriptor]

'DOUBLE_LITERAL' @ [275:24] ==> enum entry DOUBLE_LITERAL defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression.ExpressionCase[FakeCallableDescriptorForObject]

'JsDoubleLiteral' @ [275:42] ==> public constructor JsDoubleLiteral(p0: Double) defined in org.jetbrains.kotlin.js.backend.ast.JsDoubleLiteral[JavaClassConstructorDescriptor]

'proto' @ [275:58] ==> value-parameter proto: JsAstProtoBuf.Expression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'doubleLiteral' @ [275:64] ==> public final val JsAstProtoBuf.Expression.doubleLiteral: Double[MyPropertyDescriptor]

'SIMPLE_NAME_REFERENCE' @ [276:24] ==> enum entry SIMPLE_NAME_REFERENCE defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression.ExpressionCase[FakeCallableDescriptorForObject]

'JsNameRef' @ [276:49] ==> public constructor JsNameRef(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'deserializeName' @ [276:59] ==> private final fun deserializeName(id: Int): JsName defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [276:75] ==> value-parameter proto: JsAstProtoBuf.Expression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'simpleNameReference' @ [276:81] ==> public final val JsAstProtoBuf.Expression.simpleNameReference: Int[MyPropertyDescriptor]

'REG_EXP_LITERAL' @ [278:24] ==> enum entry REG_EXP_LITERAL defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression.ExpressionCase[FakeCallableDescriptorForObject]

'proto' @ [279:31] ==> value-parameter proto: JsAstProtoBuf.Expression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'regExpLiteral' @ [279:37] ==> public final val JsAstProtoBuf.Expression.regExpLiteral: (JsAstProtoBuf.RegExpLiteral..JsAstProtoBuf.RegExpLiteral?)[MyPropertyDescriptor]

'JsRegExp' @ [280:13] ==> public constructor JsRegExp() defined in org.jetbrains.kotlin.js.backend.ast.JsRegExp[JavaClassConstructorDescriptor]

'apply' @ [280:24] ==> @InlineOnly public inline fun <T> JsRegExp.apply(block: JsRegExp.() -> Unit): JsRegExp defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsRegExp

'pattern' @ [281:17] ==> public final var JsRegExp.pattern: (String..String?)[MyPropertyDescriptor]

'deserializeString' @ [281:27] ==> private final fun deserializeString(id: Int): String defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'regExpProto' @ [281:45] ==> val regExpProto: (JsAstProtoBuf.RegExpLiteral..JsAstProtoBuf.RegExpLiteral?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'patternStringId' @ [281:57] ==> public final val JsAstProtoBuf.RegExpLiteral.patternStringId: Int[MyPropertyDescriptor]

'regExpProto' @ [282:21] ==> val regExpProto: (JsAstProtoBuf.RegExpLiteral..JsAstProtoBuf.RegExpLiteral?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'hasFlagsStringId' @ [282:33] ==> public open fun hasFlagsStringId(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.RegExpLiteral[JavaMethodDescriptor]

'flags' @ [283:21] ==> public final var JsRegExp.flags: (String..String?)[MyPropertyDescriptor]

'deserializeString' @ [283:29] ==> private final fun deserializeString(id: Int): String defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'regExpProto' @ [283:47] ==> val regExpProto: (JsAstProtoBuf.RegExpLiteral..JsAstProtoBuf.RegExpLiteral?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'flagsStringId' @ [283:59] ==> public final val JsAstProtoBuf.RegExpLiteral.flagsStringId: Int[MyPropertyDescriptor]

'ARRAY_LITERAL' @ [288:24] ==> enum entry ARRAY_LITERAL defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression.ExpressionCase[FakeCallableDescriptorForObject]

'proto' @ [289:30] ==> value-parameter proto: JsAstProtoBuf.Expression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'arrayLiteral' @ [289:36] ==> public final val JsAstProtoBuf.Expression.arrayLiteral: (JsAstProtoBuf.ArrayLiteral..JsAstProtoBuf.ArrayLiteral?)[MyPropertyDescriptor]

'JsArrayLiteral' @ [290:13] ==> public constructor JsArrayLiteral(p0: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>?)) defined in org.jetbrains.kotlin.js.backend.ast.JsArrayLiteral[JavaClassConstructorDescriptor]

'arrayProto' @ [290:28] ==> val arrayProto: (JsAstProtoBuf.ArrayLiteral..JsAstProtoBuf.ArrayLiteral?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'elementList' @ [290:39] ==> public final val JsAstProtoBuf.ArrayLiteral.elementList: (MutableList<(JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)>..List<(JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)>?)[MyPropertyDescriptor]

'map' @ [290:51] ==> public inline fun <T, R> Iterable<(JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)>.map(transform: ((JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)) -> JsExpression): List<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression..org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression?)
    <R> -> JsExpression

'deserialize' @ [290:57] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'it' @ [290:69] ==> value-parameter it: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata.<anonymous>[ValueParameterDescriptorImpl]

'OBJECT_LITERAL' @ [293:24] ==> enum entry OBJECT_LITERAL defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression.ExpressionCase[FakeCallableDescriptorForObject]

'proto' @ [294:31] ==> value-parameter proto: JsAstProtoBuf.Expression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'objectLiteral' @ [294:37] ==> public final val JsAstProtoBuf.Expression.objectLiteral: (JsAstProtoBuf.ObjectLiteral..JsAstProtoBuf.ObjectLiteral?)[MyPropertyDescriptor]

'JsObjectLiteral' @ [295:13] ==> public constructor JsObjectLiteral(p0: (MutableList<(JsPropertyInitializer..JsPropertyInitializer?)>..List<(JsPropertyInitializer..JsPropertyInitializer?)>?), p1: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsObjectLiteral[JavaClassConstructorDescriptor]

'objectProto' @ [296:21] ==> val objectProto: (JsAstProtoBuf.ObjectLiteral..JsAstProtoBuf.ObjectLiteral?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'entryList' @ [296:33] ==> public final val JsAstProtoBuf.ObjectLiteral.entryList: (MutableList<(JsAstProtoBuf.ObjectLiteralEntry..JsAstProtoBuf.ObjectLiteralEntry?)>..List<(JsAstProtoBuf.ObjectLiteralEntry..JsAstProtoBuf.ObjectLiteralEntry?)>?)[MyPropertyDescriptor]

'map' @ [296:43] ==> public inline fun <T, R> Iterable<(JsAstProtoBuf.ObjectLiteralEntry..JsAstProtoBuf.ObjectLiteralEntry?)>.map(transform: ((JsAstProtoBuf.ObjectLiteralEntry..JsAstProtoBuf.ObjectLiteralEntry?)) -> JsPropertyInitializer): List<JsPropertyInitializer> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.ObjectLiteralEntry..org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.ObjectLiteralEntry?)
    <R> -> JsPropertyInitializer

'JsPropertyInitializer' @ [297:25] ==> public constructor JsPropertyInitializer(@NotNull p0: JsExpression, @NotNull p1: JsExpression) defined in org.jetbrains.kotlin.js.backend.ast.JsPropertyInitializer[JavaClassConstructorDescriptor]

'deserialize' @ [297:47] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'entryProto' @ [297:59] ==> value-parameter entryProto: (JsAstProtoBuf.ObjectLiteralEntry..JsAstProtoBuf.ObjectLiteralEntry?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [297:70] ==> public final val JsAstProtoBuf.ObjectLiteralEntry.key: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'deserialize' @ [297:76] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'entryProto' @ [297:88] ==> value-parameter entryProto: (JsAstProtoBuf.ObjectLiteralEntry..JsAstProtoBuf.ObjectLiteralEntry?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [297:99] ==> public final val JsAstProtoBuf.ObjectLiteralEntry.value: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'objectProto' @ [299:21] ==> val objectProto: (JsAstProtoBuf.ObjectLiteral..JsAstProtoBuf.ObjectLiteral?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'multiline' @ [299:33] ==> public final val JsAstProtoBuf.ObjectLiteral.multiline: Boolean[MyPropertyDescriptor]

'FUNCTION' @ [303:24] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression.ExpressionCase[FakeCallableDescriptorForObject]

'proto' @ [304:33] ==> value-parameter proto: JsAstProtoBuf.Expression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'function' @ [304:39] ==> public final val JsAstProtoBuf.Expression.function: (JsAstProtoBuf.Function..JsAstProtoBuf.Function?)[MyPropertyDescriptor]

'JsFunction' @ [305:13] ==> public constructor JsFunction(@NotNull p0: JsScope, @NotNull p1: JsBlock, @NotNull p2: String) defined in org.jetbrains.kotlin.js.backend.ast.JsFunction[JavaClassConstructorDescriptor]

'scope' @ [305:24] ==> private final val scope: JsRootScope defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[PropertyDescriptorImpl]

'deserialize' @ [305:31] ==> private final fun deserialize(proto: JsAstProtoBuf.Statement): JsStatement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'functionProto' @ [305:43] ==> val functionProto: (JsAstProtoBuf.Function..JsAstProtoBuf.Function?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'body' @ [305:57] ==> public final val JsAstProtoBuf.Function.body: (JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?)[MyPropertyDescriptor]

'apply' @ [305:79] ==> @InlineOnly public inline fun <T> JsFunction.apply(block: JsFunction.() -> Unit): JsFunction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsFunction

'parameters' @ [306:17] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'functionProto' @ [306:31] ==> val functionProto: (JsAstProtoBuf.Function..JsAstProtoBuf.Function?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'parameterList' @ [306:45] ==> public final val JsAstProtoBuf.Function.parameterList: (MutableList<(JsAstProtoBuf.Parameter..JsAstProtoBuf.Parameter?)>..List<(JsAstProtoBuf.Parameter..JsAstProtoBuf.Parameter?)>?)[MyPropertyDescriptor]

'map' @ [306:59] ==> public inline fun <T, R> Iterable<(JsAstProtoBuf.Parameter..JsAstProtoBuf.Parameter?)>.map(transform: ((JsAstProtoBuf.Parameter..JsAstProtoBuf.Parameter?)) -> JsParameter): List<JsParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Parameter..org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Parameter?)
    <R> -> JsParameter

'deserializeParameter' @ [306:65] ==> private final fun deserializeParameter(proto: JsAstProtoBuf.Parameter): JsParameter defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'it' @ [306:86] ==> value-parameter it: (JsAstProtoBuf.Parameter..JsAstProtoBuf.Parameter?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'functionProto' @ [307:21] ==> val functionProto: (JsAstProtoBuf.Function..JsAstProtoBuf.Function?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'hasNameId' @ [307:35] ==> public open fun hasNameId(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Function[JavaMethodDescriptor]

'name' @ [308:21] ==> public final var JsFunction.name: (JsName..JsName?)[MyPropertyDescriptor]

'deserializeName' @ [308:28] ==> private final fun deserializeName(id: Int): JsName defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'functionProto' @ [308:44] ==> val functionProto: (JsAstProtoBuf.Function..JsAstProtoBuf.Function?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'nameId' @ [308:58] ==> public final val JsAstProtoBuf.Function.nameId: Int[MyPropertyDescriptor]

'isLocal' @ [310:17] ==> public var JsFunction.isLocal: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'functionProto' @ [310:27] ==> val functionProto: (JsAstProtoBuf.Function..JsAstProtoBuf.Function?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'local' @ [310:41] ==> public final val JsAstProtoBuf.Function.local: Boolean[MyPropertyDescriptor]

'DOC_COMMENT' @ [314:24] ==> enum entry DOC_COMMENT defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression.ExpressionCase[FakeCallableDescriptorForObject]

'proto' @ [315:35] ==> value-parameter proto: JsAstProtoBuf.Expression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'docComment' @ [315:41] ==> public final val JsAstProtoBuf.Expression.docComment: (JsAstProtoBuf.DocComment..JsAstProtoBuf.DocComment?)[MyPropertyDescriptor]

'JsDocComment' @ [316:13] ==> public constructor JsDocComment(p0: (MutableMap<(String..String?), (Any..Any?)>..Map<(String..String?), (Any..Any?)>?)) defined in org.jetbrains.kotlin.js.backend.ast.JsDocComment[JavaClassConstructorDescriptor]

'docCommentProto' @ [316:26] ==> val docCommentProto: (JsAstProtoBuf.DocComment..JsAstProtoBuf.DocComment?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'tagList' @ [316:42] ==> public final val JsAstProtoBuf.DocComment.tagList: (MutableList<(JsAstProtoBuf.DocCommentTag..JsAstProtoBuf.DocCommentTag?)>..List<(JsAstProtoBuf.DocCommentTag..JsAstProtoBuf.DocCommentTag?)>?)[MyPropertyDescriptor]

'associate' @ [316:50] ==> public inline fun <T, K, V> Iterable<(JsAstProtoBuf.DocCommentTag..JsAstProtoBuf.DocCommentTag?)>.associate(transform: ((JsAstProtoBuf.DocCommentTag..JsAstProtoBuf.DocCommentTag?)) -> Pair<(String..String?), Any>): Map<(String..String?), Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.DocCommentTag..org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.DocCommentTag?)
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> Any

'deserializeString' @ [317:28] ==> private final fun deserializeString(id: Int): String defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'tagProto' @ [317:46] ==> value-parameter tagProto: (JsAstProtoBuf.DocCommentTag..JsAstProtoBuf.DocCommentTag?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata.<anonymous>[ValueParameterDescriptorImpl]

'nameId' @ [317:55] ==> public final val JsAstProtoBuf.DocCommentTag.nameId: Int[MyPropertyDescriptor]

'if (tagProto.hasExpression()) {
                    deserialize(tagProto.expression)
                }
                else {
                    deserializeString(tagProto.valueStringId)
                }' @ [318:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'tagProto' @ [318:38] ==> value-parameter tagProto: (JsAstProtoBuf.DocCommentTag..JsAstProtoBuf.DocCommentTag?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata.<anonymous>[ValueParameterDescriptorImpl]

'hasExpression' @ [318:47] ==> public open fun hasExpression(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.DocCommentTag[JavaMethodDescriptor]

'deserialize' @ [319:21] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'tagProto' @ [319:33] ==> value-parameter tagProto: (JsAstProtoBuf.DocCommentTag..JsAstProtoBuf.DocCommentTag?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [319:42] ==> public final val JsAstProtoBuf.DocCommentTag.expression: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'deserializeString' @ [322:21] ==> private final fun deserializeString(id: Int): String defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'tagProto' @ [322:39] ==> value-parameter tagProto: (JsAstProtoBuf.DocCommentTag..JsAstProtoBuf.DocCommentTag?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata.<anonymous>[ValueParameterDescriptorImpl]

'valueStringId' @ [322:48] ==> public final val JsAstProtoBuf.DocCommentTag.valueStringId: Int[MyPropertyDescriptor]

'name' @ [324:17] ==> val name: String defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata.<anonymous>[LocalVariableDescriptor]

'value' @ [324:25] ==> val value: Any defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata.<anonymous>[LocalVariableDescriptor]

'BINARY' @ [328:24] ==> enum entry BINARY defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression.ExpressionCase[FakeCallableDescriptorForObject]

'proto' @ [329:31] ==> value-parameter proto: JsAstProtoBuf.Expression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'binary' @ [329:37] ==> public final val JsAstProtoBuf.Expression.binary: (JsAstProtoBuf.BinaryOperation..JsAstProtoBuf.BinaryOperation?)[MyPropertyDescriptor]

'JsBinaryOperation' @ [330:13] ==> public constructor JsBinaryOperation(@NotNull p0: JsBinaryOperator, @Nullable p1: JsExpression?, @Nullable p2: JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaClassConstructorDescriptor]

'map' @ [330:31] ==> private final fun map(op: JsAstProtoBuf.BinaryOperation.Type): JsBinaryOperator defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'binaryProto' @ [330:35] ==> val binaryProto: (JsAstProtoBuf.BinaryOperation..JsAstProtoBuf.BinaryOperation?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'type' @ [330:47] ==> public final val JsAstProtoBuf.BinaryOperation.type: (JsAstProtoBuf.BinaryOperation.Type..JsAstProtoBuf.BinaryOperation.Type?)[MyPropertyDescriptor]

'deserialize' @ [330:54] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'binaryProto' @ [330:66] ==> val binaryProto: (JsAstProtoBuf.BinaryOperation..JsAstProtoBuf.BinaryOperation?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'left' @ [330:78] ==> public final val JsAstProtoBuf.BinaryOperation.left: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'deserialize' @ [330:85] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'binaryProto' @ [330:97] ==> val binaryProto: (JsAstProtoBuf.BinaryOperation..JsAstProtoBuf.BinaryOperation?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'right' @ [330:109] ==> public final val JsAstProtoBuf.BinaryOperation.right: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'UNARY' @ [333:24] ==> enum entry UNARY defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression.ExpressionCase[FakeCallableDescriptorForObject]

'proto' @ [334:30] ==> value-parameter proto: JsAstProtoBuf.Expression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'unary' @ [334:36] ==> public final val JsAstProtoBuf.Expression.unary: (JsAstProtoBuf.UnaryOperation..JsAstProtoBuf.UnaryOperation?)[MyPropertyDescriptor]

'map' @ [335:24] ==> private final fun map(op: JsAstProtoBuf.UnaryOperation.Type): JsUnaryOperator defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'unaryProto' @ [335:28] ==> val unaryProto: (JsAstProtoBuf.UnaryOperation..JsAstProtoBuf.UnaryOperation?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'type' @ [335:39] ==> public final val JsAstProtoBuf.UnaryOperation.type: (JsAstProtoBuf.UnaryOperation.Type..JsAstProtoBuf.UnaryOperation.Type?)[MyPropertyDescriptor]

'deserialize' @ [336:27] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'unaryProto' @ [336:39] ==> val unaryProto: (JsAstProtoBuf.UnaryOperation..JsAstProtoBuf.UnaryOperation?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'operand' @ [336:50] ==> public final val JsAstProtoBuf.UnaryOperation.operand: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'if (unaryProto.postfix) JsPostfixOperation(type, operand) else JsPrefixOperation(type, operand)' @ [337:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsUnaryOperation, elseBranch: JsUnaryOperation): JsUnaryOperation[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsUnaryOperation

'unaryProto' @ [337:17] ==> val unaryProto: (JsAstProtoBuf.UnaryOperation..JsAstProtoBuf.UnaryOperation?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'postfix' @ [337:28] ==> public final val JsAstProtoBuf.UnaryOperation.postfix: Boolean[MyPropertyDescriptor]

'JsPostfixOperation' @ [337:37] ==> public constructor JsPostfixOperation(p0: (JsUnaryOperator..JsUnaryOperator?), p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsPostfixOperation[JavaClassConstructorDescriptor]

'type' @ [337:56] ==> val type: JsUnaryOperator defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'operand' @ [337:62] ==> val operand: JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'JsPrefixOperation' @ [337:76] ==> public constructor JsPrefixOperation(p0: (JsUnaryOperator..JsUnaryOperator?), p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsPrefixOperation[JavaClassConstructorDescriptor]

'type' @ [337:94] ==> val type: JsUnaryOperator defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'operand' @ [337:100] ==> val operand: JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'CONDITIONAL' @ [340:24] ==> enum entry CONDITIONAL defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression.ExpressionCase[FakeCallableDescriptorForObject]

'proto' @ [341:36] ==> value-parameter proto: JsAstProtoBuf.Expression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'conditional' @ [341:42] ==> public final val JsAstProtoBuf.Expression.conditional: (JsAstProtoBuf.Conditional..JsAstProtoBuf.Conditional?)[MyPropertyDescriptor]

'JsConditional' @ [342:13] ==> public constructor JsConditional(p0: (JsExpression..JsExpression?), p1: (JsExpression..JsExpression?), p2: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsConditional[JavaClassConstructorDescriptor]

'deserialize' @ [343:21] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'conditionalProto' @ [343:33] ==> val conditionalProto: (JsAstProtoBuf.Conditional..JsAstProtoBuf.Conditional?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'testExpression' @ [343:50] ==> public final val JsAstProtoBuf.Conditional.testExpression: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'deserialize' @ [344:21] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'conditionalProto' @ [344:33] ==> val conditionalProto: (JsAstProtoBuf.Conditional..JsAstProtoBuf.Conditional?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'thenExpression' @ [344:50] ==> public final val JsAstProtoBuf.Conditional.thenExpression: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'deserialize' @ [345:21] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'conditionalProto' @ [345:33] ==> val conditionalProto: (JsAstProtoBuf.Conditional..JsAstProtoBuf.Conditional?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'elseExpression' @ [345:50] ==> public final val JsAstProtoBuf.Conditional.elseExpression: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'ARRAY_ACCESS' @ [349:24] ==> enum entry ARRAY_ACCESS defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression.ExpressionCase[FakeCallableDescriptorForObject]

'proto' @ [350:36] ==> value-parameter proto: JsAstProtoBuf.Expression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'arrayAccess' @ [350:42] ==> public final val JsAstProtoBuf.Expression.arrayAccess: (JsAstProtoBuf.ArrayAccess..JsAstProtoBuf.ArrayAccess?)[MyPropertyDescriptor]

'JsArrayAccess' @ [351:13] ==> public constructor JsArrayAccess(p0: (JsExpression..JsExpression?), p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsArrayAccess[JavaClassConstructorDescriptor]

'deserialize' @ [351:27] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'arrayAccessProto' @ [351:39] ==> val arrayAccessProto: (JsAstProtoBuf.ArrayAccess..JsAstProtoBuf.ArrayAccess?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'array' @ [351:56] ==> public final val JsAstProtoBuf.ArrayAccess.array: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'deserialize' @ [351:64] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'arrayAccessProto' @ [351:76] ==> val arrayAccessProto: (JsAstProtoBuf.ArrayAccess..JsAstProtoBuf.ArrayAccess?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'index' @ [351:93] ==> public final val JsAstProtoBuf.ArrayAccess.index: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'NAME_REFERENCE' @ [354:24] ==> enum entry NAME_REFERENCE defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression.ExpressionCase[FakeCallableDescriptorForObject]

'proto' @ [355:32] ==> value-parameter proto: JsAstProtoBuf.Expression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'nameReference' @ [355:38] ==> public final val JsAstProtoBuf.Expression.nameReference: (JsAstProtoBuf.NameReference..JsAstProtoBuf.NameReference?)[MyPropertyDescriptor]

'if (nameRefProto.hasQualifier()) deserialize(nameRefProto.qualifier) else null' @ [356:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression?, elseBranch: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression?

'nameRefProto' @ [356:33] ==> val nameRefProto: (JsAstProtoBuf.NameReference..JsAstProtoBuf.NameReference?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'hasQualifier' @ [356:46] ==> public open fun hasQualifier(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.NameReference[JavaMethodDescriptor]

'deserialize' @ [356:62] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'nameRefProto' @ [356:74] ==> val nameRefProto: (JsAstProtoBuf.NameReference..JsAstProtoBuf.NameReference?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'qualifier' @ [356:87] ==> public final val JsAstProtoBuf.NameReference.qualifier: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'JsNameRef' @ [357:13] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'deserializeName' @ [357:23] ==> private final fun deserializeName(id: Int): JsName defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'nameRefProto' @ [357:39] ==> val nameRefProto: (JsAstProtoBuf.NameReference..JsAstProtoBuf.NameReference?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'nameId' @ [357:52] ==> public final val JsAstProtoBuf.NameReference.nameId: Int[MyPropertyDescriptor]

'qualifier' @ [357:61] ==> val qualifier: JsExpression? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'apply' @ [357:72] ==> @InlineOnly public inline fun <T> JsNameRef.apply(block: JsNameRef.() -> Unit): JsNameRef defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNameRef

'nameRefProto' @ [358:21] ==> val nameRefProto: (JsAstProtoBuf.NameReference..JsAstProtoBuf.NameReference?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'hasInlineStrategy' @ [358:34] ==> public open fun hasInlineStrategy(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.NameReference[JavaMethodDescriptor]

'inlineStrategy' @ [359:21] ==> public var JsNameRef.inlineStrategy: InlineStrategy? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'map' @ [359:38] ==> private final fun map(inlineStrategy: JsAstProtoBuf.InlineStrategy): InlineStrategy defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'nameRefProto' @ [359:42] ==> val nameRefProto: (JsAstProtoBuf.NameReference..JsAstProtoBuf.NameReference?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'inlineStrategy' @ [359:55] ==> public final val JsAstProtoBuf.NameReference.inlineStrategy: (JsAstProtoBuf.InlineStrategy..JsAstProtoBuf.InlineStrategy?)[MyPropertyDescriptor]

'PROPERTY_REFERENCE' @ [364:24] ==> enum entry PROPERTY_REFERENCE defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression.ExpressionCase[FakeCallableDescriptorForObject]

'proto' @ [365:36] ==> value-parameter proto: JsAstProtoBuf.Expression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'propertyReference' @ [365:42] ==> public final val JsAstProtoBuf.Expression.propertyReference: (JsAstProtoBuf.PropertyReference..JsAstProtoBuf.PropertyReference?)[MyPropertyDescriptor]

'if (propertyRefProto.hasQualifier()) deserialize(propertyRefProto.qualifier) else null' @ [366:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression?, elseBranch: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression?

'propertyRefProto' @ [366:33] ==> val propertyRefProto: (JsAstProtoBuf.PropertyReference..JsAstProtoBuf.PropertyReference?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'hasQualifier' @ [366:50] ==> public open fun hasQualifier(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.PropertyReference[JavaMethodDescriptor]

'deserialize' @ [366:66] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'propertyRefProto' @ [366:78] ==> val propertyRefProto: (JsAstProtoBuf.PropertyReference..JsAstProtoBuf.PropertyReference?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'qualifier' @ [366:95] ==> public final val JsAstProtoBuf.PropertyReference.qualifier: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'JsNameRef' @ [367:13] ==> public constructor JsNameRef(@NotNull p0: String, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'deserializeString' @ [367:23] ==> private final fun deserializeString(id: Int): String defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'propertyRefProto' @ [367:41] ==> val propertyRefProto: (JsAstProtoBuf.PropertyReference..JsAstProtoBuf.PropertyReference?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'stringId' @ [367:58] ==> public final val JsAstProtoBuf.PropertyReference.stringId: Int[MyPropertyDescriptor]

'qualifier' @ [367:69] ==> val qualifier: JsExpression? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'apply' @ [367:80] ==> @InlineOnly public inline fun <T> JsNameRef.apply(block: JsNameRef.() -> Unit): JsNameRef defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNameRef

'propertyRefProto' @ [368:21] ==> val propertyRefProto: (JsAstProtoBuf.PropertyReference..JsAstProtoBuf.PropertyReference?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'hasInlineStrategy' @ [368:38] ==> public open fun hasInlineStrategy(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.PropertyReference[JavaMethodDescriptor]

'inlineStrategy' @ [369:21] ==> public var JsNameRef.inlineStrategy: InlineStrategy? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'map' @ [369:38] ==> private final fun map(inlineStrategy: JsAstProtoBuf.InlineStrategy): InlineStrategy defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'propertyRefProto' @ [369:42] ==> val propertyRefProto: (JsAstProtoBuf.PropertyReference..JsAstProtoBuf.PropertyReference?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'inlineStrategy' @ [369:59] ==> public final val JsAstProtoBuf.PropertyReference.inlineStrategy: (JsAstProtoBuf.InlineStrategy..JsAstProtoBuf.InlineStrategy?)[MyPropertyDescriptor]

'INVOCATION' @ [374:24] ==> enum entry INVOCATION defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression.ExpressionCase[FakeCallableDescriptorForObject]

'proto' @ [375:35] ==> value-parameter proto: JsAstProtoBuf.Expression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'invocation' @ [375:41] ==> public final val JsAstProtoBuf.Expression.invocation: (JsAstProtoBuf.Invocation..JsAstProtoBuf.Invocation?)[MyPropertyDescriptor]

'JsInvocation' @ [376:13] ==> public constructor JsInvocation(@NotNull p0: JsExpression, @NotNull p1: (MutableList<out (JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'deserialize' @ [377:21] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'invocationProto' @ [377:33] ==> val invocationProto: (JsAstProtoBuf.Invocation..JsAstProtoBuf.Invocation?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'qualifier' @ [377:49] ==> public final val JsAstProtoBuf.Invocation.qualifier: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'invocationProto' @ [378:21] ==> val invocationProto: (JsAstProtoBuf.Invocation..JsAstProtoBuf.Invocation?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'argumentList' @ [378:37] ==> public final val JsAstProtoBuf.Invocation.argumentList: (MutableList<(JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)>..List<(JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)>?)[MyPropertyDescriptor]

'map' @ [378:50] ==> public inline fun <T, R> Iterable<(JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)>.map(transform: ((JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)) -> JsExpression): List<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression..org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression?)
    <R> -> JsExpression

'deserialize' @ [378:56] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'it' @ [378:68] ==> value-parameter it: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata.<anonymous>[ValueParameterDescriptorImpl]

'apply' @ [379:15] ==> @InlineOnly public inline fun <T> JsInvocation.apply(block: JsInvocation.() -> Unit): JsInvocation defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsInvocation

'invocationProto' @ [380:21] ==> val invocationProto: (JsAstProtoBuf.Invocation..JsAstProtoBuf.Invocation?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'hasInlineStrategy' @ [380:37] ==> public open fun hasInlineStrategy(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Invocation[JavaMethodDescriptor]

'inlineStrategy' @ [381:21] ==> public var JsInvocation.inlineStrategy: InlineStrategy? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'map' @ [381:38] ==> private final fun map(inlineStrategy: JsAstProtoBuf.InlineStrategy): InlineStrategy defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'invocationProto' @ [381:42] ==> val invocationProto: (JsAstProtoBuf.Invocation..JsAstProtoBuf.Invocation?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'inlineStrategy' @ [381:58] ==> public final val JsAstProtoBuf.Invocation.inlineStrategy: (JsAstProtoBuf.InlineStrategy..JsAstProtoBuf.InlineStrategy?)[MyPropertyDescriptor]

'INSTANTIATION' @ [386:24] ==> enum entry INSTANTIATION defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression.ExpressionCase[FakeCallableDescriptorForObject]

'proto' @ [387:38] ==> value-parameter proto: JsAstProtoBuf.Expression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[ValueParameterDescriptorImpl]

'instantiation' @ [387:44] ==> public final val JsAstProtoBuf.Expression.instantiation: (JsAstProtoBuf.Instantiation..JsAstProtoBuf.Instantiation?)[MyPropertyDescriptor]

'JsNew' @ [388:13] ==> public constructor JsNew(p0: (JsExpression..JsExpression?), p1: (MutableList<out (JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNew[JavaClassConstructorDescriptor]

'deserialize' @ [389:21] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'instantiationProto' @ [389:33] ==> val instantiationProto: (JsAstProtoBuf.Instantiation..JsAstProtoBuf.Instantiation?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'qualifier' @ [389:52] ==> public final val JsAstProtoBuf.Instantiation.qualifier: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'instantiationProto' @ [390:21] ==> val instantiationProto: (JsAstProtoBuf.Instantiation..JsAstProtoBuf.Instantiation?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata[LocalVariableDescriptor]

'argumentList' @ [390:40] ==> public final val JsAstProtoBuf.Instantiation.argumentList: (MutableList<(JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)>..List<(JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)>?)[MyPropertyDescriptor]

'map' @ [390:53] ==> public inline fun <T, R> Iterable<(JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)>.map(transform: ((JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)) -> JsExpression): List<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression..org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression?)
    <R> -> JsExpression

'deserialize' @ [390:59] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'it' @ [390:71] ==> value-parameter it: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeNoMetadata.<anonymous>[ValueParameterDescriptorImpl]

'EXPRESSION_NOT_SET' @ [395:24] ==> enum entry EXPRESSION_NOT_SET defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Expression.ExpressionCase[FakeCallableDescriptorForObject]

'error' @ [395:46] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'JsVars' @ [399:20] ==> public constructor JsVars(p0: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsVars[JavaClassConstructorDescriptor]

'proto' @ [399:27] ==> value-parameter proto: JsAstProtoBuf.Vars defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeVars[ValueParameterDescriptorImpl]

'multiline' @ [399:33] ==> public final val JsAstProtoBuf.Vars.multiline: Boolean[MyPropertyDescriptor]

'proto' @ [400:27] ==> value-parameter proto: JsAstProtoBuf.Vars defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeVars[ValueParameterDescriptorImpl]

'declarationList' @ [400:33] ==> public final val JsAstProtoBuf.Vars.declarationList: (MutableList<(JsAstProtoBuf.VarDeclaration..JsAstProtoBuf.VarDeclaration?)>..List<(JsAstProtoBuf.VarDeclaration..JsAstProtoBuf.VarDeclaration?)>?)[MyPropertyDescriptor]

'vars' @ [401:13] ==> val vars: JsVars defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeVars[LocalVariableDescriptor]

'vars' @ [401:18] ==> public final val JsVars.vars: (MutableList<(JsVars.JsVar..JsVars.JsVar?)>..List<(JsVars.JsVar..JsVars.JsVar?)>?)[MyPropertyDescriptor]

'withLocation' @ [401:26] ==> private final fun <T : JsNode> withLocation(fileId: Int?, location: JsAstProtoBuf.Location?, action: () -> JsVars.JsVar): JsVars.JsVar defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : JsNode> -> JsVar

'if (declProto.hasFileId()) declProto.fileId else null' @ [402:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int?, elseBranch: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int?

'declProto' @ [402:34] ==> val declProto: (JsAstProtoBuf.VarDeclaration..JsAstProtoBuf.VarDeclaration?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeVars[LocalVariableDescriptor]

'hasFileId' @ [402:44] ==> public open fun hasFileId(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.VarDeclaration[JavaMethodDescriptor]

'declProto' @ [402:57] ==> val declProto: (JsAstProtoBuf.VarDeclaration..JsAstProtoBuf.VarDeclaration?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeVars[LocalVariableDescriptor]

'fileId' @ [402:67] ==> public final val JsAstProtoBuf.VarDeclaration.fileId: Int[MyPropertyDescriptor]

'if (declProto.hasLocation()) declProto.location else null' @ [403:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsAstProtoBuf.Location?, elseBranch: JsAstProtoBuf.Location?): JsAstProtoBuf.Location?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Location?

'declProto' @ [403:36] ==> val declProto: (JsAstProtoBuf.VarDeclaration..JsAstProtoBuf.VarDeclaration?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeVars[LocalVariableDescriptor]

'hasLocation' @ [403:46] ==> public open fun hasLocation(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.VarDeclaration[JavaMethodDescriptor]

'declProto' @ [403:61] ==> val declProto: (JsAstProtoBuf.VarDeclaration..JsAstProtoBuf.VarDeclaration?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeVars[LocalVariableDescriptor]

'location' @ [403:71] ==> public final val JsAstProtoBuf.VarDeclaration.location: (JsAstProtoBuf.Location..JsAstProtoBuf.Location?)[MyPropertyDescriptor]

'if (declProto.hasInitialValue()) deserialize(declProto.initialValue) else null' @ [405:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression?, elseBranch: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression?

'declProto' @ [405:40] ==> val declProto: (JsAstProtoBuf.VarDeclaration..JsAstProtoBuf.VarDeclaration?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeVars[LocalVariableDescriptor]

'hasInitialValue' @ [405:50] ==> public open fun hasInitialValue(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.VarDeclaration[JavaMethodDescriptor]

'deserialize' @ [405:69] ==> private final fun deserialize(proto: JsAstProtoBuf.Expression): JsExpression defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'declProto' @ [405:81] ==> val declProto: (JsAstProtoBuf.VarDeclaration..JsAstProtoBuf.VarDeclaration?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeVars[LocalVariableDescriptor]

'initialValue' @ [405:91] ==> public final val JsAstProtoBuf.VarDeclaration.initialValue: (JsAstProtoBuf.Expression..JsAstProtoBuf.Expression?)[MyPropertyDescriptor]

'JsVar' @ [406:24] ==> public constructor JsVar(p0: (JsName..JsName?), @Nullable p1: JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsVars.JsVar[JavaClassConstructorDescriptor]

'deserializeName' @ [406:30] ==> private final fun deserializeName(id: Int): JsName defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'declProto' @ [406:46] ==> val declProto: (JsAstProtoBuf.VarDeclaration..JsAstProtoBuf.VarDeclaration?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeVars[LocalVariableDescriptor]

'nameId' @ [406:56] ==> public final val JsAstProtoBuf.VarDeclaration.nameId: Int[MyPropertyDescriptor]

'initialValue' @ [406:65] ==> val initialValue: JsExpression? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeVars.<anonymous>[LocalVariableDescriptor]

'proto' @ [409:13] ==> value-parameter proto: JsAstProtoBuf.Vars defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeVars[ValueParameterDescriptorImpl]

'hasExportedPackageId' @ [409:19] ==> public open fun hasExportedPackageId(): Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Vars[JavaMethodDescriptor]

'vars' @ [410:13] ==> val vars: JsVars defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeVars[LocalVariableDescriptor]

'exportedPackage' @ [410:18] ==> public var JsVars.exportedPackage: String? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'deserializeString' @ [410:36] ==> private final fun deserializeString(id: Int): String defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [410:54] ==> value-parameter proto: JsAstProtoBuf.Vars defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeVars[ValueParameterDescriptorImpl]

'exportedPackageId' @ [410:60] ==> public final val JsAstProtoBuf.Vars.exportedPackageId: Int[MyPropertyDescriptor]

'vars' @ [412:16] ==> val vars: JsVars defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeVars[LocalVariableDescriptor]

'JsGlobalBlock' @ [416:16] ==> public constructor JsGlobalBlock() defined in org.jetbrains.kotlin.js.backend.ast.JsGlobalBlock[JavaClassConstructorDescriptor]

'apply' @ [416:32] ==> @InlineOnly public inline fun <T> JsGlobalBlock.apply(block: JsGlobalBlock.() -> Unit): JsGlobalBlock defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsGlobalBlock

'statements' @ [416:40] ==> public final val JsGlobalBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'proto' @ [416:54] ==> value-parameter proto: JsAstProtoBuf.GlobalBlock defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeGlobalBlock[ValueParameterDescriptorImpl]

'statementList' @ [416:60] ==> public final val JsAstProtoBuf.GlobalBlock.statementList: (MutableList<(JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?)>..List<(JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?)>?)[MyPropertyDescriptor]

'map' @ [416:74] ==> public inline fun <T, R> Iterable<(JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?)>.map(transform: ((JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?)) -> JsStatement): List<JsStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement..org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Statement?)
    <R> -> JsStatement

'deserialize' @ [416:80] ==> private final fun deserialize(proto: JsAstProtoBuf.Statement): JsStatement defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'it' @ [416:92] ==> value-parameter it: (JsAstProtoBuf.Statement..JsAstProtoBuf.Statement?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeGlobalBlock.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'JsParameter' @ [420:16] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'deserializeName' @ [420:28] ==> private final fun deserializeName(id: Int): JsName defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [420:44] ==> value-parameter proto: JsAstProtoBuf.Parameter defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeParameter[ValueParameterDescriptorImpl]

'nameId' @ [420:50] ==> public final val JsAstProtoBuf.Parameter.nameId: Int[MyPropertyDescriptor]

'apply' @ [420:59] ==> @InlineOnly public inline fun <T> JsParameter.apply(block: JsParameter.() -> Unit): JsParameter defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsParameter

'hasDefaultValue' @ [421:13] ==> public var JsParameter.hasDefaultValue: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'proto' @ [421:31] ==> value-parameter proto: JsAstProtoBuf.Parameter defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeParameter[ValueParameterDescriptorImpl]

'hasDefaultValue' @ [421:37] ==> public final val JsAstProtoBuf.Parameter.hasDefaultValue: Boolean[MyPropertyDescriptor]

'nameCache' @ [426:16] ==> private final val nameCache: MutableList<JsName?> defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[PropertyDescriptorImpl]

'id' @ [426:26] ==> value-parameter id: Int defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeName[ValueParameterDescriptorImpl]

'let' @ [426:33] ==> @InlineOnly public inline fun <T, R> JsAstDeserializer.let(block: (JsAstDeserializer) -> JsName): JsName defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsAstDeserializer
    <R> -> JsName

'nameTable' @ [427:29] ==> private final val nameTable: MutableList<JsAstProtoBuf.Name> defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[PropertyDescriptorImpl]

'id' @ [427:39] ==> value-parameter id: Int defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeName[ValueParameterDescriptorImpl]

'deserializeString' @ [428:30] ==> private final fun deserializeString(id: Int): String defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'nameProto' @ [428:48] ==> val nameProto: JsAstProtoBuf.Name defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeName.<anonymous>[LocalVariableDescriptor]

'identifier' @ [428:58] ==> public final val JsAstProtoBuf.Name.identifier: Int[MyPropertyDescriptor]

'if (nameProto.temporary) {
                JsScope.declareTemporaryName(identifier)
            }
            else {
                JsDynamicScope.declareName(identifier)
            }' @ [429:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsName, elseBranch: JsName): JsName[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsName

'nameProto' @ [429:28] ==> val nameProto: JsAstProtoBuf.Name defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeName.<anonymous>[LocalVariableDescriptor]

'temporary' @ [429:38] ==> public final val JsAstProtoBuf.Name.temporary: Boolean[MyPropertyDescriptor]

'declareTemporaryName' @ [430:25] ==> @NotNull public open fun declareTemporaryName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'identifier' @ [430:46] ==> val identifier: String defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeName.<anonymous>[LocalVariableDescriptor]

'JsDynamicScope' @ [433:17] ==> public object JsDynamicScope : JsScope defined in org.jetbrains.kotlin.js.backend.ast[FakeCallableDescriptorForObject]

'declareName' @ [433:32] ==> @NotNull public open fun declareName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsDynamicScope[JavaMethodDescriptor]

'identifier' @ [433:44] ==> val identifier: String defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeName.<anonymous>[LocalVariableDescriptor]

'nameCache' @ [435:13] ==> private final val nameCache: MutableList<JsName?> defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[PropertyDescriptorImpl]

'id' @ [435:23] ==> value-parameter id: Int defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeName[ValueParameterDescriptorImpl]

'name' @ [435:29] ==> val name: JsName defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeName.<anonymous>[LocalVariableDescriptor]

'name' @ [436:13] ==> val name: JsName defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeName.<anonymous>[LocalVariableDescriptor]

'stringTable' @ [440:54] ==> private final val stringTable: MutableList<String> defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[PropertyDescriptorImpl]

'id' @ [440:66] ==> value-parameter id: Int defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.deserializeString[ValueParameterDescriptorImpl]

'when (op) {
        BinaryOperation.Type.MUL -> JsBinaryOperator.MUL
        BinaryOperation.Type.DIV -> JsBinaryOperator.DIV
        BinaryOperation.Type.MOD -> JsBinaryOperator.MOD
        BinaryOperation.Type.ADD -> JsBinaryOperator.ADD
        BinaryOperation.Type.SUB -> JsBinaryOperator.SUB
        BinaryOperation.Type.SHL -> JsBinaryOperator.SHL
        BinaryOperation.Type.SHR -> JsBinaryOperator.SHR
        BinaryOperation.Type.SHRU -> JsBinaryOperator.SHRU
        BinaryOperation.Type.LT -> JsBinaryOperator.LT
        BinaryOperation.Type.LTE -> JsBinaryOperator.LTE
        BinaryOperation.Type.GT -> JsBinaryOperator.GT
        BinaryOperation.Type.GTE -> JsBinaryOperator.GTE
        BinaryOperation.Type.INSTANCEOF -> JsBinaryOperator.INSTANCEOF
        BinaryOperation.Type.IN -> JsBinaryOperator.INOP
        BinaryOperation.Type.EQ -> JsBinaryOperator.EQ
        BinaryOperation.Type.NEQ -> JsBinaryOperator.NEQ
        BinaryOperation.Type.REF_EQ -> JsBinaryOperator.REF_EQ
        BinaryOperation.Type.REF_NEQ -> JsBinaryOperator.REF_NEQ
        BinaryOperation.Type.BIT_AND -> JsBinaryOperator.BIT_AND
        BinaryOperation.Type.BIT_XOR -> JsBinaryOperator.BIT_XOR
        BinaryOperation.Type.BIT_OR -> JsBinaryOperator.BIT_OR
        BinaryOperation.Type.AND -> JsBinaryOperator.AND
        BinaryOperation.Type.OR -> JsBinaryOperator.OR
        BinaryOperation.Type.ASG -> JsBinaryOperator.ASG
        BinaryOperation.Type.ASG_ADD -> JsBinaryOperator.ASG_ADD
        BinaryOperation.Type.ASG_SUB -> JsBinaryOperator.ASG_SUB
        BinaryOperation.Type.ASG_MUL -> JsBinaryOperator.ASG_MUL
        BinaryOperation.Type.ASG_DIV -> JsBinaryOperator.ASG_DIV
        BinaryOperation.Type.ASG_MOD -> JsBinaryOperator.ASG_MOD
        BinaryOperation.Type.ASG_SHL -> JsBinaryOperator.ASG_SHL
        BinaryOperation.Type.ASG_SHR -> JsBinaryOperator.ASG_SHR
        BinaryOperation.Type.ASG_SHRU -> JsBinaryOperator.ASG_SHRU
        BinaryOperation.Type.ASG_BIT_AND -> JsBinaryOperator.ASG_BIT_AND
        BinaryOperation.Type.ASG_BIT_OR -> JsBinaryOperator.ASG_BIT_OR
        BinaryOperation.Type.ASG_BIT_XOR -> JsBinaryOperator.ASG_BIT_XOR
        BinaryOperation.Type.COMMA -> JsBinaryOperator.COMMA
    }' @ [442:49] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsBinaryOperator, entry1: JsBinaryOperator, entry2: JsBinaryOperator, entry3: JsBinaryOperator, entry4: JsBinaryOperator, entry5: JsBinaryOperator, entry6: JsBinaryOperator, entry7: JsBinaryOperator, entry8: JsBinaryOperator, entry9: JsBinaryOperator, entry10: JsBinaryOperator, entry11: JsBinaryOperator, entry12: JsBinaryOperator, entry13: JsBinaryOperator, entry14: JsBinaryOperator, entry15: JsBinaryOperator, entry16: JsBinaryOperator, entry17: JsBinaryOperator, entry18: JsBinaryOperator, entry19: JsBinaryOperator, entry20: JsBinaryOperator, entry21: JsBinaryOperator, entry22: JsBinaryOperator, entry23: JsBinaryOperator, entry24: JsBinaryOperator, entry25: JsBinaryOperator, entry26: JsBinaryOperator, entry27: JsBinaryOperator, entry28: JsBinaryOperator, entry29: JsBinaryOperator, entry30: JsBinaryOperator, entry31: JsBinaryOperator, entry32: JsBinaryOperator, entry33: JsBinaryOperator, entry34: JsBinaryOperator, entry35: JsBinaryOperator): JsBinaryOperator[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsBinaryOperator

'op' @ [442:55] ==> value-parameter op: JsAstProtoBuf.BinaryOperation.Type defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.map[ValueParameterDescriptorImpl]

'MUL' @ [443:30] ==> enum entry MUL defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'MUL' @ [443:54] ==> enum entry MUL defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'DIV' @ [444:30] ==> enum entry DIV defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'DIV' @ [444:54] ==> enum entry DIV defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'MOD' @ [445:30] ==> enum entry MOD defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'MOD' @ [445:54] ==> enum entry MOD defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'ADD' @ [446:30] ==> enum entry ADD defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'ADD' @ [446:54] ==> enum entry ADD defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'SUB' @ [447:30] ==> enum entry SUB defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'SUB' @ [447:54] ==> enum entry SUB defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'SHL' @ [448:30] ==> enum entry SHL defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'SHL' @ [448:54] ==> enum entry SHL defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'SHR' @ [449:30] ==> enum entry SHR defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'SHR' @ [449:54] ==> enum entry SHR defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'SHRU' @ [450:30] ==> enum entry SHRU defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'SHRU' @ [450:55] ==> enum entry SHRU defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'LT' @ [451:30] ==> enum entry LT defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'LT' @ [451:53] ==> enum entry LT defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'LTE' @ [452:30] ==> enum entry LTE defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'LTE' @ [452:54] ==> enum entry LTE defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'GT' @ [453:30] ==> enum entry GT defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'GT' @ [453:53] ==> enum entry GT defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'GTE' @ [454:30] ==> enum entry GTE defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'GTE' @ [454:54] ==> enum entry GTE defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'INSTANCEOF' @ [455:30] ==> enum entry INSTANCEOF defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'INSTANCEOF' @ [455:61] ==> enum entry INSTANCEOF defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'IN' @ [456:30] ==> enum entry IN defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'INOP' @ [456:53] ==> enum entry INOP defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'EQ' @ [457:30] ==> enum entry EQ defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'EQ' @ [457:53] ==> enum entry EQ defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'NEQ' @ [458:30] ==> enum entry NEQ defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'NEQ' @ [458:54] ==> enum entry NEQ defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'REF_EQ' @ [459:30] ==> enum entry REF_EQ defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'REF_EQ' @ [459:57] ==> enum entry REF_EQ defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'REF_NEQ' @ [460:30] ==> enum entry REF_NEQ defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'REF_NEQ' @ [460:58] ==> enum entry REF_NEQ defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'BIT_AND' @ [461:30] ==> enum entry BIT_AND defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'BIT_AND' @ [461:58] ==> enum entry BIT_AND defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'BIT_XOR' @ [462:30] ==> enum entry BIT_XOR defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'BIT_XOR' @ [462:58] ==> enum entry BIT_XOR defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'BIT_OR' @ [463:30] ==> enum entry BIT_OR defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'BIT_OR' @ [463:57] ==> enum entry BIT_OR defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'AND' @ [464:30] ==> enum entry AND defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'AND' @ [464:54] ==> enum entry AND defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'OR' @ [465:30] ==> enum entry OR defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'OR' @ [465:53] ==> enum entry OR defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'ASG' @ [466:30] ==> enum entry ASG defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'ASG' @ [466:54] ==> enum entry ASG defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'ASG_ADD' @ [467:30] ==> enum entry ASG_ADD defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'ASG_ADD' @ [467:58] ==> enum entry ASG_ADD defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'ASG_SUB' @ [468:30] ==> enum entry ASG_SUB defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'ASG_SUB' @ [468:58] ==> enum entry ASG_SUB defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'ASG_MUL' @ [469:30] ==> enum entry ASG_MUL defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'ASG_MUL' @ [469:58] ==> enum entry ASG_MUL defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'ASG_DIV' @ [470:30] ==> enum entry ASG_DIV defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'ASG_DIV' @ [470:58] ==> enum entry ASG_DIV defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'ASG_MOD' @ [471:30] ==> enum entry ASG_MOD defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'ASG_MOD' @ [471:58] ==> enum entry ASG_MOD defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'ASG_SHL' @ [472:30] ==> enum entry ASG_SHL defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'ASG_SHL' @ [472:58] ==> enum entry ASG_SHL defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'ASG_SHR' @ [473:30] ==> enum entry ASG_SHR defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'ASG_SHR' @ [473:58] ==> enum entry ASG_SHR defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'ASG_SHRU' @ [474:30] ==> enum entry ASG_SHRU defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'ASG_SHRU' @ [474:59] ==> enum entry ASG_SHRU defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'ASG_BIT_AND' @ [475:30] ==> enum entry ASG_BIT_AND defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'ASG_BIT_AND' @ [475:62] ==> enum entry ASG_BIT_AND defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'ASG_BIT_OR' @ [476:30] ==> enum entry ASG_BIT_OR defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'ASG_BIT_OR' @ [476:61] ==> enum entry ASG_BIT_OR defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'ASG_BIT_XOR' @ [477:30] ==> enum entry ASG_BIT_XOR defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'ASG_BIT_XOR' @ [477:62] ==> enum entry ASG_BIT_XOR defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'COMMA' @ [478:30] ==> enum entry COMMA defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.BinaryOperation.Type[FakeCallableDescriptorForObject]

'COMMA' @ [478:56] ==> enum entry COMMA defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'when (op) {
        UnaryOperation.Type.BIT_NOT -> JsUnaryOperator.BIT_NOT
        UnaryOperation.Type.DEC -> JsUnaryOperator.DEC
        UnaryOperation.Type.DELETE -> JsUnaryOperator.DELETE
        UnaryOperation.Type.INC -> JsUnaryOperator.INC
        UnaryOperation.Type.NEG -> JsUnaryOperator.NEG
        UnaryOperation.Type.POS -> JsUnaryOperator.POS
        UnaryOperation.Type.NOT -> JsUnaryOperator.NOT
        UnaryOperation.Type.TYPEOF -> JsUnaryOperator.TYPEOF
        UnaryOperation.Type.VOID -> JsUnaryOperator.VOID
    }' @ [481:48] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsUnaryOperator, entry1: JsUnaryOperator, entry2: JsUnaryOperator, entry3: JsUnaryOperator, entry4: JsUnaryOperator, entry5: JsUnaryOperator, entry6: JsUnaryOperator, entry7: JsUnaryOperator, entry8: JsUnaryOperator): JsUnaryOperator[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsUnaryOperator

'op' @ [481:54] ==> value-parameter op: JsAstProtoBuf.UnaryOperation.Type defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.map[ValueParameterDescriptorImpl]

'BIT_NOT' @ [482:29] ==> enum entry BIT_NOT defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.UnaryOperation.Type[FakeCallableDescriptorForObject]

'BIT_NOT' @ [482:56] ==> enum entry BIT_NOT defined in org.jetbrains.kotlin.js.backend.ast.JsUnaryOperator[FakeCallableDescriptorForObject]

'DEC' @ [483:29] ==> enum entry DEC defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.UnaryOperation.Type[FakeCallableDescriptorForObject]

'DEC' @ [483:52] ==> enum entry DEC defined in org.jetbrains.kotlin.js.backend.ast.JsUnaryOperator[FakeCallableDescriptorForObject]

'DELETE' @ [484:29] ==> enum entry DELETE defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.UnaryOperation.Type[FakeCallableDescriptorForObject]

'DELETE' @ [484:55] ==> enum entry DELETE defined in org.jetbrains.kotlin.js.backend.ast.JsUnaryOperator[FakeCallableDescriptorForObject]

'INC' @ [485:29] ==> enum entry INC defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.UnaryOperation.Type[FakeCallableDescriptorForObject]

'INC' @ [485:52] ==> enum entry INC defined in org.jetbrains.kotlin.js.backend.ast.JsUnaryOperator[FakeCallableDescriptorForObject]

'NEG' @ [486:29] ==> enum entry NEG defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.UnaryOperation.Type[FakeCallableDescriptorForObject]

'NEG' @ [486:52] ==> enum entry NEG defined in org.jetbrains.kotlin.js.backend.ast.JsUnaryOperator[FakeCallableDescriptorForObject]

'POS' @ [487:29] ==> enum entry POS defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.UnaryOperation.Type[FakeCallableDescriptorForObject]

'POS' @ [487:52] ==> enum entry POS defined in org.jetbrains.kotlin.js.backend.ast.JsUnaryOperator[FakeCallableDescriptorForObject]

'NOT' @ [488:29] ==> enum entry NOT defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.UnaryOperation.Type[FakeCallableDescriptorForObject]

'NOT' @ [488:52] ==> enum entry NOT defined in org.jetbrains.kotlin.js.backend.ast.JsUnaryOperator[FakeCallableDescriptorForObject]

'TYPEOF' @ [489:29] ==> enum entry TYPEOF defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.UnaryOperation.Type[FakeCallableDescriptorForObject]

'TYPEOF' @ [489:55] ==> enum entry TYPEOF defined in org.jetbrains.kotlin.js.backend.ast.JsUnaryOperator[FakeCallableDescriptorForObject]

'VOID' @ [490:29] ==> enum entry VOID defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.UnaryOperation.Type[FakeCallableDescriptorForObject]

'VOID' @ [490:53] ==> enum entry VOID defined in org.jetbrains.kotlin.js.backend.ast.JsUnaryOperator[FakeCallableDescriptorForObject]

'when (sideEffects) {
        SideEffects.AFFECTS_STATE -> SideEffectKind.AFFECTS_STATE
        SideEffects.DEPENDS_ON_STATE -> SideEffectKind.DEPENDS_ON_STATE
        SideEffects.PURE -> SideEffectKind.PURE
    }' @ [493:49] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SideEffectKind, entry1: SideEffectKind, entry2: SideEffectKind): SideEffectKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SideEffectKind

'sideEffects' @ [493:55] ==> value-parameter sideEffects: JsAstProtoBuf.SideEffects defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.map[ValueParameterDescriptorImpl]

'AFFECTS_STATE' @ [494:21] ==> enum entry AFFECTS_STATE defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.SideEffects[FakeCallableDescriptorForObject]

'AFFECTS_STATE' @ [494:53] ==> enum entry AFFECTS_STATE defined in org.jetbrains.kotlin.js.backend.ast.metadata.SideEffectKind[FakeCallableDescriptorForObject]

'DEPENDS_ON_STATE' @ [495:21] ==> enum entry DEPENDS_ON_STATE defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.SideEffects[FakeCallableDescriptorForObject]

'DEPENDS_ON_STATE' @ [495:56] ==> enum entry DEPENDS_ON_STATE defined in org.jetbrains.kotlin.js.backend.ast.metadata.SideEffectKind[FakeCallableDescriptorForObject]

'PURE' @ [496:21] ==> enum entry PURE defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.SideEffects[FakeCallableDescriptorForObject]

'PURE' @ [496:44] ==> enum entry PURE defined in org.jetbrains.kotlin.js.backend.ast.metadata.SideEffectKind[FakeCallableDescriptorForObject]

'when(inlineStrategy) {
        InlineStrategy.AS_FUNCTION -> KotlinInlineStrategy.AS_FUNCTION
        InlineStrategy.IN_PLACE -> KotlinInlineStrategy.IN_PLACE
        InlineStrategy.NOT_INLINE -> KotlinInlineStrategy.NOT_INLINE
    }' @ [499:55] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: InlineStrategy, entry1: InlineStrategy, entry2: InlineStrategy): InlineStrategy[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> InlineStrategy

'inlineStrategy' @ [499:60] ==> value-parameter inlineStrategy: JsAstProtoBuf.InlineStrategy defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.map[ValueParameterDescriptorImpl]

'AS_FUNCTION' @ [500:24] ==> enum entry AS_FUNCTION defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.InlineStrategy[FakeCallableDescriptorForObject]

'AS_FUNCTION' @ [500:60] ==> enum entry AS_FUNCTION defined in org.jetbrains.kotlin.resolve.inline.InlineStrategy[FakeCallableDescriptorForObject]

'IN_PLACE' @ [501:24] ==> enum entry IN_PLACE defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.InlineStrategy[FakeCallableDescriptorForObject]

'IN_PLACE' @ [501:57] ==> enum entry IN_PLACE defined in org.jetbrains.kotlin.resolve.inline.InlineStrategy[FakeCallableDescriptorForObject]

'NOT_INLINE' @ [502:24] ==> enum entry NOT_INLINE defined in org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.InlineStrategy[FakeCallableDescriptorForObject]

'NOT_INLINE' @ [502:59] ==> enum entry NOT_INLINE defined in org.jetbrains.kotlin.resolve.inline.InlineStrategy[FakeCallableDescriptorForObject]

'fileId' @ [506:32] ==> value-parameter fileId: Int? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.withLocation[ValueParameterDescriptorImpl]

'let' @ [506:40] ==> @InlineOnly public inline fun <T, R> Int.let(block: (Int) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> String

'deserializeString' @ [506:46] ==> private final fun deserializeString(id: Int): String defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[SimpleFunctionDescriptorImpl]

'it' @ [506:64] ==> value-parameter it: Int defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.withLocation.<anonymous>[ValueParameterDescriptorImpl]

'deserializedFile' @ [507:20] ==> val deserializedFile: String? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.withLocation[LocalVariableDescriptor]

'fileStack' @ [507:40] ==> private final val fileStack: Deque<String> defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[PropertyDescriptorImpl]

'peek' @ [507:50] ==> public abstract fun peek(): (String..String?) defined in java.util.Deque[JavaMethodDescriptor]

'if (file != null && location != null) {
            JsLocation(file, location.startLine, location.startChar)
        }
        else {
            null
        }' @ [508:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsLocation?, elseBranch: JsLocation?): JsLocation?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsLocation?

'file' @ [508:40] ==> val file: (String..String?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.withLocation[LocalVariableDescriptor]

'location' @ [508:56] ==> value-parameter location: JsAstProtoBuf.Location? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.withLocation[ValueParameterDescriptorImpl]

'JsLocation' @ [509:13] ==> public constructor JsLocation(file: String, startLine: Int, startChar: Int) defined in org.jetbrains.kotlin.js.backend.ast.JsLocation[DeserializedClassConstructorDescriptor]

'file' @ [509:24] ==> val file: (String..String?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.withLocation[LocalVariableDescriptor]

'location' @ [509:30] ==> value-parameter location: JsAstProtoBuf.Location? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.withLocation[ValueParameterDescriptorImpl]

'startLine' @ [509:39] ==> public final val JsAstProtoBuf.Location.startLine: Int[MyPropertyDescriptor]

'location' @ [509:50] ==> value-parameter location: JsAstProtoBuf.Location? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.withLocation[ValueParameterDescriptorImpl]

'startChar' @ [509:59] ==> public final val JsAstProtoBuf.Location.startChar: Int[MyPropertyDescriptor]

'location' @ [515:32] ==> value-parameter location: JsAstProtoBuf.Location? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.withLocation[ValueParameterDescriptorImpl]

'deserializedFile' @ [515:52] ==> val deserializedFile: String? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.withLocation[LocalVariableDescriptor]

'deserializedFile' @ [515:80] ==> val deserializedFile: String? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.withLocation[LocalVariableDescriptor]

'fileStack' @ [515:100] ==> private final val fileStack: Deque<String> defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[PropertyDescriptorImpl]

'peek' @ [515:110] ==> public abstract fun peek(): (String..String?) defined in java.util.Deque[JavaMethodDescriptor]

'shouldUpdateFile' @ [516:13] ==> val shouldUpdateFile: Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.withLocation[LocalVariableDescriptor]

'fileStack' @ [517:13] ==> private final val fileStack: Deque<String> defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[PropertyDescriptorImpl]

'push' @ [517:23] ==> public abstract fun push(p0: (String..String?)): Unit defined in java.util.Deque[JavaMethodDescriptor]

'deserializedFile' @ [517:28] ==> val deserializedFile: String? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.withLocation[LocalVariableDescriptor]

'invoke' @ [519:20] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'deserializedLocation' @ [520:13] ==> val deserializedLocation: JsLocation? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.withLocation[LocalVariableDescriptor]

'sourceRoots' @ [521:31] ==> private final val sourceRoots: Iterable<File> defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[PropertyDescriptorImpl]

'map' @ [522:22] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> File

'File' @ [522:28] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [522:33] ==> value-parameter it: File defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.withLocation.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [522:37] ==> val file: (String..String?) defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.withLocation[LocalVariableDescriptor]

'firstOrNull' @ [523:22] ==> public inline fun <T> Iterable<File>.firstOrNull(predicate: (File) -> Boolean): File? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [523:36] ==> value-parameter it: File defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.withLocation.<anonymous>[ValueParameterDescriptorImpl]

'exists' @ [523:39] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'node' @ [524:13] ==> val node: T defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.withLocation[LocalVariableDescriptor]

'source' @ [524:18] ==> public final var JsNode.source: (Any..Any?)[MyPropertyDescriptor]

'if (contentFile != null) {
                JsLocationWithEmbeddedSource(deserializedLocation, null) { InputStreamReader(FileInputStream(contentFile), "UTF-8") }
            }
            else {
                deserializedLocation
            }' @ [524:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsLocationWithSource, elseBranch: JsLocationWithSource): JsLocationWithSource[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsLocationWithSource

'contentFile' @ [524:31] ==> val contentFile: File? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.withLocation[LocalVariableDescriptor]

'JsLocationWithEmbeddedSource' @ [525:17] ==> public constructor JsLocationWithEmbeddedSource(location: JsLocation, identityObject: Any?, sourceProvider: () -> Reader?) defined in org.jetbrains.kotlin.js.backend.ast.JsLocationWithEmbeddedSource[DeserializedClassConstructorDescriptor]

'deserializedLocation' @ [525:46] ==> val deserializedLocation: JsLocation? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.withLocation[LocalVariableDescriptor]

'InputStreamReader' @ [525:76] ==> public constructor InputStreamReader(p0: (InputStream..InputStream?), p1: (String..String?)) defined in java.io.InputStreamReader[JavaClassConstructorDescriptor]

'FileInputStream' @ [525:94] ==> public constructor FileInputStream(p0: (File..File?)) defined in java.io.FileInputStream[JavaClassConstructorDescriptor]

'contentFile' @ [525:110] ==> val contentFile: File? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.withLocation[LocalVariableDescriptor]

'deserializedLocation' @ [528:17] ==> val deserializedLocation: JsLocation? defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.withLocation[LocalVariableDescriptor]

'shouldUpdateFile' @ [531:13] ==> val shouldUpdateFile: Boolean defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.withLocation[LocalVariableDescriptor]

'fileStack' @ [532:13] ==> private final val fileStack: Deque<String> defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer[PropertyDescriptorImpl]

'pop' @ [532:23] ==> public abstract fun pop(): (String..String?) defined in java.util.Deque[JavaMethodDescriptor]

'node' @ [535:16] ==> val node: T defined in org.jetbrains.kotlin.serialization.js.ast.JsAstDeserializer.withLocation[LocalVariableDescriptor]

