'this' @ [27:9] ==> <this> defined in org.jetbrains.kotlin.psi.debugText.getDebugText[ReceiverParameterDescriptorImpl]

'this' @ [27:42] ==> <this> defined in org.jetbrains.kotlin.psi.debugText.getDebugText[ReceiverParameterDescriptorImpl]

'stub' @ [27:47] ==> public final val <T : (StubElement<*>..StubElement<*>?)> KtElementImplStub<out (StubElement<*>..StubElement<*>?)>.stub: StubElement<*>?[MyPropertyDescriptor]
Inferred types:
    <T : (StubElement<*>..StubElement<*>?)> -> (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)

'text' @ [28:16] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'this' @ [30:9] ==> <this> defined in org.jetbrains.kotlin.psi.debugText.getDebugText[ReceiverParameterDescriptorImpl]

'fqName' @ [31:22] ==> public final var KtPackageDirective.fqName: FqName[MyPropertyDescriptor]

'fqName' @ [32:13] ==> val fqName: FqName defined in org.jetbrains.kotlin.psi.debugText.getDebugText[LocalVariableDescriptor]

'isRoot' @ [32:20] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'+' @ [35:16] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'fqName' @ [35:29] ==> val fqName: FqName defined in org.jetbrains.kotlin.psi.debugText.getDebugText[LocalVariableDescriptor]

'asString' @ [35:36] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'accept' @ [37:12] ==> public abstract fun <R, D> accept(visitor: KtVisitor<String, Unit>, data: Unit): String defined in org.jetbrains.kotlin.psi.KtElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> String
    <D> -> Unit

'DebugTextBuildingVisitor' @ [37:19] ==> private object DebugTextBuildingVisitor : KtVisitor<String, Unit> defined in org.jetbrains.kotlin.psi.debugText in file DebugTextUtil.kt[FakeCallableDescriptorForObject]

'Unit' @ [37:45] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'KtVisitor<String, Unit>' @ [41:43] ==> public constructor KtVisitor<R : (Any..Any?), D : (Any..Any?)>() defined in org.jetbrains.kotlin.psi.KtVisitor[JavaClassConstructorDescriptor]
Inferred types:
    <R : (Any..Any?)> -> String
    <D : (Any..Any?)> -> Unit

'getInstance' @ [43:30] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'this' @ [43:42] ==> <this> defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[LazyClassReceiverParameterDescriptor]

'java' @ [43:54] ==> public val <T> KClass<out DebugTextBuildingVisitor>.java: Class<out DebugTextBuildingVisitor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DebugTextBuildingVisitor

'file' @ [46:30] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitKtFile[ValueParameterDescriptorImpl]

'name' @ [46:35] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'element' @ [50:13] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitKtElement[ValueParameterDescriptorImpl]

'LOG' @ [51:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[PropertyDescriptorImpl]

'error' @ [51:17] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'element' @ [51:60] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitKtElement[ValueParameterDescriptorImpl]

'java' @ [51:75] ==> public val <T> KClass<out KtElement>.java: Class<out KtElement> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtElement

'element' @ [53:16] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitKtElement[ValueParameterDescriptorImpl]

'text' @ [53:24] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'importDirective' @ [57:26] ==> value-parameter importDirective: KtImportDirective defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitImportDirective[ValueParameterDescriptorImpl]

'importPath' @ [57:42] ==> public final val KtImportDirective.importPath: ImportPath?[MyPropertyDescriptor]

'if (importPath.hasAlias()) " as " + importPath.alias!!.asString() else ""' @ [58:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'importPath' @ [58:28] ==> val importPath: ImportPath defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitImportDirective[LocalVariableDescriptor]

'hasAlias' @ [58:39] ==> public final fun hasAlias(): Boolean defined in org.jetbrains.kotlin.resolve.ImportPath[SimpleFunctionDescriptorImpl]

'+' @ [58:51] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'importPath' @ [58:60] ==> val importPath: ImportPath defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitImportDirective[LocalVariableDescriptor]

'alias' @ [58:71] ==> public final val alias: Name? defined in org.jetbrains.kotlin.resolve.ImportPath[PropertyDescriptorImpl]

'asString' @ [58:79] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'+' @ [59:16] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'importPath' @ [59:26] ==> val importPath: ImportPath defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitImportDirective[LocalVariableDescriptor]

'pathStr' @ [59:37] ==> public final val pathStr: String defined in org.jetbrains.kotlin.resolve.ImportPath[PropertyDescriptorImpl]

'aliasStr' @ [59:49] ==> val aliasStr: String defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitImportDirective[LocalVariableDescriptor]

'renderChildren' @ [63:16] ==> public final fun renderChildren(element: KtElementImplStub<*>, separator: String, prefix: String = ..., postfix: String = ...): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'importList' @ [63:31] ==> value-parameter importList: KtImportList defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitImportList[ValueParameterDescriptorImpl]

'render' @ [67:16] ==> public final fun render(element: KtElementImplStub<*>, vararg relevantChildren: KtElement?): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'annotationEntry' @ [67:23] ==> value-parameter annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitAnnotationEntry[ValueParameterDescriptorImpl]

'annotationEntry' @ [67:40] ==> value-parameter annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitAnnotationEntry[ValueParameterDescriptorImpl]

'calleeExpression' @ [67:56] ==> public final val KtAnnotationEntry.calleeExpression: KtConstructorCalleeExpression?[MyPropertyDescriptor]

'annotationEntry' @ [67:74] ==> value-parameter annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitAnnotationEntry[ValueParameterDescriptorImpl]

'typeArgumentList' @ [67:90] ==> public final val KtAnnotationEntry.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'renderChildren' @ [71:16] ==> public final fun renderChildren(element: KtElementImplStub<*>, separator: String, prefix: String = ..., postfix: String = ...): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'typeReference' @ [71:31] ==> value-parameter typeReference: KtTypeReference defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitTypeReference[ValueParameterDescriptorImpl]

'renderChildren' @ [75:16] ==> public final fun renderChildren(element: KtElementImplStub<*>, separator: String, prefix: String = ..., postfix: String = ...): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'typeArgumentList' @ [75:31] ==> value-parameter typeArgumentList: KtTypeArgumentList defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitTypeArgumentList[ValueParameterDescriptorImpl]

'renderChildren' @ [79:16] ==> public final fun renderChildren(element: KtElementImplStub<*>, separator: String, prefix: String = ..., postfix: String = ...): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'list' @ [79:31] ==> value-parameter list: KtTypeConstraintList defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitTypeConstraintList[ValueParameterDescriptorImpl]

'render' @ [83:16] ==> public final fun render(element: KtElementImplStub<*>, vararg relevantChildren: KtElement?): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'userType' @ [83:23] ==> value-parameter userType: KtUserType defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitUserType[ValueParameterDescriptorImpl]

'userType' @ [83:33] ==> value-parameter userType: KtUserType defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitUserType[ValueParameterDescriptorImpl]

'qualifier' @ [83:42] ==> public final val KtUserType.qualifier: KtUserType?[MyPropertyDescriptor]

'userType' @ [83:53] ==> value-parameter userType: KtUserType defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitUserType[ValueParameterDescriptorImpl]

'referenceExpression' @ [83:62] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'userType' @ [83:83] ==> value-parameter userType: KtUserType defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitUserType[ValueParameterDescriptorImpl]

'typeArgumentList' @ [83:92] ==> public final val KtUserType.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'renderChildren' @ [91:16] ==> public final fun renderChildren(element: KtElementImplStub<*>, separator: String, prefix: String = ..., postfix: String = ...): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'annotation' @ [91:31] ==> value-parameter annotation: KtAnnotation defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitAnnotation[ValueParameterDescriptorImpl]

'render' @ [95:16] ==> public final fun render(element: KtElementImplStub<*>, vararg relevantChildren: KtElement?): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'constructorCalleeExpression' @ [95:23] ==> value-parameter constructorCalleeExpression: KtConstructorCalleeExpression defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitConstructorCalleeExpression[ValueParameterDescriptorImpl]

'constructorCalleeExpression' @ [95:52] ==> value-parameter constructorCalleeExpression: KtConstructorCalleeExpression defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitConstructorCalleeExpression[ValueParameterDescriptorImpl]

'constructorReferenceExpression' @ [95:80] ==> public final val KtConstructorCalleeExpression.constructorReferenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'render' @ [99:16] ==> public final fun render(element: KtElementImplStub<*>, vararg relevantChildren: KtElement?): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'specifier' @ [99:23] ==> value-parameter specifier: KtSuperTypeListEntry defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitSuperTypeListEntry[ValueParameterDescriptorImpl]

'specifier' @ [99:34] ==> value-parameter specifier: KtSuperTypeListEntry defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitSuperTypeListEntry[ValueParameterDescriptorImpl]

'typeReference' @ [99:44] ==> public final val KtSuperTypeListEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'renderChildren' @ [103:16] ==> public final fun renderChildren(element: KtElementImplStub<*>, separator: String, prefix: String = ..., postfix: String = ...): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'list' @ [103:31] ==> value-parameter list: KtSuperTypeList defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitSuperTypeList[ValueParameterDescriptorImpl]

'renderChildren' @ [107:16] ==> public final fun renderChildren(element: KtElementImplStub<*>, separator: String, prefix: String = ..., postfix: String = ...): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'list' @ [107:31] ==> value-parameter list: KtTypeParameterList defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitTypeParameterList[ValueParameterDescriptorImpl]

'renderChildren' @ [111:16] ==> public final fun renderChildren(element: KtElementImplStub<*>, separator: String, prefix: String = ..., postfix: String = ...): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [111:31] ==> value-parameter expression: KtDotQualifiedExpression defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitDotQualifiedExpression[ValueParameterDescriptorImpl]

'renderChildren' @ [115:16] ==> public final fun renderChildren(element: KtElementImplStub<*>, separator: String, prefix: String = ..., postfix: String = ...): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'list' @ [115:31] ==> value-parameter list: KtInitializerList defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitInitializerList[ValueParameterDescriptorImpl]

'renderChildren' @ [119:16] ==> public final fun renderChildren(element: KtElementImplStub<*>, separator: String, prefix: String = ..., postfix: String = ...): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'list' @ [119:31] ==> value-parameter list: KtParameterList defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitParameterList[ValueParameterDescriptorImpl]

'buildText' @ [123:16] ==> public final fun buildText(body: StringBuilder /* = StringBuilder */.() -> Unit): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'append' @ [124:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'appendInn' @ [125:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'enumEntry' @ [125:23] ==> value-parameter enumEntry: KtEnumEntry defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitEnumEntry[ValueParameterDescriptorImpl]

'modifierList' @ [125:33] ==> public final val KtEnumEntry.modifierList: KtModifierList?[MyPropertyDescriptor]

'append' @ [126:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'appendInn' @ [127:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'enumEntry' @ [127:23] ==> value-parameter enumEntry: KtEnumEntry defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitEnumEntry[ValueParameterDescriptorImpl]

'nameAsName' @ [127:33] ==> public final val KtEnumEntry.nameAsName: Name?[MyPropertyDescriptor]

'appendInn' @ [128:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'enumEntry' @ [128:23] ==> value-parameter enumEntry: KtEnumEntry defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitEnumEntry[ValueParameterDescriptorImpl]

'initializerList' @ [128:33] ==> public final val KtEnumEntry.initializerList: KtInitializerList?[MyPropertyDescriptor]

'buildText' @ [133:16] ==> public final fun buildText(body: StringBuilder /* = StringBuilder */.() -> Unit): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'appendInn' @ [134:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'functionType' @ [134:23] ==> value-parameter functionType: KtFunctionType defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitFunctionType[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [134:36] ==> public final val KtFunctionType.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'appendInn' @ [135:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'functionType' @ [135:23] ==> value-parameter functionType: KtFunctionType defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitFunctionType[ValueParameterDescriptorImpl]

'parameterList' @ [135:36] ==> public final val KtFunctionType.parameterList: KtParameterList?[MyPropertyDescriptor]

'appendInn' @ [136:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'functionType' @ [136:23] ==> value-parameter functionType: KtFunctionType defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitFunctionType[ValueParameterDescriptorImpl]

'returnTypeReference' @ [136:36] ==> public final val KtFunctionType.returnTypeReference: KtTypeReference?[MyPropertyDescriptor]

'buildText' @ [141:16] ==> public final fun buildText(body: StringBuilder /* = StringBuilder */.() -> Unit): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'appendInn' @ [142:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'parameter' @ [142:23] ==> value-parameter parameter: KtTypeParameter defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitTypeParameter[ValueParameterDescriptorImpl]

'modifierList' @ [142:33] ==> public final val KtTypeParameter.modifierList: KtModifierList?[MyPropertyDescriptor]

'appendInn' @ [143:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'parameter' @ [143:23] ==> value-parameter parameter: KtTypeParameter defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitTypeParameter[ValueParameterDescriptorImpl]

'nameAsName' @ [143:33] ==> public final val KtTypeParameter.nameAsName: Name?[MyPropertyDescriptor]

'appendInn' @ [144:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'parameter' @ [144:23] ==> value-parameter parameter: KtTypeParameter defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitTypeParameter[ValueParameterDescriptorImpl]

'extendsBound' @ [144:33] ==> public final var KtTypeParameter.extendsBound: KtTypeReference?[MyPropertyDescriptor]

'buildText' @ [149:16] ==> public final fun buildText(body: StringBuilder /* = StringBuilder */.() -> Unit): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'typeProjection' @ [150:25] ==> value-parameter typeProjection: KtTypeProjection defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitTypeProjection[ValueParameterDescriptorImpl]

'projectionKind' @ [150:40] ==> public final val KtTypeProjection.projectionKind: KtProjectionKind[MyPropertyDescriptor]

'token' @ [150:55] ==> public final val KtProjectionKind.token: KtSingleValueToken?[MyPropertyDescriptor]

'appendInn' @ [151:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'token' @ [151:23] ==> val token: KtSingleValueToken? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitTypeProjection.<anonymous>[LocalVariableDescriptor]

'value' @ [151:30] ==> public final val KtSingleValueToken.value: String[MyPropertyDescriptor]

'typeProjection' @ [152:33] ==> value-parameter typeProjection: KtTypeProjection defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitTypeProjection[ValueParameterDescriptorImpl]

'typeReference' @ [152:48] ==> public final val KtTypeProjection.typeReference: KtTypeReference?[MyPropertyDescriptor]

'token' @ [153:17] ==> val token: KtSingleValueToken? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitTypeProjection.<anonymous>[LocalVariableDescriptor]

'typeReference' @ [153:34] ==> val typeReference: KtTypeReference? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitTypeProjection.<anonymous>[LocalVariableDescriptor]

'append' @ [154:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'appendInn' @ [156:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'typeReference' @ [156:23] ==> val typeReference: KtTypeReference? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitTypeProjection.<anonymous>[LocalVariableDescriptor]

'buildText' @ [161:16] ==> public final fun buildText(body: StringBuilder /* = StringBuilder */.() -> Unit): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'iterator' @ [163:42] ==> public final operator fun iterator(): Iterator<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'MODIFIER_KEYWORDS_ARRAY' @ [163:51] ==> public final val MODIFIER_KEYWORDS_ARRAY: (Array<(KtModifierKeywordToken..KtModifierKeywordToken?)>..Array<out (KtModifierKeywordToken..KtModifierKeywordToken?)>?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'list' @ [164:21] ==> value-parameter list: KtModifierList defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitModifierList[ValueParameterDescriptorImpl]

'hasModifier' @ [164:26] ==> public open fun hasModifier(@NotNull tokenType: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'modifierKeywordToken' @ [164:38] ==> val modifierKeywordToken: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitModifierList.<anonymous>[LocalVariableDescriptor]

'!' @ [165:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'first' @ [165:26] ==> var first: Boolean defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitModifierList.<anonymous>[LocalVariableDescriptor]

'append' @ [166:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [168:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'modifierKeywordToken' @ [168:28] ==> val modifierKeywordToken: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitModifierList.<anonymous>[LocalVariableDescriptor]

'value' @ [168:49] ==> public final val KtModifierKeywordToken.value: String[MyPropertyDescriptor]

'first' @ [169:21] ==> var first: Boolean defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitModifierList.<anonymous>[LocalVariableDescriptor]

'expression' @ [176:16] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'getReferencedName' @ [176:27] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[SimpleFunctionDescriptorImpl]

'renderChildren' @ [180:16] ==> public final fun renderChildren(element: KtElementImplStub<*>, separator: String, prefix: String = ..., postfix: String = ...): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'nullableType' @ [180:31] ==> value-parameter nullableType: KtNullableType defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitNullableType[ValueParameterDescriptorImpl]

'getContainingDeclaration' @ [184:54] ==> @Nullable public open fun getContainingDeclaration(@NotNull element: PsiElement): KtDeclaration? defined in org.jetbrains.kotlin.psi.KtStubbedPsiUtil[JavaMethodDescriptor]

'initializer' @ [184:79] ==> value-parameter initializer: KtAnonymousInitializer defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitAnonymousInitializer[ValueParameterDescriptorImpl]

'+' @ [185:16] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'containingDeclaration' @ [185:37] ==> val containingDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitAnonymousInitializer[LocalVariableDescriptor]

'getDebugText' @ [185:60] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText in file DebugTextUtil.kt[SimpleFunctionDescriptorImpl]

'getContainingDeclaration' @ [189:54] ==> @Nullable public open fun getContainingDeclaration(@NotNull element: PsiElement): KtDeclaration? defined in org.jetbrains.kotlin.psi.KtStubbedPsiUtil[JavaMethodDescriptor]

'classBody' @ [189:79] ==> value-parameter classBody: KtClassBody defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitClassBody[ValueParameterDescriptorImpl]

'+' @ [190:16] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'containingDeclaration' @ [190:37] ==> val containingDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitClassBody[LocalVariableDescriptor]

'getDebugText' @ [190:60] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText in file DebugTextUtil.kt[SimpleFunctionDescriptorImpl]

'getContainingDeclaration' @ [194:51] ==> @Nullable public open fun <T : (KtDeclaration..KtDeclaration?)> getContainingDeclaration(@NotNull element: PsiElement, @NotNull declarationClass: Class<(KtProperty..KtProperty?)>): KtProperty? defined in org.jetbrains.kotlin.psi.KtStubbedPsiUtil[JavaMethodDescriptor]
Inferred types:
    <T : (KtDeclaration..KtDeclaration?)> -> KtProperty

'accessor' @ [194:76] ==> value-parameter accessor: KtPropertyAccessor defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitPropertyAccessor[ValueParameterDescriptorImpl]

'java' @ [194:104] ==> public val <T> KClass<KtProperty>.java: Class<KtProperty> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtProperty

'if (accessor.isGetter) "getter" else "setter"' @ [195:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'accessor' @ [195:25] ==> value-parameter accessor: KtPropertyAccessor defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitPropertyAccessor[ValueParameterDescriptorImpl]

'isGetter' @ [195:34] ==> public final val KtPropertyAccessor.isGetter: Boolean[MyPropertyDescriptor]

'what' @ [196:16] ==> val what: String defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitPropertyAccessor[LocalVariableDescriptor]

'containingProperty' @ [196:34] ==> val containingProperty: KtProperty? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitPropertyAccessor[LocalVariableDescriptor]

'getDebugText' @ [196:54] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText in file DebugTextUtil.kt[SimpleFunctionDescriptorImpl]

'buildText' @ [200:16] ==> public final fun buildText(body: StringBuilder /* = StringBuilder */.() -> Unit): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'append' @ [201:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'appendInn' @ [202:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'klass' @ [202:23] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitClass[ValueParameterDescriptorImpl]

'modifierList' @ [202:29] ==> public final val KtClass.modifierList: KtModifierList?[MyPropertyDescriptor]

'append' @ [203:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'appendInn' @ [204:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'klass' @ [204:23] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitClass[ValueParameterDescriptorImpl]

'nameAsName' @ [204:29] ==> public final val KtClass.nameAsName: Name?[MyPropertyDescriptor]

'appendInn' @ [205:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'klass' @ [205:23] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitClass[ValueParameterDescriptorImpl]

'typeParameterList' @ [205:29] ==> public final val KtClass.typeParameterList: KtTypeParameterList?[MyPropertyDescriptor]

'appendInn' @ [206:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'klass' @ [206:23] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitClass[ValueParameterDescriptorImpl]

'primaryConstructorModifierList' @ [206:29] ==> public final val KtClass.primaryConstructorModifierList: KtModifierList?[MyPropertyDescriptor]

'appendInn' @ [207:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'klass' @ [207:23] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitClass[ValueParameterDescriptorImpl]

'getPrimaryConstructorParameterList' @ [207:29] ==> public final fun getPrimaryConstructorParameterList(): KtParameterList? defined in org.jetbrains.kotlin.psi.KtClass[SimpleFunctionDescriptorImpl]

'appendInn' @ [208:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'klass' @ [208:23] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitClass[ValueParameterDescriptorImpl]

'getSuperTypeList' @ [208:29] ==> public final fun getSuperTypeList(): KtSuperTypeList? defined in org.jetbrains.kotlin.psi.KtClass[SimpleFunctionDescriptorImpl]

'buildText' @ [213:16] ==> public final fun buildText(body: StringBuilder /* = StringBuilder */.() -> Unit): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'append' @ [214:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'appendInn' @ [215:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'function' @ [215:23] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitNamedFunction[ValueParameterDescriptorImpl]

'modifierList' @ [215:32] ==> public final val KtNamedFunction.modifierList: KtModifierList?[MyPropertyDescriptor]

'append' @ [216:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'function' @ [218:37] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitNamedFunction[ValueParameterDescriptorImpl]

'typeParameterList' @ [218:46] ==> public final val KtNamedFunction.typeParameterList: KtTypeParameterList?[MyPropertyDescriptor]

'function' @ [219:17] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitNamedFunction[ValueParameterDescriptorImpl]

'hasTypeParameterListBeforeFunctionName' @ [219:26] ==> public open fun hasTypeParameterListBeforeFunctionName(): Boolean defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'appendInn' @ [220:17] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'typeParameterList' @ [220:27] ==> val typeParameterList: KtTypeParameterList? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitNamedFunction.<anonymous>[LocalVariableDescriptor]

'appendInn' @ [222:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'function' @ [222:23] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitNamedFunction[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [222:32] ==> public final val KtNamedFunction.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'appendInn' @ [223:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'function' @ [223:23] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitNamedFunction[ValueParameterDescriptorImpl]

'nameAsName' @ [223:32] ==> public final val KtNamedFunction.nameAsName: Name?[MyPropertyDescriptor]

'!' @ [224:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'function' @ [224:18] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitNamedFunction[ValueParameterDescriptorImpl]

'hasTypeParameterListBeforeFunctionName' @ [224:27] ==> public open fun hasTypeParameterListBeforeFunctionName(): Boolean defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'appendInn' @ [225:17] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'typeParameterList' @ [225:27] ==> val typeParameterList: KtTypeParameterList? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitNamedFunction.<anonymous>[LocalVariableDescriptor]

'appendInn' @ [227:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'function' @ [227:23] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitNamedFunction[ValueParameterDescriptorImpl]

'valueParameterList' @ [227:32] ==> public final val KtNamedFunction.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'appendInn' @ [228:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'function' @ [228:23] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitNamedFunction[ValueParameterDescriptorImpl]

'typeReference' @ [228:32] ==> public final var KtNamedFunction.typeReference: KtTypeReference?[MyPropertyDescriptor]

'appendInn' @ [229:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'function' @ [229:23] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitNamedFunction[ValueParameterDescriptorImpl]

'typeConstraintList' @ [229:32] ==> public final val KtNamedFunction.typeConstraintList: KtTypeConstraintList?[MyPropertyDescriptor]

'buildText' @ [234:16] ==> public final fun buildText(body: StringBuilder /* = StringBuilder */.() -> Unit): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'append' @ [235:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'appendInn' @ [236:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'declaration' @ [236:23] ==> value-parameter declaration: KtObjectDeclaration defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitObjectDeclaration[ValueParameterDescriptorImpl]

'modifierList' @ [236:35] ==> public final val KtObjectDeclaration.modifierList: KtModifierList?[MyPropertyDescriptor]

'append' @ [237:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'appendInn' @ [238:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'declaration' @ [238:23] ==> value-parameter declaration: KtObjectDeclaration defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitObjectDeclaration[ValueParameterDescriptorImpl]

'nameAsName' @ [238:35] ==> public final val KtObjectDeclaration.nameAsName: Name?[MyPropertyDescriptor]

'appendInn' @ [239:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'declaration' @ [239:23] ==> value-parameter declaration: KtObjectDeclaration defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitObjectDeclaration[ValueParameterDescriptorImpl]

'getSuperTypeList' @ [239:35] ==> public final fun getSuperTypeList(): KtSuperTypeList? defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[SimpleFunctionDescriptorImpl]

'buildText' @ [244:16] ==> public final fun buildText(body: StringBuilder /* = StringBuilder */.() -> Unit): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'parameter' @ [245:17] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitParameter[ValueParameterDescriptorImpl]

'hasValOrVar' @ [245:27] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'if (parameter.isMutable) append("var ") else append("val ")' @ [246:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (StringBuilder..StringBuilder?), elseBranch: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'parameter' @ [246:21] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitParameter[ValueParameterDescriptorImpl]

'isMutable' @ [246:31] ==> public final val KtParameter.isMutable: Boolean[MyPropertyDescriptor]

'append' @ [246:42] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [246:62] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'parameter' @ [248:24] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitParameter[ValueParameterDescriptorImpl]

'nameAsName' @ [248:34] ==> public final val KtParameter.nameAsName: Name?[MyPropertyDescriptor]

'appendInn' @ [249:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'name' @ [249:23] ==> val name: Name? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitParameter.<anonymous>[LocalVariableDescriptor]

'parameter' @ [250:33] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitParameter[ValueParameterDescriptorImpl]

'typeReference' @ [250:43] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeReference' @ [251:17] ==> val typeReference: KtTypeReference? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitParameter.<anonymous>[LocalVariableDescriptor]

'name' @ [251:42] ==> val name: Name? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitParameter.<anonymous>[LocalVariableDescriptor]

'append' @ [252:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'appendInn' @ [254:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'typeReference' @ [254:23] ==> val typeReference: KtTypeReference? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitParameter.<anonymous>[LocalVariableDescriptor]

'buildText' @ [259:16] ==> public final fun buildText(body: StringBuilder /* = StringBuilder */.() -> Unit): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'append' @ [260:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'appendInn' @ [261:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'property' @ [261:23] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitProperty[ValueParameterDescriptorImpl]

'modifierList' @ [261:32] ==> public final val KtProperty.modifierList: KtModifierList?[MyPropertyDescriptor]

'append' @ [262:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'if (property.isVar) "var " else "val "' @ [262:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'property' @ [262:24] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitProperty[ValueParameterDescriptorImpl]

'isVar' @ [262:33] ==> public final val KtProperty.isVar: Boolean[MyPropertyDescriptor]

'appendInn' @ [263:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'property' @ [263:23] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitProperty[ValueParameterDescriptorImpl]

'nameAsName' @ [263:32] ==> public final val KtProperty.nameAsName: Name?[MyPropertyDescriptor]

'appendInn' @ [264:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'property' @ [264:23] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitProperty[ValueParameterDescriptorImpl]

'typeReference' @ [264:32] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'buildText' @ [269:16] ==> public final fun buildText(body: StringBuilder /* = StringBuilder */.() -> Unit): String? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor[SimpleFunctionDescriptorImpl]

'appendInn' @ [270:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'constraint' @ [270:23] ==> value-parameter constraint: KtTypeConstraint defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitTypeConstraint[ValueParameterDescriptorImpl]

'subjectTypeParameterName' @ [270:34] ==> public final val KtTypeConstraint.subjectTypeParameterName: KtSimpleNameExpression?[MyPropertyDescriptor]

'appendInn' @ [271:13] ==> private fun StringBuilder /* = StringBuilder */.appendInn(target: Any?, prefix: String = ..., suffix: String = ...): Unit defined in org.jetbrains.kotlin.psi.debugText[SimpleFunctionDescriptorImpl]

'constraint' @ [271:23] ==> value-parameter constraint: KtTypeConstraint defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.visitTypeConstraint[ValueParameterDescriptorImpl]

'boundTypeReference' @ [271:34] ==> public final val KtTypeConstraint.boundTypeReference: KtTypeReference?[MyPropertyDescriptor]

'StringBuilder' @ [276:18] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'sb' @ [277:9] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.buildText[LocalVariableDescriptor]

'invoke' @ [277:12] ==> public abstract operator fun StringBuilder /* = StringBuilder */.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'sb' @ [278:16] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.buildText[LocalVariableDescriptor]

'toString' @ [278:19] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'element' @ [282:29] ==> value-parameter element: KtElementImplStub<*> defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.renderChildren[ValueParameterDescriptorImpl]

'stub' @ [282:37] ==> public final val <T : (StubElement<*>..StubElement<*>?)> KtElementImplStub<out (StubElement<*>..StubElement<*>?)>.stub: StubElement<*>?[MyPropertyDescriptor]
Inferred types:
    <T : (StubElement<*>..StubElement<*>?)> -> (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)

'childrenStubs' @ [282:43] ==> public final val <T : (PsiElement..PsiElement?)> StubElement<out (PsiElement..PsiElement?)>.childrenStubs: (MutableList<raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)>..List<raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)>)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'mapNotNull' @ [282:58] ==> public inline fun <T, R : Any> Iterable<raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)>.mapNotNull(transform: (raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> raw (com.intellij.psi.stubs.StubElement<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>..com.intellij.psi.stubs.StubElement<*>?)
    <R : Any> -> String

'it' @ [282:72] ==> value-parameter it: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?) defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.renderChildren.<anonymous>[ValueParameterDescriptorImpl]

'psi' @ [282:76] ==> public final val <T : (PsiElement..PsiElement?)> StubElement<(PsiElement..PsiElement?)>.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'getDebugText' @ [282:96] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText in file DebugTextUtil.kt[SimpleFunctionDescriptorImpl]

'childrenTexts' @ [283:16] ==> val childrenTexts: List<String>? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.renderChildren[LocalVariableDescriptor]

'joinToString' @ [283:31] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'separator' @ [283:44] ==> value-parameter separator: String defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.renderChildren[ValueParameterDescriptorImpl]

'prefix' @ [283:55] ==> value-parameter prefix: String = ... defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.renderChildren[ValueParameterDescriptorImpl]

'postfix' @ [283:63] ==> value-parameter postfix: String = ... defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.renderChildren[ValueParameterDescriptorImpl]

'element' @ [283:75] ==> value-parameter element: KtElementImplStub<*> defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.renderChildren[ValueParameterDescriptorImpl]

'text' @ [283:83] ==> public final val <T : (StubElement<*>..StubElement<*>?)> KtElementImplStub<out (StubElement<*>..StubElement<*>?)>.text: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (StubElement<*>..StubElement<*>?)> -> (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)

'element' @ [287:13] ==> value-parameter element: KtElementImplStub<*> defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.render[ValueParameterDescriptorImpl]

'stub' @ [287:21] ==> public final val <T : (StubElement<*>..StubElement<*>?)> KtElementImplStub<out (StubElement<*>..StubElement<*>?)>.stub: StubElement<*>?[MyPropertyDescriptor]
Inferred types:
    <T : (StubElement<*>..StubElement<*>?)> -> (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)

'element' @ [287:42] ==> value-parameter element: KtElementImplStub<*> defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.render[ValueParameterDescriptorImpl]

'text' @ [287:50] ==> public final val <T : (StubElement<*>..StubElement<*>?)> KtElementImplStub<out (StubElement<*>..StubElement<*>?)>.text: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (StubElement<*>..StubElement<*>?)> -> (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)

'relevantChildren' @ [288:16] ==> value-parameter vararg relevantChildren: KtElement? defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.render[ValueParameterDescriptorImpl]

'filterNotNull' @ [288:33] ==> public fun <T : Any> Array<out KtElement?>.filterNotNull(): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtElement

'joinToString' @ [288:49] ==> public fun <T> Iterable<KtElement>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((KtElement) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'it' @ [288:76] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.psi.debugText.DebugTextBuildingVisitor.render.<anonymous>[ValueParameterDescriptorImpl]

'getDebugText' @ [288:79] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText in file DebugTextUtil.kt[SimpleFunctionDescriptorImpl]

'target' @ [293:9] ==> value-parameter target: Any? defined in org.jetbrains.kotlin.psi.debugText.appendInn[ValueParameterDescriptorImpl]

'append' @ [294:5] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'prefix' @ [294:12] ==> value-parameter prefix: String = ... defined in org.jetbrains.kotlin.psi.debugText.appendInn[ValueParameterDescriptorImpl]

'append' @ [295:5] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'when (target) {
               is KtElement -> target.getDebugText()
               else -> target.toString()
           }' @ [295:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'target' @ [295:18] ==> value-parameter target: Any? defined in org.jetbrains.kotlin.psi.debugText.appendInn[ValueParameterDescriptorImpl]

'target' @ [296:32] ==> value-parameter target: Any? defined in org.jetbrains.kotlin.psi.debugText.appendInn[ValueParameterDescriptorImpl]

'getDebugText' @ [296:39] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText in file DebugTextUtil.kt[SimpleFunctionDescriptorImpl]

'target' @ [297:24] ==> value-parameter target: Any? defined in org.jetbrains.kotlin.psi.debugText.appendInn[ValueParameterDescriptorImpl]

'toString' @ [297:31] ==> public open fun toString(): String defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'append' @ [299:5] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'suffix' @ [299:12] ==> value-parameter suffix: String = ... defined in org.jetbrains.kotlin.psi.debugText.appendInn[ValueParameterDescriptorImpl]

