'KotlinQuickFixAction<KtCallableDeclaration>' @ [54:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtCallableDeclaration) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtCallableDeclaration

'element' @ [54:49] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.<init>[ValueParameterDescriptorImpl]

'containsErrorType' @ [58:48] ==> public open fun containsErrorType(@Nullable p0: KotlinType?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'type' @ [58:66] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.<init>[ValueParameterDescriptorImpl]

'IdeDescriptorRenderers' @ [59:36] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [59:59] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [59:92] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [59:103] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.<init>[ValueParameterDescriptorImpl]

'IdeDescriptorRenderers' @ [60:34] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [60:57] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [60:69] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [60:80] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.<init>[ValueParameterDescriptorImpl]

'type' @ [61:30] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.<init>[ValueParameterDescriptorImpl]

'isUnit' @ [61:35] ==> public fun KotlinType.isUnit(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'changeFunctionLiteralReturnTypeFix' @ [64:9] ==> private final val changeFunctionLiteralReturnTypeFix: ChangeFunctionLiteralReturnTypeFix? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[PropertyDescriptorImpl]

'if (element is KtFunctionLiteral) {
            val functionLiteralExpression = PsiTreeUtil.getParentOfType(element, KtLambdaExpression::class.java) ?: error("FunctionLiteral outside any FunctionLiteralExpression: " + element.getElementTextWithContext())
            ChangeFunctionLiteralReturnTypeFix(functionLiteralExpression, type)
        }
        else {
            null
        }' @ [64:46] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ChangeFunctionLiteralReturnTypeFix?, elseBranch: ChangeFunctionLiteralReturnTypeFix?): ChangeFunctionLiteralReturnTypeFix?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ChangeFunctionLiteralReturnTypeFix?

'element' @ [64:50] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.<init>[ValueParameterDescriptorImpl]

'?:' @ [65:45] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtLambdaExpression?, right: KtLambdaExpression): KtLambdaExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtLambdaExpression

'getParentOfType' @ [65:57] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtLambdaExpression..KtLambdaExpression?)>): KtLambdaExpression? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtLambdaExpression

'element' @ [65:73] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.<init>[ValueParameterDescriptorImpl]

'KtLambdaExpression' @ [65:82] ==> public constructor KtLambdaExpression(p0: (CharSequence..CharSequence?)) defined in org.jetbrains.kotlin.psi.KtLambdaExpression[JavaClassConstructorDescriptor]

'java' @ [65:108] ==> public val <T> KClass<KtLambdaExpression>.java: Class<KtLambdaExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtLambdaExpression

'error' @ [65:117] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'+' @ [65:123] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'element' @ [65:183] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.<init>[ValueParameterDescriptorImpl]

'getElementTextWithContext' @ [65:191] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'ChangeFunctionLiteralReturnTypeFix' @ [66:13] ==> public constructor ChangeFunctionLiteralReturnTypeFix(functionLiteralExpression: KtLambdaExpression, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralReturnTypeFix[ClassConstructorDescriptorImpl]

'functionLiteralExpression' @ [66:48] ==> val functionLiteralExpression: KtLambdaExpression defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.<init>[LocalVariableDescriptor]

'type' @ [66:75] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.<init>[ValueParameterDescriptorImpl]

'element' @ [74:23] ==> protected final val element: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[PropertyDescriptorImpl]

'element' @ [75:20] ==> val element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.functionPresentation[LocalVariableDescriptor]

'name' @ [75:28] ==> public final val KtCallableDeclaration.name: String?[MyPropertyDescriptor]

'if (name != null) {
            val container = element.resolveToDescriptor().containingDeclaration as? ClassDescriptor
            val containerName = container?.name?.takeUnless { it.isSpecial }?.asString()
            val fullName = if (containerName != null) "'$containerName.$name'" else "'$name'"
            if (element is KtParameter) {
                return "property $fullName"
            }
            return "function $fullName"
        }
        else {
            return null
        }' @ [76:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'name' @ [76:13] ==> val name: String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.functionPresentation[LocalVariableDescriptor]

'element' @ [77:29] ==> val element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.functionPresentation[LocalVariableDescriptor]

'resolveToDescriptor' @ [77:37] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'containingDeclaration' @ [77:59] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'container' @ [78:33] ==> val container: ClassDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.functionPresentation[LocalVariableDescriptor]

'name' @ [78:44] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'takeUnless' @ [78:50] ==> @InlineOnly @SinceKotlin public inline fun <T> Name.takeUnless(predicate: (Name) -> Boolean): Name? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'it' @ [78:63] ==> value-parameter it: Name defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.functionPresentation.<anonymous>[ValueParameterDescriptorImpl]

'isSpecial' @ [78:66] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'asString' @ [78:79] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'if (containerName != null) "'$containerName.$name'" else "'$name'"' @ [79:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'containerName' @ [79:32] ==> val containerName: String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.functionPresentation[LocalVariableDescriptor]

'containerName' @ [79:58] ==> val containerName: String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.functionPresentation[LocalVariableDescriptor]

'name' @ [79:73] ==> val name: String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.functionPresentation[LocalVariableDescriptor]

'name' @ [79:88] ==> val name: String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.functionPresentation[LocalVariableDescriptor]

'element' @ [80:17] ==> val element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.functionPresentation[LocalVariableDescriptor]

'fullName' @ [81:35] ==> val fullName: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.functionPresentation[LocalVariableDescriptor]

'fullName' @ [83:31] ==> val fullName: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.functionPresentation[LocalVariableDescriptor]

'ChangeCallableReturnTypeFix' @ [90:59] ==> public constructor ChangeCallableReturnTypeFix(element: KtCallableDeclaration, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[ClassConstructorDescriptorImpl]

'element' @ [90:87] ==> value-parameter element: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.OnType.<init>[ValueParameterDescriptorImpl]

'type' @ [90:96] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.OnType.<init>[ValueParameterDescriptorImpl]

'ChangeCallableReturnTypeFix' @ [94:65] ==> public constructor ChangeCallableReturnTypeFix(element: KtCallableDeclaration, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[ClassConstructorDescriptorImpl]

'element' @ [94:93] ==> value-parameter element: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ForEnclosing.<init>[ValueParameterDescriptorImpl]

'type' @ [94:102] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ForEnclosing.<init>[ValueParameterDescriptorImpl]

'super' @ [96:32] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ForEnclosing[LazyClassReceiverParameterDescriptor]

'functionPresentation' @ [96:38] ==> public open fun functionPresentation(): String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[SimpleFunctionDescriptorImpl]

'presentation' @ [97:32] ==> val presentation: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ForEnclosing.functionPresentation[LocalVariableDescriptor]

'ChangeCallableReturnTypeFix' @ [101:73] ==> public constructor ChangeCallableReturnTypeFix(element: KtCallableDeclaration, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[ClassConstructorDescriptorImpl]

'element' @ [101:101] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ForCalled.<init>[ValueParameterDescriptorImpl]

'type' @ [101:110] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ForCalled.<init>[ValueParameterDescriptorImpl]

'super' @ [103:32] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ForCalled[LazyClassReceiverParameterDescriptor]

'functionPresentation' @ [103:38] ==> public open fun functionPresentation(): String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[SimpleFunctionDescriptorImpl]

'if (element is KtParameter) "accessed $presentation" else "called $presentation"' @ [104:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'element' @ [104:24] ==> protected final val element: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ForCalled[PropertyDescriptorImpl]

'presentation' @ [104:59] ==> val presentation: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ForCalled.functionPresentation[LocalVariableDescriptor]

'presentation' @ [104:87] ==> val presentation: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ForCalled.functionPresentation[LocalVariableDescriptor]

'ChangeCallableReturnTypeFix' @ [108:66] ==> public constructor ChangeCallableReturnTypeFix(element: KtCallableDeclaration, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[ClassConstructorDescriptorImpl]

'element' @ [108:94] ==> value-parameter element: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ForOverridden.<init>[ValueParameterDescriptorImpl]

'type' @ [108:103] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ForOverridden.<init>[ValueParameterDescriptorImpl]

'super' @ [110:32] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ForOverridden[LazyClassReceiverParameterDescriptor]

'functionPresentation' @ [110:38] ==> public open fun functionPresentation(): String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[SimpleFunctionDescriptorImpl]

'presentation' @ [111:27] ==> val presentation: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ForOverridden.functionPresentation[LocalVariableDescriptor]

'element' @ [116:23] ==> protected final val element: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[PropertyDescriptorImpl]

'changeFunctionLiteralReturnTypeFix' @ [118:13] ==> private final val changeFunctionLiteralReturnTypeFix: ChangeFunctionLiteralReturnTypeFix? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[PropertyDescriptorImpl]

'changeFunctionLiteralReturnTypeFix' @ [119:20] ==> private final val changeFunctionLiteralReturnTypeFix: ChangeFunctionLiteralReturnTypeFix? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[PropertyDescriptorImpl]

'text' @ [119:55] ==> public final val ChangeFunctionLiteralReturnTypeFix.text: String[MyPropertyDescriptor]

'functionPresentation' @ [122:36] ==> public open fun functionPresentation(): String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[SimpleFunctionDescriptorImpl]

'isUnitType' @ [124:13] ==> private final val isUnitType: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[PropertyDescriptorImpl]

'element' @ [124:27] ==> val element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.getText[LocalVariableDescriptor]

'element' @ [124:52] ==> val element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.getText[LocalVariableDescriptor]

'hasBlockBody' @ [124:60] ==> public abstract fun hasBlockBody(): Boolean defined in org.jetbrains.kotlin.psi.KtFunction[JavaMethodDescriptor]

'if (functionPresentation == null)
                "Remove explicitly specified return type"
            else
                "Remove explicitly specified return type of $functionPresentation"' @ [125:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'functionPresentation' @ [125:24] ==> val functionPresentation: String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.getText[LocalVariableDescriptor]

'functionPresentation' @ [128:62] ==> val functionPresentation: String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.getText[LocalVariableDescriptor]

'if (element is KtFunction) "return type" else "type"' @ [131:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'element' @ [131:28] ==> val element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.getText[LocalVariableDescriptor]

'if (functionPresentation == null)
            "Change $typeName to '$typePresentation'"
        else
            "Change $typeName of $functionPresentation to '$typePresentation'"' @ [133:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'functionPresentation' @ [133:20] ==> val functionPresentation: String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.getText[LocalVariableDescriptor]

'typeName' @ [134:22] ==> val typeName: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.getText[LocalVariableDescriptor]

'typePresentation' @ [134:36] ==> private final val typePresentation: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[PropertyDescriptorImpl]

'typeName' @ [136:22] ==> val typeName: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.getText[LocalVariableDescriptor]

'functionPresentation' @ [136:35] ==> val functionPresentation: String? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.getText[LocalVariableDescriptor]

'typePresentation' @ [136:61] ==> private final val typePresentation: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[PropertyDescriptorImpl]

'message' @ [139:49] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'super' @ [142:16] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [142:22] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[SimpleFunctionDescriptorImpl]

'project' @ [142:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [142:43] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [142:51] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.isAvailable[ValueParameterDescriptorImpl]

'!' @ [143:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'typeContainsError' @ [143:17] ==> private final val typeContainsError: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[PropertyDescriptorImpl]

'element' @ [144:16] ==> protected final val element: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[PropertyDescriptorImpl]

'element' @ [148:23] ==> protected final val element: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[PropertyDescriptorImpl]

'if (changeFunctionLiteralReturnTypeFix != null) {
            changeFunctionLiteralReturnTypeFix.invoke(project, editor!!, file)
        }
        else {
            if (!(isUnitType && element is KtFunction && element.hasBlockBody())) {
                var newTypeRef = KtPsiFactory(project).createType(typeSourceCode)
                newTypeRef = element.setTypeReference(newTypeRef)!!
                ShortenReferences.DEFAULT.process(newTypeRef)
            }
            else {
                element.typeReference = null
            }
        }' @ [150:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'changeFunctionLiteralReturnTypeFix' @ [150:13] ==> private final val changeFunctionLiteralReturnTypeFix: ChangeFunctionLiteralReturnTypeFix? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[PropertyDescriptorImpl]

'changeFunctionLiteralReturnTypeFix' @ [151:13] ==> private final val changeFunctionLiteralReturnTypeFix: ChangeFunctionLiteralReturnTypeFix? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[PropertyDescriptorImpl]

'invoke' @ [151:48] ==> public final fun invoke(project: Project, editor: Editor?, file: PsiFile): Unit defined in org.jetbrains.kotlin.idea.quickfix.ChangeFunctionLiteralReturnTypeFix[SimpleFunctionDescriptorImpl]

'project' @ [151:55] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.invoke[ValueParameterDescriptorImpl]

'editor' @ [151:64] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.invoke[ValueParameterDescriptorImpl]

'file' @ [151:74] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.invoke[ValueParameterDescriptorImpl]

'if (!(isUnitType && element is KtFunction && element.hasBlockBody())) {
                var newTypeRef = KtPsiFactory(project).createType(typeSourceCode)
                newTypeRef = element.setTypeReference(newTypeRef)!!
                ShortenReferences.DEFAULT.process(newTypeRef)
            }
            else {
                element.typeReference = null
            }' @ [154:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'!' @ [154:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUnitType' @ [154:19] ==> private final val isUnitType: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[PropertyDescriptorImpl]

'element' @ [154:33] ==> val element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.invoke[LocalVariableDescriptor]

'element' @ [154:58] ==> val element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.invoke[LocalVariableDescriptor]

'hasBlockBody' @ [154:66] ==> public abstract fun hasBlockBody(): Boolean defined in org.jetbrains.kotlin.psi.KtFunction[JavaMethodDescriptor]

'KtPsiFactory' @ [155:34] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [155:47] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.invoke[ValueParameterDescriptorImpl]

'createType' @ [155:56] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'typeSourceCode' @ [155:67] ==> private final val typeSourceCode: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[PropertyDescriptorImpl]

'newTypeRef' @ [156:17] ==> var newTypeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.invoke[LocalVariableDescriptor]

'element' @ [156:30] ==> val element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.invoke[LocalVariableDescriptor]

'setTypeReference' @ [156:38] ==> @Nullable public abstract fun setTypeReference(@Nullable p0: KtTypeReference?): KtTypeReference? defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'newTypeRef' @ [156:55] ==> var newTypeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.invoke[LocalVariableDescriptor]

'ShortenReferences' @ [157:17] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [157:35] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [157:43] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'newTypeRef' @ [157:51] ==> var newTypeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.invoke[LocalVariableDescriptor]

'element' @ [160:17] ==> val element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.invoke[LocalVariableDescriptor]

'typeReference' @ [160:25] ==> public final var KtFunction.typeReference: KtTypeReference?[MyPropertyDescriptor]

'KotlinSingleIntentionActionFactory' @ [165:57] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'getDestructuringDeclarationEntryThatTypeMismatchComponentFunction' @ [167:25] ==> public final fun getDestructuringDeclarationEntryThatTypeMismatchComponentFunction(diagnostic: Diagnostic): KtDestructuringDeclarationEntry defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.Companion[SimpleFunctionDescriptorImpl]

'diagnostic' @ [167:91] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ComponentFunctionReturnTypeMismatchFactory.createAction[ValueParameterDescriptorImpl]

'entry' @ [168:27] ==> val entry: KtDestructuringDeclarationEntry defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ComponentFunctionReturnTypeMismatchFactory.createAction[LocalVariableDescriptor]

'analyze' @ [168:33] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [168:57] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'context' @ [169:32] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ComponentFunctionReturnTypeMismatchFactory.createAction[LocalVariableDescriptor]

'get' @ [169:40] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..ReadOnlySlice<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?), p1: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)): ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtDestructuringDeclarationEntry
    <V : (Any..Any?)> -> ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>

'COMPONENT_RESOLVED_CALL' @ [169:59] ==> public final val COMPONENT_RESOLVED_CALL: (WritableSlice<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'entry' @ [169:84] ==> val entry: KtDestructuringDeclarationEntry defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ComponentFunctionReturnTypeMismatchFactory.createAction[LocalVariableDescriptor]

'DescriptorToSourceUtils' @ [171:21] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [171:45] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [171:69] ==> val resolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ComponentFunctionReturnTypeMismatchFactory.createAction[LocalVariableDescriptor]

'candidateDescriptor' @ [171:82] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>.candidateDescriptor: (FunctionDescriptor..FunctionDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'context' @ [173:32] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ComponentFunctionReturnTypeMismatchFactory.createAction[LocalVariableDescriptor]

'TYPE' @ [173:55] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'entry' @ [173:61] ==> val entry: KtDestructuringDeclarationEntry defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ComponentFunctionReturnTypeMismatchFactory.createAction[LocalVariableDescriptor]

'typeReference' @ [173:67] ==> public final var KtDestructuringDeclarationEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'ChangeCallableReturnTypeFix' @ [174:20] ==> public companion object defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[FakeCallableDescriptorForObject]

'ForCalled' @ [174:48] ==> public constructor ForCalled(element: KtCallableDeclaration, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ForCalled[ClassConstructorDescriptorImpl]

'componentFunction' @ [174:58] ==> val componentFunction: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ComponentFunctionReturnTypeMismatchFactory.createAction[LocalVariableDescriptor]

'expectedType' @ [174:77] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ComponentFunctionReturnTypeMismatchFactory.createAction[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [178:49] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'?:' @ [180:30] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression

'getParentElementOfType' @ [180:43] ==> @Nullable public open fun <T : (PsiElement..PsiElement?)> getParentElementOfType(p0: (Diagnostic..Diagnostic?), p1: (Class<(KtExpression..KtExpression?)>..Class<(KtExpression..KtExpression?)>?)): KtExpression? defined in org.jetbrains.kotlin.idea.core.quickfix.QuickFixUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtExpression

'diagnostic' @ [180:66] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.HasNextFunctionTypeMismatchFactory.createAction[ValueParameterDescriptorImpl]

'java' @ [180:98] ==> public val <T> KClass<KtExpression>.java: Class<KtExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtExpression

'error' @ [181:33] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'expression' @ [182:27] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.HasNextFunctionTypeMismatchFactory.createAction[LocalVariableDescriptor]

'analyze' @ [182:38] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [182:62] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'context' @ [183:32] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.HasNextFunctionTypeMismatchFactory.createAction[LocalVariableDescriptor]

'LOOP_RANGE_HAS_NEXT_RESOLVED_CALL' @ [183:55] ==> public final val LOOP_RANGE_HAS_NEXT_RESOLVED_CALL: (WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [183:90] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.HasNextFunctionTypeMismatchFactory.createAction[LocalVariableDescriptor]

'resolvedCall' @ [184:37] ==> val resolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.HasNextFunctionTypeMismatchFactory.createAction[LocalVariableDescriptor]

'candidateDescriptor' @ [184:50] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>.candidateDescriptor: (FunctionDescriptor..FunctionDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'DescriptorToSourceUtils' @ [185:35] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [185:59] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'hasNextDescriptor' @ [185:83] ==> val hasNextDescriptor: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.HasNextFunctionTypeMismatchFactory.createAction[LocalVariableDescriptor]

'ChangeCallableReturnTypeFix' @ [186:20] ==> public companion object defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[FakeCallableDescriptorForObject]

'ForCalled' @ [186:48] ==> public constructor ForCalled(element: KtCallableDeclaration, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ForCalled[ClassConstructorDescriptorImpl]

'hasNextFunction' @ [186:58] ==> val hasNextFunction: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.HasNextFunctionTypeMismatchFactory.createAction[LocalVariableDescriptor]

'hasNextDescriptor' @ [186:75] ==> val hasNextDescriptor: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.HasNextFunctionTypeMismatchFactory.createAction[LocalVariableDescriptor]

'builtIns' @ [186:93] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'booleanType' @ [186:102] ==> public final val KotlinBuiltIns.booleanType: SimpleType[MyPropertyDescriptor]

'KotlinSingleIntentionActionFactory' @ [190:43] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'?:' @ [192:30] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtBinaryExpression?, right: KtBinaryExpression): KtBinaryExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtBinaryExpression

'getParentElementOfType' @ [192:43] ==> @Nullable public open fun <T : (PsiElement..PsiElement?)> getParentElementOfType(p0: (Diagnostic..Diagnostic?), p1: (Class<(KtBinaryExpression..KtBinaryExpression?)>..Class<(KtBinaryExpression..KtBinaryExpression?)>?)): KtBinaryExpression? defined in org.jetbrains.kotlin.idea.core.quickfix.QuickFixUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtBinaryExpression

'diagnostic' @ [192:66] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.CompareToTypeMismatchFactory.createAction[ValueParameterDescriptorImpl]

'KtBinaryExpression' @ [192:78] ==> public constructor KtBinaryExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtBinaryExpression[JavaClassConstructorDescriptor]

'java' @ [192:104] ==> public val <T> KClass<KtBinaryExpression>.java: Class<KtBinaryExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtBinaryExpression

'error' @ [192:113] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'expression' @ [193:27] ==> val expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.CompareToTypeMismatchFactory.createAction[LocalVariableDescriptor]

'analyze' @ [193:38] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [193:62] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'expression' @ [194:32] ==> val expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.CompareToTypeMismatchFactory.createAction[LocalVariableDescriptor]

'getResolvedCall' @ [194:43] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [194:59] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.CompareToTypeMismatchFactory.createAction[LocalVariableDescriptor]

'resolvedCall' @ [195:39] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.CompareToTypeMismatchFactory.createAction[LocalVariableDescriptor]

'candidateDescriptor' @ [195:52] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.candidateDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'DescriptorToSourceUtils' @ [196:29] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [196:53] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'compareToDescriptor' @ [196:77] ==> val compareToDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.CompareToTypeMismatchFactory.createAction[LocalVariableDescriptor]

'ChangeCallableReturnTypeFix' @ [197:20] ==> public companion object defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[FakeCallableDescriptorForObject]

'ForCalled' @ [197:48] ==> public constructor ForCalled(element: KtCallableDeclaration, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ForCalled[ClassConstructorDescriptorImpl]

'compareTo' @ [197:58] ==> val compareTo: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.CompareToTypeMismatchFactory.createAction[LocalVariableDescriptor]

'compareToDescriptor' @ [197:69] ==> val compareToDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.CompareToTypeMismatchFactory.createAction[LocalVariableDescriptor]

'builtIns' @ [197:89] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'intType' @ [197:98] ==> public final val KotlinBuiltIns.intType: SimpleType[MyPropertyDescriptor]

'KotlinIntentionActionsFactory' @ [201:50] ==> public constructor KotlinIntentionActionsFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionsFactory[DeserializedClassConstructorDescriptor]

'?:' @ [203:28] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtFunction?, right: KtFunction): KtFunction[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtFunction

'getParentElementOfType' @ [203:41] ==> @Nullable public open fun <T : (PsiElement..PsiElement?)> getParentElementOfType(p0: (Diagnostic..Diagnostic?), p1: (Class<(KtFunction..KtFunction?)>..Class<(KtFunction..KtFunction?)>?)): KtFunction? defined in org.jetbrains.kotlin.idea.core.quickfix.QuickFixUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtFunction

'diagnostic' @ [203:64] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ReturnTypeMismatchOnOverrideFactory.doCreateActions[ValueParameterDescriptorImpl]

'java' @ [203:94] ==> public val <T> KClass<KtFunction>.java: Class<KtFunction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtFunction

'emptyList' @ [203:110] ==> public fun <T> emptyList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'LinkedList' @ [205:27] ==> public constructor LinkedList<E : (Any..Any?)>() defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IntentionAction

'function' @ [207:30] ==> val function: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'resolveToDescriptorIfAny' @ [207:39] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [207:80] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'emptyList' @ [207:119] ==> public fun <T> emptyList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'findLowerBoundOfOverriddenCallablesReturnTypes' @ [209:51] ==> @Nullable public open fun findLowerBoundOfOverriddenCallablesReturnTypes(@NotNull p0: CallableDescriptor): KotlinType? defined in org.jetbrains.kotlin.idea.core.quickfix.QuickFixUtil[JavaMethodDescriptor]

'descriptor' @ [209:98] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'matchingReturnType' @ [210:17] ==> val matchingReturnType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'actions' @ [211:17] ==> val actions: LinkedList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'add' @ [211:25] ==> public open fun add(element: IntentionAction): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'ChangeCallableReturnTypeFix' @ [211:29] ==> public companion object defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[FakeCallableDescriptorForObject]

'OnType' @ [211:57] ==> public constructor OnType(element: KtFunction, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.OnType[ClassConstructorDescriptorImpl]

'function' @ [211:64] ==> val function: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'matchingReturnType' @ [211:74] ==> val matchingReturnType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'descriptor' @ [214:32] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'returnType' @ [214:43] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'actions' @ [214:64] ==> val actions: LinkedList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'LinkedList' @ [216:50] ==> public constructor LinkedList<E : (Any..Any?)>() defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FunctionDescriptor

'descriptor' @ [217:40] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'overriddenDescriptors' @ [217:51] ==> public final var FunctionDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'overriddenFunction' @ [218:46] ==> val overriddenFunction: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'returnType' @ [218:65] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'!' @ [219:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'DEFAULT' @ [219:40] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [219:48] ==> public abstract fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'functionType' @ [219:60] ==> val functionType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'overriddenFunctionType' @ [219:74] ==> val overriddenFunctionType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'overriddenMismatchingFunctions' @ [220:21] ==> val overriddenMismatchingFunctions: LinkedList<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'add' @ [220:52] ==> public open fun add(element: FunctionDescriptor): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'overriddenFunction' @ [220:56] ==> val overriddenFunction: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'overriddenMismatchingFunctions' @ [224:17] ==> val overriddenMismatchingFunctions: LinkedList<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'size' @ [224:48] ==> public open val size: Int defined in java.util.LinkedList[JavaPropertyDescriptor]

'DescriptorToSourceUtils' @ [225:42] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [225:66] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'overriddenMismatchingFunctions' @ [225:90] ==> val overriddenMismatchingFunctions: LinkedList<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'overriddenFunction' @ [226:21] ==> val overriddenFunction: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'actions' @ [227:21] ==> val actions: LinkedList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'add' @ [227:29] ==> public open fun add(element: IntentionAction): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'ChangeCallableReturnTypeFix' @ [227:33] ==> public companion object defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[FakeCallableDescriptorForObject]

'ForOverridden' @ [227:61] ==> public constructor ForOverridden(element: KtFunction, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ForOverridden[ClassConstructorDescriptorImpl]

'overriddenFunction' @ [227:75] ==> val overriddenFunction: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'functionType' @ [227:95] ==> val functionType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'actions' @ [231:20] ==> val actions: LinkedList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ReturnTypeMismatchOnOverrideFactory.doCreateActions[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [235:46] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'?:' @ [237:28] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtFunction?, right: KtFunction): KtFunction[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtFunction

'getParentElementOfType' @ [237:41] ==> @Nullable public open fun <T : (PsiElement..PsiElement?)> getParentElementOfType(p0: (Diagnostic..Diagnostic?), p1: (Class<(KtFunction..KtFunction?)>..Class<(KtFunction..KtFunction?)>?)): KtFunction? defined in org.jetbrains.kotlin.idea.core.quickfix.QuickFixUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtFunction

'diagnostic' @ [237:64] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ChangingReturnTypeToUnitFactory.createAction[ValueParameterDescriptorImpl]

'java' @ [237:94] ==> public val <T> KClass<KtFunction>.java: Class<KtFunction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtFunction

'ChangeCallableReturnTypeFix' @ [238:20] ==> public companion object defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[FakeCallableDescriptorForObject]

'ForEnclosing' @ [238:48] ==> public constructor ForEnclosing(element: KtFunction, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ForEnclosing[ClassConstructorDescriptorImpl]

'function' @ [238:61] ==> val function: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ChangingReturnTypeToUnitFactory.createAction[LocalVariableDescriptor]

'function' @ [238:71] ==> val function: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ChangingReturnTypeToUnitFactory.createAction[LocalVariableDescriptor]

'builtIns' @ [238:80] ==> public val KtElement.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.project[DeserializedPropertyDescriptor]

'unitType' @ [238:89] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'KotlinSingleIntentionActionFactory' @ [242:49] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'?:' @ [244:28] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtFunction?, right: KtFunction): KtFunction[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtFunction

'getParentElementOfType' @ [244:41] ==> @Nullable public open fun <T : (PsiElement..PsiElement?)> getParentElementOfType(p0: (Diagnostic..Diagnostic?), p1: (Class<(KtFunction..KtFunction?)>..Class<(KtFunction..KtFunction?)>?)): KtFunction? defined in org.jetbrains.kotlin.idea.core.quickfix.QuickFixUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtFunction

'diagnostic' @ [244:64] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ChangingReturnTypeToNothingFactory.createAction[ValueParameterDescriptorImpl]

'java' @ [244:94] ==> public val <T> KClass<KtFunction>.java: Class<KtFunction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtFunction

'ChangeCallableReturnTypeFix' @ [245:20] ==> public companion object defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix[FakeCallableDescriptorForObject]

'ForEnclosing' @ [245:48] ==> public constructor ForEnclosing(element: KtFunction, type: KotlinType) defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ForEnclosing[ClassConstructorDescriptorImpl]

'function' @ [245:61] ==> val function: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ChangingReturnTypeToNothingFactory.createAction[LocalVariableDescriptor]

'function' @ [245:71] ==> val function: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.ChangingReturnTypeToNothingFactory.createAction[LocalVariableDescriptor]

'builtIns' @ [245:80] ==> public val KtElement.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.project[DeserializedPropertyDescriptor]

'nothingType' @ [245:89] ==> public final val KotlinBuiltIns.nothingType: SimpleType[MyPropertyDescriptor]

'COMPONENT_FUNCTION_RETURN_TYPE_MISMATCH' @ [251:33] ==> public final val COMPONENT_FUNCTION_RETURN_TYPE_MISMATCH: (DiagnosticFactory3<(KtExpression..KtExpression?), (Name..Name?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>..DiagnosticFactory3<(KtExpression..KtExpression?), (Name..Name?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [251:73] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters3<(KtExpression..KtExpression?), (Name..Name?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'diagnostic' @ [251:78] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.Companion.getDestructuringDeclarationEntryThatTypeMismatchComponentFunction[ValueParameterDescriptorImpl]

'a' @ [251:90] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?), C : (Any..Any?)> DiagnosticWithParameters3<(KtExpression..KtExpression?), (Name..Name?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>.a: (Name..Name?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.name.Name..org.jetbrains.kotlin.name.Name?)
    <B : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <C : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'DataClassDescriptorResolver' @ [252:34] ==> public object DataClassDescriptorResolver defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'getComponentIndex' @ [252:62] ==> public final fun getComponentIndex(componentName: String): Int defined in org.jetbrains.kotlin.resolve.DataClassDescriptorResolver[DeserializedSimpleFunctionDescriptor]

'componentName' @ [252:80] ==> val componentName: (Name..Name?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.Companion.getDestructuringDeclarationEntryThatTypeMismatchComponentFunction[LocalVariableDescriptor]

'asString' @ [252:94] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'?:' @ [253:36] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtDestructuringDeclaration?, right: KtDestructuringDeclaration): KtDestructuringDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtDestructuringDeclaration

'getParentElementOfType' @ [253:49] ==> @Nullable public open fun <T : (PsiElement..PsiElement?)> getParentElementOfType(p0: (Diagnostic..Diagnostic?), p1: (Class<(KtDestructuringDeclaration..KtDestructuringDeclaration?)>..Class<(KtDestructuringDeclaration..KtDestructuringDeclaration?)>?)): KtDestructuringDeclaration? defined in org.jetbrains.kotlin.idea.core.quickfix.QuickFixUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtDestructuringDeclaration

'diagnostic' @ [253:72] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.Companion.getDestructuringDeclarationEntryThatTypeMismatchComponentFunction[ValueParameterDescriptorImpl]

'KtDestructuringDeclaration' @ [253:84] ==> public constructor KtDestructuringDeclaration(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtDestructuringDeclaration[JavaClassConstructorDescriptor]

'java' @ [253:118] ==> public val <T> KClass<KtDestructuringDeclaration>.java: Class<KtDestructuringDeclaration> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtDestructuringDeclaration

'error' @ [253:127] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'multiDeclaration' @ [254:20] ==> val multiDeclaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.Companion.getDestructuringDeclarationEntryThatTypeMismatchComponentFunction[LocalVariableDescriptor]

'entries' @ [254:37] ==> public final val KtDestructuringDeclaration.entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>)[MyPropertyDescriptor]

'componentIndex' @ [254:45] ==> val componentIndex: Int defined in org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix.Companion.getDestructuringDeclarationEntryThatTypeMismatchComponentFunction[LocalVariableDescriptor]

