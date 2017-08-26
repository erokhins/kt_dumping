'mirrorVarName' @ [69:42] ==> public abstract val mirrorVarName: String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Parameter[PropertyDescriptorImpl]

'name' @ [69:59] ==> public abstract val name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Parameter[PropertyDescriptorImpl]

'RenameReplacement' @ [84:47] ==> public constructor RenameReplacement(parameter: Parameter) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.RenameReplacement[ClassConstructorDescriptorImpl]

'parameter' @ [84:65] ==> value-parameter parameter: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.RenameReplacement.copy[ValueParameterDescriptorImpl]

'e' @ [87:36] ==> value-parameter e: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.RenameReplacement.invoke[ValueParameterDescriptorImpl]

'parent' @ [87:38] ==> public final val KtElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'e' @ [87:69] ==> value-parameter e: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.RenameReplacement.invoke[ValueParameterDescriptorImpl]

'let' @ [87:72] ==> @InlineOnly public inline fun <T, R> KtElement.let(block: (KtElement) -> KtElement): KtElement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R> -> KtElement

'it' @ [87:78] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.RenameReplacement.invoke.<anonymous>[ValueParameterDescriptorImpl]

'getQualifiedExpressionForSelector' @ [87:81] ==> public fun KtElement.getQualifiedExpressionForSelector(): KtQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [87:120] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.RenameReplacement.invoke.<anonymous>[ValueParameterDescriptorImpl]

'unquoteIdentifier' @ [88:39] ==> @NotNull public open fun unquoteIdentifier(@NotNull p0: String): String defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'parameter' @ [88:57] ==> public open val parameter: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.RenameReplacement[PropertyDescriptorImpl]

'nameForRef' @ [88:67] ==> public val Parameter.nameForRef: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file ExtractableCodeDescriptor.kt[PropertyDescriptorImpl]

'if (e.text.startsWith('`') || !KotlinNameSuggester.isIdentifier(parameterName)) "`$parameterName`" else parameterName' @ [90:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'e' @ [90:21] ==> value-parameter e: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.RenameReplacement.invoke[ValueParameterDescriptorImpl]

'text' @ [90:23] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'startsWith' @ [90:28] ==> public fun CharSequence.startsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'!' @ [90:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'KotlinNameSuggester' @ [90:48] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'isIdentifier' @ [90:68] ==> public final fun isIdentifier(name: String?): Boolean defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'parameterName' @ [90:81] ==> val parameterName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.RenameReplacement.invoke[LocalVariableDescriptor]

'parameterName' @ [90:100] ==> val parameterName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.RenameReplacement.invoke[LocalVariableDescriptor]

'parameterName' @ [90:121] ==> val parameterName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.RenameReplacement.invoke[LocalVariableDescriptor]

'KtPsiFactory' @ [91:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'e' @ [91:39] ==> value-parameter e: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.RenameReplacement.invoke[ValueParameterDescriptorImpl]

'when {
            parameter == descriptor.receiverParameter -> psiFactory.createExpression("this")
            expressionToReplace is KtOperationReferenceExpression -> psiFactory.createOperationName(replacingName)
            else -> psiFactory.createSimpleName(replacingName)
        }' @ [92:27] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression, entry1: KtExpression, entry2: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression

'parameter' @ [93:13] ==> public open val parameter: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.RenameReplacement[PropertyDescriptorImpl]

'descriptor' @ [93:26] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.RenameReplacement.invoke[ValueParameterDescriptorImpl]

'receiverParameter' @ [93:37] ==> public final val receiverParameter: Parameter? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'psiFactory' @ [93:58] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.RenameReplacement.invoke[LocalVariableDescriptor]

'createExpression' @ [93:69] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'expressionToReplace' @ [94:13] ==> var expressionToReplace: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.RenameReplacement.invoke[LocalVariableDescriptor]

'psiFactory' @ [94:70] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.RenameReplacement.invoke[LocalVariableDescriptor]

'createOperationName' @ [94:81] ==> public final fun createOperationName(name: String): KtSimpleNameExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'replacingName' @ [94:101] ==> val replacingName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.RenameReplacement.invoke[LocalVariableDescriptor]

'psiFactory' @ [95:21] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.RenameReplacement.invoke[LocalVariableDescriptor]

'createSimpleName' @ [95:32] ==> public final fun createSimpleName(name: String): KtSimpleNameExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'replacingName' @ [95:49] ==> val replacingName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.RenameReplacement.invoke[LocalVariableDescriptor]

'expressionToReplace' @ [97:16] ==> var expressionToReplace: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.RenameReplacement.invoke[LocalVariableDescriptor]

'replaced' @ [97:36] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'replacement' @ [97:45] ==> val replacement: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.RenameReplacement.invoke[LocalVariableDescriptor]

'?:' @ [105:20] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtElement?, right: KtElement): KtElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtElement

'e' @ [105:21] ==> value-parameter e: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.WrapInWithReplacement.invoke[ValueParameterDescriptorImpl]

'getQualifiedElement' @ [105:52] ==> public fun KtSimpleNameExpression.getQualifiedElement(): KtElement defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'e' @ [105:84] ==> value-parameter e: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.WrapInWithReplacement.invoke[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [106:35] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'e' @ [106:48] ==> value-parameter e: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.WrapInWithReplacement.invoke[ValueParameterDescriptorImpl]

'createExpressionByPattern' @ [106:51] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'argumentText' @ [106:96] ==> public abstract val argumentText: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.WrapInWithReplacement[PropertyDescriptorImpl]

'call' @ [106:110] ==> val call: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.WrapInWithReplacement.invoke[LocalVariableDescriptor]

'call' @ [107:23] ==> val call: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.WrapInWithReplacement.invoke[LocalVariableDescriptor]

'replace' @ [107:28] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'replacingExpression' @ [107:36] ==> val replacingExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.WrapInWithReplacement.invoke[LocalVariableDescriptor]

'!!' @ [108:16] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KtBlockExpression?): KtBlockExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KtBlockExpression

'replace' @ [108:17] ==> val replace: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.WrapInWithReplacement.invoke[LocalVariableDescriptor]

'lambdaArguments' @ [108:46] ==> public final val KtCallExpression.lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>)[MyPropertyDescriptor]

'first' @ [108:62] ==> public fun <T> List<(KtLambdaArgument..KtLambdaArgument?)>.first(): (KtLambdaArgument..KtLambdaArgument?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtLambdaArgument..org.jetbrains.kotlin.psi.KtLambdaArgument?)

'getLambdaExpression' @ [108:70] ==> public open fun getLambdaExpression(): KtLambdaExpression defined in org.jetbrains.kotlin.psi.KtLambdaArgument[DeserializedSimpleFunctionDescriptor]

'bodyExpression' @ [108:92] ==> public final val KtLambdaExpression.bodyExpression: KtBlockExpression?[MyPropertyDescriptor]

'statements' @ [108:109] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'first' @ [108:120] ==> public fun <T> List<(KtExpression..KtExpression?)>.first(): (KtExpression..KtExpression?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'WrapInWithReplacement' @ [112:74] ==> public constructor WrapInWithReplacement() defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.WrapInWithReplacement[ClassConstructorDescriptorImpl]

'parameter' @ [114:17] ==> public open val parameter: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.WrapParameterInWithReplacement[PropertyDescriptorImpl]

'name' @ [114:27] ==> public abstract val name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Parameter[PropertyDescriptorImpl]

'WrapParameterInWithReplacement' @ [116:47] ==> public constructor WrapParameterInWithReplacement(parameter: Parameter) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.WrapParameterInWithReplacement[ClassConstructorDescriptorImpl]

'parameter' @ [116:78] ==> value-parameter parameter: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.WrapParameterInWithReplacement.copy[ValueParameterDescriptorImpl]

'WrapInWithReplacement' @ [119:69] ==> public constructor WrapInWithReplacement() defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.WrapInWithReplacement[ClassConstructorDescriptorImpl]

'IdeDescriptorRenderers' @ [121:17] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [121:40] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderClassifierName' @ [121:52] ==> public abstract fun renderClassifierName(klass: ClassifierDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [121:73] ==> public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.WrapObjectInWithReplacement[PropertyDescriptorImpl]

'AddPrefixReplacement' @ [125:47] ==> public constructor AddPrefixReplacement(parameter: Parameter) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AddPrefixReplacement[ClassConstructorDescriptorImpl]

'parameter' @ [125:68] ==> value-parameter parameter: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AddPrefixReplacement.copy[ValueParameterDescriptorImpl]

'descriptor' @ [128:13] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AddPrefixReplacement.invoke[ValueParameterDescriptorImpl]

'receiverParameter' @ [128:24] ==> public final val receiverParameter: Parameter? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'parameter' @ [128:45] ==> public open val parameter: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AddPrefixReplacement[PropertyDescriptorImpl]

'e' @ [128:63] ==> value-parameter e: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AddPrefixReplacement.invoke[ValueParameterDescriptorImpl]

'?:' @ [130:24] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtElement?, right: KtElement): KtElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtElement

'e' @ [130:25] ==> value-parameter e: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AddPrefixReplacement.invoke[ValueParameterDescriptorImpl]

'parent' @ [130:27] ==> public final val KtElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'e' @ [130:59] ==> value-parameter e: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AddPrefixReplacement.invoke[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [131:35] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'e' @ [131:48] ==> value-parameter e: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AddPrefixReplacement.invoke[ValueParameterDescriptorImpl]

'createExpressionByPattern' @ [131:51] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'parameter' @ [131:80] ==> public open val parameter: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AddPrefixReplacement[PropertyDescriptorImpl]

'nameForRef' @ [131:90] ==> public val Parameter.nameForRef: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file ExtractableCodeDescriptor.kt[PropertyDescriptorImpl]

'selector' @ [131:107] ==> val selector: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AddPrefixReplacement.invoke[LocalVariableDescriptor]

'!!' @ [132:23] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KtExpression?): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KtExpression

'selector' @ [132:24] ==> val selector: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AddPrefixReplacement.invoke[LocalVariableDescriptor]

'replace' @ [132:33] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'replacingExpression' @ [132:41] ==> val replacingExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AddPrefixReplacement.invoke[LocalVariableDescriptor]

'selectorExpression' @ [132:88] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'?:' @ [133:16] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtElement?, right: KtElement): KtElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtElement

'newExpr' @ [133:17] ==> val newExpr: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AddPrefixReplacement.invoke[LocalVariableDescriptor]

'calleeExpression' @ [133:48] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'newExpr' @ [133:68] ==> val newExpr: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AddPrefixReplacement.invoke[LocalVariableDescriptor]

'e' @ [139:24] ==> value-parameter e: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.FqNameReplacement.invoke[ValueParameterDescriptorImpl]

'parent' @ [139:26] ==> public final val KtElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'thisExpr' @ [140:13] ==> val thisExpr: KtThisExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.FqNameReplacement.invoke[LocalVariableDescriptor]

'thisExpr' @ [141:20] ==> val thisExpr: KtThisExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.FqNameReplacement.invoke[LocalVariableDescriptor]

'replaced' @ [141:29] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'KtPsiFactory' @ [141:38] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'e' @ [141:51] ==> value-parameter e: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.FqNameReplacement.invoke[ValueParameterDescriptorImpl]

'createExpression' @ [141:54] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'fqName' @ [141:71] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.FqNameReplacement[PropertyDescriptorImpl]

'asString' @ [141:78] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'getQualifiedElementSelector' @ [141:91] ==> public fun KtElement.getQualifiedElementSelector(): KtElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'e' @ [144:24] ==> value-parameter e: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.FqNameReplacement.invoke[ValueParameterDescriptorImpl]

'mainReference' @ [144:55] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'bindToFqName' @ [144:70] ==> public final fun bindToFqName(fqName: FqName, shorteningMode: KtSimpleNameReference.ShorteningMode = ...): PsiElement defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedSimpleFunctionDescriptor]

'fqName' @ [144:83] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.FqNameReplacement[PropertyDescriptorImpl]

'NO_SHORTENING' @ [144:106] ==> enum entry NO_SHORTENING defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference.ShorteningMode[FakeCallableDescriptorForObject]

'if (newExpr is KtQualifiedExpression) newExpr.selectorExpression!! else newExpr' @ [145:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtElement, elseBranch: KtElement): KtElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtElement

'newExpr' @ [145:20] ==> val newExpr: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.FqNameReplacement.invoke[LocalVariableDescriptor]

'newExpr' @ [145:54] ==> val newExpr: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.FqNameReplacement.invoke[LocalVariableDescriptor]

'selectorExpression' @ [145:62] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'newExpr' @ [145:88] ==> val newExpr: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.FqNameReplacement.invoke[LocalVariableDescriptor]

'elementsToReplace' @ [165:70] ==> public final val elementsToReplace: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue.Jump[PropertyDescriptorImpl]

'with' @ [166:46] ==> @InlineOnly public inline fun <T, R> with(receiver: KotlinBuiltIns, block: KotlinBuiltIns.() -> KotlinType): KotlinType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinBuiltIns
    <R> -> KotlinType

'builtIns' @ [166:51] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue.Jump.<init>[ValueParameterDescriptorImpl]

'if (conditional) booleanType else unitType' @ [166:63] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'conditional' @ [166:67] ==> public final val conditional: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue.Jump[PropertyDescriptorImpl]

'booleanType' @ [166:80] ==> public final val KotlinBuiltIns.booleanType: SimpleType[MyPropertyDescriptor]

'unitType' @ [166:97] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'parameter' @ [173:52] ==> public final val parameter: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue.ParameterUpdate[PropertyDescriptorImpl]

'getParameterType' @ [173:62] ==> public abstract fun getParameterType(allowSpecialClassNames: Boolean): KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Parameter[SimpleFunctionDescriptorImpl]

'singletonList' @ [180:82] ==> public open fun <T : (Any..Any?)> singletonList(p0: (KtProperty..KtProperty?)): (MutableList<(KtProperty..KtProperty?)>..List<(KtProperty..KtProperty?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtProperty..org.jetbrains.kotlin.psi.KtProperty?)

'initializedDeclaration' @ [180:96] ==> public final val initializedDeclaration: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue.Initializer[PropertyDescriptorImpl]

'outputValues' @ [185:52] ==> public final val outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer[PropertyDescriptorImpl]

'map' @ [185:65] ==> public inline fun <T, R> Iterable<OutputValue>.map(transform: (OutputValue) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputValue
    <R> -> KotlinType

'it' @ [185:71] ==> value-parameter it: OutputValue defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.<get-outputValueTypes>.<anonymous>[ValueParameterDescriptorImpl]

'valueType' @ [185:74] ==> public abstract val valueType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue[PropertyDescriptorImpl]

'getBoxingExpressionPattern' @ [194:33] ==> protected abstract fun getBoxingExpressionPattern(arguments: List<KtExpression>): String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer[SimpleFunctionDescriptorImpl]

'arguments' @ [194:60] ==> value-parameter arguments: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.getReturnExpression[ValueParameterDescriptorImpl]

'psiFactory' @ [195:16] ==> value-parameter psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.getReturnExpression[ValueParameterDescriptorImpl]

'createExpressionByPattern' @ [195:27] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'expressionPattern' @ [195:62] ==> val expressionPattern: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.getReturnExpression[LocalVariableDescriptor]

'arguments' @ [195:83] ==> value-parameter arguments: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.getReturnExpression[ValueParameterDescriptorImpl]

'toTypedArray' @ [195:93] ==> public inline fun <reified T> Collection<KtExpression>.toTypedArray(): Array<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtExpression

'when (boxedExpression) {
            is KtCallExpression -> boxedExpression
            is KtQualifiedExpression -> boxedExpression.selectorExpression as? KtCallExpression
            else -> null
        }' @ [201:39] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtCallExpression?, entry1: KtCallExpression?, entry2: KtCallExpression?): KtCallExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtCallExpression?

'boxedExpression' @ [201:45] ==> value-parameter boxedExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.extractArgumentExpressionByIndex[ValueParameterDescriptorImpl]

'boxedExpression' @ [202:36] ==> value-parameter boxedExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.extractArgumentExpressionByIndex[ValueParameterDescriptorImpl]

'boxedExpression' @ [203:41] ==> value-parameter boxedExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.extractArgumentExpressionByIndex[ValueParameterDescriptorImpl]

'selectorExpression' @ [203:57] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'call' @ [206:25] ==> val call: KtCallExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.extractArgumentExpressionByIndex[LocalVariableDescriptor]

'valueArguments' @ [206:31] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'arguments' @ [207:13] ==> val arguments: (MutableList<(KtValueArgument..KtValueArgument?)>?..List<(KtValueArgument..KtValueArgument?)>?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.extractArgumentExpressionByIndex[LocalVariableDescriptor]

'arguments' @ [207:34] ==> val arguments: (MutableList<(KtValueArgument..KtValueArgument?)>?..List<(KtValueArgument..KtValueArgument?)>?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.extractArgumentExpressionByIndex[LocalVariableDescriptor]

'size' @ [207:44] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'index' @ [207:52] ==> value-parameter index: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.extractArgumentExpressionByIndex[ValueParameterDescriptorImpl]

'arguments' @ [209:16] ==> val arguments: (MutableList<(KtValueArgument..KtValueArgument?)>?..List<(KtValueArgument..KtValueArgument?)>?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.extractArgumentExpressionByIndex[LocalVariableDescriptor]

'index' @ [209:26] ==> value-parameter index: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.extractArgumentExpressionByIndex[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [209:33] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'outputValues' @ [213:21] ==> public final val outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer[PropertyDescriptorImpl]

'indexOf' @ [213:34] ==> public abstract fun indexOf(element: OutputValue): Int defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'value' @ [213:42] ==> value-parameter value: OutputValue defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.extractExpressionByValue[ValueParameterDescriptorImpl]

'index' @ [214:13] ==> val index: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.extractExpressionByValue[LocalVariableDescriptor]

'extractExpressionByIndex' @ [216:16] ==> protected abstract fun extractExpressionByIndex(boxedExpression: KtExpression, index: Int): KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer[SimpleFunctionDescriptorImpl]

'boxedExpression' @ [216:41] ==> value-parameter boxedExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.extractExpressionByValue[ValueParameterDescriptorImpl]

'index' @ [216:58] ==> val index: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.extractExpressionByValue[LocalVariableDescriptor]

'OutputValueBoxer' @ [224:9] ==> public constructor OutputValueBoxer(outputValues: List<OutputValue>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer[ClassConstructorDescriptorImpl]

'outputValues' @ [224:26] ==> value-parameter outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple.<init>[ValueParameterDescriptorImpl]

'assert' @ [226:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'outputValues' @ [226:20] ==> value-parameter outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple.<init>[ValueParameterDescriptorImpl]

'size' @ [226:33] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'arrayOf' @ [230:37] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'getValue' @ [233:48] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'when (outputValues.size) {
                    1 -> return outputValues.first().valueType
                    2 -> module.resolveTopLevelClass(FqName("kotlin.Pair"), NoLookupLocation.FROM_IDE)!!
                    3 -> module.resolveTopLevelClass(FqName("kotlin.Triple"), NoLookupLocation.FROM_IDE)!!
                    else -> return module.builtIns.defaultReturnType
                }' @ [235:35] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ClassDescriptor, entry1: ClassDescriptor, entry2: ClassDescriptor, entry3: ClassDescriptor): ClassDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ClassDescriptor

'outputValues' @ [235:41] ==> value-parameter outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple.<init>[ValueParameterDescriptorImpl]

'size' @ [235:54] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'outputValues' @ [236:33] ==> value-parameter outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple.<init>[ValueParameterDescriptorImpl]

'first' @ [236:46] ==> public fun <T> List<OutputValue>.first(): OutputValue defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputValue

'valueType' @ [236:54] ==> public abstract val valueType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue[PropertyDescriptorImpl]

'module' @ [237:26] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple[PropertyDescriptorImpl]

'resolveTopLevelClass' @ [237:33] ==> public fun ModuleDescriptor.resolveTopLevelClass(topLevelClassFqName: FqName, location: LookupLocation): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'FqName' @ [237:54] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'FROM_IDE' @ [237:94] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'module' @ [238:26] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple[PropertyDescriptorImpl]

'resolveTopLevelClass' @ [238:33] ==> public fun ModuleDescriptor.resolveTopLevelClass(topLevelClassFqName: FqName, location: LookupLocation): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'FqName' @ [238:54] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'FROM_IDE' @ [238:96] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'module' @ [239:36] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple[PropertyDescriptorImpl]

'builtIns' @ [239:43] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'defaultReturnType' @ [239:52] ==> internal val KotlinBuiltIns.defaultReturnType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[PropertyDescriptorImpl]

'substituteParameters' @ [241:34] ==> @NotNull public open fun substituteParameters(@NotNull p0: ClassDescriptor, @NotNull p1: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'boxingClass' @ [241:55] ==> val boxingClass: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple.returnType.<anonymous>.getType[LocalVariableDescriptor]

'outputValueTypes' @ [241:68] ==> public final val outputValueTypes: List<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple[PropertyDescriptorImpl]

'getType' @ [244:13] ==> local final fun getType(): KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple.returnType.<anonymous>[SimpleFunctionDescriptorImpl]

'outputValues' @ [247:48] ==> value-parameter outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple.<init>[ValueParameterDescriptorImpl]

'size' @ [247:61] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'when (arguments.size) {
                0 -> null
                1 -> "$0"
                else -> {
                    val constructorName = DescriptorUtils.getFqName(returnType.constructor.declarationDescriptor!!).asString()
                    return arguments.indices.joinToString(prefix = "$constructorName(", separator = ", ", postfix = ")") { "\$$it" }
                }
            }' @ [250:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'arguments' @ [250:26] ==> value-parameter arguments: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple.getBoxingExpressionPattern[ValueParameterDescriptorImpl]

'size' @ [250:36] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'getFqName' @ [254:59] ==> @NotNull public open fun getFqName(@NotNull p0: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'returnType' @ [254:69] ==> public open val returnType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple[PropertyDescriptorImpl]

'constructor' @ [254:80] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [254:92] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'asString' @ [254:117] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'arguments' @ [255:28] ==> value-parameter arguments: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple.getBoxingExpressionPattern[ValueParameterDescriptorImpl]

'indices' @ [255:38] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'joinToString' @ [255:46] ==> public fun <T> Iterable<Int>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Int) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'constructorName' @ [255:70] ==> val constructorName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple.getBoxingExpressionPattern[LocalVariableDescriptor]

'it' @ [255:128] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple.getBoxingExpressionPattern.<anonymous>[ValueParameterDescriptorImpl]

'outputValues' @ [261:17] ==> public final val outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple[PropertyDescriptorImpl]

'size' @ [261:30] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'boxedExpression' @ [261:48] ==> value-parameter boxedExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple.extractExpressionByIndex[ValueParameterDescriptorImpl]

'extractArgumentExpressionByIndex' @ [262:20] ==> protected final fun extractArgumentExpressionByIndex(boxedExpression: KtExpression, index: Int): KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple[SimpleFunctionDescriptorImpl]

'boxedExpression' @ [262:53] ==> value-parameter boxedExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple.extractExpressionByIndex[ValueParameterDescriptorImpl]

'index' @ [262:70] ==> value-parameter index: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple.extractExpressionByIndex[ValueParameterDescriptorImpl]

'when (outputValues.size) {
                0 -> Collections.emptyMap()
                1 -> Collections.singletonMap(outputValues.first(), boxedText)
                else -> {
                    var i = 0
                    ContainerUtil.newMapFromKeys(outputValues.iterator()) { "$boxedText.${selectors[i++]}" }
                }
            }' @ [266:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Map<OutputValue, String>, entry1: Map<OutputValue, String>, entry2: Map<OutputValue, String>): Map<OutputValue, String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Map<OutputValue, String>

'outputValues' @ [266:26] ==> public final val outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple[PropertyDescriptorImpl]

'size' @ [266:39] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'emptyMap' @ [267:34] ==> public final fun <K : (Any..Any?), V : (Any..Any?)> emptyMap(): (MutableMap<(OutputValue..OutputValue?), (String..String?)>..Map<(OutputValue..OutputValue?), (String..String?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue..org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue?)
    <V : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'singletonMap' @ [268:34] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> singletonMap(p0: (OutputValue..OutputValue?), p1: (String..String?)): (MutableMap<(OutputValue..OutputValue?), (String..String?)>..Map<(OutputValue..OutputValue?), (String..String?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue..org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue?)
    <V : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'outputValues' @ [268:47] ==> public final val outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple[PropertyDescriptorImpl]

'first' @ [268:60] ==> public fun <T> List<OutputValue>.first(): OutputValue defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputValue

'boxedText' @ [268:69] ==> value-parameter boxedText: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple.getUnboxingExpressions[ValueParameterDescriptorImpl]

'newMapFromKeys' @ [271:35] ==> @NotNull public final fun <K : (Any..Any?), V : (Any..Any?)> newMapFromKeys(@NotNull p0: (MutableIterator<(OutputValue..OutputValue?)>..Iterator<(OutputValue..OutputValue?)>), @NotNull p1: ((OutputValue..OutputValue?)) -> (String..String?)): (MutableMap<(OutputValue..OutputValue?), (String..String?)>..Map<(OutputValue..OutputValue?), (String..String?)>) defined in com.intellij.util.containers.ContainerUtil[SamAdapterFunctionDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue..org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue?)
    <V : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'outputValues' @ [271:50] ==> public final val outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple[PropertyDescriptorImpl]

'iterator' @ [271:63] ==> public abstract fun iterator(): Iterator<OutputValue> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'boxedText' @ [271:79] ==> value-parameter boxedText: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple.getUnboxingExpressions[ValueParameterDescriptorImpl]

'selectors' @ [271:91] ==> private final val selectors: Array<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple.Companion[PropertyDescriptorImpl]

'i' @ [271:101] ==> var i: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple.getUnboxingExpressions[LocalVariableDescriptor]

'OutputValueBoxer' @ [277:52] ==> public constructor OutputValueBoxer(outputValues: List<OutputValue>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer[ClassConstructorDescriptorImpl]

'outputValues' @ [277:69] ==> value-parameter outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsList.<init>[ValueParameterDescriptorImpl]

'getValue' @ [278:48] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'assert' @ [279:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'outputValues' @ [279:20] ==> value-parameter outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsList.<init>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [279:33] ==> @InlineOnly public inline fun <T> Collection<OutputValue>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputValue

'outputValues' @ [280:28] ==> value-parameter outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsList.<init>[ValueParameterDescriptorImpl]

'first' @ [280:41] ==> public fun <T> List<OutputValue>.first(): OutputValue defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputValue

'valueType' @ [280:49] ==> public abstract val valueType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue[PropertyDescriptorImpl]

'builtIns' @ [280:59] ==> public val KotlinType.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.types.typeUtil[DeserializedPropertyDescriptor]

'substituteParameters' @ [281:23] ==> @NotNull public open fun substituteParameters(@NotNull p0: ClassDescriptor, @NotNull p1: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'builtIns' @ [282:21] ==> val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsList.returnType.<anonymous>[LocalVariableDescriptor]

'list' @ [282:30] ==> public final val KotlinBuiltIns.list: ClassDescriptor[MyPropertyDescriptor]

'singletonList' @ [283:33] ==> public open fun <T : (Any..Any?)> singletonList(p0: (KotlinType..KotlinType?)): (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'commonSupertype' @ [283:64] ==> @NotNull public open fun commonSupertype(@NotNull p0: (MutableCollection<(KotlinType..KotlinType?)>..Collection<(KotlinType..KotlinType?)>)): KotlinType defined in org.jetbrains.kotlin.types.CommonSupertypes[JavaMethodDescriptor]

'outputValues' @ [283:80] ==> value-parameter outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsList.<init>[ValueParameterDescriptorImpl]

'map' @ [283:93] ==> public inline fun <T, R> Iterable<OutputValue>.map(transform: (OutputValue) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputValue
    <R> -> KotlinType

'it' @ [283:99] ==> value-parameter it: OutputValue defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsList.returnType.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'valueType' @ [283:102] ==> public abstract val valueType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue[PropertyDescriptorImpl]

'outputValues' @ [287:48] ==> value-parameter outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsList.<init>[ValueParameterDescriptorImpl]

'size' @ [287:61] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'arguments' @ [290:17] ==> value-parameter arguments: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsList.getBoxingExpressionPattern[ValueParameterDescriptorImpl]

'isEmpty' @ [290:27] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'arguments' @ [291:20] ==> value-parameter arguments: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsList.getBoxingExpressionPattern[ValueParameterDescriptorImpl]

'indices' @ [291:30] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'joinToString' @ [291:38] ==> public fun <T> Iterable<Int>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Int) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [291:129] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsList.getBoxingExpressionPattern.<anonymous>[ValueParameterDescriptorImpl]

'extractArgumentExpressionByIndex' @ [295:20] ==> protected final fun extractArgumentExpressionByIndex(boxedExpression: KtExpression, index: Int): KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsList[SimpleFunctionDescriptorImpl]

'boxedExpression' @ [295:53] ==> value-parameter boxedExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsList.extractExpressionByIndex[ValueParameterDescriptorImpl]

'index' @ [295:70] ==> value-parameter index: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsList.extractExpressionByIndex[ValueParameterDescriptorImpl]

'newMapFromKeys' @ [300:34] ==> @NotNull public final fun <K : (Any..Any?), V : (Any..Any?)> newMapFromKeys(@NotNull p0: (MutableIterator<(OutputValue..OutputValue?)>..Iterator<(OutputValue..OutputValue?)>), @NotNull p1: ((OutputValue..OutputValue?)) -> (String..String?)): (MutableMap<(OutputValue..OutputValue?), (String..String?)>..Map<(OutputValue..OutputValue?), (String..String?)>) defined in com.intellij.util.containers.ContainerUtil[SamAdapterFunctionDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue..org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue?)
    <V : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'outputValues' @ [300:49] ==> public final val outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsList[PropertyDescriptorImpl]

'iterator' @ [300:62] ==> public abstract fun iterator(): Iterator<OutputValue> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'boxedText' @ [300:78] ==> value-parameter boxedText: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsList.getUnboxingExpressions[ValueParameterDescriptorImpl]

'i' @ [300:90] ==> var i: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsList.getUnboxingExpressions[LocalVariableDescriptor]

'invoke' @ [310:28] ==> public abstract operator fun invoke(p1: List<OutputValue>): OutputValueBoxer defined in kotlin.Function1[FunctionInvokeDescriptor]

'outputValues' @ [310:41] ==> public final val outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ControlFlow[PropertyDescriptorImpl]

'with' @ [312:48] ==> @InlineOnly public inline fun <T, R> with(receiver: List<OutputValue.ExpressionValue>, block: List<OutputValue.ExpressionValue>.() -> OutputValue.ExpressionValue?): OutputValue.ExpressionValue? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<ExpressionValue>
    <R> -> ExpressionValue?

'outputValues' @ [312:53] ==> public final val outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ControlFlow[PropertyDescriptorImpl]

'filterIsInstance' @ [312:66] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<OutputValue.ExpressionValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> ExpressionValue

'if (size > 1) throw IllegalArgumentException("Multiple expression values: ${outputValues.joinToString()}") else firstOrNull()' @ [313:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: OutputValue.ExpressionValue?, elseBranch: OutputValue.ExpressionValue?): OutputValue.ExpressionValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ExpressionValue?

'size' @ [313:13] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'IllegalArgumentException' @ [313:29] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'outputValues' @ [313:85] ==> public final val outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ControlFlow[PropertyDescriptorImpl]

'joinToString' @ [313:98] ==> public fun <T> Iterable<OutputValue>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((OutputValue) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputValue

'firstOrNull' @ [313:121] ==> public fun <T> List<OutputValue.ExpressionValue>.firstOrNull(): OutputValue.ExpressionValue? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpressionValue

'with' @ [316:34] ==> @InlineOnly public inline fun <T, R> with(receiver: List<OutputValue.Jump>, block: List<OutputValue.Jump>.() -> OutputValue.Jump?): OutputValue.Jump? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<Jump>
    <R> -> Jump?

'outputValues' @ [316:39] ==> public final val outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ControlFlow[PropertyDescriptorImpl]

'filterIsInstance' @ [316:52] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<OutputValue.Jump> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> Jump

'size' @ [317:25] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'when {
            isEmpty() ->
                null
            outputValues.size > jumpCount || jumpCount > 1 ->
                throw IllegalArgumentException("Jump values must be the only value if it's present: ${outputValues.joinToString()}")
            else ->
                first()
        }' @ [318:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: OutputValue.Jump?, entry1: OutputValue.Jump?, entry2: OutputValue.Jump?): OutputValue.Jump?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Jump?

'isEmpty' @ [319:13] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'outputValues' @ [321:13] ==> public final val outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ControlFlow[PropertyDescriptorImpl]

'size' @ [321:26] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'jumpCount' @ [321:33] ==> val jumpCount: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ControlFlow.jumpOutputValue.<anonymous>[LocalVariableDescriptor]

'jumpCount' @ [321:46] ==> val jumpCount: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ControlFlow.jumpOutputValue.<anonymous>[LocalVariableDescriptor]

'IllegalArgumentException' @ [322:23] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'outputValues' @ [322:103] ==> public final val outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ControlFlow[PropertyDescriptorImpl]

'joinToString' @ [322:116] ==> public fun <T> Iterable<OutputValue>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((OutputValue) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputValue

'first' @ [324:17] ==> public fun <T> List<OutputValue.Jump>.first(): OutputValue.Jump defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Jump

'outputValueBoxer' @ [331:26] ==> public final val outputValueBoxer: OutputValueBoxer defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ControlFlow[PropertyDescriptorImpl]

'returnType' @ [331:43] ==> public abstract val returnType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer[PropertyDescriptorImpl]

'when {
            !returnType.isNullabilityFlexible() ->
                listOf(returnType)
            returnType.nullability() != TypeNullability.FLEXIBLE ->
                listOf(returnType.approximateFlexibleTypes())
            else ->
                (returnType.unwrap() as FlexibleType).let { listOf(it.upperBound, it.lowerBound) }
        }' @ [332:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<KotlinType>, entry1: List<KotlinType>, entry2: List<KotlinType>): List<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<KotlinType>

'!' @ [333:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'returnType' @ [333:14] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.<get-possibleReturnTypes>[LocalVariableDescriptor]

'isNullabilityFlexible' @ [333:25] ==> public fun KotlinType.isNullabilityFlexible(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'listOf' @ [334:17] ==> public fun <T> listOf(element: KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'returnType' @ [334:24] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.<get-possibleReturnTypes>[LocalVariableDescriptor]

'returnType' @ [335:13] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.<get-possibleReturnTypes>[LocalVariableDescriptor]

'nullability' @ [335:24] ==> public fun KotlinType.nullability(): TypeNullability defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'FLEXIBLE' @ [335:57] ==> enum entry FLEXIBLE defined in org.jetbrains.kotlin.types.typeUtil.TypeNullability[FakeCallableDescriptorForObject]

'listOf' @ [336:17] ==> public fun <T> listOf(element: KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'returnType' @ [336:24] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.<get-possibleReturnTypes>[LocalVariableDescriptor]

'approximateFlexibleTypes' @ [336:35] ==> public fun KotlinType.approximateFlexibleTypes(preferNotNull: Boolean = ..., preferStarForRaw: Boolean = ...): KotlinType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'returnType' @ [338:18] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.<get-possibleReturnTypes>[LocalVariableDescriptor]

'unwrap' @ [338:29] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'let' @ [338:55] ==> @InlineOnly public inline fun <T, R> FlexibleType.let(block: (FlexibleType) -> List<SimpleType>): List<SimpleType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FlexibleType
    <R> -> List<SimpleType>

'listOf' @ [338:61] ==> public fun <T> listOf(vararg elements: SimpleType): List<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'it' @ [338:68] ==> value-parameter it: FlexibleType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.<get-possibleReturnTypes>.<anonymous>[ValueParameterDescriptorImpl]

'upperBound' @ [338:71] ==> public final val upperBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'it' @ [338:83] ==> value-parameter it: FlexibleType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.<get-possibleReturnTypes>.<anonymous>[ValueParameterDescriptorImpl]

'lowerBound' @ [338:86] ==> public final val lowerBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'copy' @ [343:9] ==> public final fun copy(outputValues: List<OutputValue> = ..., boxerFactory: (List<OutputValue>) -> OutputValueBoxer = ..., declarationsToCopy: List<KtDeclaration> = ...): ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ControlFlow[SimpleFunctionDescriptorImpl]

'outputValues' @ [343:29] ==> public final val outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ControlFlow[PropertyDescriptorImpl]

'filterNot' @ [343:42] ==> public inline fun <T> Iterable<OutputValue>.filterNot(predicate: (OutputValue) -> Boolean): List<OutputValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputValue

'it' @ [343:54] ==> value-parameter it: OutputValue defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.toDefault.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [343:68] ==> value-parameter it: OutputValue defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.toDefault.<anonymous>[ValueParameterDescriptorImpl]

'outputValues' @ [346:27] ==> public final val outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ControlFlow[PropertyDescriptorImpl]

'map' @ [346:40] ==> public inline fun <T, R> Iterable<OutputValue>.map(transform: (OutputValue) -> OutputValue): List<OutputValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputValue
    <R> -> OutputValue

'if (it is ParameterUpdate) ParameterUpdate(oldToNewParameters[it.parameter]!!, it.originalExpressions) else it' @ [347:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: OutputValue, elseBranch: OutputValue): OutputValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> OutputValue

'it' @ [347:13] ==> value-parameter it: OutputValue defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy.<anonymous>[ValueParameterDescriptorImpl]

'ParameterUpdate' @ [347:36] ==> public constructor ParameterUpdate(parameter: Parameter, originalExpressions: List<KtExpression>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue.ParameterUpdate[ClassConstructorDescriptorImpl]

'oldToNewParameters' @ [347:52] ==> value-parameter oldToNewParameters: Map<Parameter, Parameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy[ValueParameterDescriptorImpl]

'it' @ [347:71] ==> value-parameter it: OutputValue defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy.<anonymous>[ValueParameterDescriptorImpl]

'parameter' @ [347:74] ==> public final val parameter: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue.ParameterUpdate[PropertyDescriptorImpl]

'it' @ [347:88] ==> value-parameter it: OutputValue defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy.<anonymous>[ValueParameterDescriptorImpl]

'originalExpressions' @ [347:91] ==> public abstract val originalExpressions: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue[PropertyDescriptorImpl]

'it' @ [347:117] ==> value-parameter it: OutputValue defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy.<anonymous>[ValueParameterDescriptorImpl]

'copy' @ [349:12] ==> public final fun copy(outputValues: List<OutputValue> = ..., boxerFactory: (List<OutputValue>) -> OutputValueBoxer = ..., declarationsToCopy: List<KtDeclaration> = ...): ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ControlFlow[SimpleFunctionDescriptorImpl]

'newOutputValues' @ [349:32] ==> val newOutputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy[LocalVariableDescriptor]

'emptyList' @ [363:47] ==> public fun <T> emptyList(): List<KtKeywordToken> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtKeywordToken

'suggestedNames' @ [365:30] ==> public final val suggestedNames: List<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'firstOrNull' @ [365:45] ==> public fun <T> List<String>.firstOrNull(): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'getValue' @ [366:44] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'findDuplicates' @ [366:51] ==> public fun ExtractableCodeDescriptor.findDuplicates(): List<DuplicateInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractorUtil.kt[SimpleFunctionDescriptorImpl]

'create' @ [376:38] ==> @NotNull public open fun <K : (Any..Any?), V : (Any..Any?)> create(): MultiMap<(KtSimpleNameExpression..KtSimpleNameExpression?), (Replacement..Replacement?)> defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtSimpleNameExpression
    <V : (Any..Any?)> -> Replacement

'component1' @ [377:11] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(KtSimpleNameExpression..KtSimpleNameExpression?), (MutableCollection<(Replacement..Replacement?)>..Collection<(Replacement..Replacement?)>?)>.component1(): (KtSimpleNameExpression..KtSimpleNameExpression?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtSimpleNameExpression..org.jetbrains.kotlin.psi.KtSimpleNameExpression?)
    <V> -> (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Replacement..org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Replacement?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Replacement..org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Replacement?)>?)

'component2' @ [377:16] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(KtSimpleNameExpression..KtSimpleNameExpression?), (MutableCollection<(Replacement..Replacement?)>..Collection<(Replacement..Replacement?)>?)>.component2(): (MutableCollection<(Replacement..Replacement?)>..Collection<(Replacement..Replacement?)>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtSimpleNameExpression..org.jetbrains.kotlin.psi.KtSimpleNameExpression?)
    <V> -> (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Replacement..org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Replacement?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Replacement..org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Replacement?)>?)

'replacementMap' @ [377:33] ==> public final val replacementMap: MultiMap<KtSimpleNameExpression, Replacement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'entrySet' @ [377:48] ==> @NotNull public open fun entrySet(): (MutableSet<(MutableMap.MutableEntry<(KtSimpleNameExpression..KtSimpleNameExpression?), (MutableCollection<(Replacement..Replacement?)>..Collection<(Replacement..Replacement?)>?)>..Map.Entry<(KtSimpleNameExpression..KtSimpleNameExpression?), (MutableCollection<(Replacement..Replacement?)>..Collection<(Replacement..Replacement?)>?)>?)>..Set<(MutableMap.MutableEntry<(KtSimpleNameExpression..KtSimpleNameExpression?), (MutableCollection<(Replacement..Replacement?)>..Collection<(Replacement..Replacement?)>?)>..Map.Entry<(KtSimpleNameExpression..KtSimpleNameExpression?), (MutableCollection<(Replacement..Replacement?)>..Collection<(Replacement..Replacement?)>?)>?)>) defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'replacements' @ [378:31] ==> val replacements: (MutableCollection<(Replacement..Replacement?)>..Collection<(Replacement..Replacement?)>?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy[LocalVariableDescriptor]

'map' @ [378:44] ==> public inline fun <T, R> Iterable<(Replacement..Replacement?)>.map(transform: ((Replacement..Replacement?)) -> (Replacement..Replacement?)): List<(Replacement..Replacement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Replacement..org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Replacement?)
    <R> -> (org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Replacement..org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Replacement?)

'if (it is ParameterReplacement) {
                val parameter = it.parameter
                val newParameter = oldToNewParameters[parameter] ?: return@map it
                it.copy(newParameter)
            }
            else it' @ [379:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Replacement..Replacement?), elseBranch: (Replacement..Replacement?)): (Replacement..Replacement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Replacement..org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Replacement?)

'it' @ [379:17] ==> value-parameter it: (Replacement..Replacement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [380:33] ==> value-parameter it: (Replacement..Replacement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy.<anonymous>[ValueParameterDescriptorImpl]

'parameter' @ [380:36] ==> public abstract val parameter: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParameterReplacement[PropertyDescriptorImpl]

'oldToNewParameters' @ [381:36] ==> value-parameter oldToNewParameters: Map<Parameter, Parameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy[ValueParameterDescriptorImpl]

'parameter' @ [381:55] ==> val parameter: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy.<anonymous>[LocalVariableDescriptor]

'it' @ [381:80] ==> value-parameter it: (Replacement..Replacement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [382:17] ==> value-parameter it: (Replacement..Replacement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy.<anonymous>[ValueParameterDescriptorImpl]

'copy' @ [382:20] ==> public abstract fun copy(parameter: Parameter): ParameterReplacement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParameterReplacement[SimpleFunctionDescriptorImpl]

'newParameter' @ [382:25] ==> val newParameter: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy.<anonymous>[LocalVariableDescriptor]

'it' @ [384:18] ==> value-parameter it: (Replacement..Replacement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy.<anonymous>[ValueParameterDescriptorImpl]

'newReplacementMap' @ [386:9] ==> val newReplacementMap: MultiMap<(KtSimpleNameExpression..KtSimpleNameExpression?), (Replacement..Replacement?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy[LocalVariableDescriptor]

'putValues' @ [386:27] ==> public open fun putValues(p0: (KtSimpleNameExpression..KtSimpleNameExpression?), @NotNull p1: (MutableCollection<out (Replacement..Replacement?)>..Collection<(Replacement..Replacement?)>)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'ref' @ [386:37] ==> val ref: (KtSimpleNameExpression..KtSimpleNameExpression?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy[LocalVariableDescriptor]

'newReplacements' @ [386:42] ==> val newReplacements: List<(Replacement..Replacement?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy[LocalVariableDescriptor]

'ExtractableCodeDescriptor' @ [389:12] ==> public constructor ExtractableCodeDescriptor(extractionData: ExtractionData, originalContext: BindingContext, suggestedNames: List<String>, visibility: String, parameters: List<Parameter>, receiverParameter: Parameter?, typeParameters: List<TypeParameter>, replacementMap: MultiMap<KtSimpleNameExpression, Replacement>, controlFlow: ControlFlow, returnType: KotlinType, modifiers: List<KtKeywordToken> = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[ClassConstructorDescriptorImpl]

'extractionData' @ [390:13] ==> public final val extractionData: ExtractionData defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'originalContext' @ [391:13] ==> public final val originalContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'listOf' @ [392:13] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'newName' @ [392:20] ==> value-parameter newName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy[ValueParameterDescriptorImpl]

'newVisibility' @ [393:13] ==> value-parameter newVisibility: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy[ValueParameterDescriptorImpl]

'oldToNewParameters' @ [394:13] ==> value-parameter oldToNewParameters: Map<Parameter, Parameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy[ValueParameterDescriptorImpl]

'values' @ [394:32] ==> public abstract val values: Collection<Parameter> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'filter' @ [394:39] ==> public inline fun <T> Iterable<Parameter>.filter(predicate: (Parameter) -> Boolean): List<Parameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Parameter

'it' @ [394:48] ==> value-parameter it: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy.<anonymous>[ValueParameterDescriptorImpl]

'newReceiver' @ [394:54] ==> value-parameter newReceiver: Parameter? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy[ValueParameterDescriptorImpl]

'newReceiver' @ [395:13] ==> value-parameter newReceiver: Parameter? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy[ValueParameterDescriptorImpl]

'typeParameters' @ [396:13] ==> public final val typeParameters: List<TypeParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'newReplacementMap' @ [397:13] ==> val newReplacementMap: MultiMap<(KtSimpleNameExpression..KtSimpleNameExpression?), (Replacement..Replacement?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy[LocalVariableDescriptor]

'controlFlow' @ [398:13] ==> public final val controlFlow: ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'copy' @ [398:25] ==> public fun ControlFlow.copy(oldToNewParameters: Map<Parameter, Parameter>): ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file ExtractableCodeDescriptor.kt[SimpleFunctionDescriptorImpl]

'oldToNewParameters' @ [398:30] ==> value-parameter oldToNewParameters: Map<Parameter, Parameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy[ValueParameterDescriptorImpl]

'returnType' @ [399:13] ==> value-parameter returnType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy[ValueParameterDescriptorImpl]

'this' @ [399:27] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.copy[ReceiverParameterDescriptorImpl]

'returnType' @ [399:32] ==> public final val returnType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'modifiers' @ [400:13] ==> public final val modifiers: List<KtKeywordToken> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'' @ [404:13] ==> private constructor ExtractionTarget(targetName: String) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget[ClassConstructorDescriptorImpl]

'' @ [408:29] ==> private constructor ExtractionTarget(targetName: String) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget[ClassConstructorDescriptorImpl]

'checkSimpleControlFlow' @ [410:20] ==> public final fun checkSimpleControlFlow(descriptor: ExtractableCodeDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [410:43] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.FAKE_LAMBDALIKE_FUNCTION.isAvailable[ValueParameterDescriptorImpl]

'descriptor' @ [410:58] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.FAKE_LAMBDALIKE_FUNCTION.isAvailable[ValueParameterDescriptorImpl]

'controlFlow' @ [410:69] ==> public final val controlFlow: ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'outputValues' @ [410:81] ==> public final val outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ControlFlow[PropertyDescriptorImpl]

'isEmpty' @ [410:94] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'' @ [414:30] ==> private constructor ExtractionTarget(targetName: String) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget[ClassConstructorDescriptorImpl]

'checkSignatureAndParent' @ [416:20] ==> public final fun checkSignatureAndParent(descriptor: ExtractableCodeDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [416:44] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.PROPERTY_WITH_INITIALIZER.isAvailable[ValueParameterDescriptorImpl]

'checkSimpleControlFlow' @ [417:23] ==> public final fun checkSimpleControlFlow(descriptor: ExtractableCodeDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [417:46] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.PROPERTY_WITH_INITIALIZER.isAvailable[ValueParameterDescriptorImpl]

'checkSimpleBody' @ [418:23] ==> public final fun checkSimpleBody(descriptor: ExtractableCodeDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [418:39] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.PROPERTY_WITH_INITIALIZER.isAvailable[ValueParameterDescriptorImpl]

'checkNotTrait' @ [419:23] ==> public final fun checkNotTrait(descriptor: ExtractableCodeDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [419:37] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.PROPERTY_WITH_INITIALIZER.isAvailable[ValueParameterDescriptorImpl]

'descriptor' @ [420:23] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.PROPERTY_WITH_INITIALIZER.isAvailable[ValueParameterDescriptorImpl]

'receiverParameter' @ [420:34] ==> public final val receiverParameter: Parameter? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'' @ [424:25] ==> private constructor ExtractionTarget(targetName: String) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget[ClassConstructorDescriptorImpl]

'checkSignatureAndParent' @ [426:20] ==> public final fun checkSignatureAndParent(descriptor: ExtractableCodeDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [426:44] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.PROPERTY_WITH_GETTER.isAvailable[ValueParameterDescriptorImpl]

'' @ [430:18] ==> private constructor ExtractionTarget(targetName: String) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget[ClassConstructorDescriptorImpl]

'checkSignatureAndParent' @ [432:20] ==> public final fun checkSignatureAndParent(descriptor: ExtractableCodeDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [432:44] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.LAZY_PROPERTY.isAvailable[ValueParameterDescriptorImpl]

'checkSimpleControlFlow' @ [433:23] ==> public final fun checkSimpleControlFlow(descriptor: ExtractableCodeDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [433:46] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.LAZY_PROPERTY.isAvailable[ValueParameterDescriptorImpl]

'checkNotTrait' @ [434:23] ==> public final fun checkNotTrait(descriptor: ExtractableCodeDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [434:37] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.LAZY_PROPERTY.isAvailable[ValueParameterDescriptorImpl]

'descriptor' @ [435:23] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.LAZY_PROPERTY.isAvailable[ValueParameterDescriptorImpl]

'receiverParameter' @ [435:34] ==> public final val receiverParameter: Parameter? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'descriptor' @ [443:26] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.Companion.checkNotTrait[ValueParameterDescriptorImpl]

'extractionData' @ [443:37] ==> public final val extractionData: ExtractionData defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'targetSibling' @ [443:52] ==> public final val targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'getStrictParentOfType' @ [443:66] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDeclaration

'!' @ [444:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parent' @ [444:22] ==> val parent: KtDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.Companion.checkNotTrait[LocalVariableDescriptor]

'parent' @ [444:43] ==> val parent: KtDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.Companion.checkNotTrait[LocalVariableDescriptor]

'isInterface' @ [444:50] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [448:30] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.Companion.checkSimpleBody[ValueParameterDescriptorImpl]

'extractionData' @ [448:41] ==> public final val extractionData: ExtractionData defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'expressions' @ [448:56] ==> public final val expressions: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'singleOrNull' @ [448:68] ==> public fun <T> List<KtExpression>.singleOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'expression' @ [449:20] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.Companion.checkSimpleBody[LocalVariableDescriptor]

'expression' @ [449:42] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.Companion.checkSimpleBody[LocalVariableDescriptor]

'expression' @ [449:74] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.Companion.checkSimpleBody[LocalVariableDescriptor]

'descriptor' @ [453:31] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.Companion.checkSimpleControlFlow[ValueParameterDescriptorImpl]

'controlFlow' @ [453:42] ==> public final val controlFlow: ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'outputValues' @ [453:54] ==> public final val outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ControlFlow[PropertyDescriptorImpl]

'singleOrNull' @ [453:67] ==> public fun <T> List<OutputValue>.singleOrNull(): OutputValue? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputValue

'outputValue' @ [454:21] ==> val outputValue: OutputValue? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.Companion.checkSimpleControlFlow[LocalVariableDescriptor]

'!' @ [454:55] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'outputValue' @ [454:56] ==> val outputValue: OutputValue? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.Companion.checkSimpleControlFlow[LocalVariableDescriptor]

'callSiteReturn' @ [454:68] ==> public final val callSiteReturn: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue.ExpressionValue[PropertyDescriptorImpl]

'outputValue' @ [454:87] ==> val outputValue: OutputValue? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.Companion.checkSimpleControlFlow[LocalVariableDescriptor]

'!' @ [458:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [458:18] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.Companion.checkSignatureAndParent[ValueParameterDescriptorImpl]

'parameters' @ [458:29] ==> public final val parameters: List<Parameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'isEmpty' @ [458:40] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [459:17] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.Companion.checkSignatureAndParent[ValueParameterDescriptorImpl]

'returnType' @ [459:28] ==> public final val returnType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'isUnit' @ [459:39] ==> public fun KotlinType.isUnit(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [461:26] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.Companion.checkSignatureAndParent[ValueParameterDescriptorImpl]

'extractionData' @ [461:37] ==> public final val extractionData: ExtractionData defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'targetSibling' @ [461:52] ==> public final val targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'parent' @ [461:66] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [462:21] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.Companion.checkSignatureAndParent[LocalVariableDescriptor]

'parent' @ [462:41] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget.Companion.checkSignatureAndParent[LocalVariableDescriptor]

'listOf' @ [467:47] ==> public fun <T> listOf(vararg elements: ExtractionTarget): List<ExtractionTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtractionTarget

'PROPERTY_WITH_INITIALIZER' @ [467:71] ==> enum entry PROPERTY_WITH_INITIALIZER defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget[FakeCallableDescriptorForObject]

'PROPERTY_WITH_GETTER' @ [468:71] ==> enum entry PROPERTY_WITH_GETTER defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget[FakeCallableDescriptorForObject]

'LAZY_PROPERTY' @ [469:71] ==> enum entry LAZY_PROPERTY defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget[FakeCallableDescriptorForObject]

'ExtractionTarget' @ [473:40] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget[FakeCallableDescriptorForObject]

'FUNCTION' @ [473:57] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget[FakeCallableDescriptorForObject]

'JvmField' @ [479:9] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'ExtractionGeneratorOptions' @ [479:33] ==> public constructor ExtractionGeneratorOptions(inTempFile: Boolean = ..., target: ExtractionTarget = ..., dummyName: String? = ..., allowExpressionBody: Boolean = ..., delayInitialOccurrenceReplacement: Boolean = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionGeneratorOptions[ClassConstructorDescriptorImpl]

'unmarkReferencesInside' @ [493:30] ==> public fun unmarkReferencesInside(root: PsiElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file ExtractionData.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [493:53] ==> public final val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionResult[PropertyDescriptorImpl]

'additionalInfo' @ [523:13] ==> public final var additionalInfo: List<String>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[PropertyDescriptorImpl]

'info' @ [523:30] ==> value-parameter info: List<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage.addAdditionalInfo[ValueParameterDescriptorImpl]

'this' @ [524:20] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[LazyClassReceiverParameterDescriptor]

'message' @ [528:51] ==> @NotNull public open fun message(@NonNls @PropertyKey key: (String..String?), vararg params: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringBundle[JavaMethodDescriptor]

'when (this) {
                        NO_EXPRESSION -> "cannot.refactor.no.expression"
                        NO_CONTAINER -> "cannot.refactor.no.container"
                        SYNTAX_ERRORS -> "cannot.refactor.syntax.errors"
                        SUPER_CALL -> "cannot.extract.super.call"
                        DENOTABLE_TYPES -> "parameter.types.are.not.denotable"
                        ERROR_TYPES -> "error.types.in.generated.function"
                        MULTIPLE_OUTPUT -> "selected.code.fragment.has.multiple.output.values"
                        OUTPUT_AND_EXIT_POINT -> "selected.code.fragment.has.output.values.and.exit.points"
                        MULTIPLE_EXIT_POINTS -> "selected.code.fragment.has.multiple.exit.points"
                        DECLARATIONS_ARE_USED_OUTSIDE -> "declarations.are.used.outside.of.selected.code.fragment"
                        DECLARATIONS_OUT_OF_SCOPE -> "declarations.will.move.out.of.scope"
                    }' @ [529:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String, entry4: String, entry5: String, entry6: String, entry7: String, entry8: String, entry9: String, entry10: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'this' @ [529:27] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[LazyClassReceiverParameterDescriptor]

'NO_EXPRESSION' @ [530:25] ==> enum entry NO_EXPRESSION defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[FakeCallableDescriptorForObject]

'NO_CONTAINER' @ [531:25] ==> enum entry NO_CONTAINER defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[FakeCallableDescriptorForObject]

'SYNTAX_ERRORS' @ [532:25] ==> enum entry SYNTAX_ERRORS defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[FakeCallableDescriptorForObject]

'SUPER_CALL' @ [533:25] ==> enum entry SUPER_CALL defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[FakeCallableDescriptorForObject]

'DENOTABLE_TYPES' @ [534:25] ==> enum entry DENOTABLE_TYPES defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[FakeCallableDescriptorForObject]

'ERROR_TYPES' @ [535:25] ==> enum entry ERROR_TYPES defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[FakeCallableDescriptorForObject]

'MULTIPLE_OUTPUT' @ [536:25] ==> enum entry MULTIPLE_OUTPUT defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[FakeCallableDescriptorForObject]

'OUTPUT_AND_EXIT_POINT' @ [537:25] ==> enum entry OUTPUT_AND_EXIT_POINT defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[FakeCallableDescriptorForObject]

'MULTIPLE_EXIT_POINTS' @ [538:25] ==> enum entry MULTIPLE_EXIT_POINTS defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[FakeCallableDescriptorForObject]

'DECLARATIONS_ARE_USED_OUTSIDE' @ [539:25] ==> enum entry DECLARATIONS_ARE_USED_OUTSIDE defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[FakeCallableDescriptorForObject]

'DECLARATIONS_OUT_OF_SCOPE' @ [540:25] ==> enum entry DECLARATIONS_OUT_OF_SCOPE defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[FakeCallableDescriptorForObject]

'additionalInfo' @ [544:20] ==> public final var additionalInfo: List<String>? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[PropertyDescriptorImpl]

'let' @ [544:36] ==> @InlineOnly public inline fun <T, R> List<String>.let(block: (List<String>) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<String>
    <R> -> String

'message' @ [544:44] ==> val message: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage.renderMessage[LocalVariableDescriptor]

'it' @ [544:57] ==> value-parameter it: List<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage.renderMessage.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [544:60] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'htmlEmphasize' @ [544:92] ==> @NotNull @Contract public open fun htmlEmphasize(@NotNull p0: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'it' @ [544:106] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage.renderMessage.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [544:119] ==> val message: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage.renderMessage[LocalVariableDescriptor]

