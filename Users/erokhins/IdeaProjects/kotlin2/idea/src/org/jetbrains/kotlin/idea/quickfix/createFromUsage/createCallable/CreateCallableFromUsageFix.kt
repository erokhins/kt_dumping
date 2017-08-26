'CreateCallableFromUsageFixBase<E>' @ [42:5] ==> public constructor CreateCallableFromUsageFixBase<E : KtElement>(originalExpression: E, callableInfos: List<CallableInfo>, isExtension: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> E

'originalExpression' @ [42:39] ==> value-parameter originalExpression: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFix.<init>[ValueParameterDescriptorImpl]

'callableInfos' @ [42:59] ==> value-parameter callableInfos: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFix.<init>[ValueParameterDescriptorImpl]

'CreateCallableFromUsageFixBase<E>' @ [47:5] ==> public constructor CreateCallableFromUsageFixBase<E : KtElement>(originalExpression: E, callableInfos: List<CallableInfo>, isExtension: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> E

'originalExpression' @ [47:39] ==> value-parameter originalExpression: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateExtensionCallableFromUsageFix.<init>[ValueParameterDescriptorImpl]

'callableInfos' @ [47:59] ==> value-parameter callableInfos: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateExtensionCallableFromUsageFix.<init>[ValueParameterDescriptorImpl]

'CreateFromUsageFixBase<E>' @ [53:5] ==> public constructor CreateFromUsageFixBase<T : KtElement>(element: E) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.CreateFromUsageFixBase[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtElement> -> E

'originalExpression' @ [53:31] ==> value-parameter originalExpression: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.<init>[ValueParameterDescriptorImpl]

'assert' @ [55:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'callableInfos' @ [55:17] ==> private final val callableInfos: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'isNotEmpty' @ [55:31] ==> @InlineOnly public inline fun <T> Collection<CallableInfo>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableInfo

'originalExpression' @ [55:68] ==> value-parameter originalExpression: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.<init>[ValueParameterDescriptorImpl]

'getElementTextWithContext' @ [55:87] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'callableInfos' @ [56:13] ==> private final val callableInfos: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'size' @ [56:27] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'callableInfos' @ [57:31] ==> private final val callableInfos: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'mapTo' @ [57:45] ==> public inline fun <T, R, C : MutableCollection<in TypeInfo>> Iterable<CallableInfo>.mapTo(destination: HashSet<TypeInfo>, transform: (CallableInfo) -> TypeInfo): HashSet<TypeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableInfo
    <R> -> TypeInfo
    <C : MutableCollection<in R>> -> HashSet<TypeInfo>

'HashSet' @ [57:51] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TypeInfo

'it' @ [57:74] ==> value-parameter it: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.<init>.<anonymous>[ValueParameterDescriptorImpl]

'receiverTypeInfo' @ [57:77] ==> public final val receiverTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'receiverSet' @ [58:17] ==> val receiverSet: HashSet<TypeInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.<init>[LocalVariableDescriptor]

'size' @ [58:29] ==> public open val size: Int defined in java.util.HashSet[JavaPropertyDescriptor]

'AssertionError' @ [58:45] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'receiverSet' @ [58:103] ==> val receiverSet: HashSet<TypeInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.<init>[LocalVariableDescriptor]

'callableInfos' @ [60:40] ==> private final val callableInfos: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'mapTo' @ [60:54] ==> public inline fun <T, R, C : MutableCollection<in List<KtElement>>> Iterable<CallableInfo>.mapTo(destination: HashSet<List<KtElement>>, transform: (CallableInfo) -> List<KtElement>): HashSet<List<KtElement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableInfo
    <R> -> List<KtElement>
    <C : MutableCollection<in R>> -> HashSet<List<KtElement>>

'HashSet' @ [60:60] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> List<KtElement>

'it' @ [60:90] ==> value-parameter it: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.<init>.<anonymous>[ValueParameterDescriptorImpl]

'possibleContainers' @ [60:93] ==> public final val possibleContainers: List<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'possibleContainerSet' @ [61:17] ==> val possibleContainerSet: HashSet<List<KtElement>> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.<init>[LocalVariableDescriptor]

'size' @ [61:38] ==> public open val size: Int defined in java.util.HashSet[JavaPropertyDescriptor]

'AssertionError' @ [61:54] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'possibleContainerSet' @ [61:114] ==> val possibleContainerSet: HashSet<List<KtElement>> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.<init>[LocalVariableDescriptor]

'descriptor' @ [66:13] ==> value-parameter descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getDeclaration[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [67:30] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [67:43] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getDeclaration[ValueParameterDescriptorImpl]

'psiFactory' @ [68:34] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getDeclaration[LocalVariableDescriptor]

'createClass' @ [68:45] ==> public final fun createClass(text: String): KtClass defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [68:80] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'render' @ [68:113] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [68:120] ==> value-parameter descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getDeclaration[ValueParameterDescriptorImpl]

'psiFactory' @ [69:20] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getDeclaration[LocalVariableDescriptor]

'createAnalyzableFile' @ [69:31] ==> public final fun createAnalyzableFile(fileName: String, text: String, contextToAnalyzeIn: PsiElement): KtFile defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [69:55] ==> value-parameter descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getDeclaration[ValueParameterDescriptorImpl]

'name' @ [69:66] ==> public final val FunctionClassDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [69:71] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'element' @ [69:92] ==> protected final val element: E? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'add' @ [69:103] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'syntheticClass' @ [69:107] ==> val syntheticClass: KtClass defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getDeclaration[LocalVariableDescriptor]

'DescriptorToSourceUtilsIde' @ [71:16] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [71:43] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [71:61] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [71:70] ==> value-parameter descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getDeclaration[ValueParameterDescriptorImpl]

'candidate' @ [75:26] ==> value-parameter candidate: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getDeclarationIfApplicable[ValueParameterDescriptorImpl]

'theType' @ [75:36] ==> public final val theType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'constructor' @ [75:44] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [75:56] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'getDeclaration' @ [76:27] ==> private final fun getDeclaration(descriptor: ClassifierDescriptor, project: Project): PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[SimpleFunctionDescriptorImpl]

'descriptor' @ [76:42] ==> val descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getDeclarationIfApplicable[LocalVariableDescriptor]

'project' @ [76:54] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getDeclarationIfApplicable[ValueParameterDescriptorImpl]

'declaration' @ [77:13] ==> val declaration: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getDeclarationIfApplicable[LocalVariableDescriptor]

'declaration' @ [77:48] ==> val declaration: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getDeclarationIfApplicable[LocalVariableDescriptor]

'declaration' @ [77:83] ==> val declaration: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getDeclarationIfApplicable[LocalVariableDescriptor]

'if (isExtension || declaration.canRefactor()) declaration else null' @ [78:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'isExtension' @ [78:20] ==> public final val isExtension: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'declaration' @ [78:35] ==> val declaration: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getDeclarationIfApplicable[LocalVariableDescriptor]

'canRefactor' @ [78:47] ==> public fun PsiElement.canRefactor(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [78:62] ==> val declaration: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getDeclarationIfApplicable[LocalVariableDescriptor]

'element' @ [82:23] ==> protected final val element: E? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'callableInfos' @ [83:33] ==> private final val callableInfos: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'map' @ [83:47] ==> public inline fun <T, R> Iterable<CallableInfo>.map(transform: (CallableInfo) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableInfo
    <R> -> String

'buildString' @ [84:13] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [85:21] ==> value-parameter it: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getText.<anonymous>[ValueParameterDescriptorImpl]

'isAbstract' @ [85:24] ==> public final val isAbstract: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'append' @ [86:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'when (it.kind) {
                    CallableKind.FUNCTION -> "function"
                    CallableKind.PROPERTY -> "property"
                    CallableKind.SECONDARY_CONSTRUCTOR -> "secondary constructor"
                    else -> throw AssertionError("Unexpected callable info: $it")
                }' @ [89:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'it' @ [89:34] ==> value-parameter it: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getText.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [89:37] ==> public abstract val kind: CallableKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'FUNCTION' @ [90:34] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableKind[FakeCallableDescriptorForObject]

'PROPERTY' @ [91:34] ==> enum entry PROPERTY defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableKind[FakeCallableDescriptorForObject]

'SECONDARY_CONSTRUCTOR' @ [92:34] ==> enum entry SECONDARY_CONSTRUCTOR defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableKind[FakeCallableDescriptorForObject]

'AssertionError' @ [93:35] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'it' @ [93:78] ==> value-parameter it: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getText.<anonymous>[ValueParameterDescriptorImpl]

'append' @ [95:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'kind' @ [95:24] ==> val kind: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getText.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [97:21] ==> value-parameter it: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getText.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [97:24] ==> public final val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'isNotEmpty' @ [97:29] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [98:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'CallableBuilderConfiguration' @ [101:29] ==> public constructor CallableBuilderConfiguration(callableInfos: List<CallableInfo>, originalElement: KtElement, currentFile: KtFile = ..., currentEditor: Editor? = ..., isExtension: Boolean = ..., enableSubstitutions: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[ClassConstructorDescriptorImpl]

'callableInfos' @ [101:58] ==> private final val callableInfos: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'element' @ [101:73] ==> val element: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getText[LocalVariableDescriptor]

'isExtension' @ [101:96] ==> public final val isExtension: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'createBuilder' @ [102:38] ==> public fun CallableBuilderConfiguration.createBuilder(): CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableBuilder.kt[SimpleFunctionDescriptorImpl]

'callableBuilder' @ [103:40] ==> val callableBuilder: CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getText.<anonymous>.<anonymous>[LocalVariableDescriptor]

'computeTypeCandidates' @ [104:30] ==> public final fun computeTypeCandidates(typeInfo: TypeInfo): List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[SimpleFunctionDescriptorImpl]

'callableInfos' @ [104:52] ==> private final val callableInfos: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'first' @ [104:66] ==> public fun <T> List<CallableInfo>.first(): CallableInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableInfo

'receiverTypeInfo' @ [104:74] ==> public final val receiverTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'firstOrNull' @ [105:30] ==> public fun <T> List<TypeCandidate>.firstOrNull(): TypeCandidate? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate

'theType' @ [106:31] ==> public final val theType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'receiverType' @ [107:25] ==> val receiverType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getText.<anonymous>.<anonymous>[LocalVariableDescriptor]

'if (isExtension) {
                            val receiverTypeText = IdeDescriptorRenderers.SOURCE_CODE_SHORT_NAMES_IN_TYPES.renderType(receiverType)
                            val isFunctionType = receiverType.constructor.declarationDescriptor is FunctionClassDescriptor
                            append(if (isFunctionType) "($receiverTypeText)" else receiverTypeText).append('.')
                        }
                        else {
                            receiverType.constructor.declarationDescriptor?.let {
                                append(IdeDescriptorRenderers.SOURCE_CODE_SHORT_NAMES_IN_TYPES.renderClassifierName(it)).append('.')
                            }
                        }' @ [108:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: StringBuilder?, elseBranch: StringBuilder?): StringBuilder?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> StringBuilder?

'isExtension' @ [108:29] ==> public final val isExtension: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'IdeDescriptorRenderers' @ [109:52] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [109:75] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [109:108] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'receiverType' @ [109:119] ==> val receiverType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getText.<anonymous>.<anonymous>[LocalVariableDescriptor]

'receiverType' @ [110:50] ==> val receiverType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getText.<anonymous>.<anonymous>[LocalVariableDescriptor]

'constructor' @ [110:63] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [110:75] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'append' @ [111:29] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'if (isFunctionType) "($receiverTypeText)" else receiverTypeText' @ [111:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isFunctionType' @ [111:40] ==> val isFunctionType: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getText.<anonymous>.<anonymous>[LocalVariableDescriptor]

'receiverTypeText' @ [111:59] ==> val receiverTypeText: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getText.<anonymous>.<anonymous>[LocalVariableDescriptor]

'receiverTypeText' @ [111:83] ==> val receiverTypeText: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getText.<anonymous>.<anonymous>[LocalVariableDescriptor]

'append' @ [111:101] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'receiverType' @ [114:29] ==> val receiverType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getText.<anonymous>.<anonymous>[LocalVariableDescriptor]

'constructor' @ [114:42] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [114:54] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'let' @ [114:77] ==> @InlineOnly public inline fun <T, R> ClassifierDescriptor.let(block: (ClassifierDescriptor) -> (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor
    <R> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'append' @ [115:33] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [115:63] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderClassifierName' @ [115:96] ==> public abstract fun renderClassifierName(klass: ClassifierDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [115:117] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getText.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'append' @ [115:122] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [120:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'it' @ [120:31] ==> value-parameter it: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getText.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [120:34] ==> public final val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'StringBuilder' @ [125:16] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'apply' @ [125:32] ==> @InlineOnly public inline fun <T> StringBuilder /* = StringBuilder */.apply(block: StringBuilder /* = StringBuilder */.() -> Unit): StringBuilder /* = StringBuilder */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StringBuilder

'append' @ [126:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'callableInfos' @ [128:32] ==> private final val callableInfos: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'first' @ [128:46] ==> public fun <T> List<CallableInfo>.first(): CallableInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableInfo

'receiverTypeInfo' @ [128:54] ==> public final val receiverTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'!' @ [129:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'callableInfos' @ [129:18] ==> private final val callableInfos: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'any' @ [129:32] ==> public inline fun <T> Iterable<CallableInfo>.any(predicate: (CallableInfo) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableInfo

'it' @ [129:38] ==> value-parameter it: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getText.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAbstract' @ [129:41] ==> public final val isAbstract: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'if (isExtension) {
                    append("extension ")
                }
                else if (receiverInfo !is TypeInfo.Empty) {
                    append("member ")
                }' @ [130:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'isExtension' @ [130:21] ==> public final val isExtension: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'append' @ [131:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'receiverInfo' @ [133:26] ==> val receiverInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getText.<anonymous>[LocalVariableDescriptor]

'append' @ [134:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'renderedCallables' @ [138:13] ==> val renderedCallables: List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getText[LocalVariableDescriptor]

'joinTo' @ [138:31] ==> public fun <T, A : Appendable /* = Appendable */> Iterable<String>.joinTo(buffer: StringBuilder /* = StringBuilder */, separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): StringBuilder /* = StringBuilder */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <A : Appendable /* = Appendable */> -> StringBuilder

'this' @ [138:38] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.getText.<anonymous>[ReceiverParameterDescriptorImpl]

'toString' @ [139:11] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'!' @ [143:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'super' @ [143:14] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [143:20] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.CreateFromUsageFixBase[SimpleFunctionDescriptorImpl]

'project' @ [143:32] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [143:41] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable[ValueParameterDescriptorImpl]

'file' @ [143:49] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable[ValueParameterDescriptorImpl]

'file' @ [144:13] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable[ValueParameterDescriptorImpl]

'element' @ [145:23] ==> protected final val element: E? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'callableInfos' @ [147:28] ==> private final val callableInfos: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'first' @ [147:42] ==> public fun <T> List<CallableInfo>.first(): CallableInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableInfo

'receiverTypeInfo' @ [147:50] ==> public final val receiverTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'receiverInfo' @ [149:13] ==> val receiverInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable[LocalVariableDescriptor]

'callableInfos' @ [150:17] ==> private final val callableInfos: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'any' @ [150:31] ==> public inline fun <T> Iterable<CallableInfo>.any(predicate: (CallableInfo) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableInfo

'it' @ [150:37] ==> value-parameter it: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [150:59] ==> value-parameter it: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable.<anonymous>[ValueParameterDescriptorImpl]

'possibleContainers' @ [150:62] ==> public final val possibleContainers: List<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'isEmpty' @ [150:81] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'!' @ [151:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isExtension' @ [151:21] ==> public final val isExtension: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'isExtension' @ [154:13] ==> public final val isExtension: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'receiverInfo' @ [154:28] ==> val receiverInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable[LocalVariableDescriptor]

'staticContextRequired' @ [154:41] ==> public open val staticContextRequired: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[PropertyDescriptorImpl]

'CallableBuilderConfiguration' @ [156:31] ==> public constructor CallableBuilderConfiguration(callableInfos: List<CallableInfo>, originalElement: KtElement, currentFile: KtFile = ..., currentEditor: Editor? = ..., isExtension: Boolean = ..., enableSubstitutions: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[ClassConstructorDescriptorImpl]

'callableInfos' @ [156:60] ==> private final val callableInfos: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'element' @ [156:75] ==> val element: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable[LocalVariableDescriptor]

'isExtension' @ [156:98] ==> public final val isExtension: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'createBuilder' @ [156:111] ==> public fun CallableBuilderConfiguration.createBuilder(): CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableBuilder.kt[SimpleFunctionDescriptorImpl]

'callableBuilder' @ [157:38] ==> val callableBuilder: CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable[LocalVariableDescriptor]

'computeTypeCandidates' @ [157:54] ==> public final fun computeTypeCandidates(typeInfo: TypeInfo): List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[SimpleFunctionDescriptorImpl]

'callableInfos' @ [157:76] ==> private final val callableInfos: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'first' @ [157:90] ==> public fun <T> List<CallableInfo>.first(): CallableInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableInfo

'receiverTypeInfo' @ [157:98] ==> public final val receiverTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'callableInfos' @ [158:28] ==> private final val callableInfos: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'firstOrNull' @ [158:42] ==> public inline fun <T> Iterable<CallableInfo>.firstOrNull(predicate: (CallableInfo) -> Boolean): CallableInfo? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableInfo

'it' @ [158:56] ==> value-parameter it: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable.<anonymous>[ValueParameterDescriptorImpl]

'callableInfos' @ [159:26] ==> private final val callableInfos: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'any' @ [159:40] ==> public inline fun <T> Iterable<CallableInfo>.any(predicate: (CallableInfo) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableInfo

'it' @ [159:46] ==> value-parameter it: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [159:49] ==> public abstract val kind: CallableKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'FUNCTION' @ [159:70] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableKind[FakeCallableDescriptorForObject]

'receiverTypeCandidates' @ [160:16] ==> val receiverTypeCandidates: List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable[LocalVariableDescriptor]

'any' @ [160:39] ==> public inline fun <T> Iterable<TypeCandidate>.any(predicate: (TypeCandidate) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate

'getDeclarationIfApplicable' @ [161:31] ==> private final fun getDeclarationIfApplicable(project: Project, candidate: TypeCandidate): PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[SimpleFunctionDescriptorImpl]

'project' @ [161:58] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable[ValueParameterDescriptorImpl]

'it' @ [161:67] ==> value-parameter it: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [162:41] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable.<anonymous>[LocalVariableDescriptor]

'declaration' @ [162:68] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable.<anonymous>[LocalVariableDescriptor]

'isInterface' @ [162:80] ==> public final val PsiClass.isInterface: Boolean[MyPropertyDescriptor]

'when {
                !isExtension && propertyInfo != null && insertToJavaInterface && (!receiverInfo.staticContextRequired || propertyInfo.writable) ->
                    false
                isFunction && insertToJavaInterface && receiverInfo.staticContextRequired ->
                    false
                !isExtension && declaration is KtTypeParameter -> false
                propertyInfo != null && !propertyInfo.isAbstract && declaration is KtClass && declaration.isInterface() -> false
                else ->
                    declaration != null
            }' @ [163:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean, entry4: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'!' @ [164:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isExtension' @ [164:18] ==> public final val isExtension: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'propertyInfo' @ [164:33] ==> val propertyInfo: PropertyInfo? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable[LocalVariableDescriptor]

'insertToJavaInterface' @ [164:57] ==> val insertToJavaInterface: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable.<anonymous>[LocalVariableDescriptor]

'!' @ [164:83] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'receiverInfo' @ [164:84] ==> val receiverInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable[LocalVariableDescriptor]

'staticContextRequired' @ [164:97] ==> public open val staticContextRequired: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[PropertyDescriptorImpl]

'propertyInfo' @ [164:122] ==> val propertyInfo: PropertyInfo? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable[LocalVariableDescriptor]

'writable' @ [164:135] ==> public final val writable: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo[PropertyDescriptorImpl]

'isFunction' @ [166:17] ==> val isFunction: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable[LocalVariableDescriptor]

'insertToJavaInterface' @ [166:31] ==> val insertToJavaInterface: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable.<anonymous>[LocalVariableDescriptor]

'receiverInfo' @ [166:56] ==> val receiverInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable[LocalVariableDescriptor]

'staticContextRequired' @ [166:69] ==> public open val staticContextRequired: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[PropertyDescriptorImpl]

'!' @ [168:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isExtension' @ [168:18] ==> public final val isExtension: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'declaration' @ [168:33] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable.<anonymous>[LocalVariableDescriptor]

'propertyInfo' @ [169:17] ==> val propertyInfo: PropertyInfo? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable[LocalVariableDescriptor]

'!' @ [169:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'propertyInfo' @ [169:42] ==> val propertyInfo: PropertyInfo? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable[LocalVariableDescriptor]

'isAbstract' @ [169:55] ==> public final val isAbstract: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo[PropertyDescriptorImpl]

'declaration' @ [169:69] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable.<anonymous>[LocalVariableDescriptor]

'declaration' @ [169:95] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable.<anonymous>[LocalVariableDescriptor]

'isInterface' @ [169:107] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'declaration' @ [171:21] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.isAvailable.<anonymous>[LocalVariableDescriptor]

'element' @ [177:23] ==> protected final val element: E? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'callableInfos' @ [178:28] ==> private final val callableInfos: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'first' @ [178:42] ==> public fun <T> List<CallableInfo>.first(): CallableInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableInfo

'CallableBuilderConfiguration' @ [181:17] ==> public constructor CallableBuilderConfiguration(callableInfos: List<CallableInfo>, originalElement: KtElement, currentFile: KtFile = ..., currentEditor: Editor? = ..., isExtension: Boolean = ..., enableSubstitutions: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[ClassConstructorDescriptorImpl]

'callableInfos' @ [181:46] ==> private final val callableInfos: List<CallableInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'element' @ [181:61] ==> val element: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[LocalVariableDescriptor]

'file' @ [181:83] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[ValueParameterDescriptorImpl]

'editor' @ [181:89] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[ValueParameterDescriptorImpl]

'isExtension' @ [181:99] ==> public final val isExtension: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[PropertyDescriptorImpl]

'createBuilder' @ [181:112] ==> public fun CallableBuilderConfiguration.createBuilder(): CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableBuilder.kt[SimpleFunctionDescriptorImpl]

'callableBuilder' @ [184:13] ==> val callableBuilder: CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[LocalVariableDescriptor]

'placement' @ [184:29] ==> public final var placement: CallablePlacement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'placement' @ [184:41] ==> value-parameter placement: CallablePlacement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke.runBuilder[ValueParameterDescriptorImpl]

'project' @ [185:13] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[ValueParameterDescriptorImpl]

'executeCommand' @ [185:21] ==> public fun <T> Project.executeCommand(name: String, groupId: Any? = ..., command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'text' @ [185:36] ==> public final val <E : KtElement> CreateCallableFromUsageFixBase<E>.text: String[MyPropertyDescriptor]
Inferred types:
    <E : KtElement> -> E

'callableBuilder' @ [185:44] ==> val callableBuilder: CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[LocalVariableDescriptor]

'build' @ [185:60] ==> public final fun build(): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[SimpleFunctionDescriptorImpl]

'callableInfo' @ [188:13] ==> val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[LocalVariableDescriptor]

'runBuilder' @ [189:13] ==> local final fun runBuilder(placement: CallablePlacement): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[SimpleFunctionDescriptorImpl]

'NoReceiver' @ [189:42] ==> public constructor NoReceiver(containingElement: PsiElement) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallablePlacement.NoReceiver[ClassConstructorDescriptorImpl]

'callableInfo' @ [189:53] ==> val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[LocalVariableDescriptor]

'targetClass' @ [189:66] ==> public final val targetClass: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.SecondaryConstructorInfo[PropertyDescriptorImpl]

'callableBuilder' @ [194:38] ==> val callableBuilder: CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[LocalVariableDescriptor]

'computeTypeCandidates' @ [194:54] ==> public final fun computeTypeCandidates(typeInfo: TypeInfo): List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[SimpleFunctionDescriptorImpl]

'callableInfo' @ [194:76] ==> val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[LocalVariableDescriptor]

'receiverTypeInfo' @ [194:89] ==> public final val receiverTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'let' @ [194:107] ==> @InlineOnly public inline fun <T, R> List<TypeCandidate>.let(block: (List<TypeCandidate>) -> List<TypeCandidate>): List<TypeCandidate> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<TypeCandidate>
    <R> -> List<TypeCandidate>

'if (callableInfo.isAbstract) it.filter { it.theType.isAbstract() } else it' @ [195:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<TypeCandidate>, elseBranch: List<TypeCandidate>): List<TypeCandidate>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<TypeCandidate>

'callableInfo' @ [195:17] ==> val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[LocalVariableDescriptor]

'isAbstract' @ [195:30] ==> public final val isAbstract: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'it' @ [195:42] ==> value-parameter it: List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [195:45] ==> public inline fun <T> Iterable<TypeCandidate>.filter(predicate: (TypeCandidate) -> Boolean): List<TypeCandidate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate

'it' @ [195:54] ==> value-parameter it: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'theType' @ [195:57] ==> public final val theType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'isAbstract' @ [195:65] ==> public fun KotlinType.isAbstract(): Boolean defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'it' @ [195:85] ==> value-parameter it: List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke.<anonymous>[ValueParameterDescriptorImpl]

'if (receiverTypeCandidates.isNotEmpty()) {
            val containers = receiverTypeCandidates
                    .mapNotNull { candidate -> getDeclarationIfApplicable(project, candidate)?.let { candidate to it } }

            chooseContainerElementIfNecessary(containers, editor, popupTitle, false, { it.second }) {
                runBuilder(CallablePlacement.WithReceiver(it.first))
            }
        }
        else {
            assert(callableInfo.receiverTypeInfo is TypeInfo.Empty) {
                "No receiver type candidates: ${element.text} in ${file.text}"
            }

            chooseContainerElementIfNecessary(callableInfo.possibleContainers, editor, popupTitle, true, { it }) {
                val container = if (it is KtClassBody) it.parent as KtClassOrObject else it
                runBuilder(CallablePlacement.NoReceiver(container))
            }
        }' @ [197:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'receiverTypeCandidates' @ [197:13] ==> val receiverTypeCandidates: List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[LocalVariableDescriptor]

'isNotEmpty' @ [197:36] ==> @InlineOnly public inline fun <T> Collection<TypeCandidate>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate

'receiverTypeCandidates' @ [198:30] ==> val receiverTypeCandidates: List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[LocalVariableDescriptor]

'mapNotNull' @ [199:22] ==> public inline fun <T, R : Any> Iterable<TypeCandidate>.mapNotNull(transform: (TypeCandidate) -> Pair<TypeCandidate, PsiElement>?): List<Pair<TypeCandidate, PsiElement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate
    <R : Any> -> Pair<TypeCandidate, PsiElement>

'getDeclarationIfApplicable' @ [199:48] ==> private final fun getDeclarationIfApplicable(project: Project, candidate: TypeCandidate): PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase[SimpleFunctionDescriptorImpl]

'project' @ [199:75] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[ValueParameterDescriptorImpl]

'candidate' @ [199:84] ==> value-parameter candidate: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [199:96] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Pair<TypeCandidate, PsiElement>): Pair<TypeCandidate, PsiElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Pair<TypeCandidate, PsiElement>

'candidate' @ [199:102] ==> value-parameter candidate: TypeCandidate defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [199:115] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'chooseContainerElementIfNecessary' @ [201:13] ==> public fun <T> chooseContainerElementIfNecessary(containers: List<Pair<TypeCandidate, PsiElement>>, editor: Editor, title: String, highlightSelection: Boolean, toPsi: (Pair<TypeCandidate, PsiElement>) -> PsiElement, onSelect: (Pair<TypeCandidate, PsiElement>) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Pair<TypeCandidate, PsiElement>

'containers' @ [201:47] ==> val containers: List<Pair<TypeCandidate, PsiElement>> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[LocalVariableDescriptor]

'editor' @ [201:59] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[ValueParameterDescriptorImpl]

'popupTitle' @ [201:67] ==> val popupTitle: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[LocalVariableDescriptor]

'it' @ [201:88] ==> value-parameter it: Pair<TypeCandidate, PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [201:91] ==> public final val second: PsiElement defined in kotlin.Pair[DeserializedPropertyDescriptor]

'runBuilder' @ [202:17] ==> local final fun runBuilder(placement: CallablePlacement): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[SimpleFunctionDescriptorImpl]

'WithReceiver' @ [202:46] ==> public constructor WithReceiver(receiverTypeCandidate: TypeCandidate) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallablePlacement.WithReceiver[ClassConstructorDescriptorImpl]

'it' @ [202:59] ==> value-parameter it: Pair<TypeCandidate, PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [202:62] ==> public final val first: TypeCandidate defined in kotlin.Pair[DeserializedPropertyDescriptor]

'assert' @ [206:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'callableInfo' @ [206:20] ==> val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[LocalVariableDescriptor]

'receiverTypeInfo' @ [206:33] ==> public final val receiverTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'element' @ [207:49] ==> val element: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[LocalVariableDescriptor]

'text' @ [207:57] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'file' @ [207:68] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[ValueParameterDescriptorImpl]

'text' @ [207:73] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'chooseContainerElementIfNecessary' @ [210:13] ==> public fun <T> chooseContainerElementIfNecessary(containers: List<KtElement>, editor: Editor, title: String, highlightSelection: Boolean, toPsi: (KtElement) -> PsiElement, onSelect: (KtElement) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> KtElement

'callableInfo' @ [210:47] ==> val callableInfo: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[LocalVariableDescriptor]

'possibleContainers' @ [210:60] ==> public final val possibleContainers: List<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'editor' @ [210:80] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[ValueParameterDescriptorImpl]

'popupTitle' @ [210:88] ==> val popupTitle: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[LocalVariableDescriptor]

'it' @ [210:108] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke.<anonymous>[ValueParameterDescriptorImpl]

'if (it is KtClassBody) it.parent as KtClassOrObject else it' @ [211:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtElement, elseBranch: KtElement): KtElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtElement

'it' @ [211:37] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [211:56] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [211:59] ==> public final val KtClassBody.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'it' @ [211:90] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke.<anonymous>[ValueParameterDescriptorImpl]

'runBuilder' @ [212:17] ==> local final fun runBuilder(placement: CallablePlacement): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke[SimpleFunctionDescriptorImpl]

'NoReceiver' @ [212:46] ==> public constructor NoReceiver(containingElement: PsiElement) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallablePlacement.NoReceiver[ClassConstructorDescriptorImpl]

'container' @ [212:57] ==> val container: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromUsageFixBase.invoke.<anonymous>[LocalVariableDescriptor]

