'super' @ [26:34] ==> public constructor KtExpressionImplStub<T : (StubElement<*>..StubElement<*>?)>(@NotNull node: ASTNode) defined in org.jetbrains.kotlin.psi.KtExpressionImplStub[JavaClassConstructorDescriptor]
Inferred types:
    <T : (StubElement<*>..StubElement<*>?)> -> KotlinPlaceHolderStub<KtDotQualifiedExpression>

'node' @ [26:40] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression.<init>[ValueParameterDescriptorImpl]

'super' @ [28:74] ==> public constructor KtExpressionImplStub<T : (StubElement<*>..StubElement<*>?)>(@NotNull stub: KotlinPlaceHolderStub<KtDotQualifiedExpression>, @NotNull nodeType: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>)) defined in org.jetbrains.kotlin.psi.KtExpressionImplStub[JavaClassConstructorDescriptor]
Inferred types:
    <T : (StubElement<*>..StubElement<*>?)> -> KotlinPlaceHolderStub<KtDotQualifiedExpression>

'stub' @ [28:80] ==> value-parameter stub: KotlinPlaceHolderStub<KtDotQualifiedExpression> defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression.<init>[ValueParameterDescriptorImpl]

'DOT_QUALIFIED_EXPRESSION' @ [28:105] ==> public final val DOT_QUALIFIED_EXPRESSION: (KtDotQualifiedExpressionElementType..KtDotQualifiedExpressionElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'visitor' @ [31:16] ==> value-parameter visitor: KtVisitor<R, D> defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression.accept[ValueParameterDescriptorImpl]

'visitDotQualifiedExpression' @ [31:24] ==> public open fun visitDotQualifiedExpression(@NotNull expression: KtDotQualifiedExpression, data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.psi.KtVisitor[JavaMethodDescriptor]

'this' @ [31:52] ==> <this> defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[LazyClassReceiverParameterDescriptor]

'data' @ [31:58] ==> value-parameter data: D defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression.accept[ValueParameterDescriptorImpl]

'stub' @ [36:24] ==> public final val KtDotQualifiedExpression.stub: KotlinPlaceHolderStub<KtDotQualifiedExpression>?[MyPropertyDescriptor]

'stub' @ [37:17] ==> val stub: KotlinPlaceHolderStub<KtDotQualifiedExpression>? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression.<get-receiverExpression>[LocalVariableDescriptor]

'getChildExpressionsByStub' @ [38:46] ==> private final fun getChildExpressionsByStub(stub: KotlinPlaceHolderStub<KtDotQualifiedExpression>): Array<KtExpression>? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[SimpleFunctionDescriptorImpl]

'stub' @ [38:72] ==> val stub: KotlinPlaceHolderStub<KtDotQualifiedExpression>? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression.<get-receiverExpression>[LocalVariableDescriptor]

'childExpressionsByStub' @ [39:21] ==> val childExpressionsByStub: Array<KtExpression>? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression.<get-receiverExpression>[LocalVariableDescriptor]

'childExpressionsByStub' @ [40:28] ==> val childExpressionsByStub: Array<KtExpression>? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression.<get-receiverExpression>[LocalVariableDescriptor]

'super' @ [43:20] ==> <this> defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[LazyClassReceiverParameterDescriptor]

'receiverExpression' @ [43:26] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[PropertyDescriptorImpl]

'stub' @ [48:24] ==> public final val KtDotQualifiedExpression.stub: KotlinPlaceHolderStub<KtDotQualifiedExpression>?[MyPropertyDescriptor]

'stub' @ [49:17] ==> val stub: KotlinPlaceHolderStub<KtDotQualifiedExpression>? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression.<get-selectorExpression>[LocalVariableDescriptor]

'getChildExpressionsByStub' @ [50:46] ==> private final fun getChildExpressionsByStub(stub: KotlinPlaceHolderStub<KtDotQualifiedExpression>): Array<KtExpression>? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[SimpleFunctionDescriptorImpl]

'stub' @ [50:72] ==> val stub: KotlinPlaceHolderStub<KtDotQualifiedExpression>? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression.<get-selectorExpression>[LocalVariableDescriptor]

'childExpressionsByStub' @ [51:21] ==> val childExpressionsByStub: Array<KtExpression>? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression.<get-selectorExpression>[LocalVariableDescriptor]

'childExpressionsByStub' @ [51:55] ==> val childExpressionsByStub: Array<KtExpression>? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression.<get-selectorExpression>[LocalVariableDescriptor]

'size' @ [51:78] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'childExpressionsByStub' @ [52:28] ==> val childExpressionsByStub: Array<KtExpression>? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression.<get-selectorExpression>[LocalVariableDescriptor]

'super' @ [55:20] ==> <this> defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[LazyClassReceiverParameterDescriptor]

'selectorExpression' @ [55:26] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[PropertyDescriptorImpl]

'if (stub.getParentStubOfType(KtImportDirective::class.java) == null &&
            stub.getParentStubOfType(KtPackageDirective::class.java) == null) {
            LOG.error("KtDotQualifiedExpression should only have stubs inside import or package directives.\n" +
                      "Stubs were created for:\n$text\nFile text:\n${containingFile.text}")
            return null
        }
        else {
            val expressions = stub.getChildrenByType(INSIDE_DIRECTIVE_EXPRESSIONS, KtExpression.ARRAY_FACTORY)
            if (expressions.size !in 1..2) {
                LOG.error("Invalid stub structure. DOT_QUALIFIED_EXPRESSION must have one or two children. Was: ${expressions.size}\n" +
                          "File text:\n${containingFile.text}")
                return null
            }
            return expressions
        }' @ [59:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'stub' @ [59:13] ==> value-parameter stub: KotlinPlaceHolderStub<KtDotQualifiedExpression> defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression.getChildExpressionsByStub[ValueParameterDescriptorImpl]

'getParentStubOfType' @ [59:18] ==> @Nullable public abstract fun <E : (PsiElement..PsiElement?)> getParentStubOfType(@NotNull p0: Class<(KtImportDirective..KtImportDirective?)>): KtImportDirective? defined in org.jetbrains.kotlin.psi.stubs.KotlinPlaceHolderStub[JavaMethodDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> KtImportDirective

'java' @ [59:63] ==> public val <T> KClass<KtImportDirective>.java: Class<KtImportDirective> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtImportDirective

'stub' @ [60:13] ==> value-parameter stub: KotlinPlaceHolderStub<KtDotQualifiedExpression> defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression.getChildExpressionsByStub[ValueParameterDescriptorImpl]

'getParentStubOfType' @ [60:18] ==> @Nullable public abstract fun <E : (PsiElement..PsiElement?)> getParentStubOfType(@NotNull p0: Class<(KtPackageDirective..KtPackageDirective?)>): KtPackageDirective? defined in org.jetbrains.kotlin.psi.stubs.KotlinPlaceHolderStub[JavaMethodDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> KtPackageDirective

'java' @ [60:64] ==> public val <T> KClass<KtPackageDirective>.java: Class<KtPackageDirective> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtPackageDirective

'LOG' @ [61:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression.Companion[PropertyDescriptorImpl]

'error' @ [61:17] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'+' @ [61:23] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'text' @ [62:50] ==> public final val KtDotQualifiedExpression.text: (String..String?)[MyPropertyDescriptor]

'containingFile' @ [62:70] ==> public final val KtDotQualifiedExpression.containingFile: PsiFile[MyPropertyDescriptor]

'text' @ [62:85] ==> public final val PsiFile.text: (String..String?)[MyPropertyDescriptor]

'stub' @ [66:31] ==> value-parameter stub: KotlinPlaceHolderStub<KtDotQualifiedExpression> defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression.getChildExpressionsByStub[ValueParameterDescriptorImpl]

'getChildrenByType' @ [66:36] ==> @NotNull public abstract fun <E : (PsiElement..PsiElement?)> getChildrenByType(@NotNull p0: TokenSet, @NotNull p1: ArrayFactory<(KtExpression..KtExpression?)>): (Array<(KtExpression..KtExpression?)>..Array<out (KtExpression..KtExpression?)>) defined in org.jetbrains.kotlin.psi.stubs.KotlinPlaceHolderStub[JavaMethodDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> KtExpression

'INSIDE_DIRECTIVE_EXPRESSIONS' @ [66:54] ==> public final val INSIDE_DIRECTIVE_EXPRESSIONS: (TokenSet..TokenSet?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'ARRAY_FACTORY' @ [66:97] ==> public final val ARRAY_FACTORY: (ArrayFactory<(KtExpression..KtExpression?)>..ArrayFactory<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaPropertyDescriptor]

'expressions' @ [67:17] ==> val expressions: (Array<(KtExpression..KtExpression?)>..Array<out (KtExpression..KtExpression?)>) defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression.getChildExpressionsByStub[LocalVariableDescriptor]

'size' @ [67:29] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'..' @ [67:38] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'LOG' @ [68:17] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression.Companion[PropertyDescriptorImpl]

'error' @ [68:21] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'+' @ [68:27] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'expressions' @ [68:115] ==> val expressions: (Array<(KtExpression..KtExpression?)>..Array<out (KtExpression..KtExpression?)>) defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression.getChildExpressionsByStub[LocalVariableDescriptor]

'size' @ [68:127] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'containingFile' @ [69:42] ==> public final val KtDotQualifiedExpression.containingFile: PsiFile[MyPropertyDescriptor]

'text' @ [69:57] ==> public final val PsiFile.text: (String..String?)[MyPropertyDescriptor]

'expressions' @ [72:20] ==> val expressions: (Array<(KtExpression..KtExpression?)>..Array<out (KtExpression..KtExpression?)>) defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression.getChildExpressionsByStub[LocalVariableDescriptor]

'getInstance' @ [77:34] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'KtDotQualifiedExpression' @ [77:46] ==> public companion object defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[FakeCallableDescriptorForObject]

'java' @ [77:78] ==> public val <T> KClass<KtDotQualifiedExpression>.java: Class<KtDotQualifiedExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtDotQualifiedExpression

