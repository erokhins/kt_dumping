'MemberCodegen<KtElement>' @ [56:5] ==> public constructor MemberCodegen<T : (KtPureElement..KtPureElement?)>(@NotNull state: GenerationState, @Nullable parentCodegen: MemberCodegen<*>?, @NotNull context: raw (FieldOwnerContext<(DeclarationDescriptor..DeclarationDescriptor?)>..FieldOwnerContext<*>), element: (KtElement..KtElement?), @NotNull builder: ClassBuilder) defined in org.jetbrains.kotlin.codegen.MemberCodegen[JavaClassConstructorDescriptor]
Inferred types:
    <T : (KtPureElement..KtPureElement?)> -> KtElement

'state' @ [56:30] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.<init>[ValueParameterDescriptorImpl]

'parentCodegen' @ [56:37] ==> value-parameter parentCodegen: MemberCodegen<*> defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.<init>[ValueParameterDescriptorImpl]

'context' @ [56:52] ==> value-parameter context: ClassContext defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.<init>[ValueParameterDescriptorImpl]

'expression' @ [56:61] ==> value-parameter expression: KtElement defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.<init>[ValueParameterDescriptorImpl]

'classBuilder' @ [56:73] ==> value-parameter classBuilder: ClassBuilder defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.<init>[ValueParameterDescriptorImpl]

'context' @ [57:35] ==> value-parameter context: ClassContext defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.<init>[ValueParameterDescriptorImpl]

'contextDescriptor' @ [57:43] ==> public final val ClassContext.contextDescriptor: ClassDescriptor[MyPropertyDescriptor]

'typeMapper' @ [58:27] ==> public final val typeMapper: (KotlinTypeMapper..KotlinTypeMapper?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[JavaPropertyDescriptor]

'mapClass' @ [58:38] ==> @NotNull public open fun mapClass(@NotNull classifier: ClassifierDescriptor): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'classDescriptor' @ [58:47] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'typeMapper' @ [61:32] ==> public final val typeMapper: (KotlinTypeMapper..KotlinTypeMapper?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[JavaPropertyDescriptor]

'mapClass' @ [61:43] ==> @NotNull public open fun mapClass(@NotNull classifier: ClassifierDescriptor): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'classDescriptor' @ [61:52] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'getSuperClassNotAny' @ [61:68] ==> public fun ClassDescriptor.getSuperClassNotAny(): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'sure' @ [61:90] ==> public inline fun <T : Any> ClassDescriptor?.sure(message: () -> String): ClassDescriptor defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClassDescriptor

'classDescriptor' @ [61:118] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'target' @ [63:44] ==> private final val target: VariableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'if (isLocalDelegatedProperty)
                (localVariableDescriptorForReference as VariableDescriptorWithAccessors).getter!!
            else
                findGetFunction(localVariableDescriptorForReference).original' @ [66:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionDescriptor, elseBranch: FunctionDescriptor): FunctionDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FunctionDescriptor

'isLocalDelegatedProperty' @ [66:17] ==> private final val isLocalDelegatedProperty: Boolean defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'!!' @ [67:17] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: VariableAccessorDescriptor?): VariableAccessorDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> VariableAccessorDescriptor

'localVariableDescriptorForReference' @ [67:18] ==> private final val localVariableDescriptorForReference: VariableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'getter' @ [67:90] ==> public abstract val getter: VariableAccessorDescriptor? defined in org.jetbrains.kotlin.descriptors.VariableDescriptorWithAccessors[DeserializedPropertyDescriptor]

'findGetFunction' @ [69:17] ==> @JvmStatic public final fun findGetFunction(localVariableDescriptorForReference: VariableDescriptor): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion[SimpleFunctionDescriptorImpl]

'localVariableDescriptorForReference' @ [69:33] ==> private final val localVariableDescriptorForReference: VariableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'original' @ [69:70] ==> public final val SimpleFunctionDescriptor.original: SimpleFunctionDescriptor[MyPropertyDescriptor]

'getWrapperMethodForPropertyReference' @ [72:33] ==> @JvmStatic public final fun getWrapperMethodForPropertyReference(property: VariableDescriptor, receiverCount: Int): Method defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion[SimpleFunctionDescriptorImpl]

'target' @ [72:70] ==> private final val target: VariableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'getFunction' @ [72:78] ==> private final val getFunction: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'valueParameters' @ [72:90] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [72:106] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'bindingContext' @ [74:27] ==> public final val bindingContext: (BindingContext..BindingContext?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[JavaPropertyDescriptor]

'get' @ [74:42] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(ClassDescriptor..ClassDescriptor?), (MutableClosure..MutableClosure?)>..ReadOnlySlice<(ClassDescriptor..ClassDescriptor?), (MutableClosure..MutableClosure?)>?), p1: (ClassDescriptor..ClassDescriptor?)): MutableClosure? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ClassDescriptor
    <V : (Any..Any?)> -> MutableClosure

'CLOSURE' @ [74:61] ==> public final val CLOSURE: (WritableSlice<(ClassDescriptor..ClassDescriptor?), (MutableClosure..MutableClosure?)>..WritableSlice<(ClassDescriptor..ClassDescriptor?), (MutableClosure..MutableClosure?)>?) defined in org.jetbrains.kotlin.codegen.binding.CodegenBinding[JavaPropertyDescriptor]

'classDescriptor' @ [74:70] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'apply' @ [74:89] ==> @InlineOnly public inline fun <T> MutableClosure.apply(block: MutableClosure.() -> Unit): MutableClosure defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableClosure

'assert' @ [75:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'==' @ [75:16] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'captureReceiverType' @ [75:17] ==> public final val MutableClosure.captureReceiverType: KotlinType?[MyPropertyDescriptor]

'receiverType' @ [75:50] ==> private final val receiverType: Type? defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'+' @ [76:13] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'captureReceiverType' @ [77:31] ==> public final val MutableClosure.captureReceiverType: KotlinType?[MyPropertyDescriptor]

'receiverType' @ [77:67] ==> private final val receiverType: Type? defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'calculateConstructorParameters' @ [81:50] ==> @NotNull public open fun calculateConstructorParameters(@NotNull typeMapper: KotlinTypeMapper, @NotNull closure: CalculatedClosure, @NotNull ownerType: Type): (MutableList<(FieldInfo..FieldInfo?)>..List<(FieldInfo..FieldInfo?)>) defined in org.jetbrains.kotlin.codegen.ClosureCodegen[JavaMethodDescriptor]

'typeMapper' @ [81:81] ==> public final val typeMapper: (KotlinTypeMapper..KotlinTypeMapper?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[JavaPropertyDescriptor]

'closure' @ [81:93] ==> private final val closure: MutableClosure defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'asmType' @ [81:102] ==> private final val asmType: Type defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'apply' @ [81:111] ==> @InlineOnly public inline fun <T> (MutableList<(FieldInfo..FieldInfo?)>..List<(FieldInfo..FieldInfo?)>).apply(block: ((MutableList<(FieldInfo..FieldInfo?)>..List<(FieldInfo..FieldInfo?)>)).() -> Unit): (MutableList<(FieldInfo..FieldInfo?)>..List<(FieldInfo..FieldInfo?)>) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.codegen.FieldInfo..org.jetbrains.kotlin.codegen.FieldInfo?)>..kotlin.collections.List<(org.jetbrains.kotlin.codegen.FieldInfo..org.jetbrains.kotlin.codegen.FieldInfo?)>)

'assert' @ [82:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'size' @ [82:16] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'this' @ [82:87] ==> <this> defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.constructorArgs.<anonymous>[ReceiverParameterDescriptorImpl]

'method' @ [84:31] ==> @NotNull public open fun method(@NotNull name: String, @NotNull returnType: Type, @NotNull vararg parameterTypes: (Type..Type?)): Method defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'VOID_TYPE' @ [84:53] ==> public final val VOID_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'constructorArgs' @ [84:65] ==> private final val constructorArgs: (MutableList<(FieldInfo..FieldInfo?)>..List<(FieldInfo..FieldInfo?)>) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'map' @ [84:81] ==> public inline fun <T, R> Iterable<(FieldInfo..FieldInfo?)>.map(transform: ((FieldInfo..FieldInfo?)) -> Type): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.codegen.FieldInfo..org.jetbrains.kotlin.codegen.FieldInfo?)
    <R> -> Type

'it' @ [84:87] ==> value-parameter it: (FieldInfo..FieldInfo?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.constructor.<anonymous>[ValueParameterDescriptorImpl]

'fieldType' @ [84:90] ==> public final val FieldInfo.fieldType: Type[MyPropertyDescriptor]

'toTypedArray' @ [84:102] ==> public inline fun <reified T> Collection<Type>.toTypedArray(): Array<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Type

'v' @ [87:9] ==> public final val v: (ClassBuilder..ClassBuilder?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[JavaPropertyDescriptor]

'defineClass' @ [87:11] ==> public abstract fun defineClass(@Nullable origin: PsiElement?, version: Int, access: Int, @NotNull name: String, @Nullable signature: String?, @NotNull superName: String, @NotNull interfaces: (Array<(String..String?)>..Array<out (String..String?)>)): Unit defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'element' @ [88:17] ==> protected/*protected and package*/ final val element: (KtElement..KtElement?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[JavaPropertyDescriptor]

'state' @ [89:17] ==> public final val state: (GenerationState..GenerationState?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[JavaPropertyDescriptor]

'classFileVersion' @ [89:23] ==> public final val classFileVersion: Int defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'ACC_FINAL' @ [90:17] ==> public const final val ACC_FINAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ACC_SUPER' @ [90:30] ==> public const final val ACC_SUPER: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'getVisibilityAccessFlagForClass' @ [90:51] ==> public open fun getVisibilityAccessFlagForClass(@NotNull descriptor: ClassDescriptor): Int defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'classDescriptor' @ [90:83] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'asmType' @ [91:17] ==> private final val asmType: Type defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'internalName' @ [91:25] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'superAsmType' @ [93:17] ==> private final val superAsmType: Type defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'internalName' @ [93:30] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'emptyArray' @ [94:17] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<(String..String?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (kotlin.String..kotlin.String?)

'v' @ [97:9] ==> public final val v: (ClassBuilder..ClassBuilder?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[JavaPropertyDescriptor]

'visitSource' @ [97:11] ==> public abstract fun visitSource(@NotNull name: String, @Nullable debug: String?): Unit defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'element' @ [97:23] ==> protected/*protected and package*/ final val element: (KtElement..KtElement?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[JavaPropertyDescriptor]

'containingFile' @ [97:31] ==> public final val KtElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'name' @ [97:46] ==> public final var PsiFile.name: String[MyPropertyDescriptor]

'if (JvmCodegenUtil.isConst(closure)) {
            generateConstInstance(asmType, wrapperMethod.returnType)
        }
        else {
            AsmUtil.genClosureFields(closure, v, typeMapper)
        }' @ [102:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isConst' @ [102:28] ==> public open fun isConst(@NotNull closure: CalculatedClosure): Boolean defined in org.jetbrains.kotlin.codegen.JvmCodegenUtil[JavaMethodDescriptor]

'closure' @ [102:36] ==> private final val closure: MutableClosure defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'generateConstInstance' @ [103:13] ==> protected/*protected and package*/ open fun generateConstInstance(@NotNull thisAsmType: Type, @NotNull fieldAsmType: Type): Unit defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[JavaMethodDescriptor]

'asmType' @ [103:35] ==> private final val asmType: Type defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'wrapperMethod' @ [103:44] ==> private final val wrapperMethod: Method defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'returnType' @ [103:58] ==> public final val Method.returnType: (Type..Type?)[MyPropertyDescriptor]

'genClosureFields' @ [106:21] ==> public open fun genClosureFields(@NotNull closure: CalculatedClosure, v: (ClassBuilder..ClassBuilder?), typeMapper: (KotlinTypeMapper..KotlinTypeMapper?)): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'closure' @ [106:38] ==> private final val closure: MutableClosure defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'v' @ [106:47] ==> public final val v: (ClassBuilder..ClassBuilder?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[JavaPropertyDescriptor]

'typeMapper' @ [106:50] ==> public final val typeMapper: (KotlinTypeMapper..KotlinTypeMapper?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[JavaPropertyDescriptor]

'generateConstructor' @ [109:9] ==> private final fun generateConstructor(): Unit defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[SimpleFunctionDescriptorImpl]

'generateMethod' @ [111:9] ==> private final fun generateMethod(debugString: String, access: Int, method: Method, generate: InstructionAdapter.() -> Unit): Unit defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[SimpleFunctionDescriptorImpl]

'ACC_PUBLIC' @ [111:54] ==> public const final val ACC_PUBLIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'method' @ [111:66] ==> @NotNull public open fun method(@NotNull name: String, @NotNull returnType: Type, @NotNull vararg parameterTypes: (Type..Type?)): Method defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'JAVA_STRING_TYPE' @ [111:84] ==> public final val JAVA_STRING_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'aconst' @ [112:13] ==> public open fun aconst(p0: (Any..Any?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'target' @ [112:20] ==> private final val target: VariableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'name' @ [112:27] ==> public final val VariableDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [112:32] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'generateMethod' @ [115:9] ==> private final fun generateMethod(debugString: String, access: Int, method: Method, generate: InstructionAdapter.() -> Unit): Unit defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[SimpleFunctionDescriptorImpl]

'ACC_PUBLIC' @ [115:59] ==> public const final val ACC_PUBLIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'method' @ [115:71] ==> @NotNull public open fun method(@NotNull name: String, @NotNull returnType: Type, @NotNull vararg parameterTypes: (Type..Type?)): Method defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'JAVA_STRING_TYPE' @ [115:94] ==> public final val JAVA_STRING_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'generateCallableReferenceSignature' @ [116:13] ==> @JvmStatic public final fun generateCallableReferenceSignature(iv: InstructionAdapter, callable: CallableDescriptor, state: GenerationState): Unit defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion[SimpleFunctionDescriptorImpl]

'this' @ [116:48] ==> <this> defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.generateBody.<anonymous>[ReceiverParameterDescriptorImpl]

'target' @ [116:54] ==> private final val target: VariableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'state' @ [116:62] ==> public final val state: (GenerationState..GenerationState?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[JavaPropertyDescriptor]

'generateMethod' @ [119:9] ==> private final fun generateMethod(debugString: String, access: Int, method: Method, generate: InstructionAdapter.() -> Unit): Unit defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[SimpleFunctionDescriptorImpl]

'ACC_PUBLIC' @ [119:55] ==> public const final val ACC_PUBLIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'method' @ [119:67] ==> @NotNull public open fun method(@NotNull name: String, @NotNull returnType: Type, @NotNull vararg parameterTypes: (Type..Type?)): Method defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'K_DECLARATION_CONTAINER_TYPE' @ [119:86] ==> public final val K_DECLARATION_CONTAINER_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'generateCallableReferenceDeclarationContainer' @ [120:28] ==> public open fun generateCallableReferenceDeclarationContainer(@NotNull iv: InstructionAdapter, @NotNull descriptor: CallableDescriptor, @NotNull state: GenerationState): Unit defined in org.jetbrains.kotlin.codegen.ClosureCodegen[JavaMethodDescriptor]

'this' @ [120:74] ==> <this> defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.generateBody.<anonymous>[ReceiverParameterDescriptorImpl]

'target' @ [120:80] ==> private final val target: VariableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'state' @ [120:88] ==> public final val state: (GenerationState..GenerationState?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[JavaPropertyDescriptor]

'!' @ [123:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isLocalDelegatedProperty' @ [123:14] ==> private final val isLocalDelegatedProperty: Boolean defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'generateAccessors' @ [124:13] ==> private final fun generateAccessors(): Unit defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[SimpleFunctionDescriptorImpl]

'generateMethod' @ [129:9] ==> private final fun generateMethod(debugString: String, access: Int, method: Method, generate: InstructionAdapter.() -> Unit): Unit defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[SimpleFunctionDescriptorImpl]

'constructor' @ [129:54] ==> private final val constructor: Method defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'closure' @ [130:52] ==> private final val closure: MutableClosure defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'isForBoundCallableReference' @ [130:60] ==> public fun CalculatedClosure.isForBoundCallableReference(): Boolean defined in org.jetbrains.kotlin.codegen in file callableReferenceUtil.kt[SimpleFunctionDescriptorImpl]

'generateClosureFieldsInitializationFromParameters' @ [131:40] ==> public fun InstructionAdapter.generateClosureFieldsInitializationFromParameters(closure: CalculatedClosure, args: List<FieldInfo>): Pair<Int, Type>? defined in org.jetbrains.kotlin.codegen[SimpleFunctionDescriptorImpl]

'closure' @ [131:90] ==> private final val closure: MutableClosure defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'constructorArgs' @ [131:99] ==> private final val constructorArgs: (MutableList<(FieldInfo..FieldInfo?)>..List<(FieldInfo..FieldInfo?)>) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'if (receiverIndexAndType == null) {
                assert(!shouldHaveBoundReferenceReceiver) { "No bound reference receiver in constructor parameters: $constructorArgs" }
                load(0, OBJECT_TYPE)
                invokespecial(superAsmType.internalName, "<init>", "()V", false)
            }
            else {
                val (receiverIndex, receiverType) = receiverIndexAndType
                load(0, OBJECT_TYPE)
                loadBoundReferenceReceiverParameter(receiverIndex, receiverType)
                invokespecial(superAsmType.internalName, "<init>", "(Ljava/lang/Object;)V", false)
            }' @ [133:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'receiverIndexAndType' @ [133:17] ==> val receiverIndexAndType: Pair<Int, Type>? defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.generateConstructor.<anonymous>[LocalVariableDescriptor]

'assert' @ [134:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [134:24] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'shouldHaveBoundReferenceReceiver' @ [134:25] ==> val shouldHaveBoundReferenceReceiver: Boolean defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.generateConstructor.<anonymous>[LocalVariableDescriptor]

'constructorArgs' @ [134:118] ==> private final val constructorArgs: (MutableList<(FieldInfo..FieldInfo?)>..List<(FieldInfo..FieldInfo?)>) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'load' @ [135:17] ==> public open fun load(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'OBJECT_TYPE' @ [135:25] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'invokespecial' @ [136:17] ==> public open fun invokespecial(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'superAsmType' @ [136:31] ==> private final val superAsmType: Type defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'internalName' @ [136:44] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'component1' @ [139:22] ==> public final operator fun component1(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [139:37] ==> public final operator fun component2(): Type defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'receiverIndexAndType' @ [139:53] ==> val receiverIndexAndType: Pair<Int, Type>? defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.generateConstructor.<anonymous>[LocalVariableDescriptor]

'load' @ [140:17] ==> public open fun load(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'OBJECT_TYPE' @ [140:25] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'loadBoundReferenceReceiverParameter' @ [141:17] ==> public fun InstructionAdapter.loadBoundReferenceReceiverParameter(index: Int, type: Type): Unit defined in org.jetbrains.kotlin.codegen in file callableReferenceUtil.kt[SimpleFunctionDescriptorImpl]

'receiverIndex' @ [141:53] ==> val receiverIndex: Int defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.generateConstructor.<anonymous>[LocalVariableDescriptor]

'receiverType' @ [141:68] ==> val receiverType: Type defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.generateConstructor.<anonymous>[LocalVariableDescriptor]

'invokespecial' @ [142:17] ==> public open fun invokespecial(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'superAsmType' @ [142:31] ==> private final val superAsmType: Type defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'internalName' @ [142:44] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'findGetFunction' @ [148:27] ==> @JvmStatic public final fun findGetFunction(localVariableDescriptorForReference: VariableDescriptor): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion[SimpleFunctionDescriptorImpl]

'localVariableDescriptorForReference' @ [148:43] ==> private final val localVariableDescriptorForReference: VariableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'createFakeOpenDescriptor' @ [149:23] ==> @JvmStatic public final fun createFakeOpenDescriptor(getFunction: FunctionDescriptor, classDescriptor: ClassDescriptor): FunctionDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion[SimpleFunctionDescriptorImpl]

'getFunction' @ [149:48] ==> val getFunction: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.generateAccessors[LocalVariableDescriptor]

'classDescriptor' @ [149:61] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'functionCodegen' @ [150:9] ==> public final val functionCodegen: (FunctionCodegen..FunctionCodegen?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[JavaPropertyDescriptor]

'generateMethod' @ [150:25] ==> public open fun generateMethod(@NotNull origin: JvmDeclarationOrigin, @NotNull descriptor: FunctionDescriptor, @NotNull strategy: FunctionGenerationStrategy): Unit defined in org.jetbrains.kotlin.codegen.FunctionCodegen[JavaMethodDescriptor]

'JvmDeclarationOrigin' @ [150:40] ==> public companion object defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[FakeCallableDescriptorForObject]

'NO_ORIGIN' @ [150:61] ==> @field:JvmField public final val NO_ORIGIN: JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin.Companion[DeserializedPropertyDescriptor]

'getImpl' @ [150:72] ==> val getImpl: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.generateAccessors[LocalVariableDescriptor]

'PropertyReferenceGenerationStrategy' @ [150:81] ==> public constructor PropertyReferenceGenerationStrategy(isGetter: Boolean, originalFunctionDesc: FunctionDescriptor, target: VariableDescriptor, asmType: Type, receiverType: Type?, expression: KtElement, state: GenerationState, isInliningStrategy: Boolean) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy[ClassConstructorDescriptorImpl]

'getFunction' @ [150:123] ==> val getFunction: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.generateAccessors[LocalVariableDescriptor]

'target' @ [150:136] ==> private final val target: VariableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'asmType' @ [150:144] ==> private final val asmType: Type defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'receiverType' @ [150:153] ==> private final val receiverType: Type? defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'element' @ [150:167] ==> protected/*protected and package*/ final val element: (KtElement..KtElement?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[JavaPropertyDescriptor]

'state' @ [150:176] ==> public final val state: (GenerationState..GenerationState?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[JavaPropertyDescriptor]

'!' @ [152:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ReflectionTypes' @ [152:14] ==> public companion object defined in org.jetbrains.kotlin.builtins.ReflectionTypes[FakeCallableDescriptorForObject]

'isNumberedKMutablePropertyType' @ [152:30] ==> public final fun isNumberedKMutablePropertyType(type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.ReflectionTypes.Companion[DeserializedSimpleFunctionDescriptor]

'localVariableDescriptorForReference' @ [152:61] ==> private final val localVariableDescriptorForReference: VariableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'type' @ [152:97] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'localVariableDescriptorForReference' @ [153:27] ==> private final val localVariableDescriptorForReference: VariableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'type' @ [153:63] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'memberScope' @ [153:68] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getContributedFunctions' @ [153:80] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'OperatorNameConventions' @ [153:104] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'SET' @ [153:128] ==> @field:JvmField public final val SET: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'FROM_BACKEND' @ [153:150] ==> enum entry FROM_BACKEND defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'single' @ [153:164] ==> public fun <T> Iterable<SimpleFunctionDescriptor>.single(): SimpleFunctionDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'createFakeOpenDescriptor' @ [154:23] ==> @JvmStatic public final fun createFakeOpenDescriptor(getFunction: FunctionDescriptor, classDescriptor: ClassDescriptor): FunctionDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion[SimpleFunctionDescriptorImpl]

'setFunction' @ [154:48] ==> val setFunction: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.generateAccessors[LocalVariableDescriptor]

'classDescriptor' @ [154:61] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'functionCodegen' @ [155:9] ==> public final val functionCodegen: (FunctionCodegen..FunctionCodegen?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[JavaPropertyDescriptor]

'generateMethod' @ [155:25] ==> public open fun generateMethod(@NotNull origin: JvmDeclarationOrigin, @NotNull descriptor: FunctionDescriptor, @NotNull strategy: FunctionGenerationStrategy): Unit defined in org.jetbrains.kotlin.codegen.FunctionCodegen[JavaMethodDescriptor]

'JvmDeclarationOrigin' @ [155:40] ==> public companion object defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[FakeCallableDescriptorForObject]

'NO_ORIGIN' @ [155:61] ==> @field:JvmField public final val NO_ORIGIN: JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin.Companion[DeserializedPropertyDescriptor]

'setImpl' @ [155:72] ==> val setImpl: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.generateAccessors[LocalVariableDescriptor]

'PropertyReferenceGenerationStrategy' @ [155:81] ==> public constructor PropertyReferenceGenerationStrategy(isGetter: Boolean, originalFunctionDesc: FunctionDescriptor, target: VariableDescriptor, asmType: Type, receiverType: Type?, expression: KtElement, state: GenerationState, isInliningStrategy: Boolean) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy[ClassConstructorDescriptorImpl]

'setFunction' @ [155:124] ==> val setFunction: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.generateAccessors[LocalVariableDescriptor]

'target' @ [155:137] ==> private final val target: VariableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'asmType' @ [155:145] ==> private final val asmType: Type defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'receiverType' @ [155:154] ==> private final val receiverType: Type? defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'element' @ [155:168] ==> protected/*protected and package*/ final val element: (KtElement..KtElement?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[JavaPropertyDescriptor]

'state' @ [155:177] ==> public final val state: (GenerationState..GenerationState?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[JavaPropertyDescriptor]

'v' @ [161:9] ==> public final val v: (ClassBuilder..ClassBuilder?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[JavaPropertyDescriptor]

'generateMethod' @ [161:11] ==> public fun ClassBuilder.generateMethod(debugString: String, access: Int, method: Method, element: PsiElement?, origin: JvmDeclarationOrigin, state: GenerationState, generate: InstructionAdapter.() -> Unit): Unit defined in org.jetbrains.kotlin.codegen[SimpleFunctionDescriptorImpl]

'debugString' @ [161:26] ==> value-parameter debugString: String defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.generateMethod[ValueParameterDescriptorImpl]

'access' @ [161:39] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.generateMethod[ValueParameterDescriptorImpl]

'method' @ [161:47] ==> value-parameter method: Method defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.generateMethod[ValueParameterDescriptorImpl]

'element' @ [161:55] ==> protected/*protected and package*/ final val element: (KtElement..KtElement?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[JavaPropertyDescriptor]

'JvmDeclarationOrigin' @ [161:64] ==> public companion object defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[FakeCallableDescriptorForObject]

'NO_ORIGIN' @ [161:85] ==> @field:JvmField public final val NO_ORIGIN: JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin.Companion[DeserializedPropertyDescriptor]

'state' @ [161:96] ==> public final val state: (GenerationState..GenerationState?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[JavaPropertyDescriptor]

'generate' @ [161:103] ==> value-parameter generate: InstructionAdapter.() -> Unit defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.generateMethod[ValueParameterDescriptorImpl]

'writeSyntheticClassMetadata' @ [165:9] ==> public fun writeSyntheticClassMetadata(cb: ClassBuilder, state: GenerationState): Unit defined in org.jetbrains.kotlin.codegen in file writeAnnotationUtil.kt[SimpleFunctionDescriptorImpl]

'v' @ [165:37] ==> public final val v: (ClassBuilder..ClassBuilder?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[JavaPropertyDescriptor]

'state' @ [165:40] ==> public final val state: (GenerationState..GenerationState?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[JavaPropertyDescriptor]

'operation' @ [169:27] ==> public open fun operation(type: (Type..Type?), lambda: (((InstructionAdapter..InstructionAdapter?)) -> (Unit..Unit?)..(((InstructionAdapter..InstructionAdapter?)) -> (Unit..Unit?))?)): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'wrapperMethod' @ [169:37] ==> private final val wrapperMethod: Method defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'returnType' @ [169:51] ==> public final val Method.returnType: (Type..Type?)[MyPropertyDescriptor]

'if (JvmCodegenUtil.isConst(closure)) {
                assert(receiverValue == null) { "No receiver expected for unbound property reference: $classDescriptor" }
                iv.getstatic(asmType.internalName, JvmAbi.INSTANCE_FIELD, wrapperMethod.returnType.descriptor)
            }
            else {
                assert(receiverValue != null) { "Receiver expected for bound property reference: $classDescriptor" }
                iv.anew(asmType)
                iv.dup()
                receiverValue!!()
                iv.invokespecial(asmType.internalName, "<init>", constructor.descriptor, false)
            }' @ [170:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isConst' @ [170:32] ==> public open fun isConst(@NotNull closure: CalculatedClosure): Boolean defined in org.jetbrains.kotlin.codegen.JvmCodegenUtil[JavaMethodDescriptor]

'closure' @ [170:40] ==> private final val closure: MutableClosure defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'assert' @ [171:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'receiverValue' @ [171:24] ==> value-parameter receiverValue: (() -> Unit)? defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.putInstanceOnStack[ValueParameterDescriptorImpl]

'classDescriptor' @ [171:104] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'iv' @ [172:17] ==> value-parameter iv: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.putInstanceOnStack.<anonymous>[ValueParameterDescriptorImpl]

'getstatic' @ [172:20] ==> public open fun getstatic(p0: (String..String?), p1: (String..String?), p2: (String..String?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'asmType' @ [172:30] ==> private final val asmType: Type defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'internalName' @ [172:38] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'INSTANCE_FIELD' @ [172:59] ==> public const final val INSTANCE_FIELD: String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaPropertyDescriptor]

'wrapperMethod' @ [172:75] ==> private final val wrapperMethod: Method defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'returnType' @ [172:89] ==> public final val Method.returnType: (Type..Type?)[MyPropertyDescriptor]

'descriptor' @ [172:100] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'assert' @ [175:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'receiverValue' @ [175:24] ==> value-parameter receiverValue: (() -> Unit)? defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.putInstanceOnStack[ValueParameterDescriptorImpl]

'classDescriptor' @ [175:99] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'iv' @ [176:17] ==> value-parameter iv: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.putInstanceOnStack.<anonymous>[ValueParameterDescriptorImpl]

'anew' @ [176:20] ==> public open fun anew(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'asmType' @ [176:25] ==> private final val asmType: Type defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'iv' @ [177:17] ==> value-parameter iv: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.putInstanceOnStack.<anonymous>[ValueParameterDescriptorImpl]

'dup' @ [177:20] ==> public open fun dup(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'receiverValue' @ [178:17] ==> value-parameter receiverValue: (() -> Unit)? defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.putInstanceOnStack[ValueParameterDescriptorImpl]

'iv' @ [179:17] ==> value-parameter iv: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.putInstanceOnStack.<anonymous>[ValueParameterDescriptorImpl]

'invokespecial' @ [179:20] ==> public open fun invokespecial(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'asmType' @ [179:34] ==> private final val asmType: Type defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'internalName' @ [179:42] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'constructor' @ [179:66] ==> private final val constructor: Method defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen[PropertyDescriptorImpl]

'descriptor' @ [179:78] ==> public final val Method.descriptor: (String..String?)[MyPropertyDescriptor]

'JvmField' @ [186:9] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'create' @ [187:47] ==> @NotNull public open fun create(@NotNull p0: TypeSubstitution): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'TypeSubstitution' @ [187:63] ==> public constructor TypeSubstitution() defined in org.jetbrains.kotlin.types.TypeSubstitution[DeserializedClassConstructorDescriptor]

'isUnit' @ [189:36] ==> public open fun isUnit(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'key' @ [189:43] ==> value-parameter key: KotlinType defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.ANY_SUBSTITUTOR.<no name provided>.get[ValueParameterDescriptorImpl]

'TypeProjectionImpl' @ [190:28] ==> public constructor TypeProjectionImpl(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'key' @ [190:47] ==> value-parameter key: KotlinType defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.ANY_SUBSTITUTOR.<no name provided>.get[ValueParameterDescriptorImpl]

'TypeProjectionImpl' @ [192:24] ==> public constructor TypeProjectionImpl(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'key' @ [192:43] ==> value-parameter key: KotlinType defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.ANY_SUBSTITUTOR.<no name provided>.get[ValueParameterDescriptorImpl]

'builtIns' @ [192:47] ==> public val KotlinType.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.types.typeUtil[DeserializedPropertyDescriptor]

'nullableAnyType' @ [192:56] ==> public final val KotlinBuiltIns.nullableAnyType: SimpleType[MyPropertyDescriptor]

'JvmStatic' @ [196:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'callable' @ [198:17] ==> value-parameter callable: CallableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.generateCallableReferenceSignature[ValueParameterDescriptorImpl]

'state' @ [199:31] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.generateCallableReferenceSignature[ValueParameterDescriptorImpl]

'bindingContext' @ [199:37] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'get' @ [199:52] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?), (Type..Type?)>..ReadOnlySlice<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?), (Type..Type?)>?), p1: (VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?)): Type? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> VariableDescriptorWithAccessors
    <V : (Any..Any?)> -> Type

'DELEGATED_PROPERTY_METADATA_OWNER' @ [199:71] ==> public final val DELEGATED_PROPERTY_METADATA_OWNER: (WritableSlice<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?), (Type..Type?)>..WritableSlice<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?), (Type..Type?)>?) defined in org.jetbrains.kotlin.codegen.binding.CodegenBinding[JavaPropertyDescriptor]

'callable' @ [199:106] ==> value-parameter callable: CallableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.generateCallableReferenceSignature[ValueParameterDescriptorImpl]

'state' @ [200:46] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.generateCallableReferenceSignature[ValueParameterDescriptorImpl]

'bindingContext' @ [200:52] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'get' @ [200:67] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(Type..Type?), (MutableList<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?)>..List<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?)>?)>..ReadOnlySlice<(Type..Type?), (MutableList<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?)>..List<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?)>?)>?), p1: (Type..Type?)): (MutableList<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?)>?..List<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Type
    <V : (Any..Any?)> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.descriptors.VariableDescriptorWithAccessors..org.jetbrains.kotlin.descriptors.VariableDescriptorWithAccessors?)>..kotlin.collections.List<(org.jetbrains.kotlin.descriptors.VariableDescriptorWithAccessors..org.jetbrains.kotlin.descriptors.VariableDescriptorWithAccessors?)>)

'DELEGATED_PROPERTIES' @ [200:86] ==> public final val DELEGATED_PROPERTIES: (WritableSlice<(Type..Type?), (MutableList<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?)>..List<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?)>?)>..WritableSlice<(Type..Type?), (MutableList<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?)>..List<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?)>?)>?) defined in org.jetbrains.kotlin.codegen.binding.CodegenBinding[JavaPropertyDescriptor]

'asmType' @ [200:108] ==> val asmType: Type? defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.generateCallableReferenceSignature[LocalVariableDescriptor]

'allDelegatedProperties' @ [201:29] ==> val allDelegatedProperties: (MutableList<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?)>?..List<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?)>?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.generateCallableReferenceSignature[LocalVariableDescriptor]

'indexOf' @ [201:53] ==> public abstract fun indexOf(element: (VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?)): Int defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'callable' @ [201:61] ==> value-parameter callable: CallableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.generateCallableReferenceSignature[ValueParameterDescriptorImpl]

'-' @ [201:74] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'index' @ [202:21] ==> val index: Int defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.generateCallableReferenceSignature[LocalVariableDescriptor]

'AssertionError' @ [203:27] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'asmType' @ [203:85] ==> val asmType: Type? defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.generateCallableReferenceSignature[LocalVariableDescriptor]

'callable' @ [203:95] ==> value-parameter callable: CallableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.generateCallableReferenceSignature[ValueParameterDescriptorImpl]

'iv' @ [205:17] ==> value-parameter iv: InstructionAdapter defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.generateCallableReferenceSignature[ValueParameterDescriptorImpl]

'aconst' @ [205:20] ==> public open fun aconst(p0: (Any..Any?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'index' @ [205:32] ==> val index: Int defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.generateCallableReferenceSignature[LocalVariableDescriptor]

'when (callable) {
                is FunctionDescriptor -> callable
                is VariableDescriptorWithAccessors ->
                    callable.getter ?:
                    DescriptorFactory.createDefaultGetter(callable as PropertyDescriptor, Annotations.EMPTY).apply {
                        initialize(callable.type)
                    }
                else -> error("Unsupported callable reference: $callable")
            }' @ [209:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: FunctionDescriptor, entry1: FunctionDescriptor, entry2: FunctionDescriptor): FunctionDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> FunctionDescriptor

'callable' @ [209:34] ==> value-parameter callable: CallableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.generateCallableReferenceSignature[ValueParameterDescriptorImpl]

'callable' @ [210:42] ==> value-parameter callable: CallableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.generateCallableReferenceSignature[ValueParameterDescriptorImpl]

'callable' @ [212:21] ==> value-parameter callable: CallableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.generateCallableReferenceSignature[ValueParameterDescriptorImpl]

'getter' @ [212:30] ==> public abstract val getter: VariableAccessorDescriptor? defined in org.jetbrains.kotlin.descriptors.VariableDescriptorWithAccessors[DeserializedPropertyDescriptor]

'createDefaultGetter' @ [213:39] ==> @NotNull public open fun createDefaultGetter(@NotNull p0: PropertyDescriptor, @NotNull p1: Annotations): PropertyGetterDescriptorImpl defined in org.jetbrains.kotlin.resolve.DescriptorFactory[JavaMethodDescriptor]

'callable' @ [213:59] ==> value-parameter callable: CallableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.generateCallableReferenceSignature[ValueParameterDescriptorImpl]

'Annotations' @ [213:91] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [213:103] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'apply' @ [213:110] ==> @InlineOnly public inline fun <T> PropertyGetterDescriptorImpl.apply(block: (PropertyGetterDescriptorImpl).() -> Unit): PropertyGetterDescriptorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyGetterDescriptorImpl

'initialize' @ [214:25] ==> public open fun initialize(p0: (KotlinType..KotlinType?)): Unit defined in org.jetbrains.kotlin.descriptors.impl.PropertyGetterDescriptorImpl[JavaMethodDescriptor]

'callable' @ [214:36] ==> value-parameter callable: CallableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.generateCallableReferenceSignature[ValueParameterDescriptorImpl]

'type' @ [214:45] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'error' @ [216:25] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'callable' @ [216:65] ==> value-parameter callable: CallableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.generateCallableReferenceSignature[ValueParameterDescriptorImpl]

'unwrapFakeOverride' @ [218:47] ==> @NotNull public open fun <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> unwrapFakeOverride(@NotNull p0: FunctionDescriptor): FunctionDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]
Inferred types:
    <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> -> FunctionDescriptor

'accessor' @ [218:66] ==> val accessor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.generateCallableReferenceSignature[LocalVariableDescriptor]

'original' @ [218:76] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'state' @ [219:26] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.generateCallableReferenceSignature[ValueParameterDescriptorImpl]

'typeMapper' @ [219:32] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'mapAsmMethod' @ [219:43] ==> @NotNull public open fun mapAsmMethod(@NotNull descriptor: FunctionDescriptor): Method defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'declaration' @ [219:56] ==> val declaration: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.generateCallableReferenceSignature[LocalVariableDescriptor]

'iv' @ [220:13] ==> value-parameter iv: InstructionAdapter defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.generateCallableReferenceSignature[ValueParameterDescriptorImpl]

'aconst' @ [220:16] ==> public open fun aconst(p0: (Any..Any?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'method' @ [220:23] ==> val method: Method defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.generateCallableReferenceSignature[LocalVariableDescriptor]

'name' @ [220:30] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'method' @ [220:37] ==> val method: Method defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.generateCallableReferenceSignature[LocalVariableDescriptor]

'descriptor' @ [220:44] ==> public final val Method.descriptor: (String..String?)[MyPropertyDescriptor]

'JvmStatic' @ [223:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'when (receiverCount) {
                2 -> when {
                    property.isVar -> method("mutableProperty2", K_MUTABLE_PROPERTY2_TYPE, MUTABLE_PROPERTY_REFERENCE2)
                    else -> method("property2", K_PROPERTY2_TYPE, PROPERTY_REFERENCE2)
                }
                1 -> when {
                    property.isVar -> method("mutableProperty1", K_MUTABLE_PROPERTY1_TYPE, MUTABLE_PROPERTY_REFERENCE1)
                    else -> method("property1", K_PROPERTY1_TYPE, PROPERTY_REFERENCE1)
                }
                else -> when {
                    property.isVar -> method("mutableProperty0", K_MUTABLE_PROPERTY0_TYPE, MUTABLE_PROPERTY_REFERENCE0)
                    else -> method("property0", K_PROPERTY0_TYPE, PROPERTY_REFERENCE0)
                }
            }' @ [225:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Method, entry1: Method, entry2: Method): Method[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Method

'receiverCount' @ [225:26] ==> value-parameter receiverCount: Int defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.getWrapperMethodForPropertyReference[ValueParameterDescriptorImpl]

'when {
                    property.isVar -> method("mutableProperty2", K_MUTABLE_PROPERTY2_TYPE, MUTABLE_PROPERTY_REFERENCE2)
                    else -> method("property2", K_PROPERTY2_TYPE, PROPERTY_REFERENCE2)
                }' @ [226:22] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Method, entry1: Method): Method[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Method

'property' @ [227:21] ==> value-parameter property: VariableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.getWrapperMethodForPropertyReference[ValueParameterDescriptorImpl]

'isVar' @ [227:30] ==> public final val VariableDescriptor.isVar: Boolean[MyPropertyDescriptor]

'method' @ [227:39] ==> @NotNull public open fun method(@NotNull name: String, @NotNull returnType: Type, @NotNull vararg parameterTypes: (Type..Type?)): Method defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'K_MUTABLE_PROPERTY2_TYPE' @ [227:66] ==> public final val K_MUTABLE_PROPERTY2_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'MUTABLE_PROPERTY_REFERENCE2' @ [227:92] ==> public final val MUTABLE_PROPERTY_REFERENCE2: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'method' @ [228:29] ==> @NotNull public open fun method(@NotNull name: String, @NotNull returnType: Type, @NotNull vararg parameterTypes: (Type..Type?)): Method defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'K_PROPERTY2_TYPE' @ [228:49] ==> public final val K_PROPERTY2_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'PROPERTY_REFERENCE2' @ [228:67] ==> public final val PROPERTY_REFERENCE2: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'when {
                    property.isVar -> method("mutableProperty1", K_MUTABLE_PROPERTY1_TYPE, MUTABLE_PROPERTY_REFERENCE1)
                    else -> method("property1", K_PROPERTY1_TYPE, PROPERTY_REFERENCE1)
                }' @ [230:22] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Method, entry1: Method): Method[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Method

'property' @ [231:21] ==> value-parameter property: VariableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.getWrapperMethodForPropertyReference[ValueParameterDescriptorImpl]

'isVar' @ [231:30] ==> public final val VariableDescriptor.isVar: Boolean[MyPropertyDescriptor]

'method' @ [231:39] ==> @NotNull public open fun method(@NotNull name: String, @NotNull returnType: Type, @NotNull vararg parameterTypes: (Type..Type?)): Method defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'K_MUTABLE_PROPERTY1_TYPE' @ [231:66] ==> public final val K_MUTABLE_PROPERTY1_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'MUTABLE_PROPERTY_REFERENCE1' @ [231:92] ==> public final val MUTABLE_PROPERTY_REFERENCE1: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'method' @ [232:29] ==> @NotNull public open fun method(@NotNull name: String, @NotNull returnType: Type, @NotNull vararg parameterTypes: (Type..Type?)): Method defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'K_PROPERTY1_TYPE' @ [232:49] ==> public final val K_PROPERTY1_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'PROPERTY_REFERENCE1' @ [232:67] ==> public final val PROPERTY_REFERENCE1: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'when {
                    property.isVar -> method("mutableProperty0", K_MUTABLE_PROPERTY0_TYPE, MUTABLE_PROPERTY_REFERENCE0)
                    else -> method("property0", K_PROPERTY0_TYPE, PROPERTY_REFERENCE0)
                }' @ [234:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Method, entry1: Method): Method[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Method

'property' @ [235:21] ==> value-parameter property: VariableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.getWrapperMethodForPropertyReference[ValueParameterDescriptorImpl]

'isVar' @ [235:30] ==> public final val VariableDescriptor.isVar: Boolean[MyPropertyDescriptor]

'method' @ [235:39] ==> @NotNull public open fun method(@NotNull name: String, @NotNull returnType: Type, @NotNull vararg parameterTypes: (Type..Type?)): Method defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'K_MUTABLE_PROPERTY0_TYPE' @ [235:66] ==> public final val K_MUTABLE_PROPERTY0_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'MUTABLE_PROPERTY_REFERENCE0' @ [235:92] ==> public final val MUTABLE_PROPERTY_REFERENCE0: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'method' @ [236:29] ==> @NotNull public open fun method(@NotNull name: String, @NotNull returnType: Type, @NotNull vararg parameterTypes: (Type..Type?)): Method defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'K_PROPERTY0_TYPE' @ [236:49] ==> public final val K_PROPERTY0_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'PROPERTY_REFERENCE0' @ [236:67] ==> public final val PROPERTY_REFERENCE0: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'JvmStatic' @ [241:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'getFunction' @ [243:24] ==> value-parameter getFunction: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.createFakeOpenDescriptor[ValueParameterDescriptorImpl]

'original' @ [243:36] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'copy' @ [243:45] ==> @NotNull public abstract fun copy(p0: (DeclarationDescriptor..DeclarationDescriptor?), p1: (Modality..Modality?), p2: (Visibility..Visibility?), p3: (CallableMemberDescriptor.Kind..CallableMemberDescriptor.Kind?), p4: Boolean): FunctionDescriptor defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[JavaMethodDescriptor]

'classDescriptor' @ [243:50] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.createFakeOpenDescriptor[ValueParameterDescriptorImpl]

'Modality' @ [243:67] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'OPEN' @ [243:76] ==> enum entry OPEN defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'getFunction' @ [243:82] ==> value-parameter getFunction: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.createFakeOpenDescriptor[ValueParameterDescriptorImpl]

'visibility' @ [243:94] ==> public final val FunctionDescriptor.visibility: Visibility[MyPropertyDescriptor]

'getFunction' @ [243:106] ==> value-parameter getFunction: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.createFakeOpenDescriptor[ValueParameterDescriptorImpl]

'kind' @ [243:118] ==> public final val FunctionDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'copy' @ [244:20] ==> val copy: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.createFakeOpenDescriptor[LocalVariableDescriptor]

'substitute' @ [244:25] ==> @Nullable public abstract fun substitute(@NotNull substitutor: TypeSubstitutor): FunctionDescriptor? defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[JavaMethodDescriptor]

'ANY_SUBSTITUTOR' @ [244:36] ==> @JvmField public final val ANY_SUBSTITUTOR: TypeSubstitutor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion[PropertyDescriptorImpl]

'JvmStatic' @ [247:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'localVariableDescriptorForReference' @ [248:88] ==> value-parameter localVariableDescriptorForReference: VariableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.Companion.findGetFunction[ValueParameterDescriptorImpl]

'type' @ [248:124] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'memberScope' @ [248:129] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getContributedFunctions' @ [248:141] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'OperatorNameConventions' @ [248:165] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'GET' @ [248:189] ==> @field:JvmField public final val GET: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'FROM_BACKEND' @ [248:211] ==> enum entry FROM_BACKEND defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'single' @ [248:225] ==> public fun <T> Iterable<SimpleFunctionDescriptor>.single(): SimpleFunctionDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'FunctionGenerationStrategy.CodegenBased' @ [261:13] ==> public constructor CodegenBased(@NotNull state: GenerationState) defined in org.jetbrains.kotlin.codegen.FunctionGenerationStrategy.CodegenBased[JavaClassConstructorDescriptor]

'state' @ [261:53] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.<init>[ValueParameterDescriptorImpl]

'codegen' @ [263:21] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[ValueParameterDescriptorImpl]

'v' @ [263:29] ==> public final val v: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaPropertyDescriptor]

'state' @ [264:30] ==> protected/*protected and package*/ final val state: (GenerationState..GenerationState?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy[JavaPropertyDescriptor]

'typeMapper' @ [264:36] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'target' @ [265:17] ==> public final val target: VariableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy[PropertyDescriptorImpl]

'target' @ [266:40] ==> public final val target: VariableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy[PropertyDescriptorImpl]

'containingObject' @ [266:47] ==> public final val containingObject: ClassDescriptor defined in org.jetbrains.kotlin.resolve.PropertyImportedFromObject[DeserializedPropertyDescriptor]

'singleton' @ [267:28] ==> @NotNull public open fun singleton(@NotNull classDescriptor: ClassDescriptor, @NotNull typeMapper: KotlinTypeMapper): StackValue.Field defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'containingObject' @ [267:38] ==> val containingObject: ClassDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[LocalVariableDescriptor]

'typeMapper' @ [267:56] ==> val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[LocalVariableDescriptor]

'put' @ [267:68] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue.Field[JavaMethodDescriptor]

'typeMapper' @ [267:72] ==> val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[LocalVariableDescriptor]

'mapClass' @ [267:83] ==> @NotNull public open fun mapClass(@NotNull classifier: ClassifierDescriptor): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'containingObject' @ [267:92] ==> val containingObject: ClassDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[LocalVariableDescriptor]

'v' @ [267:111] ==> val v: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[LocalVariableDescriptor]

'if (receiverType != null) {
                val expectedReceiver = target.extensionReceiverParameter?.type ?: (target.containingDeclaration as? ClassDescriptor)?.defaultType
                val expectedReceiverType = if (expectedReceiver != null) typeMapper.mapType(expectedReceiver) else receiverType
                capturedBoundReferenceReceiver(asmType, expectedReceiverType, isInliningStrategy).put(expectedReceiverType, v)
            }
            else {
                val receivers = originalFunctionDesc.valueParameters.dropLast(if (isGetter) 0 else 1)
                receivers.forEachIndexed { i, valueParameterDescriptor ->
                    StackValue.local(i + 1, OBJECT_TYPE).put(typeMapper.mapType(valueParameterDescriptor), v)
                }
            }' @ [270:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'receiverType' @ [270:17] ==> public final val receiverType: Type? defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy[PropertyDescriptorImpl]

'target' @ [271:40] ==> public final val target: VariableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy[PropertyDescriptorImpl]

'extensionReceiverParameter' @ [271:47] ==> public final val VariableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [271:75] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'target' @ [271:84] ==> public final val target: VariableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy[PropertyDescriptorImpl]

'containingDeclaration' @ [271:91] ==> public final val VariableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'defaultType' @ [271:135] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'if (expectedReceiver != null) typeMapper.mapType(expectedReceiver) else receiverType' @ [272:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type, elseBranch: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'expectedReceiver' @ [272:48] ==> val expectedReceiver: KotlinType? defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[LocalVariableDescriptor]

'typeMapper' @ [272:74] ==> val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[LocalVariableDescriptor]

'mapType' @ [272:85] ==> @NotNull public open fun mapType(@NotNull jetType: KotlinType): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'expectedReceiver' @ [272:93] ==> val expectedReceiver: KotlinType? defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[LocalVariableDescriptor]

'receiverType' @ [272:116] ==> public final val receiverType: Type? defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy[PropertyDescriptorImpl]

'capturedBoundReferenceReceiver' @ [273:17] ==> public fun capturedBoundReferenceReceiver(ownerType: Type, expectedReceiverType: Type, isInliningStrategy: Boolean): StackValue defined in org.jetbrains.kotlin.codegen in file callableReferenceUtil.kt[SimpleFunctionDescriptorImpl]

'asmType' @ [273:48] ==> public final val asmType: Type defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy[PropertyDescriptorImpl]

'expectedReceiverType' @ [273:57] ==> val expectedReceiverType: Type defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[LocalVariableDescriptor]

'isInliningStrategy' @ [273:79] ==> private final val isInliningStrategy: Boolean defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy[PropertyDescriptorImpl]

'put' @ [273:99] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'expectedReceiverType' @ [273:103] ==> val expectedReceiverType: Type defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[LocalVariableDescriptor]

'v' @ [273:125] ==> val v: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[LocalVariableDescriptor]

'originalFunctionDesc' @ [276:33] ==> private final val originalFunctionDesc: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy[PropertyDescriptorImpl]

'valueParameters' @ [276:54] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'dropLast' @ [276:70] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.dropLast(n: Int): List<(ValueParameterDescriptor..ValueParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'if (isGetter) 0 else 1' @ [276:79] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'isGetter' @ [276:83] ==> public final val isGetter: Boolean defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy[PropertyDescriptorImpl]

'receivers' @ [277:17] ==> val receivers: List<(ValueParameterDescriptor..ValueParameterDescriptor?)> defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[LocalVariableDescriptor]

'forEachIndexed' @ [277:27] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.forEachIndexed(action: (index: Int, (ValueParameterDescriptor..ValueParameterDescriptor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'local' @ [278:32] ==> @NotNull public open fun local(index: Int, @NotNull type: Type): StackValue.Local defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'i' @ [278:38] ==> value-parameter i: Int defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody.<anonymous>[ValueParameterDescriptorImpl]

'OBJECT_TYPE' @ [278:45] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'put' @ [278:58] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue.Local[JavaMethodDescriptor]

'typeMapper' @ [278:62] ==> val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[LocalVariableDescriptor]

'mapType' @ [278:73] ==> @NotNull public open fun mapType(@NotNull descriptor: CallableDescriptor): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'valueParameterDescriptor' @ [278:81] ==> value-parameter valueParameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody.<anonymous>[ValueParameterDescriptorImpl]

'v' @ [278:108] ==> val v: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[LocalVariableDescriptor]

'if (target is LocalVariableDescriptor) {
                codegen.findLocalOrCapturedValue(target)!!
            }
            else
                codegen.intermediateValueForProperty(target as PropertyDescriptor, false, null, StackValue.none())' @ [282:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: StackValue, elseBranch: StackValue): StackValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> StackValue

'target' @ [282:29] ==> public final val target: VariableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy[PropertyDescriptorImpl]

'codegen' @ [283:17] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[ValueParameterDescriptorImpl]

'findLocalOrCapturedValue' @ [283:25] ==> @Nullable public open fun findLocalOrCapturedValue(@NotNull descriptor: DeclarationDescriptor): StackValue? defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'target' @ [283:50] ==> public final val target: VariableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy[PropertyDescriptorImpl]

'codegen' @ [286:17] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[ValueParameterDescriptorImpl]

'intermediateValueForProperty' @ [286:25] ==> @NotNull public open fun intermediateValueForProperty(@NotNull propertyDescriptor: PropertyDescriptor, forceField: Boolean, @Nullable superCallTarget: ClassDescriptor?, @NotNull receiver: StackValue): StackValue.Property defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'target' @ [286:54] ==> public final val target: VariableDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy[PropertyDescriptorImpl]

'none' @ [286:108] ==> public open fun none(): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'codegen' @ [288:13] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[ValueParameterDescriptorImpl]

'markStartLineNumber' @ [288:21] ==> public open fun markStartLineNumber(@NotNull element: KtElement): Unit defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'expression' @ [288:41] ==> public final val expression: KtElement defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy[PropertyDescriptorImpl]

'if (isGetter) {
                value.put(OBJECT_TYPE, v)
            }
            else {
                val functionDescriptor = codegen.context.functionDescriptor
                value.store(StackValue.local(codegen.frameMap.getIndex(functionDescriptor.valueParameters.last()), OBJECT_TYPE), v)
            }' @ [289:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isGetter' @ [289:17] ==> public final val isGetter: Boolean defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy[PropertyDescriptorImpl]

'value' @ [290:17] ==> val value: StackValue defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[LocalVariableDescriptor]

'put' @ [290:23] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'OBJECT_TYPE' @ [290:27] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'v' @ [290:40] ==> val v: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[LocalVariableDescriptor]

'codegen' @ [293:42] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[ValueParameterDescriptorImpl]

'context' @ [293:50] ==> public final val context: (MethodContext..MethodContext?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaPropertyDescriptor]

'functionDescriptor' @ [293:58] ==> public final val MethodContext.functionDescriptor: FunctionDescriptor[MyPropertyDescriptor]

'value' @ [294:17] ==> val value: StackValue defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[LocalVariableDescriptor]

'store' @ [294:23] ==> public open fun store(@NotNull value: StackValue, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'local' @ [294:40] ==> @NotNull public open fun local(index: Int, @NotNull type: Type): StackValue.Local defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'codegen' @ [294:46] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[ValueParameterDescriptorImpl]

'frameMap' @ [294:54] ==> public open val frameMap: FrameMap defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaPropertyDescriptor]

'getIndex' @ [294:63] ==> public open fun getIndex(descriptor: (DeclarationDescriptor..DeclarationDescriptor?)): Int defined in org.jetbrains.kotlin.codegen.FrameMap[JavaMethodDescriptor]

'functionDescriptor' @ [294:72] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[LocalVariableDescriptor]

'valueParameters' @ [294:91] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'last' @ [294:107] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.last(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'OBJECT_TYPE' @ [294:116] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'v' @ [294:130] ==> val v: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[LocalVariableDescriptor]

'v' @ [296:13] ==> val v: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[LocalVariableDescriptor]

'areturn' @ [296:15] ==> public open fun areturn(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'signature' @ [296:23] ==> value-parameter signature: JvmMethodSignature defined in org.jetbrains.kotlin.codegen.PropertyReferenceCodegen.PropertyReferenceGenerationStrategy.doGenerateBody[ValueParameterDescriptorImpl]

'returnType' @ [296:33] ==> public final val JvmMethodSignature.returnType: Type[MyPropertyDescriptor]

