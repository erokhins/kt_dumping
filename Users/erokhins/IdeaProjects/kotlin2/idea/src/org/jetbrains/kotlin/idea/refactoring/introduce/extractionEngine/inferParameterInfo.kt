'create' @ [62:43] ==> @NotNull public open fun <K : (Any..Any?), V : (Any..Any?)> create(): MultiMap<(KtSimpleNameExpression..KtSimpleNameExpression?), (MutableParameter..MutableParameter?)> defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtSimpleNameExpression
    <V : (Any..Any?)> -> MutableParameter

'LinkedHashSet' @ [63:22] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> MutableParameter

'HashSet' @ [64:26] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TypeParameter

'HashSet' @ [65:29] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KotlinType

'create' @ [66:35] ==> @NotNull public open fun <K : (Any..Any?), V : (Any..Any?)> create(): MultiMap<(KtSimpleNameExpression..KtSimpleNameExpression?), (Replacement..Replacement?)> defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtSimpleNameExpression
    <V : (Any..Any?)> -> Replacement

'ParametersInfo' @ [77:16] ==> public constructor ParametersInfo() defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[ClassConstructorDescriptorImpl]

'LinkedHashMap' @ [79:42] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> DeclarationDescriptor
    <V : (Any..Any?)> -> MutableParameter

'getBrokenReferencesInfo' @ [81:21] ==> public final fun getBrokenReferencesInfo(body: KtBlockExpression): List<ResolvedReferenceInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[SimpleFunctionDescriptorImpl]

'virtualBlock' @ [81:45] ==> value-parameter virtualBlock: KtBlockExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[ValueParameterDescriptorImpl]

'refInfo' @ [82:19] ==> val refInfo: ResolvedReferenceInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'refExpr' @ [82:27] ==> public final val refExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolvedReferenceInfo[PropertyDescriptorImpl]

'?:' @ [84:24] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtReferenceExpression?, right: KtReferenceExpression): KtReferenceExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtReferenceExpression

'ref' @ [84:25] ==> val ref: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'parent' @ [84:29] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'ref' @ [84:61] ==> val ref: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'selector' @ [85:26] ==> val selector: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'parent' @ [85:35] ==> public final val KtReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'receiverExpression' @ [85:70] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'superExpr' @ [86:13] ==> val superExpr: KtSuperExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'info' @ [87:13] ==> val info: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'errorMessage' @ [87:18] ==> public final var errorMessage: AnalysisResult.ErrorMessage? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[PropertyDescriptorImpl]

'SUPER_CALL' @ [87:61] ==> enum entry SUPER_CALL defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[FakeCallableDescriptorForObject]

'info' @ [88:20] ==> val info: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'refInfo' @ [91:28] ==> val refInfo: ResolvedReferenceInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'resolveResult' @ [91:36] ==> public final val resolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolvedReferenceInfo[PropertyDescriptorImpl]

'resolvedCall' @ [91:50] ==> public final val resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[PropertyDescriptorImpl]

'resolvedCall' @ [92:33] ==> val resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'extensionReceiver' @ [92:47] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'if (extensionReceiver == null || isSynthesizedInvoke(refInfo.resolveResult.descriptor)) {
            resolvedCall?.dispatchReceiver
        }
        else {
            extensionReceiver
        }' @ [93:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ReceiverValue?, elseBranch: ReceiverValue?): ReceiverValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ReceiverValue?

'extensionReceiver' @ [93:38] ==> val extensionReceiver: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'isSynthesizedInvoke' @ [93:67] ==> public fun isSynthesizedInvoke(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.calls.tasks[DeserializedSimpleFunctionDescriptor]

'refInfo' @ [93:87] ==> val refInfo: ResolvedReferenceInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'resolveResult' @ [93:95] ==> public final val resolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolvedReferenceInfo[PropertyDescriptorImpl]

'descriptor' @ [93:109] ==> public final val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[PropertyDescriptorImpl]

'resolvedCall' @ [94:13] ==> val resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'dispatchReceiver' @ [94:27] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'extensionReceiver' @ [97:13] ==> val extensionReceiver: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'resolvedCall' @ [100:28] ==> val resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'resolvedCall' @ [100:52] ==> val resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'hasBothReceivers' @ [100:65] ==> public fun ResolvedCall<*>.hasBothReceivers(): Boolean defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [101:43] ==> val resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'dispatchReceiver' @ [101:57] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'declarationDescriptor' @ [101:97] ==> public abstract val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitReceiver[DeserializedPropertyDescriptor]

'options' @ [102:13] ==> public final val options: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'canWrapInWith' @ [102:21] ==> public final val canWrapInWith: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionOptions[PropertyDescriptorImpl]

'twoReceivers' @ [103:16] ==> val twoReceivers: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'resolvedCall' @ [104:16] ==> val resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'extensionReceiver' @ [104:31] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'isObject' @ [105:32] ==> public open fun isObject(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'dispatchReceiverDescriptor' @ [105:41] ==> val dispatchReceiverDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'info' @ [106:13] ==> val info: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'replacementMap' @ [106:18] ==> public final val replacementMap: MultiMap<(KtSimpleNameExpression..KtSimpleNameExpression?), (Replacement..Replacement?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[PropertyDescriptorImpl]

'putValue' @ [106:33] ==> public open fun putValue(@Nullable p0: KtSimpleNameExpression?, p1: (Replacement..Replacement?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'refInfo' @ [106:42] ==> val refInfo: ResolvedReferenceInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'resolveResult' @ [106:50] ==> public final val resolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolvedReferenceInfo[PropertyDescriptorImpl]

'originalRefExpr' @ [106:64] ==> public final val originalRefExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[PropertyDescriptorImpl]

'WrapObjectInWithReplacement' @ [107:42] ==> public constructor WrapObjectInWithReplacement(descriptor: ClassDescriptor) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.WrapObjectInWithReplacement[ClassConstructorDescriptorImpl]

'dispatchReceiverDescriptor' @ [107:70] ==> val dispatchReceiverDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'!' @ [111:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'refInfo' @ [111:14] ==> val refInfo: ResolvedReferenceInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'shouldSkipPrimaryReceiver' @ [111:22] ==> public final val shouldSkipPrimaryReceiver: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolvedReferenceInfo[PropertyDescriptorImpl]

'extractReceiver' @ [112:13] ==> private fun ExtractionData.extractReceiver(receiverToExtract: ReceiverValue?, info: ParametersInfo, targetScope: LexicalScope, refInfo: ResolvedReferenceInfo, extractedDescriptorToParameter: HashMap<DeclarationDescriptor, MutableParameter>, pseudocode: Pseudocode, bindingContext: BindingContext, isMemberExtension: Boolean): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file inferParameterInfo.kt[SimpleFunctionDescriptorImpl]

'receiverToExtract' @ [112:29] ==> val receiverToExtract: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'info' @ [112:48] ==> val info: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'targetScope' @ [112:54] ==> value-parameter targetScope: LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[ValueParameterDescriptorImpl]

'refInfo' @ [112:67] ==> val refInfo: ResolvedReferenceInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'extractedDescriptorToParameter' @ [112:76] ==> val extractedDescriptorToParameter: LinkedHashMap<DeclarationDescriptor, MutableParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'pseudocode' @ [112:108] ==> value-parameter pseudocode: Pseudocode defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[ValueParameterDescriptorImpl]

'bindingContext' @ [112:120] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[ValueParameterDescriptorImpl]

'options' @ [115:13] ==> public final val options: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'canWrapInWith' @ [115:21] ==> public final val canWrapInWith: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionOptions[PropertyDescriptorImpl]

'twoReceivers' @ [115:38] ==> val twoReceivers: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'extractReceiver' @ [116:13] ==> private fun ExtractionData.extractReceiver(receiverToExtract: ReceiverValue?, info: ParametersInfo, targetScope: LexicalScope, refInfo: ResolvedReferenceInfo, extractedDescriptorToParameter: HashMap<DeclarationDescriptor, MutableParameter>, pseudocode: Pseudocode, bindingContext: BindingContext, isMemberExtension: Boolean): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file inferParameterInfo.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [116:29] ==> val resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'dispatchReceiver' @ [116:44] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'info' @ [116:62] ==> val info: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'targetScope' @ [116:68] ==> value-parameter targetScope: LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[ValueParameterDescriptorImpl]

'refInfo' @ [116:81] ==> val refInfo: ResolvedReferenceInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'extractedDescriptorToParameter' @ [116:90] ==> val extractedDescriptorToParameter: LinkedHashMap<DeclarationDescriptor, MutableParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'pseudocode' @ [116:122] ==> value-parameter pseudocode: Pseudocode defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[ValueParameterDescriptorImpl]

'bindingContext' @ [116:134] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[ValueParameterDescriptorImpl]

'NewDeclarationNameValidator' @ [120:28] ==> public constructor NewDeclarationNameValidator(container: PsiElement, anchor: PsiElement?, target: NewDeclarationNameValidator.Target, excludedDeclarations: List<KtDeclaration> = ...) defined in org.jetbrains.kotlin.idea.core.NewDeclarationNameValidator[DeserializedClassConstructorDescriptor]

'commonParent' @ [121:13] ==> value-parameter commonParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [121:26] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'physicalElements' @ [122:13] ==> public final val physicalElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'firstOrNull' @ [122:30] ==> public fun <T> List<PsiElement>.firstOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'VARIABLES' @ [123:48] ==> enum entry VARIABLES defined in org.jetbrains.kotlin.idea.core.NewDeclarationNameValidator.Target[FakeCallableDescriptorForObject]

'component1' @ [126:11] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<DeclarationDescriptor, MutableParameter>.component1(): DeclarationDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> DeclarationDescriptor
    <V> -> MutableParameter

'component2' @ [126:32] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<DeclarationDescriptor, MutableParameter>.component2(): MutableParameter defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> DeclarationDescriptor
    <V> -> MutableParameter

'extractedDescriptorToParameter' @ [126:46] ==> val extractedDescriptorToParameter: LinkedHashMap<DeclarationDescriptor, MutableParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'!' @ [127:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parameter' @ [127:14] ==> val parameter: MutableParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'getParameterType' @ [128:18] ==> public open fun getParameterType(allowSpecialClassNames: Boolean): KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[SimpleFunctionDescriptorImpl]

'options' @ [128:35] ==> public final val options: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'allowSpecialClassNames' @ [128:43] ==> public final val allowSpecialClassNames: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionOptions[PropertyDescriptorImpl]

'processTypeIfExtractable' @ [129:18] ==> internal fun KotlinType.processTypeIfExtractable(typeParameters: MutableSet<TypeParameter>, nonDenotableTypes: MutableSet<KotlinType>, options: ExtractionOptions, targetScope: LexicalScope?, processTypeArguments: Boolean = ...): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'info' @ [129:43] ==> val info: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'typeParameters' @ [129:48] ==> public final val typeParameters: HashSet<TypeParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[PropertyDescriptorImpl]

'info' @ [129:64] ==> val info: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'nonDenotableTypes' @ [129:69] ==> public final val nonDenotableTypes: HashSet<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[PropertyDescriptorImpl]

'options' @ [129:88] ==> public final val options: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'targetScope' @ [129:97] ==> value-parameter targetScope: LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[ValueParameterDescriptorImpl]

'with' @ [131:9] ==> @InlineOnly public inline fun <T, R> with(receiver: MutableParameter, block: MutableParameter.() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableParameter
    <R> -> Boolean

'parameter' @ [131:15] ==> val parameter: MutableParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'currentName' @ [132:17] ==> public final var currentName: String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'currentName' @ [133:17] ==> public final var currentName: String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'KotlinNameSuggester' @ [133:31] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNamesByType' @ [133:51] ==> public final fun suggestNamesByType(type: KotlinType, validator: (String) -> Boolean, defaultName: String? = ...): List<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'getParameterType' @ [133:70] ==> public open fun getParameterType(allowSpecialClassNames: Boolean): KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[SimpleFunctionDescriptorImpl]

'options' @ [133:87] ==> public final val options: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'allowSpecialClassNames' @ [133:95] ==> public final val allowSpecialClassNames: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionOptions[PropertyDescriptorImpl]

'varNameValidator' @ [133:120] ==> val varNameValidator: NewDeclarationNameValidator defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'first' @ [133:143] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'mirrorVarName' @ [135:13] ==> public open var mirrorVarName: String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'if (descriptorToExtract in modifiedVarDescriptors) KotlinNameSuggester.suggestNameByName(name, varNameValidator) else null' @ [135:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'descriptorToExtract' @ [135:33] ==> val descriptorToExtract: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'modifiedVarDescriptors' @ [135:56] ==> value-parameter modifiedVarDescriptors: Set<VariableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[ValueParameterDescriptorImpl]

'suggestNameByName' @ [135:100] ==> public final fun suggestNameByName(name: String, validator: (String) -> Boolean): String defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'name' @ [135:118] ==> public open val name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'varNameValidator' @ [135:124] ==> val varNameValidator: NewDeclarationNameValidator defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'info' @ [136:13] ==> val info: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'parameters' @ [136:18] ==> public final val parameters: LinkedHashSet<MutableParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[PropertyDescriptorImpl]

'add' @ [136:29] ==> public open fun add(element: MutableParameter): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'this' @ [136:33] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo.<anonymous>[ReceiverParameterDescriptorImpl]

'info' @ [140:25] ==> val info: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'typeParameters' @ [140:30] ==> public final val typeParameters: HashSet<TypeParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[PropertyDescriptorImpl]

'flatMapTo' @ [140:45] ==> public inline fun <T, R, C : MutableCollection<in KotlinType>> Iterable<TypeParameter>.flatMapTo(destination: HashSet<KotlinType>, transform: (TypeParameter) -> Iterable<KotlinType>): HashSet<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameter
    <R> -> KotlinType
    <C : MutableCollection<in R>> -> HashSet<KotlinType>

'HashSet' @ [140:55] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KotlinType

'it' @ [140:68] ==> value-parameter it: TypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo.<anonymous>[ValueParameterDescriptorImpl]

'collectReferencedTypes' @ [140:71] ==> public fun TypeParameter.collectReferencedTypes(bindingContext: BindingContext): List<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'bindingContext' @ [140:94] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[ValueParameterDescriptorImpl]

'typeToCheck' @ [141:9] ==> val typeToCheck: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'processTypeIfExtractable' @ [141:21] ==> internal fun KotlinType.processTypeIfExtractable(typeParameters: MutableSet<TypeParameter>, nonDenotableTypes: MutableSet<KotlinType>, options: ExtractionOptions, targetScope: LexicalScope?, processTypeArguments: Boolean = ...): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'info' @ [141:46] ==> val info: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'typeParameters' @ [141:51] ==> public final val typeParameters: HashSet<TypeParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[PropertyDescriptorImpl]

'info' @ [141:67] ==> val info: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'nonDenotableTypes' @ [141:72] ==> public final val nonDenotableTypes: HashSet<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[PropertyDescriptorImpl]

'options' @ [141:91] ==> public final val options: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'targetScope' @ [141:100] ==> value-parameter targetScope: LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[ValueParameterDescriptorImpl]

'info' @ [145:12] ==> val info: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.inferParametersInfo[LocalVariableDescriptor]

'component1' @ [158:10] ==> public final operator fun component1(): KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[SimpleFunctionDescriptorImpl]

'component2' @ [158:23] ==> public final operator fun component2(): PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[SimpleFunctionDescriptorImpl]

'component3' @ [158:44] ==> public final operator fun component3(): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[SimpleFunctionDescriptorImpl]

'component4' @ [158:64] ==> public final operator fun component4(): ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[SimpleFunctionDescriptorImpl]

'refInfo' @ [158:80] ==> value-parameter refInfo: ResolvedReferenceInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'resolveResult' @ [158:88] ==> public final val resolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolvedReferenceInfo[PropertyDescriptorImpl]

'receiverToExtract' @ [160:27] ==> value-parameter receiverToExtract: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'declarationDescriptor' @ [160:68] ==> public abstract val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitReceiver[DeserializedPropertyDescriptor]

'thisDescriptor' @ [161:27] ==> val thisDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'refInfo' @ [162:20] ==> value-parameter refInfo: ResolvedReferenceInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'refExpr' @ [162:28] ==> public final val refExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolvedReferenceInfo[PropertyDescriptorImpl]

'parent' @ [162:36] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'hasThisReceiver' @ [164:9] ==> val hasThisReceiver: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'DescriptorToSourceUtilsIde' @ [165:12] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAllDeclarations' @ [165:39] ==> public final fun getAllDeclarations(project: Project, targetDescriptor: DeclarationDescriptor, builtInsSearchScope: GlobalSearchScope? = ...): Collection<PsiElement> defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [165:58] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'thisDescriptor' @ [165:67] ==> val thisDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'all' @ [165:85] ==> public inline fun <T> Iterable<PsiElement>.all(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [165:91] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver.<anonymous>[ValueParameterDescriptorImpl]

'isInsideOf' @ [165:94] ==> public fun PsiElement.isInsideOf(elements: Iterable<PsiElement>): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'physicalElements' @ [165:105] ==> public final val physicalElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'thisDescriptor' @ [169:66] ==> val thisDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'originalDescriptor' @ [169:84] ==> val originalDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'let' @ [169:104] ==> @InlineOnly public inline fun <T, R> DeclarationDescriptor.let(block: (DeclarationDescriptor) -> ClassifierDescriptor?): ClassifierDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> ClassifierDescriptor?

'when (it) {
            is ClassDescriptor ->
                when(it.kind) {
                    ClassKind.OBJECT, ClassKind.ENUM_CLASS -> it
                    ClassKind.ENUM_ENTRY -> it.containingDeclaration as? ClassDescriptor
                    else -> if (refInfo.refExpr.getNonStrictParentOfType<KtTypeReference>() != null) it else null
                }

            is TypeParameterDescriptor -> it

            is ConstructorDescriptor -> it.containingDeclaration

            else -> null
        }' @ [170:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ClassifierDescriptor?, entry1: ClassifierDescriptor?, entry2: ClassifierDescriptor?, entry3: ClassifierDescriptor?): ClassifierDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ClassifierDescriptor?

'it' @ [170:15] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver.<anonymous>[ValueParameterDescriptorImpl]

'when(it.kind) {
                    ClassKind.OBJECT, ClassKind.ENUM_CLASS -> it
                    ClassKind.ENUM_ENTRY -> it.containingDeclaration as? ClassDescriptor
                    else -> if (refInfo.refExpr.getNonStrictParentOfType<KtTypeReference>() != null) it else null
                }' @ [172:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ClassDescriptor?, entry1: ClassDescriptor?, entry2: ClassDescriptor?): ClassDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ClassDescriptor?

'it' @ [172:22] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [172:25] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'OBJECT' @ [173:31] ==> enum entry OBJECT defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'ENUM_CLASS' @ [173:49] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'it' @ [173:63] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver.<anonymous>[ValueParameterDescriptorImpl]

'ENUM_ENTRY' @ [174:31] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'it' @ [174:45] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [174:48] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'if (refInfo.refExpr.getNonStrictParentOfType<KtTypeReference>() != null) it else null' @ [175:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ClassDescriptor?, elseBranch: ClassDescriptor?): ClassDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClassDescriptor?

'refInfo' @ [175:33] ==> value-parameter refInfo: ResolvedReferenceInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'refExpr' @ [175:41] ==> public final val refExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolvedReferenceInfo[PropertyDescriptorImpl]

'getNonStrictParentOfType' @ [175:49] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtTypeReference? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeReference

'it' @ [175:102] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [178:43] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [180:41] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [180:44] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'if (referencedClassifierDescriptor != null) {
        if (!referencedClassifierDescriptor.defaultType.processTypeIfExtractable(
                info.typeParameters, info.nonDenotableTypes, options, targetScope, referencedClassifierDescriptor is TypeParameterDescriptor
        )) return

        if (options.canWrapInWith
            && resolvedCall != null
            && resolvedCall.hasBothReceivers()
            && DescriptorUtils.isObject(referencedClassifierDescriptor)) {
            info.replacementMap.putValue(originalRef, WrapObjectInWithReplacement(referencedClassifierDescriptor as ClassDescriptor))
        } else if (referencedClassifierDescriptor is ClassDescriptor) {
            info.replacementMap.putValue(originalRef, FqNameReplacement(originalDescriptor.getImportableDescriptor().fqNameSafe))
        }
    }
    else {
        val extractThis = (hasThisReceiver && refInfo.smartCast == null) || thisExpr != null
        val extractOrdinaryParameter =
                originalDeclaration is KtDestructuringDeclarationEntry ||
                originalDeclaration is KtProperty ||
                originalDeclaration is KtParameter

        val extractFunctionRef =
                options.captureLocalFunctions
                && originalRef.getReferencedName() == originalDescriptor.name.asString() // to forbid calls by convention
                && originalDeclaration is KtNamedFunction && originalDeclaration.isLocal
                && targetScope.findFunction(originalDescriptor.name, NoLookupLocation.FROM_IDE) { it == originalDescriptor } == null

        val descriptorToExtract = (if (extractThis) thisDescriptor else null) ?: originalDescriptor

        val extractParameter = extractThis || extractOrdinaryParameter || extractFunctionRef
        if (extractParameter) {
            val parameterExpression = when {
                receiverToExtract is ExpressionReceiver -> {
                    val receiverExpression = receiverToExtract.expression
                    // If p.q has a smart-cast, then extract entire qualified expression
                    if (refInfo.smartCast != null) receiverExpression.parent as KtExpression else receiverExpression
                }
                receiverToExtract != null && refInfo.smartCast == null -> null
                else -> (originalRef.parent as? KtThisExpression) ?: originalRef
            }

            val parameterType = suggestParameterType(extractFunctionRef, originalDescriptor, parameterExpression, receiverToExtract, resolvedCall, true, bindingContext)

            val parameter = extractedDescriptorToParameter.getOrPut(descriptorToExtract) {
                var argumentText =
                        if (hasThisReceiver && extractThis) {
                            val label = if (descriptorToExtract is ClassDescriptor) "@${descriptorToExtract.name.asString()}" else ""
                            "this$label"
                        }
                        else {
                            val argumentExpr = (thisExpr ?: refInfo.refExpr).getQualifiedExpressionForSelectorOrThis()
                            if (argumentExpr is KtOperationReferenceExpression) {
                                val nameElement = argumentExpr.getReferencedNameElement()
                                val nameElementType = nameElement.node.elementType
                                (nameElementType as? KtToken)?.let {
                                    OperatorConventions.getNameForOperationSymbol(it)?.asString()
                                } ?: nameElement.text
                            }
                            else argumentExpr.text
                                 ?: throw AssertionError("reference shouldn't be empty: code fragment = $codeFragmentText")
                        }
                if (extractFunctionRef) {
                    val receiverTypeText = (originalDeclaration as KtCallableDeclaration).receiverTypeReference?.text ?: ""
                    argumentText = "$receiverTypeText::$argumentText"
                }

                val originalType = suggestParameterType(extractFunctionRef, originalDescriptor, parameterExpression, receiverToExtract, resolvedCall, false, bindingContext)

                MutableParameter(argumentText, descriptorToExtract, extractThis, targetScope, originalType, refInfo.possibleTypes)
            }

            if (!extractThis) {
                parameter.currentName = when (originalDeclaration) {
                    is PsiNameIdentifierOwner -> originalDeclaration.nameIdentifier?.text
                    else -> null
                }
            }

            parameter.refCount++
            info.originalRefToParameter.putValue(originalRef, parameter)

            parameter.addDefaultType(parameterType)

            if (extractThis && thisExpr == null) {
                val callElement = resolvedCall!!.call.callElement
                val instruction = pseudocode.getElementValue(callElement)?.createdAt as? InstructionWithReceivers
                val receiverValue = instruction?.receiverValues?.entries?.singleOrNull { it.value == receiverToExtract }?.key
                if (receiverValue != null) {
                    parameter.addTypePredicate(getExpectedTypePredicate(receiverValue, bindingContext, targetScope.ownerDescriptor.builtIns))
                }
            }
            else if (extractFunctionRef) {
                parameter.addTypePredicate(SingleType(parameterType))
            }
            else {
                pseudocode.getElementValuesRecursively(originalRef).forEach {
                    parameter.addTypePredicate(getExpectedTypePredicate(it, bindingContext, targetScope.ownerDescriptor.builtIns))
                }
            }

            val replacement = when {
                isMemberExtension -> WrapParameterInWithReplacement(parameter)
                hasThisReceiver && extractThis -> AddPrefixReplacement(parameter)
                else -> RenameReplacement(parameter)
            }
            info.replacementMap.putValue(originalRef, replacement)
        }
    }' @ [186:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'referencedClassifierDescriptor' @ [186:9] ==> val referencedClassifierDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'!' @ [187:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'referencedClassifierDescriptor' @ [187:14] ==> val referencedClassifierDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'defaultType' @ [187:45] ==> public final val ClassifierDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'processTypeIfExtractable' @ [187:57] ==> internal fun KotlinType.processTypeIfExtractable(typeParameters: MutableSet<TypeParameter>, nonDenotableTypes: MutableSet<KotlinType>, options: ExtractionOptions, targetScope: LexicalScope?, processTypeArguments: Boolean = ...): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'info' @ [188:17] ==> value-parameter info: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'typeParameters' @ [188:22] ==> public final val typeParameters: HashSet<TypeParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[PropertyDescriptorImpl]

'info' @ [188:38] ==> value-parameter info: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'nonDenotableTypes' @ [188:43] ==> public final val nonDenotableTypes: HashSet<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[PropertyDescriptorImpl]

'options' @ [188:62] ==> public final val options: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'targetScope' @ [188:71] ==> value-parameter targetScope: LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'referencedClassifierDescriptor' @ [188:84] ==> val referencedClassifierDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'if (options.canWrapInWith
            && resolvedCall != null
            && resolvedCall.hasBothReceivers()
            && DescriptorUtils.isObject(referencedClassifierDescriptor)) {
            info.replacementMap.putValue(originalRef, WrapObjectInWithReplacement(referencedClassifierDescriptor as ClassDescriptor))
        } else if (referencedClassifierDescriptor is ClassDescriptor) {
            info.replacementMap.putValue(originalRef, FqNameReplacement(originalDescriptor.getImportableDescriptor().fqNameSafe))
        }' @ [191:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'options' @ [191:13] ==> public final val options: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'canWrapInWith' @ [191:21] ==> public final val canWrapInWith: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionOptions[PropertyDescriptorImpl]

'resolvedCall' @ [192:16] ==> val resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'resolvedCall' @ [193:16] ==> val resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'hasBothReceivers' @ [193:29] ==> public fun ResolvedCall<*>.hasBothReceivers(): Boolean defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil[DeserializedSimpleFunctionDescriptor]

'isObject' @ [194:32] ==> public open fun isObject(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'referencedClassifierDescriptor' @ [194:41] ==> val referencedClassifierDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'info' @ [195:13] ==> value-parameter info: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'replacementMap' @ [195:18] ==> public final val replacementMap: MultiMap<(KtSimpleNameExpression..KtSimpleNameExpression?), (Replacement..Replacement?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[PropertyDescriptorImpl]

'putValue' @ [195:33] ==> public open fun putValue(@Nullable p0: KtSimpleNameExpression?, p1: (Replacement..Replacement?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'originalRef' @ [195:42] ==> val originalRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'WrapObjectInWithReplacement' @ [195:55] ==> public constructor WrapObjectInWithReplacement(descriptor: ClassDescriptor) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.WrapObjectInWithReplacement[ClassConstructorDescriptorImpl]

'referencedClassifierDescriptor' @ [195:83] ==> val referencedClassifierDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'referencedClassifierDescriptor' @ [196:20] ==> val referencedClassifierDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'info' @ [197:13] ==> value-parameter info: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'replacementMap' @ [197:18] ==> public final val replacementMap: MultiMap<(KtSimpleNameExpression..KtSimpleNameExpression?), (Replacement..Replacement?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[PropertyDescriptorImpl]

'putValue' @ [197:33] ==> public open fun putValue(@Nullable p0: KtSimpleNameExpression?, p1: (Replacement..Replacement?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'originalRef' @ [197:42] ==> val originalRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'FqNameReplacement' @ [197:55] ==> public constructor FqNameReplacement(fqName: FqName) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.FqNameReplacement[ClassConstructorDescriptorImpl]

'originalDescriptor' @ [197:73] ==> val originalDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'getImportableDescriptor' @ [197:92] ==> public fun DeclarationDescriptor.getImportableDescriptor(): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'fqNameSafe' @ [197:118] ==> public val DeclarationDescriptor.fqNameSafe: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'hasThisReceiver' @ [201:28] ==> val hasThisReceiver: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'refInfo' @ [201:47] ==> value-parameter refInfo: ResolvedReferenceInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'smartCast' @ [201:55] ==> public final val smartCast: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolvedReferenceInfo[PropertyDescriptorImpl]

'thisExpr' @ [201:77] ==> val thisExpr: KtThisExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'originalDeclaration' @ [203:17] ==> val originalDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'originalDeclaration' @ [204:17] ==> val originalDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'originalDeclaration' @ [205:17] ==> val originalDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'options' @ [208:17] ==> public final val options: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'captureLocalFunctions' @ [208:25] ==> public final val captureLocalFunctions: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionOptions[PropertyDescriptorImpl]

'originalRef' @ [209:20] ==> val originalRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'getReferencedName' @ [209:32] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'originalDescriptor' @ [209:55] ==> val originalDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'name' @ [209:74] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [209:79] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'originalDeclaration' @ [210:20] ==> val originalDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'originalDeclaration' @ [210:62] ==> val originalDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'isLocal' @ [210:82] ==> public final val KtNamedFunction.isLocal: Boolean[MyPropertyDescriptor]

'targetScope' @ [211:20] ==> value-parameter targetScope: LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'findFunction' @ [211:32] ==> public fun HierarchicalScope.findFunction(name: Name, location: LookupLocation, predicate: (FunctionDescriptor) -> Boolean = ...): FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'originalDescriptor' @ [211:45] ==> val originalDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'name' @ [211:64] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'FROM_IDE' @ [211:87] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'it' @ [211:99] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver.<anonymous>[ValueParameterDescriptorImpl]

'originalDescriptor' @ [211:105] ==> val originalDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'?:' @ [213:35] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: DeclarationDescriptor?, right: DeclarationDescriptor): DeclarationDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> DeclarationDescriptor

'if (extractThis) thisDescriptor else null' @ [213:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DeclarationDescriptor?, elseBranch: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DeclarationDescriptor?

'extractThis' @ [213:40] ==> val extractThis: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'thisDescriptor' @ [213:53] ==> val thisDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'originalDescriptor' @ [213:82] ==> val originalDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'extractThis' @ [215:32] ==> val extractThis: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'extractOrdinaryParameter' @ [215:47] ==> val extractOrdinaryParameter: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'extractFunctionRef' @ [215:75] ==> val extractFunctionRef: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'extractParameter' @ [216:13] ==> val extractParameter: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'when {
                receiverToExtract is ExpressionReceiver -> {
                    val receiverExpression = receiverToExtract.expression
                    // If p.q has a smart-cast, then extract entire qualified expression
                    if (refInfo.smartCast != null) receiverExpression.parent as KtExpression else receiverExpression
                }
                receiverToExtract != null && refInfo.smartCast == null -> null
                else -> (originalRef.parent as? KtThisExpression) ?: originalRef
            }' @ [217:39] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'receiverToExtract' @ [218:17] ==> value-parameter receiverToExtract: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'receiverToExtract' @ [219:46] ==> value-parameter receiverToExtract: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'expression' @ [219:64] ==> public abstract val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[DeserializedPropertyDescriptor]

'if (refInfo.smartCast != null) receiverExpression.parent as KtExpression else receiverExpression' @ [221:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'refInfo' @ [221:25] ==> value-parameter refInfo: ResolvedReferenceInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'smartCast' @ [221:33] ==> public final val smartCast: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolvedReferenceInfo[PropertyDescriptorImpl]

'receiverExpression' @ [221:52] ==> val receiverExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'parent' @ [221:71] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'receiverExpression' @ [221:99] ==> val receiverExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'receiverToExtract' @ [223:17] ==> value-parameter receiverToExtract: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'refInfo' @ [223:46] ==> value-parameter refInfo: ResolvedReferenceInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'smartCast' @ [223:54] ==> public final val smartCast: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolvedReferenceInfo[PropertyDescriptorImpl]

'?:' @ [224:25] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression?

'originalRef' @ [224:26] ==> val originalRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'parent' @ [224:38] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'originalRef' @ [224:70] ==> val originalRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'suggestParameterType' @ [227:33] ==> private fun suggestParameterType(extractFunctionRef: Boolean, originalDescriptor: DeclarationDescriptor, parameterExpression: KtExpression?, receiverToExtract: ReceiverValue?, resolvedCall: ResolvedCall<*>?, useSmartCastsIfPossible: Boolean, bindingContext: BindingContext): KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file inferParameterInfo.kt[SimpleFunctionDescriptorImpl]

'extractFunctionRef' @ [227:54] ==> val extractFunctionRef: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'originalDescriptor' @ [227:74] ==> val originalDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'parameterExpression' @ [227:94] ==> val parameterExpression: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'receiverToExtract' @ [227:115] ==> value-parameter receiverToExtract: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'resolvedCall' @ [227:134] ==> val resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'bindingContext' @ [227:154] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'extractedDescriptorToParameter' @ [229:29] ==> value-parameter extractedDescriptorToParameter: HashMap<DeclarationDescriptor, MutableParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'getOrPut' @ [229:60] ==> public inline fun <K, V> MutableMap<DeclarationDescriptor, MutableParameter>.getOrPut(key: DeclarationDescriptor, defaultValue: () -> MutableParameter): MutableParameter defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> DeclarationDescriptor
    <V> -> MutableParameter

'descriptorToExtract' @ [229:69] ==> val descriptorToExtract: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'if (hasThisReceiver && extractThis) {
                            val label = if (descriptorToExtract is ClassDescriptor) "@${descriptorToExtract.name.asString()}" else ""
                            "this$label"
                        }
                        else {
                            val argumentExpr = (thisExpr ?: refInfo.refExpr).getQualifiedExpressionForSelectorOrThis()
                            if (argumentExpr is KtOperationReferenceExpression) {
                                val nameElement = argumentExpr.getReferencedNameElement()
                                val nameElementType = nameElement.node.elementType
                                (nameElementType as? KtToken)?.let {
                                    OperatorConventions.getNameForOperationSymbol(it)?.asString()
                                } ?: nameElement.text
                            }
                            else argumentExpr.text
                                 ?: throw AssertionError("reference shouldn't be empty: code fragment = $codeFragmentText")
                        }' @ [231:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'hasThisReceiver' @ [231:29] ==> val hasThisReceiver: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'extractThis' @ [231:48] ==> val extractThis: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'if (descriptorToExtract is ClassDescriptor) "@${descriptorToExtract.name.asString()}" else ""' @ [232:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'descriptorToExtract' @ [232:45] ==> val descriptorToExtract: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'descriptorToExtract' @ [232:89] ==> val descriptorToExtract: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'name' @ [232:109] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [232:114] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'label' @ [233:35] ==> val label: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver.<anonymous>[LocalVariableDescriptor]

'thisExpr' @ [236:49] ==> val thisExpr: KtThisExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'refInfo' @ [236:61] ==> value-parameter refInfo: ResolvedReferenceInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'refExpr' @ [236:69] ==> public final val refExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolvedReferenceInfo[PropertyDescriptorImpl]

'getQualifiedExpressionForSelectorOrThis' @ [236:78] ==> public fun KtExpression.getQualifiedExpressionForSelectorOrThis(): KtExpression defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'if (argumentExpr is KtOperationReferenceExpression) {
                                val nameElement = argumentExpr.getReferencedNameElement()
                                val nameElementType = nameElement.node.elementType
                                (nameElementType as? KtToken)?.let {
                                    OperatorConventions.getNameForOperationSymbol(it)?.asString()
                                } ?: nameElement.text
                            }
                            else argumentExpr.text
                                 ?: throw AssertionError("reference shouldn't be empty: code fragment = $codeFragmentText")' @ [237:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'argumentExpr' @ [237:33] ==> val argumentExpr: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver.<anonymous>[LocalVariableDescriptor]

'argumentExpr' @ [238:51] ==> val argumentExpr: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver.<anonymous>[LocalVariableDescriptor]

'getReferencedNameElement' @ [238:64] ==> public open fun getReferencedNameElement(): PsiElement defined in org.jetbrains.kotlin.psi.KtOperationReferenceExpression[DeserializedSimpleFunctionDescriptor]

'nameElement' @ [239:55] ==> val nameElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver.<anonymous>[LocalVariableDescriptor]

'node' @ [239:67] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [239:72] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'?:' @ [240:33] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'nameElementType' @ [240:34] ==> val nameElementType: IElementType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver.<anonymous>[LocalVariableDescriptor]

'let' @ [240:64] ==> @InlineOnly public inline fun <T, R> KtToken.let(block: (KtToken) -> String?): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtToken
    <R> -> String?

'getNameForOperationSymbol' @ [241:57] ==> @Nullable public open fun getNameForOperationSymbol(@NotNull p0: KtToken): Name? defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaMethodDescriptor]

'it' @ [241:83] ==> value-parameter it: KtToken defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'asString' @ [241:88] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'nameElement' @ [242:38] ==> val nameElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver.<anonymous>[LocalVariableDescriptor]

'text' @ [242:50] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'argumentExpr' @ [244:34] ==> val argumentExpr: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver.<anonymous>[LocalVariableDescriptor]

'text' @ [244:47] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'AssertionError' @ [245:43] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'codeFragmentText' @ [245:106] ==> public final val codeFragmentText: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'extractFunctionRef' @ [247:21] ==> val extractFunctionRef: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'?:' @ [248:44] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'originalDeclaration' @ [248:45] ==> val originalDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'receiverTypeReference' @ [248:91] ==> public final val KtCallableDeclaration.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'text' @ [248:114] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'argumentText' @ [249:21] ==> var argumentText: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver.<anonymous>[LocalVariableDescriptor]

'receiverTypeText' @ [249:38] ==> val receiverTypeText: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver.<anonymous>[LocalVariableDescriptor]

'argumentText' @ [249:57] ==> var argumentText: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver.<anonymous>[LocalVariableDescriptor]

'suggestParameterType' @ [252:36] ==> private fun suggestParameterType(extractFunctionRef: Boolean, originalDescriptor: DeclarationDescriptor, parameterExpression: KtExpression?, receiverToExtract: ReceiverValue?, resolvedCall: ResolvedCall<*>?, useSmartCastsIfPossible: Boolean, bindingContext: BindingContext): KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file inferParameterInfo.kt[SimpleFunctionDescriptorImpl]

'extractFunctionRef' @ [252:57] ==> val extractFunctionRef: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'originalDescriptor' @ [252:77] ==> val originalDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'parameterExpression' @ [252:97] ==> val parameterExpression: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'receiverToExtract' @ [252:118] ==> value-parameter receiverToExtract: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'resolvedCall' @ [252:137] ==> val resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'bindingContext' @ [252:158] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'MutableParameter' @ [254:17] ==> public constructor MutableParameter(argumentText: String, originalDescriptor: DeclarationDescriptor, receiverCandidate: Boolean, targetScope: LexicalScope?, originalType: KotlinType, possibleTypes: Set<KotlinType>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[ClassConstructorDescriptorImpl]

'argumentText' @ [254:34] ==> var argumentText: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver.<anonymous>[LocalVariableDescriptor]

'descriptorToExtract' @ [254:48] ==> val descriptorToExtract: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'extractThis' @ [254:69] ==> val extractThis: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'targetScope' @ [254:82] ==> value-parameter targetScope: LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'originalType' @ [254:95] ==> val originalType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver.<anonymous>[LocalVariableDescriptor]

'refInfo' @ [254:109] ==> value-parameter refInfo: ResolvedReferenceInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'possibleTypes' @ [254:117] ==> public final val possibleTypes: Set<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolvedReferenceInfo[PropertyDescriptorImpl]

'!' @ [257:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'extractThis' @ [257:18] ==> val extractThis: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'parameter' @ [258:17] ==> val parameter: MutableParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'currentName' @ [258:27] ==> public final var currentName: String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'when (originalDeclaration) {
                    is PsiNameIdentifierOwner -> originalDeclaration.nameIdentifier?.text
                    else -> null
                }' @ [258:41] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'originalDeclaration' @ [258:47] ==> val originalDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'originalDeclaration' @ [259:50] ==> val originalDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'nameIdentifier' @ [259:70] ==> public final val PsiNameIdentifierOwner.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'text' @ [259:86] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'parameter' @ [264:13] ==> val parameter: MutableParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'refCount' @ [264:23] ==> public final var refCount: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'info' @ [265:13] ==> value-parameter info: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'originalRefToParameter' @ [265:18] ==> public final val originalRefToParameter: MultiMap<(KtSimpleNameExpression..KtSimpleNameExpression?), (MutableParameter..MutableParameter?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[PropertyDescriptorImpl]

'putValue' @ [265:41] ==> public open fun putValue(@Nullable p0: KtSimpleNameExpression?, p1: (MutableParameter..MutableParameter?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'originalRef' @ [265:50] ==> val originalRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'parameter' @ [265:63] ==> val parameter: MutableParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'parameter' @ [267:13] ==> val parameter: MutableParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'addDefaultType' @ [267:23] ==> public final fun addDefaultType(jetType: KotlinType): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[SimpleFunctionDescriptorImpl]

'parameterType' @ [267:38] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'if (extractThis && thisExpr == null) {
                val callElement = resolvedCall!!.call.callElement
                val instruction = pseudocode.getElementValue(callElement)?.createdAt as? InstructionWithReceivers
                val receiverValue = instruction?.receiverValues?.entries?.singleOrNull { it.value == receiverToExtract }?.key
                if (receiverValue != null) {
                    parameter.addTypePredicate(getExpectedTypePredicate(receiverValue, bindingContext, targetScope.ownerDescriptor.builtIns))
                }
            }
            else if (extractFunctionRef) {
                parameter.addTypePredicate(SingleType(parameterType))
            }
            else {
                pseudocode.getElementValuesRecursively(originalRef).forEach {
                    parameter.addTypePredicate(getExpectedTypePredicate(it, bindingContext, targetScope.ownerDescriptor.builtIns))
                }
            }' @ [269:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'extractThis' @ [269:17] ==> val extractThis: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'thisExpr' @ [269:32] ==> val thisExpr: KtThisExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'resolvedCall' @ [270:35] ==> val resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'call' @ [270:50] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'callElement' @ [270:55] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'pseudocode' @ [271:35] ==> value-parameter pseudocode: Pseudocode defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'getElementValue' @ [271:46] ==> public abstract fun getElementValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[DeserializedSimpleFunctionDescriptor]

'callElement' @ [271:62] ==> val callElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'createdAt' @ [271:76] ==> public abstract val createdAt: InstructionWithValue? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudoValue[DeserializedPropertyDescriptor]

'instruction' @ [272:37] ==> val instruction: InstructionWithReceivers? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'receiverValues' @ [272:50] ==> public abstract val receiverValues: Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.InstructionWithReceivers[DeserializedPropertyDescriptor]

'entries' @ [272:66] ==> public abstract val entries: Set<Map.Entry<PseudoValue, ReceiverValue>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'singleOrNull' @ [272:75] ==> public inline fun <T> Iterable<Map.Entry<PseudoValue, ReceiverValue>>.singleOrNull(predicate: (Map.Entry<PseudoValue, ReceiverValue>) -> Boolean): Map.Entry<PseudoValue, ReceiverValue>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<PseudoValue, ReceiverValue>

'it' @ [272:90] ==> value-parameter it: Map.Entry<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [272:93] ==> public abstract val value: ReceiverValue defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'receiverToExtract' @ [272:102] ==> value-parameter receiverToExtract: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'key' @ [272:123] ==> public abstract val key: PseudoValue defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'receiverValue' @ [273:21] ==> val receiverValue: PseudoValue? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'parameter' @ [274:21] ==> val parameter: MutableParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'addTypePredicate' @ [274:31] ==> public final fun addTypePredicate(predicate: TypePredicate): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[SimpleFunctionDescriptorImpl]

'getExpectedTypePredicate' @ [274:48] ==> public fun getExpectedTypePredicate(value: PseudoValue, bindingContext: BindingContext, builtIns: KotlinBuiltIns): TypePredicate defined in org.jetbrains.kotlin.cfg.pseudocode[DeserializedSimpleFunctionDescriptor]

'receiverValue' @ [274:73] ==> val receiverValue: PseudoValue? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'bindingContext' @ [274:88] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'targetScope' @ [274:104] ==> value-parameter targetScope: LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [274:116] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'builtIns' @ [274:132] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'if (extractFunctionRef) {
                parameter.addTypePredicate(SingleType(parameterType))
            }
            else {
                pseudocode.getElementValuesRecursively(originalRef).forEach {
                    parameter.addTypePredicate(getExpectedTypePredicate(it, bindingContext, targetScope.ownerDescriptor.builtIns))
                }
            }' @ [277:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'extractFunctionRef' @ [277:22] ==> val extractFunctionRef: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'parameter' @ [278:17] ==> val parameter: MutableParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'addTypePredicate' @ [278:27] ==> public final fun addTypePredicate(predicate: TypePredicate): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[SimpleFunctionDescriptorImpl]

'SingleType' @ [278:44] ==> public constructor SingleType(targetType: KotlinType) defined in org.jetbrains.kotlin.cfg.pseudocode.SingleType[DeserializedClassConstructorDescriptor]

'parameterType' @ [278:55] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'pseudocode' @ [281:17] ==> value-parameter pseudocode: Pseudocode defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'getElementValuesRecursively' @ [281:28] ==> public fun Pseudocode.getElementValuesRecursively(element: KtElement): List<PseudoValue> defined in org.jetbrains.kotlin.cfg.pseudocode[DeserializedSimpleFunctionDescriptor]

'originalRef' @ [281:56] ==> val originalRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'forEach' @ [281:69] ==> @HidesMembers public inline fun <T> Iterable<PseudoValue>.forEach(action: (PseudoValue) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PseudoValue

'parameter' @ [282:21] ==> val parameter: MutableParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'addTypePredicate' @ [282:31] ==> public final fun addTypePredicate(predicate: TypePredicate): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[SimpleFunctionDescriptorImpl]

'getExpectedTypePredicate' @ [282:48] ==> public fun getExpectedTypePredicate(value: PseudoValue, bindingContext: BindingContext, builtIns: KotlinBuiltIns): TypePredicate defined in org.jetbrains.kotlin.cfg.pseudocode[DeserializedSimpleFunctionDescriptor]

'it' @ [282:73] ==> value-parameter it: PseudoValue defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver.<anonymous>[ValueParameterDescriptorImpl]

'bindingContext' @ [282:77] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'targetScope' @ [282:93] ==> value-parameter targetScope: LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [282:105] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'builtIns' @ [282:121] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'when {
                isMemberExtension -> WrapParameterInWithReplacement(parameter)
                hasThisReceiver && extractThis -> AddPrefixReplacement(parameter)
                else -> RenameReplacement(parameter)
            }' @ [286:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ParameterReplacement, entry1: ParameterReplacement, entry2: ParameterReplacement): ParameterReplacement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ParameterReplacement

'isMemberExtension' @ [287:17] ==> value-parameter isMemberExtension: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'WrapParameterInWithReplacement' @ [287:38] ==> public constructor WrapParameterInWithReplacement(parameter: Parameter) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.WrapParameterInWithReplacement[ClassConstructorDescriptorImpl]

'parameter' @ [287:69] ==> val parameter: MutableParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'hasThisReceiver' @ [288:17] ==> val hasThisReceiver: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'extractThis' @ [288:36] ==> val extractThis: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'AddPrefixReplacement' @ [288:51] ==> public constructor AddPrefixReplacement(parameter: Parameter) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AddPrefixReplacement[ClassConstructorDescriptorImpl]

'parameter' @ [288:72] ==> val parameter: MutableParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'RenameReplacement' @ [289:25] ==> public constructor RenameReplacement(parameter: Parameter) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.RenameReplacement[ClassConstructorDescriptorImpl]

'parameter' @ [289:43] ==> val parameter: MutableParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'info' @ [291:13] ==> value-parameter info: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[ValueParameterDescriptorImpl]

'replacementMap' @ [291:18] ==> public final val replacementMap: MultiMap<(KtSimpleNameExpression..KtSimpleNameExpression?), (Replacement..Replacement?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[PropertyDescriptorImpl]

'putValue' @ [291:33] ==> public open fun putValue(@Nullable p0: KtSimpleNameExpression?, p1: (Replacement..Replacement?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'originalRef' @ [291:42] ==> val originalRef: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'replacement' @ [291:55] ==> val replacement: ParameterReplacement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.extractReceiver[LocalVariableDescriptor]

'originalDescriptor' @ [304:20] ==> value-parameter originalDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[ValueParameterDescriptorImpl]

'builtIns' @ [304:39] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'when {
               extractFunctionRef -> {
                   originalDescriptor as FunctionDescriptor
                   createFunctionType(
                           builtIns,
                           Annotations.EMPTY,
                           originalDescriptor.extensionReceiverParameter?.type,
                           originalDescriptor.valueParameters.map { it.type },
                           originalDescriptor.valueParameters.map { it.name },
                           originalDescriptor.returnType ?: builtIns.defaultReturnType
                   )
               }

               parameterExpression != null ->
                   (if (useSmartCastsIfPossible) bindingContext[BindingContext.SMARTCAST, parameterExpression]?.defaultType else null)
                   ?: bindingContext.getType(parameterExpression)
                   ?: (parameterExpression as? KtReferenceExpression)?.let {
                       (bindingContext[BindingContext.REFERENCE_TARGET, it] as? CallableDescriptor)?.returnType
                   }
                   ?: receiverToExtract?.type

               receiverToExtract is ImplicitReceiver -> {
                   val typeByDataFlowInfo = if (useSmartCastsIfPossible) {
                       val dataFlowInfo = bindingContext.getDataFlowInfoAfter(resolvedCall!!.call.callElement)
                       val possibleTypes = dataFlowInfo.getCollectedTypes(DataFlowValueFactory.createDataFlowValueForStableReceiver(receiverToExtract))
                       if (possibleTypes.isNotEmpty()) CommonSupertypes.commonSupertype(possibleTypes) else null
                   } else null
                   typeByDataFlowInfo ?: receiverToExtract.type
               }

               else -> receiverToExtract?.type
           }' @ [305:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinType?, entry1: KotlinType?, entry2: KotlinType?, entry3: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinType?

'extractFunctionRef' @ [306:16] ==> value-parameter extractFunctionRef: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[ValueParameterDescriptorImpl]

'originalDescriptor' @ [307:20] ==> value-parameter originalDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[ValueParameterDescriptorImpl]

'createFunctionType' @ [308:20] ==> @JvmOverloads public fun createFunctionType(builtIns: KotlinBuiltIns, annotations: Annotations, receiverType: KotlinType?, parameterTypes: List<KotlinType>, parameterNames: List<Name>?, returnType: KotlinType, suspendFunction: Boolean = ...): SimpleType defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'builtIns' @ [309:28] ==> val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[LocalVariableDescriptor]

'EMPTY' @ [310:40] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'originalDescriptor' @ [311:28] ==> value-parameter originalDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [311:47] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [311:75] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'originalDescriptor' @ [312:28] ==> value-parameter originalDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[ValueParameterDescriptorImpl]

'valueParameters' @ [312:47] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'map' @ [312:63] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> KotlinType

'it' @ [312:69] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [312:72] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'originalDescriptor' @ [313:28] ==> value-parameter originalDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[ValueParameterDescriptorImpl]

'valueParameters' @ [313:47] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'map' @ [313:63] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Name): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> Name

'it' @ [313:69] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [313:72] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'originalDescriptor' @ [314:28] ==> value-parameter originalDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[ValueParameterDescriptorImpl]

'returnType' @ [314:47] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'builtIns' @ [314:61] ==> val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[LocalVariableDescriptor]

'defaultReturnType' @ [314:70] ==> internal val KotlinBuiltIns.defaultReturnType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[PropertyDescriptorImpl]

'parameterExpression' @ [318:16] ==> value-parameter parameterExpression: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[ValueParameterDescriptorImpl]

'?:' @ [319:20] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KotlinType?, right: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KotlinType?

'if (useSmartCastsIfPossible) bindingContext[BindingContext.SMARTCAST, parameterExpression]?.defaultType else null' @ [319:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType?, elseBranch: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType?

'useSmartCastsIfPossible' @ [319:25] ==> value-parameter useSmartCastsIfPossible: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[ValueParameterDescriptorImpl]

'bindingContext' @ [319:50] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[ValueParameterDescriptorImpl]

'SMARTCAST' @ [319:80] ==> public final val SMARTCAST: (WritableSlice<(KtExpression..KtExpression?), (ExplicitSmartCasts..ExplicitSmartCasts?)>..WritableSlice<(KtExpression..KtExpression?), (ExplicitSmartCasts..ExplicitSmartCasts?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'parameterExpression' @ [319:91] ==> value-parameter parameterExpression: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[ValueParameterDescriptorImpl]

'defaultType' @ [319:113] ==> public abstract val defaultType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.ExplicitSmartCasts[DeserializedPropertyDescriptor]

'bindingContext' @ [320:23] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[ValueParameterDescriptorImpl]

'getType' @ [320:38] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'parameterExpression' @ [320:46] ==> value-parameter parameterExpression: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[ValueParameterDescriptorImpl]

'parameterExpression' @ [321:24] ==> value-parameter parameterExpression: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[ValueParameterDescriptorImpl]

'let' @ [321:72] ==> @InlineOnly public inline fun <T, R> KtReferenceExpression.let(block: (KtReferenceExpression) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtReferenceExpression
    <R> -> KotlinType?

'bindingContext' @ [322:25] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[ValueParameterDescriptorImpl]

'REFERENCE_TARGET' @ [322:55] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [322:73] ==> value-parameter it: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType.<anonymous>[ValueParameterDescriptorImpl]

'returnType' @ [322:102] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'receiverToExtract' @ [324:23] ==> value-parameter receiverToExtract: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[ValueParameterDescriptorImpl]

'type' @ [324:42] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'receiverToExtract' @ [326:16] ==> value-parameter receiverToExtract: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[ValueParameterDescriptorImpl]

'if (useSmartCastsIfPossible) {
                       val dataFlowInfo = bindingContext.getDataFlowInfoAfter(resolvedCall!!.call.callElement)
                       val possibleTypes = dataFlowInfo.getCollectedTypes(DataFlowValueFactory.createDataFlowValueForStableReceiver(receiverToExtract))
                       if (possibleTypes.isNotEmpty()) CommonSupertypes.commonSupertype(possibleTypes) else null
                   } else null' @ [327:45] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType?, elseBranch: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType?

'useSmartCastsIfPossible' @ [327:49] ==> value-parameter useSmartCastsIfPossible: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[ValueParameterDescriptorImpl]

'bindingContext' @ [328:43] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[ValueParameterDescriptorImpl]

'getDataFlowInfoAfter' @ [328:58] ==> public fun BindingContext.getDataFlowInfoAfter(position: PsiElement): DataFlowInfo defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [328:79] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[ValueParameterDescriptorImpl]

'call' @ [328:94] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'callElement' @ [328:99] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'dataFlowInfo' @ [329:44] ==> val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[LocalVariableDescriptor]

'getCollectedTypes' @ [329:57] ==> public abstract fun getCollectedTypes(key: DataFlowValue): Set<KotlinType> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[DeserializedSimpleFunctionDescriptor]

'createDataFlowValueForStableReceiver' @ [329:96] ==> @JvmStatic public final fun createDataFlowValueForStableReceiver(receiver: ReceiverValue): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[DeserializedSimpleFunctionDescriptor]

'receiverToExtract' @ [329:133] ==> value-parameter receiverToExtract: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[ValueParameterDescriptorImpl]

'if (possibleTypes.isNotEmpty()) CommonSupertypes.commonSupertype(possibleTypes) else null' @ [330:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType?, elseBranch: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType?

'possibleTypes' @ [330:28] ==> val possibleTypes: Set<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[LocalVariableDescriptor]

'isNotEmpty' @ [330:42] ==> @InlineOnly public inline fun <T> Collection<KotlinType>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'commonSupertype' @ [330:73] ==> @NotNull public open fun commonSupertype(@NotNull p0: (MutableCollection<(KotlinType..KotlinType?)>..Collection<(KotlinType..KotlinType?)>)): KotlinType defined in org.jetbrains.kotlin.types.CommonSupertypes[JavaMethodDescriptor]

'possibleTypes' @ [330:89] ==> val possibleTypes: Set<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[LocalVariableDescriptor]

'typeByDataFlowInfo' @ [332:20] ==> val typeByDataFlowInfo: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[LocalVariableDescriptor]

'receiverToExtract' @ [332:42] ==> value-parameter receiverToExtract: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[ValueParameterDescriptorImpl]

'type' @ [332:60] ==> public final val ImplicitReceiver.type: KotlinType[MyPropertyDescriptor]

'receiverToExtract' @ [335:24] ==> value-parameter receiverToExtract: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[ValueParameterDescriptorImpl]

'type' @ [335:43] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'builtIns' @ [336:17] ==> val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestParameterType[LocalVariableDescriptor]

'defaultParameterType' @ [336:26] ==> internal val KotlinBuiltIns.defaultParameterType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[PropertyDescriptorImpl]

