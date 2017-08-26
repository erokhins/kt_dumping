'descriptor' @ [43:25] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateClassModel[ValueParameterDescriptorImpl]

'getSuperClassNotAny' @ [43:36] ==> public fun ClassDescriptor.getSuperClassNotAny(): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'let' @ [43:59] ==> @InlineOnly public inline fun <T, R> ClassDescriptor.let(block: (ClassDescriptor) -> JsName): JsName defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> JsName

'context' @ [43:65] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[PropertyDescriptorImpl]

'getInnerNameForDescriptor' @ [43:73] ==> @NotNull public open fun getInnerNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'it' @ [43:99] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateClassModel.<anonymous>[ValueParameterDescriptorImpl]

'JsClassModel' @ [44:21] ==> public constructor JsClassModel(name: JsName, superName: JsName?) defined in org.jetbrains.kotlin.js.backend.ast.JsClassModel[DeserializedClassConstructorDescriptor]

'context' @ [44:34] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[PropertyDescriptorImpl]

'getInnerNameForDescriptor' @ [44:42] ==> @NotNull public open fun getInnerNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'descriptor' @ [44:68] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateClassModel[ValueParameterDescriptorImpl]

'superName' @ [44:81] ==> val superName: JsName? defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateClassModel[LocalVariableDescriptor]

'descriptor' @ [45:13] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateClassModel[ValueParameterDescriptorImpl]

'kind' @ [45:24] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ANNOTATION_CLASS' @ [45:42] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'!' @ [45:62] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNativeObject' @ [45:80] ==> public open fun isNativeObject(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.AnnotationsUtils[JavaMethodDescriptor]

'descriptor' @ [45:95] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateClassModel[ValueParameterDescriptorImpl]

'copyDefaultMembers' @ [46:13] ==> private final fun copyDefaultMembers(descriptor: ClassDescriptor, model: JsClassModel): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [46:32] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateClassModel[ValueParameterDescriptorImpl]

'model' @ [46:44] ==> val model: JsClassModel defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateClassModel[LocalVariableDescriptor]

'generateBridgeMethods' @ [47:13] ==> private final fun generateBridgeMethods(descriptor: ClassDescriptor, model: JsClassModel): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [47:35] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateClassModel[ValueParameterDescriptorImpl]

'model' @ [47:47] ==> val model: JsClassModel defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateClassModel[LocalVariableDescriptor]

'model' @ [49:16] ==> val model: JsClassModel defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateClassModel[LocalVariableDescriptor]

'descriptor' @ [53:23] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyDefaultMembers[ValueParameterDescriptorImpl]

'unsubstitutedMemberScope' @ [53:34] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'getContributedDescriptors' @ [54:18] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'DescriptorKindFilter' @ [54:44] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'FUNCTIONS' @ [54:65] ==> @field:JvmField public final val FUNCTIONS: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'mapNotNull' @ [55:18] ==> public inline fun <T, R : Any> Iterable<DeclarationDescriptor>.mapNotNull(transform: (DeclarationDescriptor) -> CallableMemberDescriptor?): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R : Any> -> CallableMemberDescriptor

'it' @ [55:31] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyDefaultMembers.<anonymous>[ValueParameterDescriptorImpl]

'members' @ [59:24] ==> val members: List<CallableMemberDescriptor> defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyDefaultMembers[LocalVariableDescriptor]

'filter' @ [59:32] ==> public inline fun <T> Iterable<CallableMemberDescriptor>.filter(predicate: (CallableMemberDescriptor) -> Boolean): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'!' @ [59:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [59:42] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyDefaultMembers.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [59:45] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'isReal' @ [59:50] ==> public final val CallableMemberDescriptor.Kind.isReal: Boolean[MyPropertyDescriptor]

'it' @ [59:60] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyDefaultMembers.<anonymous>[ValueParameterDescriptorImpl]

'modality' @ [59:63] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [59:75] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [59:84] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'member' @ [60:17] ==> val member: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyDefaultMembers[LocalVariableDescriptor]

'tryCopyWhenImplementingInterfaceWithDefaultArgs' @ [61:17] ==> private final fun tryCopyWhenImplementingInterfaceWithDefaultArgs(member: FunctionDescriptor, model: JsClassModel): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[SimpleFunctionDescriptorImpl]

'member' @ [61:65] ==> val member: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyDefaultMembers[LocalVariableDescriptor]

'model' @ [61:73] ==> value-parameter model: JsClassModel defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyDefaultMembers[ValueParameterDescriptorImpl]

'copySimpleMember' @ [64:13] ==> private final fun copySimpleMember(descriptor: ClassDescriptor, member: CallableMemberDescriptor, model: JsClassModel): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [64:30] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyDefaultMembers[ValueParameterDescriptorImpl]

'member' @ [64:42] ==> val member: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyDefaultMembers[LocalVariableDescriptor]

'model' @ [64:50] ==> value-parameter model: JsClassModel defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyDefaultMembers[ValueParameterDescriptorImpl]

'member' @ [68:17] ==> val member: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyDefaultMembers[LocalVariableDescriptor]

'!' @ [68:49] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasImplementationInPrototype' @ [68:50] ==> private final fun hasImplementationInPrototype(member: CallableMemberDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[SimpleFunctionDescriptorImpl]

'member' @ [68:79] ==> val member: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyDefaultMembers[LocalVariableDescriptor]

'copyMemberWithOptionalArgs' @ [69:17] ==> private final fun copyMemberWithOptionalArgs(descriptor: ClassDescriptor, member: FunctionDescriptor, model: JsClassModel, suffix: String): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [69:44] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyDefaultMembers[ValueParameterDescriptorImpl]

'member' @ [69:56] ==> val member: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyDefaultMembers[LocalVariableDescriptor]

'model' @ [69:64] ==> value-parameter model: JsClassModel defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyDefaultMembers[ValueParameterDescriptorImpl]

'DEFAULT_PARAMETER_IMPLEMENTOR_SUFFIX' @ [69:77] ==> public const final val DEFAULT_PARAMETER_IMPLEMENTOR_SUFFIX: String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaPropertyDescriptor]

'members' @ [77:26] ==> val members: List<CallableMemberDescriptor> defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyDefaultMembers[LocalVariableDescriptor]

'filterIsInstance' @ [77:34] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> FunctionDescriptor

'filter' @ [77:73] ==> public inline fun <T> Iterable<FunctionDescriptor>.filter(predicate: (FunctionDescriptor) -> Boolean): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'it' @ [77:82] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyDefaultMembers.<anonymous>[ValueParameterDescriptorImpl]

'modality' @ [77:85] ==> public final val FunctionDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [77:97] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [77:106] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'it' @ [77:118] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyDefaultMembers.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [77:121] ==> public final val FunctionDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'isReal' @ [77:126] ==> public final val CallableMemberDescriptor.Kind.isReal: Boolean[MyPropertyDescriptor]

'copyMemberWithOptionalArgs' @ [78:13] ==> private final fun copyMemberWithOptionalArgs(descriptor: ClassDescriptor, member: FunctionDescriptor, model: JsClassModel, suffix: String): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [78:40] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyDefaultMembers[ValueParameterDescriptorImpl]

'function' @ [78:52] ==> val function: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyDefaultMembers[LocalVariableDescriptor]

'model' @ [78:62] ==> value-parameter model: JsClassModel defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyDefaultMembers[ValueParameterDescriptorImpl]

'member' @ [83:16] ==> value-parameter member: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.hasImplementationInPrototype[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [83:23] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'any' @ [83:45] ==> public inline fun <T> Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>.any(predicate: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'it' @ [84:13] ==> value-parameter it: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.hasImplementationInPrototype.<anonymous>[ValueParameterDescriptorImpl]

'modality' @ [84:16] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [84:28] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [84:37] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'!' @ [84:49] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInterface' @ [84:66] ==> public open fun isInterface(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'it' @ [84:78] ==> value-parameter it: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.hasImplementationInPrototype.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [84:81] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'member' @ [99:29] ==> value-parameter member: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.tryCopyWhenImplementingInterfaceWithDefaultArgs[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [99:36] ==> public final var FunctionDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'firstOrNull' @ [99:58] ==> public inline fun <T> Iterable<(FunctionDescriptor..FunctionDescriptor?)>.firstOrNull(predicate: ((FunctionDescriptor..FunctionDescriptor?)) -> Boolean): FunctionDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'it' @ [99:72] ==> value-parameter it: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.tryCopyWhenImplementingInterfaceWithDefaultArgs.<anonymous>[ValueParameterDescriptorImpl]

'hasOwnParametersWithDefaultValue' @ [99:75] ==> public fun FunctionDescriptor.hasOwnParametersWithDefaultValue(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'!' @ [100:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInterface' @ [100:30] ==> public open fun isInterface(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'fromInterface' @ [100:42] ==> val fromInterface: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.tryCopyWhenImplementingInterfaceWithDefaultArgs[LocalVariableDescriptor]

'containingDeclaration' @ [100:56] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'member' @ [101:25] ==> value-parameter member: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.tryCopyWhenImplementingInterfaceWithDefaultArgs[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [101:32] ==> public final var FunctionDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'firstOrNull' @ [101:54] ==> public inline fun <T> Iterable<(FunctionDescriptor..FunctionDescriptor?)>.firstOrNull(predicate: ((FunctionDescriptor..FunctionDescriptor?)) -> Boolean): FunctionDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'!' @ [101:68] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInterface' @ [101:85] ==> public open fun isInterface(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'it' @ [101:97] ==> value-parameter it: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.tryCopyWhenImplementingInterfaceWithDefaultArgs.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [101:100] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'member' @ [103:27] ==> value-parameter member: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.tryCopyWhenImplementingInterfaceWithDefaultArgs[ValueParameterDescriptorImpl]

'containingDeclaration' @ [103:34] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'context' @ [104:33] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[PropertyDescriptorImpl]

'getNameForDescriptor' @ [104:41] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'fromInterface' @ [104:62] ==> val fromInterface: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.tryCopyWhenImplementingInterfaceWithDefaultArgs[LocalVariableDescriptor]

'ident' @ [104:77] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'copyMethod' @ [106:9] ==> private final fun copyMethod(sourceName: String, targetName: String, sourceDescriptor: ClassDescriptor, targetDescriptor: ClassDescriptor, block: JsBlock): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[SimpleFunctionDescriptorImpl]

'context' @ [106:20] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[PropertyDescriptorImpl]

'getNameForDescriptor' @ [106:28] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'fromClass' @ [106:49] ==> val fromClass: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.tryCopyWhenImplementingInterfaceWithDefaultArgs[LocalVariableDescriptor]

'ident' @ [106:60] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'fromInterfaceName' @ [106:67] ==> val fromInterfaceName: String defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.tryCopyWhenImplementingInterfaceWithDefaultArgs[LocalVariableDescriptor]

'DEFAULT_PARAMETER_IMPLEMENTOR_SUFFIX' @ [106:93] ==> public const final val DEFAULT_PARAMETER_IMPLEMENTOR_SUFFIX: String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaPropertyDescriptor]

'fromClass' @ [107:20] ==> val fromClass: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.tryCopyWhenImplementingInterfaceWithDefaultArgs[LocalVariableDescriptor]

'containingDeclaration' @ [107:30] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'targetClass' @ [107:72] ==> val targetClass: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.tryCopyWhenImplementingInterfaceWithDefaultArgs[LocalVariableDescriptor]

'model' @ [107:85] ==> value-parameter model: JsClassModel defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.tryCopyWhenImplementingInterfaceWithDefaultArgs[ValueParameterDescriptorImpl]

'postDeclarationBlock' @ [107:91] ==> public final val postDeclarationBlock: JsGlobalBlock defined in org.jetbrains.kotlin.js.backend.ast.JsClassModel[DeserializedPropertyDescriptor]

'copyMethod' @ [108:9] ==> private final fun copyMethod(sourceName: String, targetName: String, sourceDescriptor: ClassDescriptor, targetDescriptor: ClassDescriptor, block: JsBlock): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[SimpleFunctionDescriptorImpl]

'fromInterfaceName' @ [108:20] ==> val fromInterfaceName: String defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.tryCopyWhenImplementingInterfaceWithDefaultArgs[LocalVariableDescriptor]

'context' @ [108:39] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[PropertyDescriptorImpl]

'getNameForDescriptor' @ [108:47] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'member' @ [108:68] ==> value-parameter member: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.tryCopyWhenImplementingInterfaceWithDefaultArgs[ValueParameterDescriptorImpl]

'ident' @ [108:76] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'fromInterface' @ [109:20] ==> val fromInterface: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.tryCopyWhenImplementingInterfaceWithDefaultArgs[LocalVariableDescriptor]

'containingDeclaration' @ [109:34] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'targetClass' @ [109:76] ==> val targetClass: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.tryCopyWhenImplementingInterfaceWithDefaultArgs[LocalVariableDescriptor]

'model' @ [110:20] ==> value-parameter model: JsClassModel defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.tryCopyWhenImplementingInterfaceWithDefaultArgs[ValueParameterDescriptorImpl]

'postDeclarationBlock' @ [110:26] ==> public final val postDeclarationBlock: JsGlobalBlock defined in org.jetbrains.kotlin.js.backend.ast.JsClassModel[DeserializedPropertyDescriptor]

'member' @ [115:13] ==> value-parameter member: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copySimpleMember[ValueParameterDescriptorImpl]

'visibility' @ [115:20] ==> public final val CallableMemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'INVISIBLE_FAKE' @ [115:47] ==> @NotNull public final val INVISIBLE_FAKE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'copyInvisibleFakeMember' @ [115:70] ==> private final fun copyInvisibleFakeMember(descriptor: ClassDescriptor, member: CallableMemberDescriptor, model: JsClassModel): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [115:94] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copySimpleMember[ValueParameterDescriptorImpl]

'member' @ [115:106] ==> value-parameter member: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copySimpleMember[ValueParameterDescriptorImpl]

'model' @ [115:114] ==> value-parameter model: JsClassModel defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copySimpleMember[ValueParameterDescriptorImpl]

'findMemberToCopy' @ [117:28] ==> private final fun findMemberToCopy(member: CallableMemberDescriptor): CallableMemberDescriptor? defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[SimpleFunctionDescriptorImpl]

'member' @ [117:45] ==> value-parameter member: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copySimpleMember[ValueParameterDescriptorImpl]

'memberToCopy' @ [118:31] ==> val memberToCopy: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copySimpleMember[LocalVariableDescriptor]

'containingDeclaration' @ [118:44] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'classToCopyFrom' @ [119:13] ==> val classToCopyFrom: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copySimpleMember[LocalVariableDescriptor]

'kind' @ [119:29] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [119:47] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'isNativeObject' @ [119:77] ==> public open fun isNativeObject(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.AnnotationsUtils[JavaMethodDescriptor]

'classToCopyFrom' @ [119:92] ==> val classToCopyFrom: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copySimpleMember[LocalVariableDescriptor]

'context' @ [121:20] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[PropertyDescriptorImpl]

'getNameForDescriptor' @ [121:28] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'member' @ [121:49] ==> value-parameter member: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copySimpleMember[ValueParameterDescriptorImpl]

'ident' @ [121:57] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'when (member) {
            is FunctionDescriptor -> {
                copyMethod(name, name, classToCopyFrom, descriptor, model.postDeclarationBlock)
            }
            is PropertyDescriptor -> copyProperty(name, classToCopyFrom, descriptor, model.postDeclarationBlock)
        }' @ [122:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'member' @ [122:15] ==> value-parameter member: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copySimpleMember[ValueParameterDescriptorImpl]

'copyMethod' @ [124:17] ==> private final fun copyMethod(sourceName: String, targetName: String, sourceDescriptor: ClassDescriptor, targetDescriptor: ClassDescriptor, block: JsBlock): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[SimpleFunctionDescriptorImpl]

'name' @ [124:28] ==> val name: String defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copySimpleMember[LocalVariableDescriptor]

'name' @ [124:34] ==> val name: String defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copySimpleMember[LocalVariableDescriptor]

'classToCopyFrom' @ [124:40] ==> val classToCopyFrom: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copySimpleMember[LocalVariableDescriptor]

'descriptor' @ [124:57] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copySimpleMember[ValueParameterDescriptorImpl]

'model' @ [124:69] ==> value-parameter model: JsClassModel defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copySimpleMember[ValueParameterDescriptorImpl]

'postDeclarationBlock' @ [124:75] ==> public final val postDeclarationBlock: JsGlobalBlock defined in org.jetbrains.kotlin.js.backend.ast.JsClassModel[DeserializedPropertyDescriptor]

'copyProperty' @ [126:38] ==> private final fun copyProperty(name: String, sourceDescriptor: ClassDescriptor, targetDescriptor: ClassDescriptor, block: JsBlock): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[SimpleFunctionDescriptorImpl]

'name' @ [126:51] ==> val name: String defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copySimpleMember[LocalVariableDescriptor]

'classToCopyFrom' @ [126:57] ==> val classToCopyFrom: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copySimpleMember[LocalVariableDescriptor]

'descriptor' @ [126:74] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copySimpleMember[ValueParameterDescriptorImpl]

'model' @ [126:86] ==> value-parameter model: JsClassModel defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copySimpleMember[ValueParameterDescriptorImpl]

'postDeclarationBlock' @ [126:92] ==> public final val postDeclarationBlock: JsGlobalBlock defined in org.jetbrains.kotlin.js.backend.ast.JsClassModel[DeserializedPropertyDescriptor]

'member' @ [131:34] ==> value-parameter member: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyInvisibleFakeMember[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [131:41] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'if (overriddenMember.kind.isReal) overriddenMember else findMemberToCopy(overriddenMember) ?: continue' @ [132:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (CallableMemberDescriptor..CallableMemberDescriptor?), elseBranch: (CallableMemberDescriptor..CallableMemberDescriptor?)): (CallableMemberDescriptor..CallableMemberDescriptor?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'overriddenMember' @ [132:36] ==> val overriddenMember: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyInvisibleFakeMember[LocalVariableDescriptor]

'kind' @ [132:53] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'isReal' @ [132:58] ==> public final val CallableMemberDescriptor.Kind.isReal: Boolean[MyPropertyDescriptor]

'overriddenMember' @ [132:66] ==> val overriddenMember: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyInvisibleFakeMember[LocalVariableDescriptor]

'findMemberToCopy' @ [132:88] ==> private final fun findMemberToCopy(member: CallableMemberDescriptor): CallableMemberDescriptor? defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[SimpleFunctionDescriptorImpl]

'overriddenMember' @ [132:105] ==> val overriddenMember: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyInvisibleFakeMember[LocalVariableDescriptor]

'memberToCopy' @ [133:35] ==> val memberToCopy: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyInvisibleFakeMember[LocalVariableDescriptor]

'containingDeclaration' @ [133:48] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'classToCopyFrom' @ [134:17] ==> val classToCopyFrom: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyInvisibleFakeMember[LocalVariableDescriptor]

'kind' @ [134:33] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [134:51] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'context' @ [136:24] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[PropertyDescriptorImpl]

'getNameForDescriptor' @ [136:32] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'memberToCopy' @ [136:53] ==> val memberToCopy: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyInvisibleFakeMember[LocalVariableDescriptor]

'ident' @ [136:67] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'when (member) {
                is FunctionDescriptor -> {
                    copyMethod(name, name, classToCopyFrom, descriptor, model.postDeclarationBlock)
                }
                is PropertyDescriptor -> copyProperty(name, classToCopyFrom, descriptor, model.postDeclarationBlock)
            }' @ [137:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'member' @ [137:19] ==> value-parameter member: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyInvisibleFakeMember[ValueParameterDescriptorImpl]

'copyMethod' @ [139:21] ==> private final fun copyMethod(sourceName: String, targetName: String, sourceDescriptor: ClassDescriptor, targetDescriptor: ClassDescriptor, block: JsBlock): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[SimpleFunctionDescriptorImpl]

'name' @ [139:32] ==> val name: String defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyInvisibleFakeMember[LocalVariableDescriptor]

'name' @ [139:38] ==> val name: String defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyInvisibleFakeMember[LocalVariableDescriptor]

'classToCopyFrom' @ [139:44] ==> val classToCopyFrom: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyInvisibleFakeMember[LocalVariableDescriptor]

'descriptor' @ [139:61] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyInvisibleFakeMember[ValueParameterDescriptorImpl]

'model' @ [139:73] ==> value-parameter model: JsClassModel defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyInvisibleFakeMember[ValueParameterDescriptorImpl]

'postDeclarationBlock' @ [139:79] ==> public final val postDeclarationBlock: JsGlobalBlock defined in org.jetbrains.kotlin.js.backend.ast.JsClassModel[DeserializedPropertyDescriptor]

'copyProperty' @ [141:42] ==> private final fun copyProperty(name: String, sourceDescriptor: ClassDescriptor, targetDescriptor: ClassDescriptor, block: JsBlock): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[SimpleFunctionDescriptorImpl]

'name' @ [141:55] ==> val name: String defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyInvisibleFakeMember[LocalVariableDescriptor]

'classToCopyFrom' @ [141:61] ==> val classToCopyFrom: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyInvisibleFakeMember[LocalVariableDescriptor]

'descriptor' @ [141:78] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyInvisibleFakeMember[ValueParameterDescriptorImpl]

'model' @ [141:90] ==> value-parameter model: JsClassModel defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyInvisibleFakeMember[ValueParameterDescriptorImpl]

'postDeclarationBlock' @ [141:96] ==> public final val postDeclarationBlock: JsGlobalBlock defined in org.jetbrains.kotlin.js.backend.ast.JsClassModel[DeserializedPropertyDescriptor]

'findOptionalArgsMemberToCopy' @ [147:28] ==> private final fun findOptionalArgsMemberToCopy(member: FunctionDescriptor): FunctionDescriptor? defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[SimpleFunctionDescriptorImpl]

'member' @ [147:57] ==> value-parameter member: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyMemberWithOptionalArgs[ValueParameterDescriptorImpl]

'memberToCopy' @ [148:31] ==> val memberToCopy: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyMemberWithOptionalArgs[LocalVariableDescriptor]

'containingDeclaration' @ [148:44] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'classToCopyFrom' @ [149:13] ==> val classToCopyFrom: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyMemberWithOptionalArgs[LocalVariableDescriptor]

'kind' @ [149:29] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [149:47] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'isNativeObject' @ [149:77] ==> public open fun isNativeObject(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.AnnotationsUtils[JavaMethodDescriptor]

'classToCopyFrom' @ [149:92] ==> val classToCopyFrom: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyMemberWithOptionalArgs[LocalVariableDescriptor]

'context' @ [151:20] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[PropertyDescriptorImpl]

'getNameForDescriptor' @ [151:28] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'member' @ [151:49] ==> value-parameter member: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyMemberWithOptionalArgs[ValueParameterDescriptorImpl]

'ident' @ [151:57] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'suffix' @ [151:65] ==> value-parameter suffix: String defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyMemberWithOptionalArgs[ValueParameterDescriptorImpl]

'copyMethod' @ [152:9] ==> private final fun copyMethod(sourceName: String, targetName: String, sourceDescriptor: ClassDescriptor, targetDescriptor: ClassDescriptor, block: JsBlock): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[SimpleFunctionDescriptorImpl]

'name' @ [152:20] ==> val name: String defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyMemberWithOptionalArgs[LocalVariableDescriptor]

'name' @ [152:26] ==> val name: String defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyMemberWithOptionalArgs[LocalVariableDescriptor]

'classToCopyFrom' @ [152:32] ==> val classToCopyFrom: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyMemberWithOptionalArgs[LocalVariableDescriptor]

'descriptor' @ [152:49] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyMemberWithOptionalArgs[ValueParameterDescriptorImpl]

'model' @ [152:61] ==> value-parameter model: JsClassModel defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyMemberWithOptionalArgs[ValueParameterDescriptorImpl]

'postDeclarationBlock' @ [152:67] ==> public final val postDeclarationBlock: JsGlobalBlock defined in org.jetbrains.kotlin.js.backend.ast.JsClassModel[DeserializedPropertyDescriptor]

'member' @ [159:28] ==> value-parameter member: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findMemberToCopy[ValueParameterDescriptorImpl]

'findNonRepeatingOverriddenDescriptors' @ [159:35] ==> private final fun <T : CallableMemberDescriptor> CallableMemberDescriptor.findNonRepeatingOverriddenDescriptors(getTypedOverriddenDescriptors: CallableMemberDescriptor.() -> Collection<CallableMemberDescriptor>, getOriginalDescriptor: CallableMemberDescriptor.() -> CallableMemberDescriptor): List<CallableMemberDescriptor> defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : CallableMemberDescriptor> -> CallableMemberDescriptor

'overriddenDescriptors' @ [159:75] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'original' @ [159:102] ==> public final val CallableMemberDescriptor.original: CallableMemberDescriptor[MyPropertyDescriptor]

'singleOrNull' @ [160:37] ==> public inline fun <T> Iterable<CallableMemberDescriptor>.singleOrNull(predicate: (CallableMemberDescriptor) -> Boolean): CallableMemberDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'it' @ [160:52] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findMemberToCopy.<anonymous>[ValueParameterDescriptorImpl]

'modality' @ [160:55] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [160:67] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [160:76] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'!=' @ [163:13] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.ClassKind[DeserializedSimpleFunctionDescriptor]

'memberToCopy' @ [163:14] ==> val memberToCopy: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findMemberToCopy[LocalVariableDescriptor]

'containingDeclaration' @ [163:27] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'kind' @ [163:69] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [163:87] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'if (!memberToCopy.kind.isReal) findMemberToCopy(memberToCopy) else memberToCopy' @ [166:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CallableMemberDescriptor?, elseBranch: CallableMemberDescriptor?): CallableMemberDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CallableMemberDescriptor?

'!' @ [166:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'memberToCopy' @ [166:21] ==> val memberToCopy: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findMemberToCopy[LocalVariableDescriptor]

'kind' @ [166:34] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'isReal' @ [166:39] ==> public final val CallableMemberDescriptor.Kind.isReal: Boolean[MyPropertyDescriptor]

'findMemberToCopy' @ [166:47] ==> private final fun findMemberToCopy(member: CallableMemberDescriptor): CallableMemberDescriptor? defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[SimpleFunctionDescriptorImpl]

'memberToCopy' @ [166:64] ==> val memberToCopy: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findMemberToCopy[LocalVariableDescriptor]

'memberToCopy' @ [166:83] ==> val memberToCopy: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findMemberToCopy[LocalVariableDescriptor]

'member' @ [173:28] ==> value-parameter member: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findOptionalArgsMemberToCopy[ValueParameterDescriptorImpl]

'findNonRepeatingOverriddenDescriptors' @ [173:35] ==> private final fun <T : CallableMemberDescriptor> FunctionDescriptor.findNonRepeatingOverriddenDescriptors(getTypedOverriddenDescriptors: FunctionDescriptor.() -> Collection<FunctionDescriptor>, getOriginalDescriptor: FunctionDescriptor.() -> FunctionDescriptor): List<FunctionDescriptor> defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : CallableMemberDescriptor> -> FunctionDescriptor

'overriddenDescriptors' @ [173:75] ==> public final var FunctionDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'original' @ [173:102] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'singleOrNull' @ [174:37] ==> public inline fun <T> Iterable<FunctionDescriptor>.singleOrNull(predicate: (FunctionDescriptor) -> Boolean): FunctionDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'it' @ [174:52] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findOptionalArgsMemberToCopy.<anonymous>[ValueParameterDescriptorImpl]

'hasOrInheritsParametersWithDefaultValue' @ [174:55] ==> public fun FunctionDescriptor.hasOrInheritsParametersWithDefaultValue(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'!=' @ [177:13] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.ClassKind[DeserializedSimpleFunctionDescriptor]

'memberToCopy' @ [177:14] ==> val memberToCopy: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findOptionalArgsMemberToCopy[LocalVariableDescriptor]

'containingDeclaration' @ [177:27] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'kind' @ [177:69] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [177:87] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'if (!memberToCopy.kind.isReal) findOptionalArgsMemberToCopy(memberToCopy) else memberToCopy' @ [180:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionDescriptor?, elseBranch: FunctionDescriptor?): FunctionDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FunctionDescriptor?

'!' @ [180:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'memberToCopy' @ [180:21] ==> val memberToCopy: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findOptionalArgsMemberToCopy[LocalVariableDescriptor]

'kind' @ [180:34] ==> public final val FunctionDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'isReal' @ [180:39] ==> public final val CallableMemberDescriptor.Kind.isReal: Boolean[MyPropertyDescriptor]

'findOptionalArgsMemberToCopy' @ [180:47] ==> private final fun findOptionalArgsMemberToCopy(member: FunctionDescriptor): FunctionDescriptor? defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[SimpleFunctionDescriptorImpl]

'memberToCopy' @ [180:76] ==> val memberToCopy: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findOptionalArgsMemberToCopy[LocalVariableDescriptor]

'memberToCopy' @ [180:95] ==> val memberToCopy: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findOptionalArgsMemberToCopy[LocalVariableDescriptor]

'mutableSetOf' @ [187:30] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'mutableSetOf' @ [188:35] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'descriptor' @ [190:28] ==> value-parameter descriptor: T defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findNonRepeatingOverriddenDescriptors.walk[ValueParameterDescriptorImpl]

'invoke' @ [190:39] ==> public abstract operator fun T.invoke(): T defined in kotlin.Function1[FunctionInvokeDescriptor]

'!' @ [191:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'allDescriptors' @ [191:18] ==> val allDescriptors: MutableSet<T> defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findNonRepeatingOverriddenDescriptors[LocalVariableDescriptor]

'add' @ [191:33] ==> public abstract fun add(element: T): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'original' @ [191:37] ==> val original: T defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findNonRepeatingOverriddenDescriptors.walk[LocalVariableDescriptor]

'original' @ [192:30] ==> val original: T defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findNonRepeatingOverriddenDescriptors.walk[LocalVariableDescriptor]

'invoke' @ [192:39] ==> public abstract operator fun T.invoke(): Collection<T> defined in kotlin.Function1[FunctionInvokeDescriptor]

'map' @ [192:71] ==> public inline fun <T, R> Iterable<T>.map(transform: (T) -> T): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T
    <R> -> T

'it' @ [192:77] ==> value-parameter it: T defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findNonRepeatingOverriddenDescriptors.walk.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [192:80] ==> public abstract operator fun T.invoke(): T defined in kotlin.Function1[FunctionInvokeDescriptor]

'repeatedDescriptors' @ [193:13] ==> val repeatedDescriptors: MutableSet<T> defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findNonRepeatingOverriddenDescriptors[LocalVariableDescriptor]

'overridden' @ [193:36] ==> val overridden: List<T> defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findNonRepeatingOverriddenDescriptors.walk[LocalVariableDescriptor]

'overridden' @ [194:13] ==> val overridden: List<T> defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findNonRepeatingOverriddenDescriptors.walk[LocalVariableDescriptor]

'forEach' @ [194:24] ==> @HidesMembers public inline fun <T> Iterable<T>.forEach(action: (T) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'walk' @ [194:34] ==> local final fun walk(descriptor: T): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findNonRepeatingOverriddenDescriptors[SimpleFunctionDescriptorImpl]

'it' @ [194:39] ==> value-parameter it: T defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findNonRepeatingOverriddenDescriptors.walk.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [197:43] ==> public abstract operator fun T.invoke(): Collection<T> defined in kotlin.Function1[FunctionInvokeDescriptor]

'directOverriddenDescriptors' @ [198:9] ==> val directOverriddenDescriptors: Collection<T> defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findNonRepeatingOverriddenDescriptors[LocalVariableDescriptor]

'forEach' @ [198:37] ==> @HidesMembers public inline fun <T> Iterable<T>.forEach(action: (T) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'walk' @ [198:47] ==> local final fun walk(descriptor: T): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findNonRepeatingOverriddenDescriptors[SimpleFunctionDescriptorImpl]

'it' @ [198:52] ==> value-parameter it: T defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findNonRepeatingOverriddenDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'directOverriddenDescriptors' @ [199:16] ==> val directOverriddenDescriptors: Collection<T> defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findNonRepeatingOverriddenDescriptors[LocalVariableDescriptor]

'filter' @ [199:44] ==> public inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'it' @ [199:53] ==> value-parameter it: T defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findNonRepeatingOverriddenDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [199:56] ==> public abstract operator fun T.invoke(): T defined in kotlin.Function1[FunctionInvokeDescriptor]

'repeatedDescriptors' @ [199:84] ==> val repeatedDescriptors: MutableSet<T> defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.findNonRepeatingOverriddenDescriptors[LocalVariableDescriptor]

'generateBridgesToTraitImpl' @ [203:9] ==> private final fun generateBridgesToTraitImpl(descriptor: ClassDescriptor, model: JsClassModel): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [203:36] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridgeMethods[ValueParameterDescriptorImpl]

'model' @ [203:48] ==> value-parameter model: JsClassModel defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridgeMethods[ValueParameterDescriptorImpl]

'generateOtherBridges' @ [204:9] ==> private final fun generateOtherBridges(descriptor: ClassDescriptor, model: JsClassModel): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [204:30] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridgeMethods[ValueParameterDescriptorImpl]

'model' @ [204:42] ==> value-parameter model: JsClassModel defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridgeMethods[ValueParameterDescriptorImpl]

'rootContext' @ [208:53] ==> @NotNull public open fun rootContext(@NotNull staticContext: StaticContext): TranslationContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'context' @ [208:65] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[PropertyDescriptorImpl]

'component1' @ [209:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<FunctionDescriptor, FunctionDescriptor>.component1(): FunctionDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FunctionDescriptor
    <V> -> FunctionDescriptor

'component2' @ [209:20] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<FunctionDescriptor, FunctionDescriptor>.component2(): FunctionDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FunctionDescriptor
    <V> -> FunctionDescriptor

'CodegenUtil' @ [209:30] ==> public object CodegenUtil defined in org.jetbrains.kotlin.backend.common[FakeCallableDescriptorForObject]

'getNonPrivateTraitMethods' @ [209:42] ==> @JvmStatic public final fun getNonPrivateTraitMethods(descriptor: ClassDescriptor): Map<FunctionDescriptor, FunctionDescriptor> defined in org.jetbrains.kotlin.backend.common.CodegenUtil[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [209:68] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridgesToTraitImpl[ValueParameterDescriptorImpl]

'context' @ [210:30] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[PropertyDescriptorImpl]

'getNameForDescriptor' @ [210:38] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'key' @ [210:59] ==> val key: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridgesToTraitImpl[LocalVariableDescriptor]

'ident' @ [210:64] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'context' @ [211:30] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[PropertyDescriptorImpl]

'getNameForDescriptor' @ [211:38] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'value' @ [211:59] ==> val value: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridgesToTraitImpl[LocalVariableDescriptor]

'ident' @ [211:66] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'sourceName' @ [212:17] ==> val sourceName: String defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridgesToTraitImpl[LocalVariableDescriptor]

'targetName' @ [212:31] ==> val targetName: String defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridgesToTraitImpl[LocalVariableDescriptor]

'generateDelegateCall' @ [213:33] ==> public fun generateDelegateCall(classDescriptor: ClassDescriptor, fromDescriptor: FunctionDescriptor, toDescriptor: FunctionDescriptor, thisObject: JsExpression, context: TranslationContext, detectDefaultParameters: Boolean, source: PsiElement?): JsStatement defined in org.jetbrains.kotlin.js.translate.utils in file utils.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [213:54] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridgesToTraitImpl[ValueParameterDescriptorImpl]

'key' @ [213:66] ==> val key: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridgesToTraitImpl[LocalVariableDescriptor]

'value' @ [213:71] ==> val value: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridgesToTraitImpl[LocalVariableDescriptor]

'JsThisRef' @ [213:78] ==> public constructor JsThisRef() defined in org.jetbrains.kotlin.js.backend.ast.JsThisRef[JavaClassConstructorDescriptor]

'translationContext' @ [213:91] ==> val translationContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridgesToTraitImpl[LocalVariableDescriptor]

'descriptor' @ [214:54] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridgesToTraitImpl[ValueParameterDescriptorImpl]

'source' @ [214:65] ==> public final val ClassDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [214:72] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'model' @ [215:17] ==> value-parameter model: JsClassModel defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridgesToTraitImpl[ValueParameterDescriptorImpl]

'postDeclarationBlock' @ [215:23] ==> public final val postDeclarationBlock: JsGlobalBlock defined in org.jetbrains.kotlin.js.backend.ast.JsClassModel[DeserializedPropertyDescriptor]

'statements' @ [215:44] ==> public final val JsGlobalBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'statement' @ [215:58] ==> val statement: JsStatement defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridgesToTraitImpl[LocalVariableDescriptor]

'descriptor' @ [221:34] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateOtherBridges[ValueParameterDescriptorImpl]

'defaultType' @ [221:45] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'memberScope' @ [221:57] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'getContributedDescriptors' @ [221:69] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'memberDescriptor' @ [222:17] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateOtherBridges[LocalVariableDescriptor]

'generateBridgesForFunctionDescriptor' @ [223:41] ==> public fun <Signature> generateBridgesForFunctionDescriptor(descriptor: FunctionDescriptor, signature: (FunctionDescriptor) -> FunctionDescriptor, isBodyOwner: (DeclarationDescriptor) -> Boolean): Set<Bridge<FunctionDescriptor>> defined in org.jetbrains.kotlin.backend.common.bridges[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <Signature> -> FunctionDescriptor

'memberDescriptor' @ [223:78] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateOtherBridges[LocalVariableDescriptor]

'identity' @ [223:96] ==> public fun <T> identity(): (FunctionDescriptor) -> FunctionDescriptor defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'bridgesToGenerate' @ [228:32] ==> val bridgesToGenerate: Set<Bridge<FunctionDescriptor>> defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateOtherBridges[LocalVariableDescriptor]

'generateBridge' @ [229:21] ==> private final fun generateBridge(descriptor: ClassDescriptor, model: JsClassModel, bridge: Bridge<FunctionDescriptor>): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[SimpleFunctionDescriptorImpl]

'descriptor' @ [229:36] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateOtherBridges[ValueParameterDescriptorImpl]

'model' @ [229:48] ==> value-parameter model: JsClassModel defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateOtherBridges[ValueParameterDescriptorImpl]

'bridge' @ [229:55] ==> val bridge: Bridge<FunctionDescriptor> defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateOtherBridges[LocalVariableDescriptor]

'bridge' @ [236:30] ==> value-parameter bridge: Bridge<FunctionDescriptor> defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridge[ValueParameterDescriptorImpl]

'from' @ [236:37] ==> public final val from: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.Bridge[DeserializedPropertyDescriptor]

'bridge' @ [237:28] ==> value-parameter bridge: Bridge<FunctionDescriptor> defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridge[ValueParameterDescriptorImpl]

'to' @ [237:35] ==> public final val to: FunctionDescriptor defined in org.jetbrains.kotlin.backend.common.bridges.Bridge[DeserializedPropertyDescriptor]

'toDescriptor' @ [239:13] ==> val toDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridge[LocalVariableDescriptor]

'visibility' @ [239:26] ==> public final val FunctionDescriptor.visibility: Visibility[MyPropertyDescriptor]

'INVISIBLE_FAKE' @ [239:53] ==> @NotNull public final val INVISIBLE_FAKE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'context' @ [241:26] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[PropertyDescriptorImpl]

'getNameForDescriptor' @ [241:34] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'fromDescriptor' @ [241:55] ==> val fromDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridge[LocalVariableDescriptor]

'ident' @ [241:71] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'context' @ [242:26] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[PropertyDescriptorImpl]

'getNameForDescriptor' @ [242:34] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'toDescriptor' @ [242:55] ==> val toDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridge[LocalVariableDescriptor]

'ident' @ [242:69] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'sourceName' @ [243:13] ==> val sourceName: String defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridge[LocalVariableDescriptor]

'targetName' @ [243:27] ==> val targetName: String defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridge[LocalVariableDescriptor]

'!=' @ [245:13] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.ClassKind[DeserializedSimpleFunctionDescriptor]

'fromDescriptor' @ [245:14] ==> val fromDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridge[LocalVariableDescriptor]

'containingDeclaration' @ [245:29] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'kind' @ [245:71] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [245:89] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'fromDescriptor' @ [246:17] ==> val fromDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridge[LocalVariableDescriptor]

'kind' @ [246:32] ==> public final val FunctionDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'isReal' @ [246:37] ==> public final val CallableMemberDescriptor.Kind.isReal: Boolean[MyPropertyDescriptor]

'fromDescriptor' @ [246:47] ==> val fromDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridge[LocalVariableDescriptor]

'modality' @ [246:62] ==> public final val FunctionDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [246:74] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [246:83] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'!' @ [246:95] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'toDescriptor' @ [246:96] ==> val toDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridge[LocalVariableDescriptor]

'kind' @ [246:109] ==> public final val FunctionDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'isReal' @ [246:114] ==> public final val CallableMemberDescriptor.Kind.isReal: Boolean[MyPropertyDescriptor]

'rootContext' @ [249:53] ==> @NotNull public open fun rootContext(@NotNull staticContext: StaticContext): TranslationContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'context' @ [249:65] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[PropertyDescriptorImpl]

'model' @ [250:9] ==> value-parameter model: JsClassModel defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridge[ValueParameterDescriptorImpl]

'postDeclarationBlock' @ [250:15] ==> public final val postDeclarationBlock: JsGlobalBlock defined in org.jetbrains.kotlin.js.backend.ast.JsClassModel[DeserializedPropertyDescriptor]

'statements' @ [250:36] ==> public final val JsGlobalBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'generateDelegateCall' @ [250:50] ==> public fun generateDelegateCall(classDescriptor: ClassDescriptor, fromDescriptor: FunctionDescriptor, toDescriptor: FunctionDescriptor, thisObject: JsExpression, context: TranslationContext, detectDefaultParameters: Boolean, source: PsiElement?): JsStatement defined in org.jetbrains.kotlin.js.translate.utils in file utils.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [250:71] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridge[ValueParameterDescriptorImpl]

'fromDescriptor' @ [250:83] ==> val fromDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridge[LocalVariableDescriptor]

'toDescriptor' @ [250:99] ==> val toDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridge[LocalVariableDescriptor]

'JsThisRef' @ [250:113] ==> public constructor JsThisRef() defined in org.jetbrains.kotlin.js.backend.ast.JsThisRef[JavaClassConstructorDescriptor]

'translationContext' @ [251:71] ==> val translationContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridge[LocalVariableDescriptor]

'descriptor' @ [251:98] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.generateBridge[ValueParameterDescriptorImpl]

'source' @ [251:109] ==> public final val ClassDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [251:116] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'targetDescriptor' @ [261:13] ==> value-parameter targetDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyMethod[ValueParameterDescriptorImpl]

'module' @ [261:30] ==> public val DeclarationDescriptor.module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'context' @ [261:40] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[PropertyDescriptorImpl]

'currentModule' @ [261:48] ==> public final val StaticContext.currentModule: ModuleDescriptor[MyPropertyDescriptor]

'prototypeOf' @ [263:31] ==> @NotNull public open fun prototypeOf(@NotNull expression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'pureFqn' @ [263:43] ==> @NotNull public open fun pureFqn(@NotNull identifier: JsName, @Nullable qualifier: JsExpression?): JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'context' @ [263:51] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[PropertyDescriptorImpl]

'getInnerNameForDescriptor' @ [263:59] ==> @NotNull public open fun getInnerNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'targetDescriptor' @ [263:85] ==> value-parameter targetDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyMethod[ValueParameterDescriptorImpl]

'prototypeOf' @ [264:31] ==> @NotNull public open fun prototypeOf(@NotNull expression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'pureFqn' @ [264:43] ==> @NotNull public open fun pureFqn(@NotNull identifier: JsName, @Nullable qualifier: JsExpression?): JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'context' @ [264:51] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[PropertyDescriptorImpl]

'getInnerNameForDescriptor' @ [264:59] ==> @NotNull public open fun getInnerNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'sourceDescriptor' @ [264:85] ==> value-parameter sourceDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyMethod[ValueParameterDescriptorImpl]

'JsNameRef' @ [265:30] ==> public constructor JsNameRef(@NotNull p0: String, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'targetName' @ [265:40] ==> value-parameter targetName: String defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyMethod[ValueParameterDescriptorImpl]

'targetPrototype' @ [265:52] ==> val targetPrototype: JsExpression defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyMethod[LocalVariableDescriptor]

'JsNameRef' @ [266:30] ==> public constructor JsNameRef(@NotNull p0: String, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'sourceName' @ [266:40] ==> value-parameter sourceName: String defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyMethod[ValueParameterDescriptorImpl]

'sourcePrototype' @ [266:52] ==> val sourcePrototype: JsExpression defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyMethod[LocalVariableDescriptor]

'block' @ [267:9] ==> value-parameter block: JsBlock defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyMethod[ValueParameterDescriptorImpl]

'statements' @ [267:15] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'assignment' @ [267:40] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'targetFunction' @ [267:51] ==> val targetFunction: JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyMethod[LocalVariableDescriptor]

'sourceFunction' @ [267:67] ==> val sourceFunction: JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyMethod[LocalVariableDescriptor]

'makeStmt' @ [267:83] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'targetDescriptor' @ [276:13] ==> value-parameter targetDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyProperty[ValueParameterDescriptorImpl]

'module' @ [276:30] ==> public val DeclarationDescriptor.module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'context' @ [276:40] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[PropertyDescriptorImpl]

'currentModule' @ [276:48] ==> public final val StaticContext.currentModule: ModuleDescriptor[MyPropertyDescriptor]

'prototypeOf' @ [278:31] ==> @NotNull public open fun prototypeOf(@NotNull expression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'pureFqn' @ [278:43] ==> @NotNull public open fun pureFqn(@NotNull identifier: JsName, @Nullable qualifier: JsExpression?): JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'context' @ [278:51] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[PropertyDescriptorImpl]

'getInnerNameForDescriptor' @ [278:59] ==> @NotNull public open fun getInnerNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'targetDescriptor' @ [278:85] ==> value-parameter targetDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyProperty[ValueParameterDescriptorImpl]

'prototypeOf' @ [279:31] ==> @NotNull public open fun prototypeOf(@NotNull expression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'pureFqn' @ [279:43] ==> @NotNull public open fun pureFqn(@NotNull identifier: JsName, @Nullable qualifier: JsExpression?): JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'context' @ [279:51] ==> public final val context: StaticContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator[PropertyDescriptorImpl]

'getInnerNameForDescriptor' @ [279:59] ==> @NotNull public open fun getInnerNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'sourceDescriptor' @ [279:85] ==> value-parameter sourceDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyProperty[ValueParameterDescriptorImpl]

'JsStringLiteral' @ [280:27] ==> public constructor JsStringLiteral(p0: (String..String?)) defined in org.jetbrains.kotlin.js.backend.ast.JsStringLiteral[JavaClassConstructorDescriptor]

'name' @ [280:43] ==> value-parameter name: String defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyProperty[ValueParameterDescriptorImpl]

'JsInvocation' @ [282:37] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'JsNameRef' @ [282:50] ==> public constructor JsNameRef(@NotNull p0: String, @NotNull p1: String) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'sourcePrototype' @ [282:99] ==> val sourcePrototype: JsExpression defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyProperty[LocalVariableDescriptor]

'nameLiteral' @ [282:116] ==> val nameLiteral: JsStringLiteral defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyProperty[LocalVariableDescriptor]

'defineProperty' @ [283:41] ==> @NotNull public open fun defineProperty(@NotNull receiver: JsExpression, @NotNull name: String, @NotNull value: JsExpression): JsInvocation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'targetPrototype' @ [283:56] ==> val targetPrototype: JsExpression defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyProperty[LocalVariableDescriptor]

'name' @ [283:73] ==> value-parameter name: String defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyProperty[ValueParameterDescriptorImpl]

'getPropertyDescriptor' @ [283:79] ==> val getPropertyDescriptor: JsInvocation defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyProperty[LocalVariableDescriptor]

'block' @ [285:9] ==> value-parameter block: JsBlock defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyProperty[ValueParameterDescriptorImpl]

'statements' @ [285:15] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'defineProperty' @ [285:29] ==> val defineProperty: JsInvocation defined in org.jetbrains.kotlin.js.translate.declaration.ClassModelGenerator.copyProperty[LocalVariableDescriptor]

'makeStmt' @ [285:44] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaMethodDescriptor]

