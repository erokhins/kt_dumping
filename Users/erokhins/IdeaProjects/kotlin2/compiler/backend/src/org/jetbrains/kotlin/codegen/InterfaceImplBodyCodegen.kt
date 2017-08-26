'ClassBodyCodegen' @ [40:5] ==> protected/*protected and package*/ constructor ClassBodyCodegen(@NotNull myClass: KtPureClassOrObject, @NotNull context: ClassContext, @NotNull v: ClassBuilder, @NotNull state: GenerationState, @Nullable parentCodegen: MemberCodegen<*>?) defined in org.jetbrains.kotlin.codegen.ClassBodyCodegen[JavaClassConstructorDescriptor]

'aClass' @ [40:22] ==> value-parameter aClass: KtPureClassOrObject defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.<init>[ValueParameterDescriptorImpl]

'context' @ [40:30] ==> value-parameter context: ClassContext defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.<init>[ValueParameterDescriptorImpl]

'InterfaceImplClassBuilder' @ [40:64] ==> public constructor InterfaceImplClassBuilder(v: ClassBuilder) defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.InterfaceImplClassBuilder[ClassConstructorDescriptorImpl]

'v' @ [40:90] ==> value-parameter v: ClassBuilder defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.<init>[ValueParameterDescriptorImpl]

'state' @ [40:94] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.<init>[ValueParameterDescriptorImpl]

'parentCodegen' @ [40:101] ==> value-parameter parentCodegen: MemberCodegen<*>? defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.<init>[ValueParameterDescriptorImpl]

'v' @ [42:18] ==> public final val v: (ClassBuilder..ClassBuilder?) defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[JavaPropertyDescriptor]

'isAnythingGenerated' @ [42:50] ==> public final var isAnythingGenerated: Boolean defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.InterfaceImplClassBuilder[PropertyDescriptorImpl]

'typeMapper' @ [44:35] ==> public final val typeMapper: (KotlinTypeMapper..KotlinTypeMapper?) defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[JavaPropertyDescriptor]

'mapDefaultImpls' @ [44:46] ==> @NotNull public open fun mapDefaultImpls(@NotNull descriptor: ClassDescriptor): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'descriptor' @ [44:62] ==> @NotNull public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[JavaPropertyDescriptor]

'ACC_PUBLIC' @ [47:28] ==> public const final val ACC_PUBLIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ACC_FINAL' @ [47:42] ==> public const final val ACC_FINAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ACC_SUPER' @ [47:55] ==> public const final val ACC_SUPER: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'if (state.classBuilderMode == ClassBuilderMode.LIGHT_CLASSES) codegenFlags or ACC_STATIC else codegenFlags' @ [48:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'state' @ [48:25] ==> public final val state: (GenerationState..GenerationState?) defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[JavaPropertyDescriptor]

'classBuilderMode' @ [48:31] ==> public final val classBuilderMode: ClassBuilderMode defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'LIGHT_CLASSES' @ [48:68] ==> public final val LIGHT_CLASSES: (ClassBuilderMode..ClassBuilderMode?) defined in org.jetbrains.kotlin.codegen.ClassBuilderMode[JavaPropertyDescriptor]

'codegenFlags' @ [48:83] ==> val codegenFlags: Int defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDeclaration[LocalVariableDescriptor]

'ACC_STATIC' @ [48:99] ==> public const final val ACC_STATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'codegenFlags' @ [48:115] ==> val codegenFlags: Int defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDeclaration[LocalVariableDescriptor]

'v' @ [49:9] ==> public final val v: (ClassBuilder..ClassBuilder?) defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[JavaPropertyDescriptor]

'defineClass' @ [49:11] ==> public abstract fun defineClass(@Nullable origin: PsiElement?, version: Int, access: Int, @NotNull name: String, @Nullable signature: String?, @NotNull superName: String, @NotNull interfaces: (Array<(String..String?)>..Array<out (String..String?)>)): Unit defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'myClass' @ [50:17] ==> @NotNull public final val myClass: KtPureClassOrObject defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[JavaPropertyDescriptor]

'psiOrParent' @ [50:25] ==> public final val KtPureClassOrObject.psiOrParent: KtElement[MyPropertyDescriptor]

'state' @ [50:38] ==> public final val state: (GenerationState..GenerationState?) defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[JavaPropertyDescriptor]

'classFileVersion' @ [50:44] ==> public final val classFileVersion: Int defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'flags' @ [50:62] ==> val flags: Int defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDeclaration[LocalVariableDescriptor]

'defaultImplType' @ [51:17] ==> private final val defaultImplType: Type defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[PropertyDescriptorImpl]

'internalName' @ [51:33] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'EMPTY_STRING_ARRAY' @ [52:53] ==> public final val EMPTY_STRING_ARRAY: (Array<(String..String?)>..Array<out (String..String?)>?) defined in com.intellij.util.ArrayUtil[JavaPropertyDescriptor]

'v' @ [54:9] ==> public final val v: (ClassBuilder..ClassBuilder?) defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[JavaPropertyDescriptor]

'visitSource' @ [54:11] ==> public abstract fun visitSource(@NotNull name: String, @Nullable debug: String?): Unit defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'myClass' @ [54:23] ==> @NotNull public final val myClass: KtPureClassOrObject defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[JavaPropertyDescriptor]

'containingKtFile' @ [54:31] ==> public final val KtPureClassOrObject.containingKtFile: KtFile[MyPropertyDescriptor]

'name' @ [54:48] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'!' @ [58:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAnythingGenerated' @ [58:14] ==> private final var isAnythingGenerated: Boolean defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[PropertyDescriptorImpl]

'InnerClassConsumer' @ [59:16] ==> public companion object defined in org.jetbrains.kotlin.codegen.InnerClassConsumer[FakeCallableDescriptorForObject]

'classForInnerClassRecord' @ [59:35] ==> public final fun classForInnerClassRecord(descriptor: ClassDescriptor, defaultImpls: Boolean): ClassDescriptor? defined in org.jetbrains.kotlin.codegen.InnerClassConsumer.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [59:60] ==> @NotNull public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[JavaPropertyDescriptor]

'descriptor' @ [63:34] ==> @NotNull public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[JavaPropertyDescriptor]

'defaultType' @ [63:45] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'memberScope' @ [63:57] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'getContributedDescriptors' @ [63:69] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'memberDescriptor' @ [64:17] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'memberDescriptor' @ [66:17] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'kind' @ [66:34] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'isReal' @ [66:39] ==> public final val CallableMemberDescriptor.Kind.isReal: Boolean[MyPropertyDescriptor]

'memberDescriptor' @ [67:17] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'visibility' @ [67:34] ==> public final val CallableMemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'INVISIBLE_FAKE' @ [67:61] ==> @NotNull public final val INVISIBLE_FAKE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'memberDescriptor' @ [68:17] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'modality' @ [68:34] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'ABSTRACT' @ [68:55] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'findImplementationFromInterface' @ [70:34] ==> public fun findImplementationFromInterface(descriptor: CallableMemberDescriptor): CallableMemberDescriptor? defined in org.jetbrains.kotlin.backend.common.bridges[DeserializedSimpleFunctionDescriptor]

'memberDescriptor' @ [70:66] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'implementation' @ [73:17] ==> val implementation: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'isDefinitelyNotDefaultImplsMethod' @ [73:32] ==> public fun CallableMemberDescriptor.isDefinitelyNotDefaultImplsMethod(): Boolean defined in org.jetbrains.kotlin.codegen in file codegenUtil.kt[SimpleFunctionDescriptorImpl]

'memberDescriptor' @ [76:24] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'copy' @ [76:41] ==> @NotNull public abstract fun copy(p0: (DeclarationDescriptor..DeclarationDescriptor?), p1: (Modality..Modality?), p2: (Visibility..Visibility?), p3: (CallableMemberDescriptor.Kind..CallableMemberDescriptor.Kind?), p4: Boolean): CallableMemberDescriptor defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor[JavaMethodDescriptor]

'memberDescriptor' @ [76:46] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'containingDeclaration' @ [76:63] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'OPEN' @ [76:95] ==> enum entry OPEN defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'memberDescriptor' @ [76:101] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'visibility' @ [76:118] ==> public final val CallableMemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'DECLARATION' @ [77:76] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'if (memberDescriptor is FunctionDescriptor) {
                generateDelegationToSuperDefaultImpls(copy as FunctionDescriptor, implementation as FunctionDescriptor)
            }
            else if (memberDescriptor is PropertyDescriptor) {
                implementation as PropertyDescriptor
                val getter = (copy as PropertyDescriptor).getter
                val implGetter = implementation.getter
                if (getter != null && implGetter != null) {
                    generateDelegationToSuperDefaultImpls(getter, implGetter)
                }
                val setter = copy.setter
                val implSetter = implementation.setter
                if (setter != null && implSetter != null) {
                    generateDelegationToSuperDefaultImpls(setter, implSetter)
                }
            }' @ [79:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'memberDescriptor' @ [79:17] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'generateDelegationToSuperDefaultImpls' @ [80:17] ==> private final fun generateDelegationToSuperDefaultImpls(descriptor: FunctionDescriptor, implementation: FunctionDescriptor): Unit defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[SimpleFunctionDescriptorImpl]

'copy' @ [80:55] ==> val copy: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'implementation' @ [80:83] ==> val implementation: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'memberDescriptor' @ [82:22] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'implementation' @ [83:17] ==> val implementation: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'copy' @ [84:31] ==> val copy: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'getter' @ [84:59] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'implementation' @ [85:34] ==> val implementation: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'getter' @ [85:49] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'getter' @ [86:21] ==> val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'implGetter' @ [86:39] ==> val implGetter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'generateDelegationToSuperDefaultImpls' @ [87:21] ==> private final fun generateDelegationToSuperDefaultImpls(descriptor: FunctionDescriptor, implementation: FunctionDescriptor): Unit defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[SimpleFunctionDescriptorImpl]

'getter' @ [87:59] ==> val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'implGetter' @ [87:67] ==> val implGetter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'copy' @ [89:30] ==> val copy: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'setter' @ [89:35] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'implementation' @ [90:34] ==> val implementation: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'setter' @ [90:49] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'setter' @ [91:21] ==> val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'implSetter' @ [91:39] ==> val implSetter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'generateDelegationToSuperDefaultImpls' @ [92:21] ==> private final fun generateDelegationToSuperDefaultImpls(descriptor: FunctionDescriptor, implementation: FunctionDescriptor): Unit defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[SimpleFunctionDescriptorImpl]

'setter' @ [92:59] ==> val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'implSetter' @ [92:67] ==> val implSetter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateSyntheticPartsAfterBody[LocalVariableDescriptor]

'generateSyntheticAccessors' @ [97:9] ==> protected/*protected and package*/ open fun generateSyntheticAccessors(): Unit defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[JavaMethodDescriptor]

'firstSuperMethodFromKotlin' @ [101:26] ==> public fun firstSuperMethodFromKotlin(descriptor: CallableMemberDescriptor, implementation: CallableMemberDescriptor): CallableMemberDescriptor? defined in org.jetbrains.kotlin.backend.common.bridges[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [101:53] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls[ValueParameterDescriptorImpl]

'implementation' @ [101:65] ==> value-parameter implementation: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls[ValueParameterDescriptorImpl]

'delegateTo' @ [104:13] ==> val delegateTo: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls[LocalVariableDescriptor]

'functionCodegen' @ [106:9] ==> public final val functionCodegen: (FunctionCodegen..FunctionCodegen?) defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[JavaPropertyDescriptor]

'generateMethod' @ [106:25] ==> public open fun generateMethod(@NotNull origin: JvmDeclarationOrigin, @NotNull descriptor: FunctionDescriptor, @NotNull strategy: FunctionGenerationStrategy): Unit defined in org.jetbrains.kotlin.codegen.FunctionCodegen[JavaMethodDescriptor]

'JvmDeclarationOrigin' @ [107:17] ==> public constructor JvmDeclarationOrigin(originKind: JvmDeclarationOriginKind, element: PsiElement?, descriptor: DeclarationDescriptor?) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[DeserializedClassConstructorDescriptor]

'DEFAULT_IMPL_DELEGATION_TO_SUPERINTERFACE_DEFAULT_IMPL' @ [108:50] ==> enum entry DEFAULT_IMPL_DELEGATION_TO_SUPERINTERFACE_DEFAULT_IMPL defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOriginKind[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [109:49] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [109:73] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls[ValueParameterDescriptorImpl]

'descriptor' @ [109:86] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls[ValueParameterDescriptorImpl]

'descriptor' @ [111:17] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls[ValueParameterDescriptorImpl]

'FunctionGenerationStrategy.CodegenBased' @ [112:26] ==> public constructor CodegenBased(@NotNull state: GenerationState) defined in org.jetbrains.kotlin.codegen.FunctionGenerationStrategy.CodegenBased[JavaClassConstructorDescriptor]

'state' @ [112:66] ==> public final val state: (GenerationState..GenerationState?) defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[JavaPropertyDescriptor]

'codegen' @ [114:34] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls.<no name provided>.doGenerateBody[ValueParameterDescriptorImpl]

'v' @ [114:42] ==> public final val v: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaPropertyDescriptor]

'typeMapper' @ [116:38] ==> public final val typeMapper: (KotlinTypeMapper..KotlinTypeMapper?) defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[JavaPropertyDescriptor]

'mapToCallableMethod' @ [116:49] ==> @NotNull public open fun mapToCallableMethod(@NotNull descriptor: FunctionDescriptor, superCall: Boolean): CallableMethod defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'delegateTo' @ [116:69] ==> val delegateTo: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls[LocalVariableDescriptor]

'signature' @ [117:44] ==> value-parameter signature: JvmMethodSignature defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls.<no name provided>.doGenerateBody[ValueParameterDescriptorImpl]

'valueParameters' @ [117:54] ==> public final val JvmMethodSignature.valueParameters: (MutableList<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>..List<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>)[MyPropertyDescriptor]

'method' @ [118:48] ==> val method: CallableMethod defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls.<no name provided>.doGenerateBody[LocalVariableDescriptor]

'getValueParameters' @ [118:55] ==> public final fun getValueParameters(): List<JvmMethodParameterSignature> defined in org.jetbrains.kotlin.codegen.CallableMethod[SimpleFunctionDescriptorImpl]

'myParameters' @ [120:29] ==> val myParameters: (MutableList<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>..List<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>) defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls.<no name provided>.doGenerateBody[LocalVariableDescriptor]

'size' @ [120:42] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'calleeParameters' @ [120:50] ==> val calleeParameters: List<JvmMethodParameterSignature> defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls.<no name provided>.doGenerateBody[LocalVariableDescriptor]

'size' @ [120:67] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'AssertionError' @ [121:35] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'+' @ [122:37] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'format' @ [123:91] ==> @InlineOnly public inline fun String.format(vararg args: Any?): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [124:45] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls[ValueParameterDescriptorImpl]

'signature' @ [124:57] ==> value-parameter signature: JvmMethodSignature defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls.<no name provided>.doGenerateBody[ValueParameterDescriptorImpl]

'myParameters' @ [124:68] ==> val myParameters: (MutableList<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>..List<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>) defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls.<no name provided>.doGenerateBody[LocalVariableDescriptor]

'delegateTo' @ [124:82] ==> val delegateTo: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls[LocalVariableDescriptor]

'method' @ [124:94] ==> val method: CallableMethod defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls.<no name provided>.doGenerateBody[LocalVariableDescriptor]

'calleeParameters' @ [124:102] ==> val calleeParameters: List<JvmMethodParameterSignature> defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls.<no name provided>.doGenerateBody[LocalVariableDescriptor]

'calleeParameters' @ [130:34] ==> val calleeParameters: List<JvmMethodParameterSignature> defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls.<no name provided>.doGenerateBody[LocalVariableDescriptor]

'iterator' @ [130:51] ==> public abstract fun iterator(): Iterator<JvmMethodParameterSignature> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'myParameters' @ [131:43] ==> val myParameters: (MutableList<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>..List<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>) defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls.<no name provided>.doGenerateBody[LocalVariableDescriptor]

'parameter' @ [132:40] ==> val parameter: (JvmMethodParameterSignature..JvmMethodParameterSignature?) defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls.<no name provided>.doGenerateBody[LocalVariableDescriptor]

'asmType' @ [132:50] ==> public final val JvmMethodParameterSignature.asmType: Type[MyPropertyDescriptor]

'local' @ [133:40] ==> @NotNull public open fun local(index: Int, @NotNull type: Type): StackValue.Local defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'k' @ [133:46] ==> var k: Int defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls.<no name provided>.doGenerateBody[LocalVariableDescriptor]

'type' @ [133:49] ==> val type: Type defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls.<no name provided>.doGenerateBody[LocalVariableDescriptor]

'put' @ [133:55] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue.Local[JavaMethodDescriptor]

'it' @ [133:59] ==> val it: Iterator<JvmMethodParameterSignature> defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls.<no name provided>.doGenerateBody[LocalVariableDescriptor]

'next' @ [133:62] ==> public abstract operator fun next(): JvmMethodParameterSignature defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'asmType' @ [133:69] ==> public final val JvmMethodParameterSignature.asmType: Type[MyPropertyDescriptor]

'iv' @ [133:78] ==> val iv: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls.<no name provided>.doGenerateBody[LocalVariableDescriptor]

'k' @ [134:29] ==> var k: Int defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls.<no name provided>.doGenerateBody[LocalVariableDescriptor]

'type' @ [134:34] ==> val type: Type defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls.<no name provided>.doGenerateBody[LocalVariableDescriptor]

'size' @ [134:39] ==> public final val Type.size: Int[MyPropertyDescriptor]

'method' @ [137:25] ==> val method: CallableMethod defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls.<no name provided>.doGenerateBody[LocalVariableDescriptor]

'genInvokeInstruction' @ [137:32] ==> public open fun genInvokeInstruction(v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.CallableMethod[SimpleFunctionDescriptorImpl]

'iv' @ [137:53] ==> val iv: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls.<no name provided>.doGenerateBody[LocalVariableDescriptor]

'coerce' @ [138:36] ==> public open fun coerce(@NotNull fromType: Type, @NotNull toType: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'method' @ [138:43] ==> val method: CallableMethod defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls.<no name provided>.doGenerateBody[LocalVariableDescriptor]

'returnType' @ [138:50] ==> public open val returnType: Type defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'signature' @ [138:62] ==> value-parameter signature: JvmMethodSignature defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls.<no name provided>.doGenerateBody[ValueParameterDescriptorImpl]

'returnType' @ [138:72] ==> public final val JvmMethodSignature.returnType: Type[MyPropertyDescriptor]

'iv' @ [138:84] ==> val iv: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls.<no name provided>.doGenerateBody[LocalVariableDescriptor]

'iv' @ [139:25] ==> val iv: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls.<no name provided>.doGenerateBody[LocalVariableDescriptor]

'areturn' @ [139:28] ==> public open fun areturn(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'signature' @ [139:36] ==> value-parameter signature: JvmMethodSignature defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.generateDelegationToSuperDefaultImpls.<no name provided>.doGenerateBody[ValueParameterDescriptorImpl]

'returnType' @ [139:46] ==> public final val JvmMethodSignature.returnType: Type[MyPropertyDescriptor]

'v' @ [145:10] ==> public final val v: (ClassBuilder..ClassBuilder?) defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[JavaPropertyDescriptor]

'stopCounting' @ [145:42] ==> public final fun stopCounting(): Unit defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.InterfaceImplClassBuilder[SimpleFunctionDescriptorImpl]

'writeSyntheticClassMetadata' @ [147:9] ==> public fun writeSyntheticClassMetadata(cb: ClassBuilder, state: GenerationState): Unit defined in org.jetbrains.kotlin.codegen in file writeAnnotationUtil.kt[SimpleFunctionDescriptorImpl]

'v' @ [147:37] ==> public final val v: (ClassBuilder..ClassBuilder?) defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[JavaPropertyDescriptor]

'state' @ [147:40] ==> public final val state: (GenerationState..GenerationState?) defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[JavaPropertyDescriptor]

'super' @ [151:9] ==> <this> defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[LazyClassReceiverParameterDescriptor]

'done' @ [151:15] ==> protected/*protected and package*/ open fun done(): Unit defined in org.jetbrains.kotlin.codegen.ClassBodyCodegen[JavaMethodDescriptor]

'!' @ [152:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAnythingGenerated' @ [152:14] ==> private final var isAnythingGenerated: Boolean defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[PropertyDescriptorImpl]

'state' @ [153:13] ==> public final val state: (GenerationState..GenerationState?) defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[JavaPropertyDescriptor]

'factory' @ [153:19] ==> public final val factory: ClassFileFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'removeClasses' @ [153:27] ==> public open fun removeClasses(classNamesToRemove: (MutableSet<(String..String?)>..Set<(String..String?)>?)): Unit defined in org.jetbrains.kotlin.codegen.ClassFileFactory[JavaMethodDescriptor]

'setOf' @ [153:41] ==> public fun <T> setOf(element: (String..String?)): Set<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'defaultImplType' @ [153:47] ==> private final val defaultImplType: Type defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[PropertyDescriptorImpl]

'internalName' @ [153:63] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'DelegatingClassBuilder' @ [157:76] ==> public constructor DelegatingClassBuilder() defined in org.jetbrains.kotlin.codegen.DelegatingClassBuilder[JavaClassConstructorDescriptor]

'shouldCount' @ [163:13] ==> private final var shouldCount: Boolean defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.InterfaceImplClassBuilder[PropertyDescriptorImpl]

'v' @ [166:38] ==> private final val v: ClassBuilder defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.InterfaceImplClassBuilder[PropertyDescriptorImpl]

'shouldCount' @ [176:17] ==> private final var shouldCount: Boolean defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.InterfaceImplClassBuilder[PropertyDescriptorImpl]

'isAnythingGenerated' @ [177:17] ==> public final var isAnythingGenerated: Boolean defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.InterfaceImplClassBuilder[PropertyDescriptorImpl]

'super' @ [179:20] ==> <this> defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.InterfaceImplClassBuilder[LazyClassReceiverParameterDescriptor]

'newMethod' @ [179:26] ==> @NotNull @Override public open fun newMethod(@NotNull origin: JvmDeclarationOrigin, access: Int, @NotNull name: String, @NotNull desc: String, @Nullable signature: String?, @Nullable exceptions: (Array<(String..String?)>?..Array<out (String..String?)>?)): MethodVisitor defined in org.jetbrains.kotlin.codegen.DelegatingClassBuilder[JavaMethodDescriptor]

'origin' @ [179:36] ==> value-parameter origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.InterfaceImplClassBuilder.newMethod[ValueParameterDescriptorImpl]

'access' @ [179:44] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.InterfaceImplClassBuilder.newMethod[ValueParameterDescriptorImpl]

'name' @ [179:52] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.InterfaceImplClassBuilder.newMethod[ValueParameterDescriptorImpl]

'desc' @ [179:58] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.InterfaceImplClassBuilder.newMethod[ValueParameterDescriptorImpl]

'signature' @ [179:64] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.InterfaceImplClassBuilder.newMethod[ValueParameterDescriptorImpl]

'exceptions' @ [179:75] ==> value-parameter exceptions: Array<out String>? defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen.InterfaceImplClassBuilder.newMethod[ValueParameterDescriptorImpl]

'generatePropertyMetadataArrayFieldIfNeeded' @ [184:9] ==> protected/*protected and package*/ open fun generatePropertyMetadataArrayFieldIfNeeded(@NotNull thisAsmType: Type): Unit defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[JavaMethodDescriptor]

'defaultImplType' @ [184:52] ==> private final val defaultImplType: Type defined in org.jetbrains.kotlin.codegen.InterfaceImplBodyCodegen[PropertyDescriptorImpl]

