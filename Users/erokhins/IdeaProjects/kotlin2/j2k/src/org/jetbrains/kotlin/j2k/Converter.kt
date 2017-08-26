'ArrayList' @ [49:32] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeferredElement<*>

'ArrayList' @ [50:33] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Function0<Unit>

'elementToConvert' @ [53:28] ==> private final val elementToConvert: PsiElement defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'project' @ [53:45] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'TypeConverter' @ [54:40] ==> public constructor TypeConverter(converter: Converter) defined in org.jetbrains.kotlin.j2k.TypeConverter[ClassConstructorDescriptorImpl]

'this' @ [54:54] ==> <this> defined in org.jetbrains.kotlin.j2k.Converter[LazyClassReceiverParameterDescriptor]

'AnnotationConverter' @ [55:52] ==> public constructor AnnotationConverter(converter: Converter) defined in org.jetbrains.kotlin.j2k.AnnotationConverter[ClassConstructorDescriptorImpl]

'this' @ [55:72] ==> <this> defined in org.jetbrains.kotlin.j2k.Converter[LazyClassReceiverParameterDescriptor]

'CachingReferenceSearcher' @ [57:48] ==> public constructor CachingReferenceSearcher(searcher: ReferenceSearcher) defined in org.jetbrains.kotlin.j2k.Converter.CachingReferenceSearcher[ClassConstructorDescriptorImpl]

'services' @ [57:73] ==> public final val services: JavaToKotlinConverterServices defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'referenceSearcher' @ [57:82] ==> public abstract val referenceSearcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverterServices[PropertyDescriptorImpl]

'PropertyDetectionCache' @ [59:34] ==> public constructor PropertyDetectionCache(converter: Converter) defined in org.jetbrains.kotlin.j2k.PropertyDetectionCache[ClassConstructorDescriptorImpl]

'this' @ [59:57] ==> <this> defined in org.jetbrains.kotlin.j2k.Converter[LazyClassReceiverParameterDescriptor]

'Converter' @ [64:20] ==> private constructor Converter(elementToConvert: PsiElement, settings: ConverterSettings, inConversionScope: (PsiElement) -> Boolean, services: JavaToKotlinConverterServices, commonState: Converter.CommonState) defined in org.jetbrains.kotlin.j2k.Converter[ClassConstructorDescriptorImpl]

'elementToConvert' @ [64:30] ==> value-parameter elementToConvert: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.Companion.create[ValueParameterDescriptorImpl]

'settings' @ [64:48] ==> value-parameter settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.Converter.Companion.create[ValueParameterDescriptorImpl]

'inConversionScope' @ [64:58] ==> value-parameter inConversionScope: (PsiElement) -> Boolean defined in org.jetbrains.kotlin.j2k.Converter.Companion.create[ValueParameterDescriptorImpl]

'services' @ [65:30] ==> value-parameter services: JavaToKotlinConverterServices defined in org.jetbrains.kotlin.j2k.Converter.Companion.create[ValueParameterDescriptorImpl]

'CommonState' @ [65:40] ==> public constructor CommonState(usageProcessingsCollector: (UsageProcessing) -> Unit) defined in org.jetbrains.kotlin.j2k.Converter.CommonState[ClassConstructorDescriptorImpl]

'usageProcessingsCollector' @ [65:52] ==> value-parameter usageProcessingsCollector: (UsageProcessing) -> Unit defined in org.jetbrains.kotlin.j2k.Converter.Companion.create[ValueParameterDescriptorImpl]

'Converter' @ [69:55] ==> private constructor Converter(elementToConvert: PsiElement, settings: ConverterSettings, inConversionScope: (PsiElement) -> Boolean, services: JavaToKotlinConverterServices, commonState: Converter.CommonState) defined in org.jetbrains.kotlin.j2k.Converter[ClassConstructorDescriptorImpl]

'elementToConvert' @ [69:65] ==> private final val elementToConvert: PsiElement defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'settings' @ [69:83] ==> public final val settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'inConversionScope' @ [69:93] ==> public final val inConversionScope: (PsiElement) -> Boolean defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'services' @ [69:112] ==> public final val services: JavaToKotlinConverterServices defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'state' @ [69:122] ==> value-parameter state: Converter.CommonState defined in org.jetbrains.kotlin.j2k.Converter.withCommonState[ValueParameterDescriptorImpl]

'CodeConverter' @ [71:48] ==> public constructor CodeConverter(converter: Converter, expressionConverter: ExpressionConverter, statementConverter: StatementConverter, methodReturnType: PsiType?) defined in org.jetbrains.kotlin.j2k.CodeConverter[ClassConstructorDescriptorImpl]

'this' @ [71:62] ==> <this> defined in org.jetbrains.kotlin.j2k.Converter[LazyClassReceiverParameterDescriptor]

'DefaultExpressionConverter' @ [71:68] ==> public constructor DefaultExpressionConverter() defined in org.jetbrains.kotlin.j2k.DefaultExpressionConverter[ClassConstructorDescriptorImpl]

'DefaultStatementConverter' @ [71:98] ==> public constructor DefaultStatementConverter() defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[ClassConstructorDescriptorImpl]

'lazy' @ [74:33] ==> public fun <T> lazy(initializer: () -> CodeConverter): Lazy<CodeConverter> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CodeConverter

'withCommonState' @ [74:40] ==> private final fun withCommonState(state: Converter.CommonState): Converter defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'CommonState' @ [74:56] ==> public constructor CommonState(usageProcessingsCollector: (UsageProcessing) -> Unit) defined in org.jetbrains.kotlin.j2k.Converter.CommonState[ClassConstructorDescriptorImpl]

'createDefaultCodeConverter' @ [74:72] ==> private final fun createDefaultCodeConverter(): CodeConverter defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'convertTopElement' @ [87:23] ==> private final fun convertTopElement(element: PsiElement): Element? defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'elementToConvert' @ [87:41] ==> private final val elementToConvert: PsiElement defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'when (elementToConvert) {
            is PsiStatement, is PsiExpression -> ParseContext.CODE_BLOCK
            else -> ParseContext.TOP_LEVEL
        }' @ [88:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ParseContext, entry1: ParseContext): ParseContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ParseContext

'elementToConvert' @ [88:34] ==> private final val elementToConvert: PsiElement defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'CODE_BLOCK' @ [89:63] ==> enum entry CODE_BLOCK defined in org.jetbrains.kotlin.j2k.ParseContext[FakeCallableDescriptorForObject]

'TOP_LEVEL' @ [90:34] ==> enum entry TOP_LEVEL defined in org.jetbrains.kotlin.j2k.ParseContext[FakeCallableDescriptorForObject]

'IntermediateResult' @ [92:16] ==> public constructor IntermediateResult(codeGenerator: (Map<PsiElement, Collection<UsageProcessing>>) -> Converter.Result, parseContext: ParseContext) defined in org.jetbrains.kotlin.j2k.Converter.IntermediateResult[ClassConstructorDescriptorImpl]

'unfoldDeferredElements' @ [94:21] ==> private final fun unfoldDeferredElements(usageProcessings: Map<PsiElement, Collection<UsageProcessing>>): Unit defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'usageProcessings' @ [94:44] ==> value-parameter usageProcessings: Map<PsiElement, Collection<UsageProcessing>> defined in org.jetbrains.kotlin.j2k.Converter.convert.<anonymous>[ValueParameterDescriptorImpl]

'CodeBuilder' @ [96:35] ==> public constructor CodeBuilder(topElement: PsiElement?, docConverter: DocCommentConverter) defined in org.jetbrains.kotlin.j2k.CodeBuilder[ClassConstructorDescriptorImpl]

'elementToConvert' @ [96:47] ==> private final val elementToConvert: PsiElement defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'services' @ [96:65] ==> public final val services: JavaToKotlinConverterServices defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'docCommentConverter' @ [96:74] ==> public abstract val docCommentConverter: DocCommentConverter defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverterServices[PropertyDescriptorImpl]

'builder' @ [97:21] ==> val builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.Converter.convert.<anonymous>[LocalVariableDescriptor]

'append' @ [97:29] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'element' @ [97:36] ==> val element: Element defined in org.jetbrains.kotlin.j2k.Converter.convert[LocalVariableDescriptor]

'Result' @ [98:21] ==> public constructor Result(text: String, importsToAdd: Set<FqName>) defined in org.jetbrains.kotlin.j2k.Converter.Result[ClassConstructorDescriptorImpl]

'builder' @ [98:28] ==> val builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.Converter.convert.<anonymous>[LocalVariableDescriptor]

'resultText' @ [98:36] ==> public final val resultText: String defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'builder' @ [98:48] ==> val builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.Converter.convert.<anonymous>[LocalVariableDescriptor]

'importsToAdd' @ [98:56] ==> public final val importsToAdd: Set<FqName> defined in org.jetbrains.kotlin.j2k.CodeBuilder[PropertyDescriptorImpl]

'parseContext' @ [100:17] ==> val parseContext: ParseContext defined in org.jetbrains.kotlin.j2k.Converter.convert[LocalVariableDescriptor]

'when (element) {
        is PsiJavaFile -> convertFile(element)
        is PsiClass -> convertClass(element)
        is PsiMethod -> convertMethod(element, null, null, null, ClassKind.FINAL_CLASS)
        is PsiField -> convertProperty(PropertyInfo.fromFieldWithNoAccessors(element, this), ClassKind.FINAL_CLASS)
        is PsiStatement -> createDefaultCodeConverter().convertStatement(element)
        is PsiExpression -> createDefaultCodeConverter().convertExpression(element)
        is PsiImportList -> convertImportList(element)
        is PsiImportStatementBase -> convertImport(element, dumpConversion = true).singleOrNull()
        is PsiAnnotation -> annotationConverter.convertAnnotation(element, newLineAfter = false)
        is PsiPackageStatement -> PackageStatement(quoteKeywords(element.packageName ?: "")).assignPrototype(element)
        is PsiJavaCodeReferenceElement -> {
            if (element.parent is PsiReferenceList) {
                val factory = JavaPsiFacade.getInstance(project).elementFactory
                typeConverter.convertType(factory.createType(element), Nullability.NotNull)
            }
            else null
        }
        else -> null
    }' @ [103:68] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Element?, entry1: Element?, entry2: Element?, entry3: Element?, entry4: Element?, entry5: Element?, entry6: Element?, entry7: Element?, entry8: Element?, entry9: Element?, entry10: Element?, entry11: Element?): Element?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Element?

'element' @ [103:74] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.convertTopElement[ValueParameterDescriptorImpl]

'convertFile' @ [104:27] ==> private final fun convertFile(javaFile: PsiJavaFile): File defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'element' @ [104:39] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.convertTopElement[ValueParameterDescriptorImpl]

'convertClass' @ [105:24] ==> public final fun convertClass(psiClass: PsiClass): Class defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'element' @ [105:37] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.convertTopElement[ValueParameterDescriptorImpl]

'convertMethod' @ [106:25] ==> public final fun convertMethod(method: PsiMethod, fieldsToDrop: MutableSet<PsiField>?, constructorConverter: ConstructorConverter?, overloadReducer: OverloadReducer?, classKind: ClassKind): FunctionLike? defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'element' @ [106:39] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.convertTopElement[ValueParameterDescriptorImpl]

'FINAL_CLASS' @ [106:76] ==> enum entry FINAL_CLASS defined in org.jetbrains.kotlin.j2k.ClassKind[FakeCallableDescriptorForObject]

'convertProperty' @ [107:24] ==> public final fun convertProperty(propertyInfo: PropertyInfo, classKind: ClassKind): Member defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'PropertyInfo' @ [107:40] ==> public companion object defined in org.jetbrains.kotlin.j2k.PropertyInfo[FakeCallableDescriptorForObject]

'fromFieldWithNoAccessors' @ [107:53] ==> public final fun fromFieldWithNoAccessors(field: PsiField, converter: Converter): PropertyInfo defined in org.jetbrains.kotlin.j2k.PropertyInfo.Companion[SimpleFunctionDescriptorImpl]

'element' @ [107:78] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.convertTopElement[ValueParameterDescriptorImpl]

'this' @ [107:87] ==> <this> defined in org.jetbrains.kotlin.j2k.Converter[LazyClassReceiverParameterDescriptor]

'FINAL_CLASS' @ [107:104] ==> enum entry FINAL_CLASS defined in org.jetbrains.kotlin.j2k.ClassKind[FakeCallableDescriptorForObject]

'createDefaultCodeConverter' @ [108:28] ==> private final fun createDefaultCodeConverter(): CodeConverter defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'convertStatement' @ [108:57] ==> public final fun convertStatement(statement: PsiStatement?): Statement defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'element' @ [108:74] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.convertTopElement[ValueParameterDescriptorImpl]

'createDefaultCodeConverter' @ [109:29] ==> private final fun createDefaultCodeConverter(): CodeConverter defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'convertExpression' @ [109:58] ==> public final fun convertExpression(expression: PsiExpression?, shouldParenthesize: Boolean = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'element' @ [109:76] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.convertTopElement[ValueParameterDescriptorImpl]

'convertImportList' @ [110:29] ==> public fun Converter.convertImportList(importList: PsiImportList): ImportList defined in org.jetbrains.kotlin.j2k in file importConversion.kt[SimpleFunctionDescriptorImpl]

'element' @ [110:47] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.convertTopElement[ValueParameterDescriptorImpl]

'convertImport' @ [111:38] ==> public fun Converter.convertImport(anImport: PsiImportStatementBase, dumpConversion: Boolean = ...): List<Import> defined in org.jetbrains.kotlin.j2k[SimpleFunctionDescriptorImpl]

'element' @ [111:52] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.convertTopElement[ValueParameterDescriptorImpl]

'singleOrNull' @ [111:84] ==> public fun <T> List<Import>.singleOrNull(): Import? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Import

'annotationConverter' @ [112:29] ==> public final val annotationConverter: AnnotationConverter defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'convertAnnotation' @ [112:49] ==> public final fun convertAnnotation(annotation: PsiAnnotation, newLineAfter: Boolean, target: AnnotationUseTarget? = ...): Annotation? defined in org.jetbrains.kotlin.j2k.AnnotationConverter[SimpleFunctionDescriptorImpl]

'element' @ [112:67] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.convertTopElement[ValueParameterDescriptorImpl]

'PackageStatement' @ [113:35] ==> public constructor PackageStatement(packageName: String) defined in org.jetbrains.kotlin.j2k.ast.PackageStatement[ClassConstructorDescriptorImpl]

'quoteKeywords' @ [113:52] ==> public fun quoteKeywords(packageName: String): String defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'element' @ [113:66] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.convertTopElement[ValueParameterDescriptorImpl]

'packageName' @ [113:74] ==> public final val PsiPackageStatement.packageName: (String..String?)[MyPropertyDescriptor]

'assignPrototype' @ [113:94] ==> public fun <TElement : Element> PackageStatement.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): PackageStatement defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> PackageStatement

'element' @ [113:110] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.convertTopElement[ValueParameterDescriptorImpl]

'if (element.parent is PsiReferenceList) {
                val factory = JavaPsiFacade.getInstance(project).elementFactory
                typeConverter.convertType(factory.createType(element), Nullability.NotNull)
            }
            else null' @ [115:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type?, elseBranch: Type?): Type?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type?

'element' @ [115:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.convertTopElement[ValueParameterDescriptorImpl]

'parent' @ [115:25] ==> public final val PsiJavaCodeReferenceElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getInstance' @ [116:45] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'project' @ [116:57] ==> public final val project: Project defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'elementFactory' @ [116:66] ==> public final val JavaPsiFacade.elementFactory: PsiElementFactory[MyPropertyDescriptor]

'typeConverter' @ [117:17] ==> public final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'convertType' @ [117:31] ==> public final fun convertType(type: PsiType?, nullability: Nullability = ..., mutability: Mutability = ..., inAnnotationType: Boolean = ...): Type defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'factory' @ [117:43] ==> val factory: PsiElementFactory defined in org.jetbrains.kotlin.j2k.Converter.convertTopElement[LocalVariableDescriptor]

'createType' @ [117:51] ==> @NotNull public abstract fun createType(@NotNull p0: PsiJavaCodeReferenceElement): PsiClassType defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'element' @ [117:62] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.convertTopElement[ValueParameterDescriptorImpl]

'NotNull' @ [117:84] ==> enum entry NotNull defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'createDefaultCodeConverter' @ [125:29] ==> private final fun createDefaultCodeConverter(): CodeConverter defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'withSpecialExpressionConverter' @ [125:58] ==> public final fun withSpecialExpressionConverter(specialConverter: SpecialExpressionConverter): CodeConverter defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'UsageProcessingExpressionConverter' @ [125:89] ==> public constructor UsageProcessingExpressionConverter(processings: Map<PsiElement, Collection<UsageProcessing>>) defined in org.jetbrains.kotlin.j2k.usageProcessing.UsageProcessingExpressionConverter[ClassConstructorDescriptorImpl]

'usageProcessings' @ [125:124] ==> value-parameter usageProcessings: Map<PsiElement, Collection<UsageProcessing>> defined in org.jetbrains.kotlin.j2k.Converter.unfoldDeferredElements[ValueParameterDescriptorImpl]

'i' @ [129:16] ==> var i: Int defined in org.jetbrains.kotlin.j2k.Converter.unfoldDeferredElements[LocalVariableDescriptor]

'commonState' @ [129:20] ==> private final val commonState: Converter.CommonState defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'deferredElements' @ [129:32] ==> public final val deferredElements: ArrayList<DeferredElement<*>> defined in org.jetbrains.kotlin.j2k.Converter.CommonState[PropertyDescriptorImpl]

'size' @ [129:49] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'commonState' @ [130:35] ==> private final val commonState: Converter.CommonState defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'deferredElements' @ [130:47] ==> public final val deferredElements: ArrayList<DeferredElement<*>> defined in org.jetbrains.kotlin.j2k.Converter.CommonState[PropertyDescriptorImpl]

'i' @ [130:64] ==> var i: Int defined in org.jetbrains.kotlin.j2k.Converter.unfoldDeferredElements[LocalVariableDescriptor]

'deferredElement' @ [131:13] ==> val deferredElement: DeferredElement<*> defined in org.jetbrains.kotlin.j2k.Converter.unfoldDeferredElements[LocalVariableDescriptor]

'unfold' @ [131:29] ==> public final fun unfold(codeConverter: CodeConverter): Unit defined in org.jetbrains.kotlin.j2k.ast.DeferredElement[SimpleFunctionDescriptorImpl]

'codeConverter' @ [131:36] ==> val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.Converter.unfoldDeferredElements[LocalVariableDescriptor]

'commonState' @ [134:9] ==> private final val commonState: Converter.CommonState defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'postUnfoldActions' @ [134:21] ==> public final val postUnfoldActions: ArrayList<() -> Unit> defined in org.jetbrains.kotlin.j2k.Converter.CommonState[PropertyDescriptorImpl]

'forEach' @ [134:39] ==> @HidesMembers public inline fun <T> Iterable<() -> Unit>.forEach(action: (() -> Unit) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function0<Unit>

'invoke' @ [134:49] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'DeferredElement' @ [138:23] ==> public constructor DeferredElement<TResult : Element>(generator: (CodeConverter) -> TResult) defined in org.jetbrains.kotlin.j2k.ast.DeferredElement[ClassConstructorDescriptorImpl]
Inferred types:
    <TResult : Element> -> TResult

'generator' @ [138:39] ==> value-parameter generator: (CodeConverter) -> TResult defined in org.jetbrains.kotlin.j2k.Converter.deferredElement[ValueParameterDescriptorImpl]

'commonState' @ [139:9] ==> private final val commonState: Converter.CommonState defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'deferredElements' @ [139:21] ==> public final val deferredElements: ArrayList<DeferredElement<*>> defined in org.jetbrains.kotlin.j2k.Converter.CommonState[PropertyDescriptorImpl]

'add' @ [139:38] ==> public open fun add(element: DeferredElement<*>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'element' @ [139:42] ==> val element: DeferredElement<TResult> defined in org.jetbrains.kotlin.j2k.Converter.deferredElement[LocalVariableDescriptor]

'element' @ [140:16] ==> val element: DeferredElement<TResult> defined in org.jetbrains.kotlin.j2k.Converter.deferredElement[LocalVariableDescriptor]

'commonState' @ [144:9] ==> private final val commonState: Converter.CommonState defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'invoke' @ [144:21] ==> public abstract operator fun invoke(p1: UsageProcessing): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'processing' @ [144:47] ==> value-parameter processing: UsageProcessing defined in org.jetbrains.kotlin.j2k.Converter.addUsageProcessing[ValueParameterDescriptorImpl]

'commonState' @ [148:9] ==> private final val commonState: Converter.CommonState defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'postUnfoldActions' @ [148:21] ==> public final val postUnfoldActions: ArrayList<() -> Unit> defined in org.jetbrains.kotlin.j2k.Converter.CommonState[PropertyDescriptorImpl]

'add' @ [148:39] ==> public open fun add(element: () -> Unit): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'action' @ [148:43] ==> value-parameter action: () -> Unit defined in org.jetbrains.kotlin.j2k.Converter.addPostUnfoldDeferredElementsAction[ValueParameterDescriptorImpl]

'javaFile' @ [152:33] ==> value-parameter javaFile: PsiJavaFile defined in org.jetbrains.kotlin.j2k.Converter.convertFile[ValueParameterDescriptorImpl]

'children' @ [152:42] ==> public final val PsiJavaFile.children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'mapNotNull' @ [152:51] ==> public inline fun <T, R : Any> Array<out (PsiElement..PsiElement?)>.mapNotNull(transform: ((PsiElement..PsiElement?)) -> Element?): List<Element> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <R : Any> -> Element

'convertTopElement' @ [152:64] ==> private final fun convertTopElement(element: PsiElement): Element? defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'it' @ [152:82] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.Converter.convertFile.<anonymous>[ValueParameterDescriptorImpl]

'File' @ [153:16] ==> public constructor File(elements: List<Element>) defined in org.jetbrains.kotlin.j2k.ast.File[ClassConstructorDescriptorImpl]

'convertedChildren' @ [153:21] ==> val convertedChildren: List<Element> defined in org.jetbrains.kotlin.j2k.Converter.convertFile[LocalVariableDescriptor]

'assignPrototype' @ [153:40] ==> public fun <TElement : Element> File.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): File defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> File

'javaFile' @ [153:56] ==> value-parameter javaFile: PsiJavaFile defined in org.jetbrains.kotlin.j2k.Converter.convertFile[ValueParameterDescriptorImpl]

'annotationConverter' @ [157:15] ==> public final val annotationConverter: AnnotationConverter defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'convertAnnotations' @ [157:35] ==> public final fun convertAnnotations(owner: PsiModifierListOwner, target: AnnotationUseTarget? = ...): Annotations defined in org.jetbrains.kotlin.j2k.AnnotationConverter[SimpleFunctionDescriptorImpl]

'owner' @ [157:54] ==> value-parameter owner: PsiModifierListOwner defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotations[ValueParameterDescriptorImpl]

'target' @ [157:61] ==> value-parameter target: AnnotationUseTarget? = ... defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotations[ValueParameterDescriptorImpl]

'psiClass' @ [160:13] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertClass[ValueParameterDescriptorImpl]

'isAnnotationType' @ [160:22] ==> public final val PsiClass.isAnnotationType: Boolean[MyPropertyDescriptor]

'convertAnnotationType' @ [161:20] ==> private final fun convertAnnotationType(psiClass: PsiClass): Class defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'psiClass' @ [161:42] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertClass[ValueParameterDescriptorImpl]

'convertAnnotations' @ [164:27] ==> public final fun convertAnnotations(owner: PsiModifierListOwner, target: AnnotationUseTarget? = ...): Annotations defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'psiClass' @ [164:46] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertClass[ValueParameterDescriptorImpl]

'convertModifiers' @ [165:25] ==> public final fun convertModifiers(owner: PsiModifierListOwner, isMethodInOpenClass: Boolean): Modifiers defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'psiClass' @ [165:42] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertClass[ValueParameterDescriptorImpl]

'convertTypeParameterList' @ [166:30] ==> public fun Converter.convertTypeParameterList(typeParameterList: PsiTypeParameterList?): TypeParameterList defined in org.jetbrains.kotlin.j2k.ast in file TypeParameters.kt[SimpleFunctionDescriptorImpl]

'psiClass' @ [166:55] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertClass[ValueParameterDescriptorImpl]

'typeParameterList' @ [166:64] ==> public final val PsiClass.typeParameterList: PsiTypeParameterList?[MyPropertyDescriptor]

'convertToNotNullableTypes' @ [167:28] ==> private final fun convertToNotNullableTypes(refs: PsiReferenceList?): List<Type> defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'psiClass' @ [167:54] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertClass[ValueParameterDescriptorImpl]

'extendsList' @ [167:63] ==> public final val PsiClass.extendsList: PsiReferenceList?[MyPropertyDescriptor]

'convertToNotNullableTypes' @ [168:31] ==> private final fun convertToNotNullableTypes(refs: PsiReferenceList?): List<Type> defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'psiClass' @ [168:57] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertClass[ValueParameterDescriptorImpl]

'implementsList' @ [168:66] ==> public final val PsiClass.implementsList: PsiReferenceList?[MyPropertyDescriptor]

'psiClass' @ [169:20] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertClass[ValueParameterDescriptorImpl]

'declarationIdentifier' @ [169:29] ==> public fun PsiNameIdentifierOwner.declarationIdentifier(): Identifier defined in org.jetbrains.kotlin.j2k.ast in file Identifier.kt[SimpleFunctionDescriptorImpl]

'when {
            psiClass.isInterface -> {
                val classBody = ClassBodyConverter(psiClass, ClassKind.INTERFACE, this).convertBody()
                Interface(name, annotations, modifiers, typeParameters, extendsTypes, implementsTypes, classBody)
            }

            psiClass.isEnum -> {
                modifiers = modifiers.without(Modifier.ABSTRACT)
                val hasInheritors = psiClass.fields.any { it is PsiEnumConstant && it.initializingClass != null }
                val classBody = ClassBodyConverter(psiClass, if (hasInheritors) ClassKind.OPEN_ENUM else ClassKind.FINAL_ENUM, this).convertBody()
                Enum(name, annotations, modifiers, typeParameters, implementsTypes, classBody)
            }

            else -> {
                if (shouldConvertIntoObject(psiClass)) {
                    val classBody = ClassBodyConverter(psiClass, ClassKind.OBJECT, this).convertBody()
                    Object(name, annotations, modifiers.without(Modifier.ABSTRACT), classBody)
                }
                else {
                    if (psiClass.containingClass != null && !psiClass.hasModifierProperty(PsiModifier.STATIC)) {
                        modifiers = modifiers.with(Modifier.INNER)
                    }

                    if (needOpenModifier(psiClass)) {
                        modifiers = modifiers.with(Modifier.OPEN)
                    }

                    val isOpen = modifiers.contains(Modifier.OPEN) || modifiers.contains(Modifier.ABSTRACT)
                    val classBody = ClassBodyConverter(psiClass, if (isOpen) ClassKind.OPEN_CLASS else ClassKind.FINAL_CLASS, this).convertBody()
                    Class(name, annotations, modifiers, typeParameters, extendsTypes, classBody.baseClassParams, implementsTypes, classBody)
                }
            }
        }' @ [171:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Class, entry1: Class, entry2: Class): Class[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Class

'psiClass' @ [172:13] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertClass[ValueParameterDescriptorImpl]

'isInterface' @ [172:22] ==> public final val PsiClass.isInterface: Boolean[MyPropertyDescriptor]

'ClassBodyConverter' @ [173:33] ==> public constructor ClassBodyConverter(psiClass: PsiClass, classKind: ClassKind, converter: Converter) defined in org.jetbrains.kotlin.j2k.ClassBodyConverter[ClassConstructorDescriptorImpl]

'psiClass' @ [173:52] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertClass[ValueParameterDescriptorImpl]

'INTERFACE' @ [173:72] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.j2k.ClassKind[FakeCallableDescriptorForObject]

'this' @ [173:83] ==> <this> defined in org.jetbrains.kotlin.j2k.Converter[LazyClassReceiverParameterDescriptor]

'convertBody' @ [173:89] ==> public final fun convertBody(): ClassBody defined in org.jetbrains.kotlin.j2k.ClassBodyConverter[SimpleFunctionDescriptorImpl]

'Interface' @ [174:17] ==> public constructor Interface(name: Identifier, annotations: Annotations, modifiers: Modifiers, typeParameterList: TypeParameterList, extendsTypes: List<Type>, implementsTypes: List<Type>, body: ClassBody) defined in org.jetbrains.kotlin.j2k.ast.Interface[ClassConstructorDescriptorImpl]

'name' @ [174:27] ==> val name: Identifier defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'annotations' @ [174:33] ==> val annotations: Annotations defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'modifiers' @ [174:46] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'typeParameters' @ [174:57] ==> val typeParameters: TypeParameterList defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'extendsTypes' @ [174:73] ==> val extendsTypes: List<Type> defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'implementsTypes' @ [174:87] ==> val implementsTypes: List<Type> defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'classBody' @ [174:104] ==> val classBody: ClassBody defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'psiClass' @ [177:13] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertClass[ValueParameterDescriptorImpl]

'isEnum' @ [177:22] ==> public final val PsiClass.isEnum: Boolean[MyPropertyDescriptor]

'modifiers' @ [178:17] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'modifiers' @ [178:29] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'without' @ [178:39] ==> public final fun without(modifier: Modifier?): Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'ABSTRACT' @ [178:56] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'psiClass' @ [179:37] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertClass[ValueParameterDescriptorImpl]

'fields' @ [179:46] ==> public final val PsiClass.fields: (Array<(PsiField..PsiField?)>..Array<out (PsiField..PsiField?)>)[MyPropertyDescriptor]

'any' @ [179:53] ==> public inline fun <T> Array<out (PsiField..PsiField?)>.any(predicate: ((PsiField..PsiField?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiField..com.intellij.psi.PsiField?)

'it' @ [179:59] ==> value-parameter it: (PsiField..PsiField?) defined in org.jetbrains.kotlin.j2k.Converter.convertClass.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [179:84] ==> value-parameter it: (PsiField..PsiField?) defined in org.jetbrains.kotlin.j2k.Converter.convertClass.<anonymous>[ValueParameterDescriptorImpl]

'initializingClass' @ [179:87] ==> public final val PsiEnumConstant.initializingClass: PsiEnumConstantInitializer?[MyPropertyDescriptor]

'ClassBodyConverter' @ [180:33] ==> public constructor ClassBodyConverter(psiClass: PsiClass, classKind: ClassKind, converter: Converter) defined in org.jetbrains.kotlin.j2k.ClassBodyConverter[ClassConstructorDescriptorImpl]

'psiClass' @ [180:52] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertClass[ValueParameterDescriptorImpl]

'if (hasInheritors) ClassKind.OPEN_ENUM else ClassKind.FINAL_ENUM' @ [180:62] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ClassKind, elseBranch: ClassKind): ClassKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClassKind

'hasInheritors' @ [180:66] ==> val hasInheritors: Boolean defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'OPEN_ENUM' @ [180:91] ==> enum entry OPEN_ENUM defined in org.jetbrains.kotlin.j2k.ClassKind[FakeCallableDescriptorForObject]

'FINAL_ENUM' @ [180:116] ==> enum entry FINAL_ENUM defined in org.jetbrains.kotlin.j2k.ClassKind[FakeCallableDescriptorForObject]

'this' @ [180:128] ==> <this> defined in org.jetbrains.kotlin.j2k.Converter[LazyClassReceiverParameterDescriptor]

'convertBody' @ [180:134] ==> public final fun convertBody(): ClassBody defined in org.jetbrains.kotlin.j2k.ClassBodyConverter[SimpleFunctionDescriptorImpl]

'Enum' @ [181:17] ==> public constructor Enum(name: Identifier, annotations: Annotations, modifiers: Modifiers, typeParameterList: TypeParameterList, implementsTypes: List<Type>, body: ClassBody) defined in org.jetbrains.kotlin.j2k.ast.Enum[ClassConstructorDescriptorImpl]

'name' @ [181:22] ==> val name: Identifier defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'annotations' @ [181:28] ==> val annotations: Annotations defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'modifiers' @ [181:41] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'typeParameters' @ [181:52] ==> val typeParameters: TypeParameterList defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'implementsTypes' @ [181:68] ==> val implementsTypes: List<Type> defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'classBody' @ [181:85] ==> val classBody: ClassBody defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'if (shouldConvertIntoObject(psiClass)) {
                    val classBody = ClassBodyConverter(psiClass, ClassKind.OBJECT, this).convertBody()
                    Object(name, annotations, modifiers.without(Modifier.ABSTRACT), classBody)
                }
                else {
                    if (psiClass.containingClass != null && !psiClass.hasModifierProperty(PsiModifier.STATIC)) {
                        modifiers = modifiers.with(Modifier.INNER)
                    }

                    if (needOpenModifier(psiClass)) {
                        modifiers = modifiers.with(Modifier.OPEN)
                    }

                    val isOpen = modifiers.contains(Modifier.OPEN) || modifiers.contains(Modifier.ABSTRACT)
                    val classBody = ClassBodyConverter(psiClass, if (isOpen) ClassKind.OPEN_CLASS else ClassKind.FINAL_CLASS, this).convertBody()
                    Class(name, annotations, modifiers, typeParameters, extendsTypes, classBody.baseClassParams, implementsTypes, classBody)
                }' @ [185:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Class, elseBranch: Class): Class[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Class

'shouldConvertIntoObject' @ [185:21] ==> private final fun shouldConvertIntoObject(psiClass: PsiClass): Boolean defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'psiClass' @ [185:45] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertClass[ValueParameterDescriptorImpl]

'ClassBodyConverter' @ [186:37] ==> public constructor ClassBodyConverter(psiClass: PsiClass, classKind: ClassKind, converter: Converter) defined in org.jetbrains.kotlin.j2k.ClassBodyConverter[ClassConstructorDescriptorImpl]

'psiClass' @ [186:56] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertClass[ValueParameterDescriptorImpl]

'OBJECT' @ [186:76] ==> enum entry OBJECT defined in org.jetbrains.kotlin.j2k.ClassKind[FakeCallableDescriptorForObject]

'this' @ [186:84] ==> <this> defined in org.jetbrains.kotlin.j2k.Converter[LazyClassReceiverParameterDescriptor]

'convertBody' @ [186:90] ==> public final fun convertBody(): ClassBody defined in org.jetbrains.kotlin.j2k.ClassBodyConverter[SimpleFunctionDescriptorImpl]

'Object' @ [187:21] ==> public constructor Object(name: Identifier, annotations: Annotations, modifiers: Modifiers, body: ClassBody) defined in org.jetbrains.kotlin.j2k.ast.Object[ClassConstructorDescriptorImpl]

'name' @ [187:28] ==> val name: Identifier defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'annotations' @ [187:34] ==> val annotations: Annotations defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'modifiers' @ [187:47] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'without' @ [187:57] ==> public final fun without(modifier: Modifier?): Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'ABSTRACT' @ [187:74] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'classBody' @ [187:85] ==> val classBody: ClassBody defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'psiClass' @ [190:25] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertClass[ValueParameterDescriptorImpl]

'containingClass' @ [190:34] ==> public final val PsiClass.containingClass: PsiClass?[MyPropertyDescriptor]

'!' @ [190:61] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'psiClass' @ [190:62] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertClass[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [190:71] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiClass[JavaMethodDescriptor]

'STATIC' @ [190:103] ==> public const final val STATIC: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'modifiers' @ [191:25] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'modifiers' @ [191:37] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'with' @ [191:47] ==> public final fun with(modifier: Modifier?): Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'INNER' @ [191:61] ==> enum entry INNER defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'needOpenModifier' @ [194:25] ==> public final fun needOpenModifier(psiClass: PsiClass): Boolean defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'psiClass' @ [194:42] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertClass[ValueParameterDescriptorImpl]

'modifiers' @ [195:25] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'modifiers' @ [195:37] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'with' @ [195:47] ==> public final fun with(modifier: Modifier?): Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'OPEN' @ [195:61] ==> enum entry OPEN defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'modifiers' @ [198:34] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'contains' @ [198:44] ==> public final fun contains(modifier: Modifier): Boolean defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'OPEN' @ [198:62] ==> enum entry OPEN defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'modifiers' @ [198:71] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'contains' @ [198:81] ==> public final fun contains(modifier: Modifier): Boolean defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'ABSTRACT' @ [198:99] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'ClassBodyConverter' @ [199:37] ==> public constructor ClassBodyConverter(psiClass: PsiClass, classKind: ClassKind, converter: Converter) defined in org.jetbrains.kotlin.j2k.ClassBodyConverter[ClassConstructorDescriptorImpl]

'psiClass' @ [199:56] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertClass[ValueParameterDescriptorImpl]

'if (isOpen) ClassKind.OPEN_CLASS else ClassKind.FINAL_CLASS' @ [199:66] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ClassKind, elseBranch: ClassKind): ClassKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClassKind

'isOpen' @ [199:70] ==> val isOpen: Boolean defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'OPEN_CLASS' @ [199:88] ==> enum entry OPEN_CLASS defined in org.jetbrains.kotlin.j2k.ClassKind[FakeCallableDescriptorForObject]

'FINAL_CLASS' @ [199:114] ==> enum entry FINAL_CLASS defined in org.jetbrains.kotlin.j2k.ClassKind[FakeCallableDescriptorForObject]

'this' @ [199:127] ==> <this> defined in org.jetbrains.kotlin.j2k.Converter[LazyClassReceiverParameterDescriptor]

'convertBody' @ [199:133] ==> public final fun convertBody(): ClassBody defined in org.jetbrains.kotlin.j2k.ClassBodyConverter[SimpleFunctionDescriptorImpl]

'Class' @ [200:21] ==> public constructor Class(name: Identifier, annotations: Annotations, modifiers: Modifiers, typeParameterList: TypeParameterList, extendsTypes: List<Type>, baseClassParams: List<DeferredElement<Expression>>?, implementsTypes: List<Type>, body: ClassBody) defined in org.jetbrains.kotlin.j2k.ast.Class[ClassConstructorDescriptorImpl]

'name' @ [200:27] ==> val name: Identifier defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'annotations' @ [200:33] ==> val annotations: Annotations defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'modifiers' @ [200:46] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'typeParameters' @ [200:57] ==> val typeParameters: TypeParameterList defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'extendsTypes' @ [200:73] ==> val extendsTypes: List<Type> defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'classBody' @ [200:87] ==> val classBody: ClassBody defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'baseClassParams' @ [200:97] ==> public final val baseClassParams: List<DeferredElement<Expression>>? defined in org.jetbrains.kotlin.j2k.ast.ClassBody[PropertyDescriptorImpl]

'implementsTypes' @ [200:114] ==> val implementsTypes: List<Type> defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'classBody' @ [200:131] ==> val classBody: ClassBody defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'assignPrototype' @ [203:11] ==> public fun <TElement : Element> Class.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): Class defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Class

'psiClass' @ [203:27] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertClass[ValueParameterDescriptorImpl]

'converted' @ [205:13] ==> val converted: Class defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'body' @ [205:23] ==> public final val body: ClassBody defined in org.jetbrains.kotlin.j2k.ast.Class[PropertyDescriptorImpl]

'primaryConstructorSignature' @ [205:28] ==> public final val primaryConstructorSignature: PrimaryConstructorSignature? defined in org.jetbrains.kotlin.j2k.ast.ClassBody[PropertyDescriptorImpl]

'addPostUnfoldDeferredElementsAction' @ [206:13] ==> public final fun addPostUnfoldDeferredElementsAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'converted' @ [207:42] ==> val converted: Class defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'body' @ [207:52] ==> public final val body: ClassBody defined in org.jetbrains.kotlin.j2k.ast.Class[PropertyDescriptorImpl]

'primaryConstructor' @ [207:57] ==> public final val primaryConstructor: PrimaryConstructor? defined in org.jetbrains.kotlin.j2k.ast.ClassBody[PropertyDescriptorImpl]

'primaryConstructor' @ [208:21] ==> val primaryConstructor: PrimaryConstructor? defined in org.jetbrains.kotlin.j2k.Converter.convertClass.<anonymous>[LocalVariableDescriptor]

'if (primaryConstructor.initializer.isEmpty)
                        converted.prototypes = converted.prototypes!! + primaryConstructor.prototypes!!
                    else
                        primaryConstructor.initializer.assignPrototypesFrom(primaryConstructor, CommentsAndSpacesInheritance.NO_SPACES)' @ [209:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'primaryConstructor' @ [209:25] ==> val primaryConstructor: PrimaryConstructor? defined in org.jetbrains.kotlin.j2k.Converter.convertClass.<anonymous>[LocalVariableDescriptor]

'initializer' @ [209:44] ==> public final val initializer: Initializer defined in org.jetbrains.kotlin.j2k.ast.PrimaryConstructor[PropertyDescriptorImpl]

'isEmpty' @ [209:56] ==> public open val isEmpty: Boolean defined in org.jetbrains.kotlin.j2k.ast.Initializer[PropertyDescriptorImpl]

'converted' @ [210:25] ==> val converted: Class defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'prototypes' @ [210:35] ==> public final var prototypes: List<PrototypeInfo>? defined in org.jetbrains.kotlin.j2k.ast.Class[PropertyDescriptorImpl]

'converted' @ [210:48] ==> val converted: Class defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'prototypes' @ [210:58] ==> public final var prototypes: List<PrototypeInfo>? defined in org.jetbrains.kotlin.j2k.ast.Class[PropertyDescriptorImpl]

'primaryConstructor' @ [210:73] ==> val primaryConstructor: PrimaryConstructor? defined in org.jetbrains.kotlin.j2k.Converter.convertClass.<anonymous>[LocalVariableDescriptor]

'prototypes' @ [210:92] ==> public final var prototypes: List<PrototypeInfo>? defined in org.jetbrains.kotlin.j2k.ast.PrimaryConstructor[PropertyDescriptorImpl]

'primaryConstructor' @ [212:25] ==> val primaryConstructor: PrimaryConstructor? defined in org.jetbrains.kotlin.j2k.Converter.convertClass.<anonymous>[LocalVariableDescriptor]

'initializer' @ [212:44] ==> public final val initializer: Initializer defined in org.jetbrains.kotlin.j2k.ast.PrimaryConstructor[PropertyDescriptorImpl]

'assignPrototypesFrom' @ [212:56] ==> public fun <TElement : Element> Initializer.assignPrototypesFrom(element: Element, inheritance: CommentsAndSpacesInheritance? = ...): Initializer defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Initializer

'primaryConstructor' @ [212:77] ==> val primaryConstructor: PrimaryConstructor? defined in org.jetbrains.kotlin.j2k.Converter.convertClass.<anonymous>[LocalVariableDescriptor]

'CommentsAndSpacesInheritance' @ [212:97] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance[FakeCallableDescriptorForObject]

'NO_SPACES' @ [212:126] ==> public final val NO_SPACES: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance.Companion[PropertyDescriptorImpl]

'converted' @ [215:16] ==> val converted: Class defined in org.jetbrains.kotlin.j2k.Converter.convertClass[LocalVariableDescriptor]

'if (psiClass.hasModifierProperty(PsiModifier.FINAL) || psiClass.hasModifierProperty(PsiModifier.ABSTRACT))
            false
        else
            settings.openByDefault || referenceSearcher.hasInheritors(psiClass)' @ [219:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'psiClass' @ [219:20] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.needOpenModifier[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [219:29] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiClass[JavaMethodDescriptor]

'FINAL' @ [219:61] ==> public const final val FINAL: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'psiClass' @ [219:71] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.needOpenModifier[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [219:80] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiClass[JavaMethodDescriptor]

'ABSTRACT' @ [219:112] ==> public const final val ABSTRACT: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'settings' @ [222:13] ==> public final val settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'openByDefault' @ [222:22] ==> public final var openByDefault: Boolean defined in org.jetbrains.kotlin.j2k.ConverterSettings[PropertyDescriptorImpl]

'referenceSearcher' @ [222:39] ==> public final val referenceSearcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'hasInheritors' @ [222:57] ==> public abstract fun hasInheritors(`class`: PsiClass): Boolean defined in org.jetbrains.kotlin.j2k.ReferenceSearcher[SimpleFunctionDescriptorImpl]

'psiClass' @ [222:71] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.needOpenModifier[ValueParameterDescriptorImpl]

'psiClass' @ [226:23] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.shouldConvertIntoObject[ValueParameterDescriptorImpl]

'methods' @ [226:32] ==> public final val PsiClass.methods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'psiClass' @ [227:22] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.shouldConvertIntoObject[ValueParameterDescriptorImpl]

'fields' @ [227:31] ==> public final val PsiClass.fields: (Array<(PsiField..PsiField?)>..Array<out (PsiField..PsiField?)>)[MyPropertyDescriptor]

'psiClass' @ [228:23] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.shouldConvertIntoObject[ValueParameterDescriptorImpl]

'innerClasses' @ [228:32] ==> public final val PsiClass.innerClasses: (Array<(PsiClass..PsiClass?)>..Array<out (PsiClass..PsiClass?)>)[MyPropertyDescriptor]

'methods' @ [229:13] ==> val methods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in org.jetbrains.kotlin.j2k.Converter.shouldConvertIntoObject[LocalVariableDescriptor]

'isEmpty' @ [229:21] ==> @InlineOnly public inline fun <T> Array<out (PsiMethod..PsiMethod?)>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'fields' @ [229:34] ==> val fields: (Array<(PsiField..PsiField?)>..Array<out (PsiField..PsiField?)>) defined in org.jetbrains.kotlin.j2k.Converter.shouldConvertIntoObject[LocalVariableDescriptor]

'isEmpty' @ [229:41] ==> @InlineOnly public inline fun <T> Array<out (PsiField..PsiField?)>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiField..com.intellij.psi.PsiField?)

'member' @ [230:43] ==> value-parameter member: PsiMember defined in org.jetbrains.kotlin.j2k.Converter.shouldConvertIntoObject.isStatic[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [230:50] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiMember[JavaMethodDescriptor]

'STATIC' @ [230:82] ==> public const final val STATIC: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'!' @ [231:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'methods' @ [231:14] ==> val methods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in org.jetbrains.kotlin.j2k.Converter.shouldConvertIntoObject[LocalVariableDescriptor]

'all' @ [231:22] ==> public inline fun <T> Array<out (PsiMethod..PsiMethod?)>.all(predicate: ((PsiMethod..PsiMethod?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'isStatic' @ [231:28] ==> local final fun isStatic(member: PsiMember): Boolean defined in org.jetbrains.kotlin.j2k.Converter.shouldConvertIntoObject[SimpleFunctionDescriptorImpl]

'it' @ [231:37] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.j2k.Converter.shouldConvertIntoObject.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [231:44] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.j2k.Converter.shouldConvertIntoObject.<anonymous>[ValueParameterDescriptorImpl]

'isConstructor' @ [231:47] ==> public final val PsiMethod.isConstructor: Boolean[MyPropertyDescriptor]

'!' @ [231:66] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'fields' @ [231:67] ==> val fields: (Array<(PsiField..PsiField?)>..Array<out (PsiField..PsiField?)>) defined in org.jetbrains.kotlin.j2k.Converter.shouldConvertIntoObject[LocalVariableDescriptor]

'all' @ [231:74] ==> public inline fun <T> Array<out (PsiField..PsiField?)>.all(predicate: ((PsiField..PsiField?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiField..com.intellij.psi.PsiField?)

'!' @ [231:93] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'classes' @ [231:94] ==> val classes: (Array<(PsiClass..PsiClass?)>..Array<out (PsiClass..PsiClass?)>) defined in org.jetbrains.kotlin.j2k.Converter.shouldConvertIntoObject[LocalVariableDescriptor]

'all' @ [231:102] ==> public inline fun <T> Array<out (PsiClass..PsiClass?)>.all(predicate: ((PsiClass..PsiClass?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'psiClass' @ [233:28] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.shouldConvertIntoObject[ValueParameterDescriptorImpl]

'constructors' @ [233:37] ==> public final val PsiClass.constructors: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'constructors' @ [234:13] ==> val constructors: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in org.jetbrains.kotlin.j2k.Converter.shouldConvertIntoObject[LocalVariableDescriptor]

'size' @ [234:26] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'constructors' @ [235:27] ==> val constructors: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in org.jetbrains.kotlin.j2k.Converter.shouldConvertIntoObject[LocalVariableDescriptor]

'singleOrNull' @ [235:40] ==> public fun <T> Array<out (PsiMethod..PsiMethod?)>.singleOrNull(): PsiMethod? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'constructor' @ [236:13] ==> val constructor: PsiMethod? defined in org.jetbrains.kotlin.j2k.Converter.shouldConvertIntoObject[LocalVariableDescriptor]

'!' @ [237:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'constructor' @ [237:18] ==> val constructor: PsiMethod? defined in org.jetbrains.kotlin.j2k.Converter.shouldConvertIntoObject[LocalVariableDescriptor]

'hasModifierProperty' @ [237:30] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'PRIVATE' @ [237:62] ==> public const final val PRIVATE: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'constructor' @ [238:17] ==> val constructor: PsiMethod? defined in org.jetbrains.kotlin.j2k.Converter.shouldConvertIntoObject[LocalVariableDescriptor]

'parameterList' @ [238:29] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parameters' @ [238:43] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [238:54] ==> @InlineOnly public inline fun <T> Array<out (PsiParameter..PsiParameter?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiParameter..com.intellij.psi.PsiParameter?)

'constructor' @ [239:17] ==> val constructor: PsiMethod? defined in org.jetbrains.kotlin.j2k.Converter.shouldConvertIntoObject[LocalVariableDescriptor]

'body' @ [239:29] ==> public final val PsiMethod.body: PsiCodeBlock?[MyPropertyDescriptor]

'statements' @ [239:35] ==> public final val PsiCodeBlock.statements: (Array<(PsiStatement..PsiStatement?)>..Array<out (PsiStatement..PsiStatement?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [239:47] ==> @InlineOnly public inline fun <T> Array<out (PsiStatement..PsiStatement?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiStatement..com.intellij.psi.PsiStatement?)

'constructor' @ [240:17] ==> val constructor: PsiMethod? defined in org.jetbrains.kotlin.j2k.Converter.shouldConvertIntoObject[LocalVariableDescriptor]

'modifierList' @ [240:29] ==> public final val PsiMethod.modifierList: PsiModifierList[MyPropertyDescriptor]

'annotations' @ [240:42] ==> public final val PsiModifierList.annotations: (Array<(PsiAnnotation..PsiAnnotation?)>..Array<out (PsiAnnotation..PsiAnnotation?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [240:54] ==> @InlineOnly public inline fun <T> Array<out (PsiAnnotation..PsiAnnotation?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiAnnotation..com.intellij.psi.PsiAnnotation?)

'psiClass' @ [243:13] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.shouldConvertIntoObject[ValueParameterDescriptorImpl]

'extendsListTypes' @ [243:22] ==> public final val PsiClass.extendsListTypes: (Array<(PsiClassType..PsiClassType?)>..Array<out (PsiClassType..PsiClassType?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [243:39] ==> @InlineOnly public inline fun <T> Array<out (PsiClassType..PsiClassType?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClassType..com.intellij.psi.PsiClassType?)

'psiClass' @ [243:55] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.shouldConvertIntoObject[ValueParameterDescriptorImpl]

'implementsListTypes' @ [243:64] ==> public final val PsiClass.implementsListTypes: (Array<(PsiClassType..PsiClassType?)>..Array<out (PsiClassType..PsiClassType?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [243:84] ==> @InlineOnly public inline fun <T> Array<out (PsiClassType..PsiClassType?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClassType..com.intellij.psi.PsiClassType?)

'psiClass' @ [244:13] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.shouldConvertIntoObject[ValueParameterDescriptorImpl]

'typeParameters' @ [244:22] ==> public final val PsiClass.typeParameters: (Array<(PsiTypeParameter..PsiTypeParameter?)>..Array<out (PsiTypeParameter..PsiTypeParameter?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [244:37] ==> @InlineOnly public inline fun <T> Array<out (PsiTypeParameter..PsiTypeParameter?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiTypeParameter..com.intellij.psi.PsiTypeParameter?)

'referenceSearcher' @ [246:13] ==> public final val referenceSearcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'hasInheritors' @ [246:31] ==> public abstract fun hasInheritors(`class`: PsiClass): Boolean defined in org.jetbrains.kotlin.j2k.ReferenceSearcher[SimpleFunctionDescriptorImpl]

'psiClass' @ [246:45] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.shouldConvertIntoObject[ValueParameterDescriptorImpl]

'Modifiers' @ [252:30] ==> public constructor Modifiers(modifiers: Collection<Modifier>) defined in org.jetbrains.kotlin.j2k.ast.Modifiers[ClassConstructorDescriptorImpl]

'listOf' @ [252:40] ==> public fun <T> listOf(element: Modifier): List<Modifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Modifier

'PUBLIC' @ [252:56] ==> enum entry PUBLIC defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'assignNoPrototype' @ [252:65] ==> public fun <TElement : Element> Modifiers.assignNoPrototype(): Modifiers defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Modifiers

'psiClass' @ [253:33] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[ValueParameterDescriptorImpl]

'methods' @ [253:42] ==> public final val PsiClass.methods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'filterIsInstance' @ [253:50] ==> public inline fun <reified R> Array<*>.filterIsInstance(): List<PsiAnnotationMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> PsiAnnotationMethod

'component1' @ [254:14] ==> public final operator fun component1(): List<PsiAnnotationMethod> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [254:33] ==> public final operator fun component2(): List<PsiAnnotationMethod> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'annotationMethods' @ [254:49] ==> val annotationMethods: List<PsiAnnotationMethod> defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[LocalVariableDescriptor]

'partition' @ [254:67] ==> public inline fun <T> Iterable<PsiAnnotationMethod>.partition(predicate: (PsiAnnotationMethod) -> Boolean): Pair<List<PsiAnnotationMethod>, List<PsiAnnotationMethod>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiAnnotationMethod

'it' @ [254:79] ==> value-parameter it: PsiAnnotationMethod defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [254:82] ==> public final var PsiAnnotationMethod.name: String[MyPropertyDescriptor]

'type' @ [257:13] ==> value-parameter type: Type defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType.createParameter[ValueParameterDescriptorImpl]

'assignPrototype' @ [257:18] ==> public fun <TElement : Element> Type.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): Type defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Type

'method' @ [257:34] ==> value-parameter method: PsiAnnotationMethod defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType.createParameter[ValueParameterDescriptorImpl]

'returnTypeElement' @ [257:41] ==> public final val PsiAnnotationMethod.returnTypeElement: PsiTypeElement?[MyPropertyDescriptor]

'CommentsAndSpacesInheritance' @ [257:60] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance[FakeCallableDescriptorForObject]

'NO_SPACES' @ [257:89] ==> public final val NO_SPACES: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance.Companion[PropertyDescriptorImpl]

'FunctionParameter' @ [259:20] ==> public constructor FunctionParameter(identifier: Identifier, type: Type?, varVal: FunctionParameter.VarValModifier, annotations: Annotations, modifiers: Modifiers, defaultValue: DeferredElement<Expression>? = ...) defined in org.jetbrains.kotlin.j2k.ast.FunctionParameter[ClassConstructorDescriptorImpl]

'method' @ [259:38] ==> value-parameter method: PsiAnnotationMethod defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType.createParameter[ValueParameterDescriptorImpl]

'declarationIdentifier' @ [259:45] ==> public fun PsiNameIdentifierOwner.declarationIdentifier(): Identifier defined in org.jetbrains.kotlin.j2k.ast in file Identifier.kt[SimpleFunctionDescriptorImpl]

'type' @ [260:38] ==> value-parameter type: Type defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType.createParameter[ValueParameterDescriptorImpl]

'Val' @ [261:71] ==> enum entry Val defined in org.jetbrains.kotlin.j2k.ast.FunctionParameter.VarValModifier[FakeCallableDescriptorForObject]

'convertAnnotations' @ [262:38] ==> public final fun convertAnnotations(owner: PsiModifierListOwner, target: AnnotationUseTarget? = ...): Annotations defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'method' @ [262:57] ==> value-parameter method: PsiAnnotationMethod defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType.createParameter[ValueParameterDescriptorImpl]

'paramModifiers' @ [263:38] ==> val paramModifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[LocalVariableDescriptor]

'annotationConverter' @ [264:38] ==> public final val annotationConverter: AnnotationConverter defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'convertAnnotationMethodDefault' @ [264:58] ==> public final fun convertAnnotationMethodDefault(method: PsiAnnotationMethod): DeferredElement<Expression>? defined in org.jetbrains.kotlin.j2k.AnnotationConverter[SimpleFunctionDescriptorImpl]

'method' @ [264:89] ==> value-parameter method: PsiAnnotationMethod defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType.createParameter[ValueParameterDescriptorImpl]

'assignPrototype' @ [264:98] ==> public fun <TElement : Element> FunctionParameter.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): FunctionParameter defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> FunctionParameter

'method' @ [264:114] ==> value-parameter method: PsiAnnotationMethod defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType.createParameter[ValueParameterDescriptorImpl]

'CommentsAndSpacesInheritance' @ [264:122] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance[FakeCallableDescriptorForObject]

'NO_SPACES' @ [264:151] ==> public final val NO_SPACES: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance.Companion[PropertyDescriptorImpl]

'typeConverter' @ [268:20] ==> public final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'convertType' @ [268:34] ==> public final fun convertType(type: PsiType?, nullability: Nullability = ..., mutability: Mutability = ..., inAnnotationType: Boolean = ...): Type defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'psiType' @ [268:46] ==> value-parameter psiType: PsiType? defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType.convertType[ValueParameterDescriptorImpl]

'NotNull' @ [268:67] ==> enum entry NotNull defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'methodsNamedValue' @ [274:17] ==> val methodsNamedValue: List<PsiAnnotationMethod> defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[LocalVariableDescriptor]

'map' @ [274:35] ==> public inline fun <T, R> Iterable<PsiAnnotationMethod>.map(transform: (PsiAnnotationMethod) -> FunctionParameter): List<FunctionParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiAnnotationMethod
    <R> -> FunctionParameter

'method' @ [275:38] ==> value-parameter method: PsiAnnotationMethod defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType.<anonymous>[ValueParameterDescriptorImpl]

'returnType' @ [275:45] ==> public final val PsiAnnotationMethod.returnType: PsiType?[MyPropertyDescriptor]

'if (returnType is PsiArrayType)
                        VarArgType(convertType(returnType.componentType))
                    else
                        convertType(returnType)' @ [276:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type, elseBranch: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'returnType' @ [276:45] ==> val returnType: PsiType? defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType.<anonymous>[LocalVariableDescriptor]

'VarArgType' @ [277:25] ==> public constructor VarArgType(type: Type) defined in org.jetbrains.kotlin.j2k.ast.VarArgType[ClassConstructorDescriptorImpl]

'convertType' @ [277:36] ==> local final fun convertType(psiType: PsiType?): Type defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[SimpleFunctionDescriptorImpl]

'returnType' @ [277:48] ==> val returnType: PsiType? defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType.<anonymous>[LocalVariableDescriptor]

'componentType' @ [277:59] ==> public final val PsiArrayType.componentType: PsiType[MyPropertyDescriptor]

'convertType' @ [279:25] ==> local final fun convertType(psiType: PsiType?): Type defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[SimpleFunctionDescriptorImpl]

'returnType' @ [279:37] ==> val returnType: PsiType? defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType.<anonymous>[LocalVariableDescriptor]

'createParameter' @ [281:21] ==> local final fun createParameter(type: Type, method: PsiAnnotationMethod): FunctionParameter defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[SimpleFunctionDescriptorImpl]

'typeConverted' @ [281:37] ==> val typeConverted: Type defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType.<anonymous>[LocalVariableDescriptor]

'method' @ [281:52] ==> value-parameter method: PsiAnnotationMethod defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType.<anonymous>[ValueParameterDescriptorImpl]

'otherMethods' @ [283:17] ==> val otherMethods: List<PsiAnnotationMethod> defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[LocalVariableDescriptor]

'map' @ [283:30] ==> public inline fun <T, R> Iterable<PsiAnnotationMethod>.map(transform: (PsiAnnotationMethod) -> FunctionParameter): List<FunctionParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiAnnotationMethod
    <R> -> FunctionParameter

'createParameter' @ [283:46] ==> local final fun createParameter(type: Type, method: PsiAnnotationMethod): FunctionParameter defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[SimpleFunctionDescriptorImpl]

'convertType' @ [283:62] ==> local final fun convertType(psiType: PsiType?): Type defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[SimpleFunctionDescriptorImpl]

'method' @ [283:74] ==> value-parameter method: PsiAnnotationMethod defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType.<anonymous>[ValueParameterDescriptorImpl]

'returnType' @ [283:81] ==> public final val PsiAnnotationMethod.returnType: PsiType?[MyPropertyDescriptor]

'method' @ [283:94] ==> value-parameter method: PsiAnnotationMethod defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType.<anonymous>[ValueParameterDescriptorImpl]

'ParameterList' @ [285:29] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.ParameterList[FakeCallableDescriptorForObject]

'withNoPrototype' @ [285:43] ==> public final fun withNoPrototype(parameters: List<Parameter>): ParameterList defined in org.jetbrains.kotlin.j2k.ast.ParameterList.Companion[SimpleFunctionDescriptorImpl]

'parameters' @ [285:59] ==> val parameters: List<FunctionParameter> defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[LocalVariableDescriptor]

'if (parameterList.parameters.isNotEmpty())
            PrimaryConstructorSignature(Annotations.Empty, Modifiers.Empty, parameterList).assignNoPrototype()
        else
            null' @ [286:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PrimaryConstructorSignature?, elseBranch: PrimaryConstructorSignature?): PrimaryConstructorSignature?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PrimaryConstructorSignature?

'parameterList' @ [286:40] ==> val parameterList: ParameterList defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[LocalVariableDescriptor]

'parameters' @ [286:54] ==> public final val parameters: List<Parameter> defined in org.jetbrains.kotlin.j2k.ast.ParameterList[PropertyDescriptorImpl]

'isNotEmpty' @ [286:65] ==> @InlineOnly public inline fun <T> Collection<Parameter>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Parameter

'PrimaryConstructorSignature' @ [287:13] ==> public constructor PrimaryConstructorSignature(annotations: Annotations, modifiers: Modifiers, parameterList: ParameterList) defined in org.jetbrains.kotlin.j2k.ast.PrimaryConstructorSignature[ClassConstructorDescriptorImpl]

'Annotations' @ [287:41] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Annotations[FakeCallableDescriptorForObject]

'Empty' @ [287:53] ==> public final val Empty: Annotations defined in org.jetbrains.kotlin.j2k.ast.Annotations.Companion[PropertyDescriptorImpl]

'Modifiers' @ [287:60] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Modifiers[FakeCallableDescriptorForObject]

'Empty' @ [287:70] ==> public final val Empty: Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers.Companion[PropertyDescriptorImpl]

'parameterList' @ [287:77] ==> val parameterList: ParameterList defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[LocalVariableDescriptor]

'assignNoPrototype' @ [287:92] ==> public fun <TElement : Element> PrimaryConstructorSignature.assignNoPrototype(): PrimaryConstructorSignature defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> PrimaryConstructorSignature

'ClassBodyConverter' @ [292:25] ==> public constructor ClassBodyConverter(psiClass: PsiClass, classKind: ClassKind, converter: Converter) defined in org.jetbrains.kotlin.j2k.ClassBodyConverter[ClassConstructorDescriptorImpl]

'psiClass' @ [292:44] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[ValueParameterDescriptorImpl]

'ANNOTATION_CLASS' @ [292:64] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.j2k.ClassKind[FakeCallableDescriptorForObject]

'this' @ [292:82] ==> <this> defined in org.jetbrains.kotlin.j2k.Converter[LazyClassReceiverParameterDescriptor]

'convertBody' @ [292:88] ==> public final fun convertBody(): ClassBody defined in org.jetbrains.kotlin.j2k.ClassBodyConverter[SimpleFunctionDescriptorImpl]

'classBody' @ [293:9] ==> var classBody: ClassBody defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[LocalVariableDescriptor]

'ClassBody' @ [293:21] ==> public constructor ClassBody(primaryConstructor: PrimaryConstructor?, primaryConstructorSignature: PrimaryConstructorSignature?, baseClassParams: List<DeferredElement<Expression>>?, members: List<Member>, companionObjectMembers: List<Member>, lBrace: LBrace, rBrace: RBrace, classKind: ClassKind) defined in org.jetbrains.kotlin.j2k.ast.ClassBody[ClassConstructorDescriptorImpl]

'constructorSignature' @ [293:37] ==> val constructorSignature: PrimaryConstructorSignature? defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[LocalVariableDescriptor]

'classBody' @ [293:59] ==> var classBody: ClassBody defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[LocalVariableDescriptor]

'baseClassParams' @ [293:69] ==> public final val baseClassParams: List<DeferredElement<Expression>>? defined in org.jetbrains.kotlin.j2k.ast.ClassBody[PropertyDescriptorImpl]

'classBody' @ [293:86] ==> var classBody: ClassBody defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[LocalVariableDescriptor]

'members' @ [293:96] ==> public final val members: List<Member> defined in org.jetbrains.kotlin.j2k.ast.ClassBody[PropertyDescriptorImpl]

'classBody' @ [294:31] ==> var classBody: ClassBody defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[LocalVariableDescriptor]

'companionObjectMembers' @ [294:41] ==> public final val companionObjectMembers: List<Member> defined in org.jetbrains.kotlin.j2k.ast.ClassBody[PropertyDescriptorImpl]

'classBody' @ [294:65] ==> var classBody: ClassBody defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[LocalVariableDescriptor]

'lBrace' @ [294:75] ==> public final val lBrace: LBrace defined in org.jetbrains.kotlin.j2k.ast.ClassBody[PropertyDescriptorImpl]

'classBody' @ [294:83] ==> var classBody: ClassBody defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[LocalVariableDescriptor]

'rBrace' @ [294:93] ==> public final val rBrace: RBrace defined in org.jetbrains.kotlin.j2k.ast.ClassBody[PropertyDescriptorImpl]

'classBody' @ [294:101] ==> var classBody: ClassBody defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[LocalVariableDescriptor]

'classKind' @ [294:111] ==> public final val classKind: ClassKind defined in org.jetbrains.kotlin.j2k.ast.ClassBody[PropertyDescriptorImpl]

'Class' @ [296:16] ==> public constructor Class(name: Identifier, annotations: Annotations, modifiers: Modifiers, typeParameterList: TypeParameterList, extendsTypes: List<Type>, baseClassParams: List<DeferredElement<Expression>>?, implementsTypes: List<Type>, body: ClassBody) defined in org.jetbrains.kotlin.j2k.ast.Class[ClassConstructorDescriptorImpl]

'psiClass' @ [296:22] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[ValueParameterDescriptorImpl]

'declarationIdentifier' @ [296:31] ==> public fun PsiNameIdentifierOwner.declarationIdentifier(): Identifier defined in org.jetbrains.kotlin.j2k.ast in file Identifier.kt[SimpleFunctionDescriptorImpl]

'convertAnnotations' @ [297:22] ==> public final fun convertAnnotations(owner: PsiModifierListOwner, target: AnnotationUseTarget? = ...): Annotations defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'psiClass' @ [297:41] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[ValueParameterDescriptorImpl]

'convertModifiers' @ [298:22] ==> public final fun convertModifiers(owner: PsiModifierListOwner, isMethodInOpenClass: Boolean): Modifiers defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'psiClass' @ [298:39] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[ValueParameterDescriptorImpl]

'with' @ [298:56] ==> public final fun with(modifier: Modifier?): Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'ANNOTATION' @ [298:70] ==> enum entry ANNOTATION defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'without' @ [298:82] ==> public final fun without(modifier: Modifier?): Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'ABSTRACT' @ [298:99] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'TypeParameterList' @ [299:22] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.TypeParameterList[FakeCallableDescriptorForObject]

'Empty' @ [299:40] ==> public final val Empty: TypeParameterList defined in org.jetbrains.kotlin.j2k.ast.TypeParameterList.Companion[PropertyDescriptorImpl]

'listOf' @ [300:22] ==> @InlineOnly public inline fun <T> listOf(): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'listOf' @ [302:22] ==> @InlineOnly public inline fun <T> listOf(): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'classBody' @ [303:22] ==> var classBody: ClassBody defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[LocalVariableDescriptor]

'assignPrototype' @ [303:33] ==> public fun <TElement : Element> Class.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): Class defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Class

'psiClass' @ [303:49] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.convertAnnotationType[ValueParameterDescriptorImpl]

'Initializer' @ [307:16] ==> public constructor Initializer(body: DeferredElement<Block>, modifiers: Modifiers) defined in org.jetbrains.kotlin.j2k.ast.Initializer[ClassConstructorDescriptorImpl]

'deferredElement' @ [307:28] ==> public final fun <TResult : Element> deferredElement(generator: (CodeConverter) -> Block): DeferredElement<Block> defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]
Inferred types:
    <TResult : Element> -> Block

'codeConverter' @ [307:63] ==> value-parameter codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.Converter.convertInitializer.<anonymous>[ValueParameterDescriptorImpl]

'convertBlock' @ [307:77] ==> public final fun convertBlock(block: PsiCodeBlock?, notEmpty: Boolean = ..., statementFilter: (PsiStatement) -> Boolean = ...): Block defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'initializer' @ [307:90] ==> value-parameter initializer: PsiClassInitializer defined in org.jetbrains.kotlin.j2k.Converter.convertInitializer[ValueParameterDescriptorImpl]

'body' @ [307:102] ==> public final val PsiClassInitializer.body: PsiCodeBlock[MyPropertyDescriptor]

'convertModifiers' @ [308:28] ==> public final fun convertModifiers(owner: PsiModifierListOwner, isMethodInOpenClass: Boolean): Modifiers defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'initializer' @ [308:45] ==> value-parameter initializer: PsiClassInitializer defined in org.jetbrains.kotlin.j2k.Converter.convertInitializer[ValueParameterDescriptorImpl]

'assignPrototype' @ [308:66] ==> public fun <TElement : Element> Initializer.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): Initializer defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Initializer

'initializer' @ [308:82] ==> value-parameter initializer: PsiClassInitializer defined in org.jetbrains.kotlin.j2k.Converter.convertInitializer[ValueParameterDescriptorImpl]

'propertyInfo' @ [312:21] ==> value-parameter propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'field' @ [312:34] ==> public final val field: PsiField? defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'propertyInfo' @ [313:25] ==> value-parameter propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'getMethod' @ [313:38] ==> public final val getMethod: PsiMethod? defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'propertyInfo' @ [314:25] ==> value-parameter propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'setMethod' @ [314:38] ==> public final val setMethod: PsiMethod? defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'Annotations' @ [317:27] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Annotations[FakeCallableDescriptorForObject]

'Empty' @ [317:39] ==> public final val Empty: Annotations defined in org.jetbrains.kotlin.j2k.ast.Annotations.Companion[PropertyDescriptorImpl]

'field' @ [319:9] ==> val field: PsiField? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'let' @ [319:16] ==> @InlineOnly public inline fun <T, R> PsiField.let(block: (PsiField) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiField
    <R> -> Unit

'annotations' @ [319:22] ==> var annotations: Annotations defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'convertAnnotations' @ [319:37] ==> public final fun convertAnnotations(owner: PsiModifierListOwner, target: AnnotationUseTarget? = ...): Annotations defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'it' @ [319:56] ==> value-parameter it: PsiField defined in org.jetbrains.kotlin.j2k.Converter.convertProperty.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [321:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'propertyInfo' @ [321:14] ==> value-parameter propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'needExplicitGetter' @ [321:27] ==> public final val needExplicitGetter: Boolean defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'getMethod' @ [322:13] ==> val getMethod: PsiMethod? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'let' @ [322:24] ==> @InlineOnly public inline fun <T, R> PsiMethod.let(block: (PsiMethod) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <R> -> Unit

'annotations' @ [322:30] ==> var annotations: Annotations defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'convertAnnotations' @ [322:45] ==> public final fun convertAnnotations(owner: PsiModifierListOwner, target: AnnotationUseTarget? = ...): Annotations defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'it' @ [322:64] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.convertProperty.<anonymous>[ValueParameterDescriptorImpl]

'Get' @ [322:88] ==> enum entry Get defined in org.jetbrains.kotlin.j2k.ast.AnnotationUseTarget[FakeCallableDescriptorForObject]

'!' @ [324:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'propertyInfo' @ [324:14] ==> value-parameter propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'needExplicitSetter' @ [324:27] ==> public final val needExplicitSetter: Boolean defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'setMethod' @ [325:13] ==> val setMethod: PsiMethod? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'let' @ [325:24] ==> @InlineOnly public inline fun <T, R> PsiMethod.let(block: (PsiMethod) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <R> -> Unit

'annotations' @ [325:30] ==> var annotations: Annotations defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'convertAnnotations' @ [325:45] ==> public final fun convertAnnotations(owner: PsiModifierListOwner, target: AnnotationUseTarget? = ...): Annotations defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'it' @ [325:64] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.convertProperty.<anonymous>[ValueParameterDescriptorImpl]

'Set' @ [325:88] ==> enum entry Set defined in org.jetbrains.kotlin.j2k.ast.AnnotationUseTarget[FakeCallableDescriptorForObject]

'propertyInfo' @ [328:26] ==> value-parameter propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'modifiers' @ [328:39] ==> public final val modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'field' @ [328:52] ==> val field: PsiField? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'let' @ [328:59] ==> @InlineOnly public inline fun <T, R> PsiField.let(block: (PsiField) -> Modifiers): Modifiers defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiField
    <R> -> Modifiers

'specialModifiersCase' @ [328:65] ==> private final fun specialModifiersCase(field: PsiField): Modifiers defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'field' @ [328:86] ==> val field: PsiField? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'Modifiers' @ [328:98] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Modifiers[FakeCallableDescriptorForObject]

'Empty' @ [328:108] ==> public final val Empty: Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers.Companion[PropertyDescriptorImpl]

'propertyInfo' @ [330:20] ==> value-parameter propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'identifier' @ [330:33] ==> public final val identifier: Identifier defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'if (field is PsiEnumConstant) {
            assert(getMethod == null && setMethod == null)
            val argumentList = field.argumentList
            val params = if (argumentList != null && argumentList.expressions.isNotEmpty()) {
                deferredElement { codeConverter -> codeConverter.convertArgumentList(argumentList) }
            }
            else {
                null
            }
            val body = field.initializingClass?.let { convertAnonymousClassBody(it) }
            return EnumConstant(name, annotations, modifiers, params, body)
                    .assignPrototype(field, CommentsAndSpacesInheritance.LINE_BREAKS)
        }
        else {
            val setterParameter = setMethod?.parameterList?.parameters?.single()
            val nullability = combinedNullability(field, getMethod, setterParameter)
            val mutability = combinedMutability(field, getMethod, setterParameter)

            val propertyType = typeConverter.convertType(propertyInfo.psiType, nullability, mutability)

            val shouldDeclareType = settings.specifyFieldTypeByDefault
                                    || field == null
                                    || shouldDeclareVariableType(field, propertyType, !propertyInfo.isVar && modifiers.isPrivate)

            //TODO: usage processings for converting method's to property
            if (field != null) {
                addUsageProcessing(FieldToPropertyProcessing(field, propertyInfo.name, propertyType.isNullable,
                                                             replaceReadWithFieldReference = propertyInfo.getMethod != null && !propertyInfo.isGetMethodBodyFieldAccess,
                                                             replaceWriteWithFieldReference = propertyInfo.setMethod != null && !propertyInfo.isSetMethodBodyFieldAccess))
            }

            //TODO: doc-comments

            var getter: PropertyAccessor? = null
            if (propertyInfo.needExplicitGetter) {
                if (getMethod != null) {
                    val method = convertMethod(getMethod, null, null, null, classKind)!!
                    getter = if (method.modifiers.contains(Modifier.EXTERNAL))
                        PropertyAccessor(AccessorKind.GETTER, method.annotations, Modifiers(listOf(Modifier.EXTERNAL)).assignNoPrototype(), null, null)
                    else
                        PropertyAccessor(AccessorKind.GETTER, method.annotations, Modifiers.Empty, method.parameterList, method.body)
                    getter.assignPrototype(getMethod, CommentsAndSpacesInheritance.NO_SPACES)
                }
                else if (propertyInfo.modifiers.contains(Modifier.OVERRIDE) && !(propertyInfo.superInfo?.isAbstract() ?: false)) {
                    val superExpression = SuperExpression(Identifier.Empty).assignNoPrototype()
                    val superAccess = QualifiedExpression(superExpression, propertyInfo.identifier, null).assignNoPrototype()
                    val returnStatement = ReturnStatement(superAccess).assignNoPrototype()
                    val body = Block.of(returnStatement).assignNoPrototype()
                    val parameterList = ParameterList.withNoPrototype(emptyList())
                    getter = PropertyAccessor(AccessorKind.GETTER, Annotations.Empty, Modifiers.Empty, parameterList, deferredElement { body })
                    getter.assignNoPrototype()
                }
                else {
                    //TODO: what else?
                    getter = PropertyAccessor(AccessorKind.GETTER, Annotations.Empty, Modifiers.Empty, null, null).assignNoPrototype()
                }
            }

            var setter: PropertyAccessor? = null
            if (propertyInfo.needExplicitSetter) {
                val accessorModifiers = Modifiers(listOfNotNull(propertyInfo.specialSetterAccess)).assignNoPrototype()
                if (setMethod != null && !propertyInfo.isSetMethodBodyFieldAccess) {
                    val method = convertMethod(setMethod, null, null, null, classKind)!!
                    setter = if (method.modifiers.contains(Modifier.EXTERNAL))
                        PropertyAccessor(AccessorKind.SETTER, method.annotations, accessorModifiers.with(Modifier.EXTERNAL), null, null)
                    else {
                        val convertedParameter = method.parameterList!!.parameters.single() as FunctionParameter
                        val parameterAnnotations = convertedParameter.annotations
                        val parameterList = if (method.body != null || !parameterAnnotations.isEmpty) {
                            val parameter = FunctionParameter(convertedParameter.identifier, null, FunctionParameter.VarValModifier.None, parameterAnnotations, Modifiers.Empty)
                                    .assignPrototypesFrom(convertedParameter, CommentsAndSpacesInheritance.NO_SPACES)
                            ParameterList.withNoPrototype(listOf(parameter))
                        }
                        else {
                            null
                        }
                        PropertyAccessor(AccessorKind.SETTER, method.annotations, accessorModifiers, parameterList, method.body)
                    }
                    setter.assignPrototype(setMethod, CommentsAndSpacesInheritance.NO_SPACES)
                }
                else if (propertyInfo.modifiers.contains(Modifier.OVERRIDE) && !(propertyInfo.superInfo?.isAbstract() ?: false)) {
                    val superExpression = SuperExpression(Identifier.Empty).assignNoPrototype()
                    val superAccess = QualifiedExpression(superExpression, propertyInfo.identifier, null).assignNoPrototype()
                    val valueIdentifier = Identifier.withNoPrototype("value", isNullable = false)
                    val assignment = AssignmentExpression(superAccess, valueIdentifier, Operator.EQ).assignNoPrototype()
                    val body = Block.of(assignment).assignNoPrototype()
                    val parameter = FunctionParameter(valueIdentifier, propertyType, FunctionParameter.VarValModifier.None, Annotations.Empty, Modifiers.Empty).assignNoPrototype()
                    val parameterList = ParameterList.withNoPrototype(listOf(parameter))
                    setter = PropertyAccessor(AccessorKind.SETTER, Annotations.Empty, accessorModifiers, parameterList, deferredElement { body })
                    setter.assignNoPrototype()
                }
                else {
                    setter = PropertyAccessor(AccessorKind.SETTER, Annotations.Empty, accessorModifiers, null, null).assignNoPrototype()
                }
            }

            val needInitializer = field != null && shouldGenerateDefaultInitializer(referenceSearcher, field)
            val property = Property(name,
                                    annotations,
                                    modifiers,
                                    propertyInfo.isVar,
                                    propertyType,
                                    shouldDeclareType,
                                    deferredElement { codeConverter -> field?.let { codeConverter.convertExpression(it.initializer, it.type) } ?: Expression.Empty },
                                    needInitializer,
                                    getter,
                                    setter,
                                    classKind == ClassKind.INTERFACE
            )

            val placementElement = field ?: getMethod ?: setMethod
            val prototypes = listOfNotNull<PsiElement>(field, getMethod, setMethod)
                    .map { PrototypeInfo(it, if (it == placementElement) CommentsAndSpacesInheritance.LINE_BREAKS else CommentsAndSpacesInheritance.NO_SPACES) }
            return property.assignPrototypes(*prototypes.toTypedArray())
        }' @ [331:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'field' @ [331:13] ==> val field: PsiField? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'assert' @ [332:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'getMethod' @ [332:20] ==> val getMethod: PsiMethod? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'setMethod' @ [332:41] ==> val setMethod: PsiMethod? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'field' @ [333:32] ==> val field: PsiField? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'argumentList' @ [333:38] ==> public final val PsiEnumConstant.argumentList: PsiExpressionList?[MyPropertyDescriptor]

'if (argumentList != null && argumentList.expressions.isNotEmpty()) {
                deferredElement { codeConverter -> codeConverter.convertArgumentList(argumentList) }
            }
            else {
                null
            }' @ [334:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DeferredElement<ArgumentList>?, elseBranch: DeferredElement<ArgumentList>?): DeferredElement<ArgumentList>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DeferredElement<ArgumentList>?

'argumentList' @ [334:30] ==> val argumentList: PsiExpressionList? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'argumentList' @ [334:54] ==> val argumentList: PsiExpressionList? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'expressions' @ [334:67] ==> public final val PsiExpressionList.expressions: (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [334:79] ==> @InlineOnly public inline fun <T> Array<out (PsiExpression..PsiExpression?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiExpression..com.intellij.psi.PsiExpression?)

'deferredElement' @ [335:17] ==> public final fun <TResult : Element> deferredElement(generator: (CodeConverter) -> ArgumentList): DeferredElement<ArgumentList> defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]
Inferred types:
    <TResult : Element> -> ArgumentList

'codeConverter' @ [335:52] ==> value-parameter codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.Converter.convertProperty.<anonymous>[ValueParameterDescriptorImpl]

'convertArgumentList' @ [335:66] ==> public final fun convertArgumentList(list: PsiExpressionList): ArgumentList defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'argumentList' @ [335:86] ==> val argumentList: PsiExpressionList? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'field' @ [340:24] ==> val field: PsiField? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'initializingClass' @ [340:30] ==> public final val PsiEnumConstant.initializingClass: PsiEnumConstantInitializer?[MyPropertyDescriptor]

'let' @ [340:49] ==> @InlineOnly public inline fun <T, R> PsiEnumConstantInitializer.let(block: (PsiEnumConstantInitializer) -> AnonymousClassBody): AnonymousClassBody defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiEnumConstantInitializer
    <R> -> AnonymousClassBody

'convertAnonymousClassBody' @ [340:55] ==> public final fun convertAnonymousClassBody(anonymousClass: PsiAnonymousClass): AnonymousClassBody defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'it' @ [340:81] ==> value-parameter it: PsiEnumConstantInitializer defined in org.jetbrains.kotlin.j2k.Converter.convertProperty.<anonymous>[ValueParameterDescriptorImpl]

'EnumConstant' @ [341:20] ==> public constructor EnumConstant(identifier: Identifier, annotations: Annotations, modifiers: Modifiers, params: DeferredElement<ArgumentList>?, body: AnonymousClassBody?) defined in org.jetbrains.kotlin.j2k.ast.EnumConstant[ClassConstructorDescriptorImpl]

'name' @ [341:33] ==> val name: Identifier defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'annotations' @ [341:39] ==> var annotations: Annotations defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'modifiers' @ [341:52] ==> val modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'params' @ [341:63] ==> val params: DeferredElement<ArgumentList>? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'body' @ [341:71] ==> val body: AnonymousClassBody? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'assignPrototype' @ [342:22] ==> public fun <TElement : Element> EnumConstant.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): EnumConstant defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> EnumConstant

'field' @ [342:38] ==> val field: PsiField? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'CommentsAndSpacesInheritance' @ [342:45] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance[FakeCallableDescriptorForObject]

'LINE_BREAKS' @ [342:74] ==> public final val LINE_BREAKS: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance.Companion[PropertyDescriptorImpl]

'setMethod' @ [345:35] ==> val setMethod: PsiMethod? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'parameterList' @ [345:46] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parameters' @ [345:61] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'single' @ [345:73] ==> public fun <T> Array<out (PsiParameter..PsiParameter?)>.single(): (PsiParameter..PsiParameter?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiParameter..com.intellij.psi.PsiParameter?)

'combinedNullability' @ [346:31] ==> private final fun combinedNullability(vararg psiElements: PsiElement?): Nullability defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'field' @ [346:51] ==> val field: PsiField? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'getMethod' @ [346:58] ==> val getMethod: PsiMethod? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'setterParameter' @ [346:69] ==> val setterParameter: PsiParameter? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'combinedMutability' @ [347:30] ==> private final fun combinedMutability(vararg psiElements: PsiElement?): Mutability defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'field' @ [347:49] ==> val field: PsiField? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'getMethod' @ [347:56] ==> val getMethod: PsiMethod? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'setterParameter' @ [347:67] ==> val setterParameter: PsiParameter? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'typeConverter' @ [349:32] ==> public final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'convertType' @ [349:46] ==> public final fun convertType(type: PsiType?, nullability: Nullability = ..., mutability: Mutability = ..., inAnnotationType: Boolean = ...): Type defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'propertyInfo' @ [349:58] ==> value-parameter propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'psiType' @ [349:71] ==> public final val psiType: PsiType defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'nullability' @ [349:80] ==> val nullability: Nullability defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'mutability' @ [349:93] ==> val mutability: Mutability defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'settings' @ [351:37] ==> public final val settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'specifyFieldTypeByDefault' @ [351:46] ==> public final var specifyFieldTypeByDefault: Boolean defined in org.jetbrains.kotlin.j2k.ConverterSettings[PropertyDescriptorImpl]

'field' @ [352:40] ==> val field: PsiField? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'shouldDeclareVariableType' @ [353:40] ==> public final fun shouldDeclareVariableType(variable: PsiVariable, type: Type, canChangeType: Boolean): Boolean defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'field' @ [353:66] ==> val field: PsiField? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'propertyType' @ [353:73] ==> val propertyType: Type defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'!' @ [353:87] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'propertyInfo' @ [353:88] ==> value-parameter propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'isVar' @ [353:101] ==> public final val isVar: Boolean defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'modifiers' @ [353:110] ==> val modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'isPrivate' @ [353:120] ==> public final val isPrivate: Boolean defined in org.jetbrains.kotlin.j2k.ast.Modifiers[PropertyDescriptorImpl]

'field' @ [356:17] ==> val field: PsiField? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'addUsageProcessing' @ [357:17] ==> public final fun addUsageProcessing(processing: UsageProcessing): Unit defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'FieldToPropertyProcessing' @ [357:36] ==> public constructor FieldToPropertyProcessing(field: PsiField, propertyName: String, isNullable: Boolean, replaceReadWithFieldReference: Boolean, replaceWriteWithFieldReference: Boolean) defined in org.jetbrains.kotlin.j2k.usageProcessing.FieldToPropertyProcessing[ClassConstructorDescriptorImpl]

'field' @ [357:62] ==> val field: PsiField? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'propertyInfo' @ [357:69] ==> value-parameter propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'name' @ [357:82] ==> public final val name: String defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'propertyType' @ [357:88] ==> val propertyType: Type defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'isNullable' @ [357:101] ==> public abstract val isNullable: Boolean defined in org.jetbrains.kotlin.j2k.ast.Type[PropertyDescriptorImpl]

'propertyInfo' @ [358:94] ==> value-parameter propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'getMethod' @ [358:107] ==> public final val getMethod: PsiMethod? defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'!' @ [358:128] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'propertyInfo' @ [358:129] ==> value-parameter propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'isGetMethodBodyFieldAccess' @ [358:142] ==> public final val isGetMethodBodyFieldAccess: Boolean defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'propertyInfo' @ [359:95] ==> value-parameter propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'setMethod' @ [359:108] ==> public final val setMethod: PsiMethod? defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'!' @ [359:129] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'propertyInfo' @ [359:130] ==> value-parameter propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'isSetMethodBodyFieldAccess' @ [359:143] ==> public final val isSetMethodBodyFieldAccess: Boolean defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'propertyInfo' @ [365:17] ==> value-parameter propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'needExplicitGetter' @ [365:30] ==> public final val needExplicitGetter: Boolean defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'if (getMethod != null) {
                    val method = convertMethod(getMethod, null, null, null, classKind)!!
                    getter = if (method.modifiers.contains(Modifier.EXTERNAL))
                        PropertyAccessor(AccessorKind.GETTER, method.annotations, Modifiers(listOf(Modifier.EXTERNAL)).assignNoPrototype(), null, null)
                    else
                        PropertyAccessor(AccessorKind.GETTER, method.annotations, Modifiers.Empty, method.parameterList, method.body)
                    getter.assignPrototype(getMethod, CommentsAndSpacesInheritance.NO_SPACES)
                }
                else if (propertyInfo.modifiers.contains(Modifier.OVERRIDE) && !(propertyInfo.superInfo?.isAbstract() ?: false)) {
                    val superExpression = SuperExpression(Identifier.Empty).assignNoPrototype()
                    val superAccess = QualifiedExpression(superExpression, propertyInfo.identifier, null).assignNoPrototype()
                    val returnStatement = ReturnStatement(superAccess).assignNoPrototype()
                    val body = Block.of(returnStatement).assignNoPrototype()
                    val parameterList = ParameterList.withNoPrototype(emptyList())
                    getter = PropertyAccessor(AccessorKind.GETTER, Annotations.Empty, Modifiers.Empty, parameterList, deferredElement { body })
                    getter.assignNoPrototype()
                }
                else {
                    //TODO: what else?
                    getter = PropertyAccessor(AccessorKind.GETTER, Annotations.Empty, Modifiers.Empty, null, null).assignNoPrototype()
                }' @ [366:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'getMethod' @ [366:21] ==> val getMethod: PsiMethod? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'convertMethod' @ [367:34] ==> public final fun convertMethod(method: PsiMethod, fieldsToDrop: MutableSet<PsiField>?, constructorConverter: ConstructorConverter?, overloadReducer: OverloadReducer?, classKind: ClassKind): FunctionLike? defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'getMethod' @ [367:48] ==> val getMethod: PsiMethod? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'classKind' @ [367:77] ==> value-parameter classKind: ClassKind defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'getter' @ [368:21] ==> var getter: PropertyAccessor? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'if (method.modifiers.contains(Modifier.EXTERNAL))
                        PropertyAccessor(AccessorKind.GETTER, method.annotations, Modifiers(listOf(Modifier.EXTERNAL)).assignNoPrototype(), null, null)
                    else
                        PropertyAccessor(AccessorKind.GETTER, method.annotations, Modifiers.Empty, method.parameterList, method.body)' @ [368:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PropertyAccessor?, elseBranch: PropertyAccessor?): PropertyAccessor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PropertyAccessor?

'method' @ [368:34] ==> val method: FunctionLike defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'modifiers' @ [368:41] ==> public final val modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.ast.FunctionLike[PropertyDescriptorImpl]

'contains' @ [368:51] ==> public final fun contains(modifier: Modifier): Boolean defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'EXTERNAL' @ [368:69] ==> enum entry EXTERNAL defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'PropertyAccessor' @ [369:25] ==> public constructor PropertyAccessor(kind: AccessorKind, annotations: Annotations, modifiers: Modifiers, parameterList: ParameterList?, body: DeferredElement<Block>?) defined in org.jetbrains.kotlin.j2k.ast.PropertyAccessor[ClassConstructorDescriptorImpl]

'GETTER' @ [369:55] ==> enum entry GETTER defined in org.jetbrains.kotlin.j2k.AccessorKind[FakeCallableDescriptorForObject]

'method' @ [369:63] ==> val method: FunctionLike defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'annotations' @ [369:70] ==> public final var annotations: Annotations defined in org.jetbrains.kotlin.j2k.ast.FunctionLike[PropertyDescriptorImpl]

'Modifiers' @ [369:83] ==> public constructor Modifiers(modifiers: Collection<Modifier>) defined in org.jetbrains.kotlin.j2k.ast.Modifiers[ClassConstructorDescriptorImpl]

'listOf' @ [369:93] ==> public fun <T> listOf(element: Modifier): List<Modifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Modifier

'EXTERNAL' @ [369:109] ==> enum entry EXTERNAL defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'assignNoPrototype' @ [369:120] ==> public fun <TElement : Element> Modifiers.assignNoPrototype(): Modifiers defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Modifiers

'PropertyAccessor' @ [371:25] ==> public constructor PropertyAccessor(kind: AccessorKind, annotations: Annotations, modifiers: Modifiers, parameterList: ParameterList?, body: DeferredElement<Block>?) defined in org.jetbrains.kotlin.j2k.ast.PropertyAccessor[ClassConstructorDescriptorImpl]

'GETTER' @ [371:55] ==> enum entry GETTER defined in org.jetbrains.kotlin.j2k.AccessorKind[FakeCallableDescriptorForObject]

'method' @ [371:63] ==> val method: FunctionLike defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'annotations' @ [371:70] ==> public final var annotations: Annotations defined in org.jetbrains.kotlin.j2k.ast.FunctionLike[PropertyDescriptorImpl]

'Modifiers' @ [371:83] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Modifiers[FakeCallableDescriptorForObject]

'Empty' @ [371:93] ==> public final val Empty: Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers.Companion[PropertyDescriptorImpl]

'method' @ [371:100] ==> val method: FunctionLike defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'parameterList' @ [371:107] ==> public open val parameterList: ParameterList? defined in org.jetbrains.kotlin.j2k.ast.FunctionLike[PropertyDescriptorImpl]

'method' @ [371:122] ==> val method: FunctionLike defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'body' @ [371:129] ==> public final val body: DeferredElement<Block>? defined in org.jetbrains.kotlin.j2k.ast.FunctionLike[PropertyDescriptorImpl]

'getter' @ [372:21] ==> var getter: PropertyAccessor? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'assignPrototype' @ [372:28] ==> public fun <TElement : Element> PropertyAccessor.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): PropertyAccessor defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> PropertyAccessor

'getMethod' @ [372:44] ==> val getMethod: PsiMethod? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'CommentsAndSpacesInheritance' @ [372:55] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance[FakeCallableDescriptorForObject]

'NO_SPACES' @ [372:84] ==> public final val NO_SPACES: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance.Companion[PropertyDescriptorImpl]

'if (propertyInfo.modifiers.contains(Modifier.OVERRIDE) && !(propertyInfo.superInfo?.isAbstract() ?: false)) {
                    val superExpression = SuperExpression(Identifier.Empty).assignNoPrototype()
                    val superAccess = QualifiedExpression(superExpression, propertyInfo.identifier, null).assignNoPrototype()
                    val returnStatement = ReturnStatement(superAccess).assignNoPrototype()
                    val body = Block.of(returnStatement).assignNoPrototype()
                    val parameterList = ParameterList.withNoPrototype(emptyList())
                    getter = PropertyAccessor(AccessorKind.GETTER, Annotations.Empty, Modifiers.Empty, parameterList, deferredElement { body })
                    getter.assignNoPrototype()
                }
                else {
                    //TODO: what else?
                    getter = PropertyAccessor(AccessorKind.GETTER, Annotations.Empty, Modifiers.Empty, null, null).assignNoPrototype()
                }' @ [374:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'propertyInfo' @ [374:26] ==> value-parameter propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'modifiers' @ [374:39] ==> public final val modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'contains' @ [374:49] ==> public final fun contains(modifier: Modifier): Boolean defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'OVERRIDE' @ [374:67] ==> enum entry OVERRIDE defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'!' @ [374:80] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'propertyInfo' @ [374:82] ==> value-parameter propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'superInfo' @ [374:95] ==> public final val superInfo: SuperInfo? defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'isAbstract' @ [374:106] ==> public final fun isAbstract(): Boolean defined in org.jetbrains.kotlin.j2k.SuperInfo[SimpleFunctionDescriptorImpl]

'SuperExpression' @ [375:43] ==> public constructor SuperExpression(identifier: Identifier) defined in org.jetbrains.kotlin.j2k.ast.SuperExpression[ClassConstructorDescriptorImpl]

'Identifier' @ [375:59] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'Empty' @ [375:70] ==> public final val Empty: Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[PropertyDescriptorImpl]

'assignNoPrototype' @ [375:77] ==> public fun <TElement : Element> SuperExpression.assignNoPrototype(): SuperExpression defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> SuperExpression

'QualifiedExpression' @ [376:39] ==> public constructor QualifiedExpression(qualifier: Expression, identifier: Expression, dotPrototype: PsiElement?) defined in org.jetbrains.kotlin.j2k.ast.QualifiedExpression[ClassConstructorDescriptorImpl]

'superExpression' @ [376:59] ==> val superExpression: SuperExpression defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'propertyInfo' @ [376:76] ==> value-parameter propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'identifier' @ [376:89] ==> public final val identifier: Identifier defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'assignNoPrototype' @ [376:107] ==> public fun <TElement : Element> QualifiedExpression.assignNoPrototype(): QualifiedExpression defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> QualifiedExpression

'ReturnStatement' @ [377:43] ==> public constructor ReturnStatement(expression: Expression, label: Identifier? = ...) defined in org.jetbrains.kotlin.j2k.ast.ReturnStatement[ClassConstructorDescriptorImpl]

'superAccess' @ [377:59] ==> val superAccess: QualifiedExpression defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'assignNoPrototype' @ [377:72] ==> public fun <TElement : Element> ReturnStatement.assignNoPrototype(): ReturnStatement defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> ReturnStatement

'Block' @ [378:32] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Block[FakeCallableDescriptorForObject]

'of' @ [378:38] ==> public final fun of(statement: Statement): Block defined in org.jetbrains.kotlin.j2k.ast.Block.Companion[SimpleFunctionDescriptorImpl]

'returnStatement' @ [378:41] ==> val returnStatement: ReturnStatement defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'assignNoPrototype' @ [378:58] ==> public fun <TElement : Element> Block.assignNoPrototype(): Block defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Block

'ParameterList' @ [379:41] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.ParameterList[FakeCallableDescriptorForObject]

'withNoPrototype' @ [379:55] ==> public final fun withNoPrototype(parameters: List<Parameter>): ParameterList defined in org.jetbrains.kotlin.j2k.ast.ParameterList.Companion[SimpleFunctionDescriptorImpl]

'emptyList' @ [379:71] ==> public fun <T> emptyList(): List<Parameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Parameter

'getter' @ [380:21] ==> var getter: PropertyAccessor? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'PropertyAccessor' @ [380:30] ==> public constructor PropertyAccessor(kind: AccessorKind, annotations: Annotations, modifiers: Modifiers, parameterList: ParameterList?, body: DeferredElement<Block>?) defined in org.jetbrains.kotlin.j2k.ast.PropertyAccessor[ClassConstructorDescriptorImpl]

'GETTER' @ [380:60] ==> enum entry GETTER defined in org.jetbrains.kotlin.j2k.AccessorKind[FakeCallableDescriptorForObject]

'Annotations' @ [380:68] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Annotations[FakeCallableDescriptorForObject]

'Empty' @ [380:80] ==> public final val Empty: Annotations defined in org.jetbrains.kotlin.j2k.ast.Annotations.Companion[PropertyDescriptorImpl]

'Modifiers' @ [380:87] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Modifiers[FakeCallableDescriptorForObject]

'Empty' @ [380:97] ==> public final val Empty: Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers.Companion[PropertyDescriptorImpl]

'parameterList' @ [380:104] ==> val parameterList: ParameterList defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'deferredElement' @ [380:119] ==> public final fun <TResult : Element> deferredElement(generator: (CodeConverter) -> Block): DeferredElement<Block> defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]
Inferred types:
    <TResult : Element> -> Block

'body' @ [380:137] ==> val body: Block defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'getter' @ [381:21] ==> var getter: PropertyAccessor? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'assignNoPrototype' @ [381:28] ==> public fun <TElement : Element> PropertyAccessor.assignNoPrototype(): PropertyAccessor defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> PropertyAccessor

'getter' @ [385:21] ==> var getter: PropertyAccessor? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'PropertyAccessor' @ [385:30] ==> public constructor PropertyAccessor(kind: AccessorKind, annotations: Annotations, modifiers: Modifiers, parameterList: ParameterList?, body: DeferredElement<Block>?) defined in org.jetbrains.kotlin.j2k.ast.PropertyAccessor[ClassConstructorDescriptorImpl]

'GETTER' @ [385:60] ==> enum entry GETTER defined in org.jetbrains.kotlin.j2k.AccessorKind[FakeCallableDescriptorForObject]

'Annotations' @ [385:68] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Annotations[FakeCallableDescriptorForObject]

'Empty' @ [385:80] ==> public final val Empty: Annotations defined in org.jetbrains.kotlin.j2k.ast.Annotations.Companion[PropertyDescriptorImpl]

'Modifiers' @ [385:87] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Modifiers[FakeCallableDescriptorForObject]

'Empty' @ [385:97] ==> public final val Empty: Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers.Companion[PropertyDescriptorImpl]

'assignNoPrototype' @ [385:116] ==> public fun <TElement : Element> PropertyAccessor.assignNoPrototype(): PropertyAccessor defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> PropertyAccessor

'propertyInfo' @ [390:17] ==> value-parameter propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'needExplicitSetter' @ [390:30] ==> public final val needExplicitSetter: Boolean defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'Modifiers' @ [391:41] ==> public constructor Modifiers(modifiers: Collection<Modifier>) defined in org.jetbrains.kotlin.j2k.ast.Modifiers[ClassConstructorDescriptorImpl]

'listOfNotNull' @ [391:51] ==> public fun <T : Any> listOfNotNull(element: Modifier?): List<Modifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Modifier

'propertyInfo' @ [391:65] ==> value-parameter propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'specialSetterAccess' @ [391:78] ==> public final val specialSetterAccess: Modifier? defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'assignNoPrototype' @ [391:100] ==> public fun <TElement : Element> Modifiers.assignNoPrototype(): Modifiers defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Modifiers

'if (setMethod != null && !propertyInfo.isSetMethodBodyFieldAccess) {
                    val method = convertMethod(setMethod, null, null, null, classKind)!!
                    setter = if (method.modifiers.contains(Modifier.EXTERNAL))
                        PropertyAccessor(AccessorKind.SETTER, method.annotations, accessorModifiers.with(Modifier.EXTERNAL), null, null)
                    else {
                        val convertedParameter = method.parameterList!!.parameters.single() as FunctionParameter
                        val parameterAnnotations = convertedParameter.annotations
                        val parameterList = if (method.body != null || !parameterAnnotations.isEmpty) {
                            val parameter = FunctionParameter(convertedParameter.identifier, null, FunctionParameter.VarValModifier.None, parameterAnnotations, Modifiers.Empty)
                                    .assignPrototypesFrom(convertedParameter, CommentsAndSpacesInheritance.NO_SPACES)
                            ParameterList.withNoPrototype(listOf(parameter))
                        }
                        else {
                            null
                        }
                        PropertyAccessor(AccessorKind.SETTER, method.annotations, accessorModifiers, parameterList, method.body)
                    }
                    setter.assignPrototype(setMethod, CommentsAndSpacesInheritance.NO_SPACES)
                }
                else if (propertyInfo.modifiers.contains(Modifier.OVERRIDE) && !(propertyInfo.superInfo?.isAbstract() ?: false)) {
                    val superExpression = SuperExpression(Identifier.Empty).assignNoPrototype()
                    val superAccess = QualifiedExpression(superExpression, propertyInfo.identifier, null).assignNoPrototype()
                    val valueIdentifier = Identifier.withNoPrototype("value", isNullable = false)
                    val assignment = AssignmentExpression(superAccess, valueIdentifier, Operator.EQ).assignNoPrototype()
                    val body = Block.of(assignment).assignNoPrototype()
                    val parameter = FunctionParameter(valueIdentifier, propertyType, FunctionParameter.VarValModifier.None, Annotations.Empty, Modifiers.Empty).assignNoPrototype()
                    val parameterList = ParameterList.withNoPrototype(listOf(parameter))
                    setter = PropertyAccessor(AccessorKind.SETTER, Annotations.Empty, accessorModifiers, parameterList, deferredElement { body })
                    setter.assignNoPrototype()
                }
                else {
                    setter = PropertyAccessor(AccessorKind.SETTER, Annotations.Empty, accessorModifiers, null, null).assignNoPrototype()
                }' @ [392:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'setMethod' @ [392:21] ==> val setMethod: PsiMethod? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'!' @ [392:42] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'propertyInfo' @ [392:43] ==> value-parameter propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'isSetMethodBodyFieldAccess' @ [392:56] ==> public final val isSetMethodBodyFieldAccess: Boolean defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'convertMethod' @ [393:34] ==> public final fun convertMethod(method: PsiMethod, fieldsToDrop: MutableSet<PsiField>?, constructorConverter: ConstructorConverter?, overloadReducer: OverloadReducer?, classKind: ClassKind): FunctionLike? defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'setMethod' @ [393:48] ==> val setMethod: PsiMethod? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'classKind' @ [393:77] ==> value-parameter classKind: ClassKind defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'setter' @ [394:21] ==> var setter: PropertyAccessor? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'if (method.modifiers.contains(Modifier.EXTERNAL))
                        PropertyAccessor(AccessorKind.SETTER, method.annotations, accessorModifiers.with(Modifier.EXTERNAL), null, null)
                    else {
                        val convertedParameter = method.parameterList!!.parameters.single() as FunctionParameter
                        val parameterAnnotations = convertedParameter.annotations
                        val parameterList = if (method.body != null || !parameterAnnotations.isEmpty) {
                            val parameter = FunctionParameter(convertedParameter.identifier, null, FunctionParameter.VarValModifier.None, parameterAnnotations, Modifiers.Empty)
                                    .assignPrototypesFrom(convertedParameter, CommentsAndSpacesInheritance.NO_SPACES)
                            ParameterList.withNoPrototype(listOf(parameter))
                        }
                        else {
                            null
                        }
                        PropertyAccessor(AccessorKind.SETTER, method.annotations, accessorModifiers, parameterList, method.body)
                    }' @ [394:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PropertyAccessor?, elseBranch: PropertyAccessor?): PropertyAccessor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PropertyAccessor?

'method' @ [394:34] ==> val method: FunctionLike defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'modifiers' @ [394:41] ==> public final val modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.ast.FunctionLike[PropertyDescriptorImpl]

'contains' @ [394:51] ==> public final fun contains(modifier: Modifier): Boolean defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'EXTERNAL' @ [394:69] ==> enum entry EXTERNAL defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'PropertyAccessor' @ [395:25] ==> public constructor PropertyAccessor(kind: AccessorKind, annotations: Annotations, modifiers: Modifiers, parameterList: ParameterList?, body: DeferredElement<Block>?) defined in org.jetbrains.kotlin.j2k.ast.PropertyAccessor[ClassConstructorDescriptorImpl]

'SETTER' @ [395:55] ==> enum entry SETTER defined in org.jetbrains.kotlin.j2k.AccessorKind[FakeCallableDescriptorForObject]

'method' @ [395:63] ==> val method: FunctionLike defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'annotations' @ [395:70] ==> public final var annotations: Annotations defined in org.jetbrains.kotlin.j2k.ast.FunctionLike[PropertyDescriptorImpl]

'accessorModifiers' @ [395:83] ==> val accessorModifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'with' @ [395:101] ==> public final fun with(modifier: Modifier?): Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'EXTERNAL' @ [395:115] ==> enum entry EXTERNAL defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'method' @ [397:50] ==> val method: FunctionLike defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'parameterList' @ [397:57] ==> public open val parameterList: ParameterList? defined in org.jetbrains.kotlin.j2k.ast.FunctionLike[PropertyDescriptorImpl]

'parameters' @ [397:73] ==> public final val parameters: List<Parameter> defined in org.jetbrains.kotlin.j2k.ast.ParameterList[PropertyDescriptorImpl]

'single' @ [397:84] ==> public fun <T> List<Parameter>.single(): Parameter defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Parameter

'convertedParameter' @ [398:52] ==> val convertedParameter: FunctionParameter defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'annotations' @ [398:71] ==> public final val annotations: Annotations defined in org.jetbrains.kotlin.j2k.ast.FunctionParameter[PropertyDescriptorImpl]

'if (method.body != null || !parameterAnnotations.isEmpty) {
                            val parameter = FunctionParameter(convertedParameter.identifier, null, FunctionParameter.VarValModifier.None, parameterAnnotations, Modifiers.Empty)
                                    .assignPrototypesFrom(convertedParameter, CommentsAndSpacesInheritance.NO_SPACES)
                            ParameterList.withNoPrototype(listOf(parameter))
                        }
                        else {
                            null
                        }' @ [399:45] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ParameterList?, elseBranch: ParameterList?): ParameterList?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ParameterList?

'method' @ [399:49] ==> val method: FunctionLike defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'body' @ [399:56] ==> public final val body: DeferredElement<Block>? defined in org.jetbrains.kotlin.j2k.ast.FunctionLike[PropertyDescriptorImpl]

'!' @ [399:72] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parameterAnnotations' @ [399:73] ==> val parameterAnnotations: Annotations defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'isEmpty' @ [399:94] ==> public open val isEmpty: Boolean defined in org.jetbrains.kotlin.j2k.ast.Annotations[PropertyDescriptorImpl]

'FunctionParameter' @ [400:45] ==> public constructor FunctionParameter(identifier: Identifier, type: Type?, varVal: FunctionParameter.VarValModifier, annotations: Annotations, modifiers: Modifiers, defaultValue: DeferredElement<Expression>? = ...) defined in org.jetbrains.kotlin.j2k.ast.FunctionParameter[ClassConstructorDescriptorImpl]

'convertedParameter' @ [400:63] ==> val convertedParameter: FunctionParameter defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'identifier' @ [400:82] ==> public final val identifier: Identifier defined in org.jetbrains.kotlin.j2k.ast.FunctionParameter[PropertyDescriptorImpl]

'None' @ [400:133] ==> enum entry None defined in org.jetbrains.kotlin.j2k.ast.FunctionParameter.VarValModifier[FakeCallableDescriptorForObject]

'parameterAnnotations' @ [400:139] ==> val parameterAnnotations: Annotations defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'Modifiers' @ [400:161] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Modifiers[FakeCallableDescriptorForObject]

'Empty' @ [400:171] ==> public final val Empty: Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers.Companion[PropertyDescriptorImpl]

'assignPrototypesFrom' @ [401:38] ==> public fun <TElement : Element> FunctionParameter.assignPrototypesFrom(element: Element, inheritance: CommentsAndSpacesInheritance? = ...): FunctionParameter defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> FunctionParameter

'convertedParameter' @ [401:59] ==> val convertedParameter: FunctionParameter defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'CommentsAndSpacesInheritance' @ [401:79] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance[FakeCallableDescriptorForObject]

'NO_SPACES' @ [401:108] ==> public final val NO_SPACES: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance.Companion[PropertyDescriptorImpl]

'ParameterList' @ [402:29] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.ParameterList[FakeCallableDescriptorForObject]

'withNoPrototype' @ [402:43] ==> public final fun withNoPrototype(parameters: List<Parameter>): ParameterList defined in org.jetbrains.kotlin.j2k.ast.ParameterList.Companion[SimpleFunctionDescriptorImpl]

'listOf' @ [402:59] ==> public fun <T> listOf(element: FunctionParameter): List<FunctionParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionParameter

'parameter' @ [402:66] ==> val parameter: FunctionParameter defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'PropertyAccessor' @ [407:25] ==> public constructor PropertyAccessor(kind: AccessorKind, annotations: Annotations, modifiers: Modifiers, parameterList: ParameterList?, body: DeferredElement<Block>?) defined in org.jetbrains.kotlin.j2k.ast.PropertyAccessor[ClassConstructorDescriptorImpl]

'SETTER' @ [407:55] ==> enum entry SETTER defined in org.jetbrains.kotlin.j2k.AccessorKind[FakeCallableDescriptorForObject]

'method' @ [407:63] ==> val method: FunctionLike defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'annotations' @ [407:70] ==> public final var annotations: Annotations defined in org.jetbrains.kotlin.j2k.ast.FunctionLike[PropertyDescriptorImpl]

'accessorModifiers' @ [407:83] ==> val accessorModifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'parameterList' @ [407:102] ==> val parameterList: ParameterList? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'method' @ [407:117] ==> val method: FunctionLike defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'body' @ [407:124] ==> public final val body: DeferredElement<Block>? defined in org.jetbrains.kotlin.j2k.ast.FunctionLike[PropertyDescriptorImpl]

'setter' @ [409:21] ==> var setter: PropertyAccessor? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'assignPrototype' @ [409:28] ==> public fun <TElement : Element> PropertyAccessor.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): PropertyAccessor defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> PropertyAccessor

'setMethod' @ [409:44] ==> val setMethod: PsiMethod? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'CommentsAndSpacesInheritance' @ [409:55] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance[FakeCallableDescriptorForObject]

'NO_SPACES' @ [409:84] ==> public final val NO_SPACES: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance.Companion[PropertyDescriptorImpl]

'if (propertyInfo.modifiers.contains(Modifier.OVERRIDE) && !(propertyInfo.superInfo?.isAbstract() ?: false)) {
                    val superExpression = SuperExpression(Identifier.Empty).assignNoPrototype()
                    val superAccess = QualifiedExpression(superExpression, propertyInfo.identifier, null).assignNoPrototype()
                    val valueIdentifier = Identifier.withNoPrototype("value", isNullable = false)
                    val assignment = AssignmentExpression(superAccess, valueIdentifier, Operator.EQ).assignNoPrototype()
                    val body = Block.of(assignment).assignNoPrototype()
                    val parameter = FunctionParameter(valueIdentifier, propertyType, FunctionParameter.VarValModifier.None, Annotations.Empty, Modifiers.Empty).assignNoPrototype()
                    val parameterList = ParameterList.withNoPrototype(listOf(parameter))
                    setter = PropertyAccessor(AccessorKind.SETTER, Annotations.Empty, accessorModifiers, parameterList, deferredElement { body })
                    setter.assignNoPrototype()
                }
                else {
                    setter = PropertyAccessor(AccessorKind.SETTER, Annotations.Empty, accessorModifiers, null, null).assignNoPrototype()
                }' @ [411:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'propertyInfo' @ [411:26] ==> value-parameter propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'modifiers' @ [411:39] ==> public final val modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'contains' @ [411:49] ==> public final fun contains(modifier: Modifier): Boolean defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'OVERRIDE' @ [411:67] ==> enum entry OVERRIDE defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'!' @ [411:80] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'propertyInfo' @ [411:82] ==> value-parameter propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'superInfo' @ [411:95] ==> public final val superInfo: SuperInfo? defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'isAbstract' @ [411:106] ==> public final fun isAbstract(): Boolean defined in org.jetbrains.kotlin.j2k.SuperInfo[SimpleFunctionDescriptorImpl]

'SuperExpression' @ [412:43] ==> public constructor SuperExpression(identifier: Identifier) defined in org.jetbrains.kotlin.j2k.ast.SuperExpression[ClassConstructorDescriptorImpl]

'Identifier' @ [412:59] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'Empty' @ [412:70] ==> public final val Empty: Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[PropertyDescriptorImpl]

'assignNoPrototype' @ [412:77] ==> public fun <TElement : Element> SuperExpression.assignNoPrototype(): SuperExpression defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> SuperExpression

'QualifiedExpression' @ [413:39] ==> public constructor QualifiedExpression(qualifier: Expression, identifier: Expression, dotPrototype: PsiElement?) defined in org.jetbrains.kotlin.j2k.ast.QualifiedExpression[ClassConstructorDescriptorImpl]

'superExpression' @ [413:59] ==> val superExpression: SuperExpression defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'propertyInfo' @ [413:76] ==> value-parameter propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'identifier' @ [413:89] ==> public final val identifier: Identifier defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'assignNoPrototype' @ [413:107] ==> public fun <TElement : Element> QualifiedExpression.assignNoPrototype(): QualifiedExpression defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> QualifiedExpression

'Identifier' @ [414:43] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'withNoPrototype' @ [414:54] ==> public final fun withNoPrototype(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...): Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[SimpleFunctionDescriptorImpl]

'AssignmentExpression' @ [415:38] ==> public constructor AssignmentExpression(left: Expression, right: Expression, op: Operator) defined in org.jetbrains.kotlin.j2k.ast.AssignmentExpression[ClassConstructorDescriptorImpl]

'superAccess' @ [415:59] ==> val superAccess: QualifiedExpression defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'valueIdentifier' @ [415:72] ==> val valueIdentifier: Identifier defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'Operator' @ [415:89] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Operator[FakeCallableDescriptorForObject]

'EQ' @ [415:98] ==> public final val EQ: Operator defined in org.jetbrains.kotlin.j2k.ast.Operator.Companion[PropertyDescriptorImpl]

'assignNoPrototype' @ [415:102] ==> public fun <TElement : Element> AssignmentExpression.assignNoPrototype(): AssignmentExpression defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> AssignmentExpression

'Block' @ [416:32] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Block[FakeCallableDescriptorForObject]

'of' @ [416:38] ==> public final fun of(statement: Statement): Block defined in org.jetbrains.kotlin.j2k.ast.Block.Companion[SimpleFunctionDescriptorImpl]

'assignment' @ [416:41] ==> val assignment: AssignmentExpression defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'assignNoPrototype' @ [416:53] ==> public fun <TElement : Element> Block.assignNoPrototype(): Block defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Block

'FunctionParameter' @ [417:37] ==> public constructor FunctionParameter(identifier: Identifier, type: Type?, varVal: FunctionParameter.VarValModifier, annotations: Annotations, modifiers: Modifiers, defaultValue: DeferredElement<Expression>? = ...) defined in org.jetbrains.kotlin.j2k.ast.FunctionParameter[ClassConstructorDescriptorImpl]

'valueIdentifier' @ [417:55] ==> val valueIdentifier: Identifier defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'propertyType' @ [417:72] ==> val propertyType: Type defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'None' @ [417:119] ==> enum entry None defined in org.jetbrains.kotlin.j2k.ast.FunctionParameter.VarValModifier[FakeCallableDescriptorForObject]

'Annotations' @ [417:125] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Annotations[FakeCallableDescriptorForObject]

'Empty' @ [417:137] ==> public final val Empty: Annotations defined in org.jetbrains.kotlin.j2k.ast.Annotations.Companion[PropertyDescriptorImpl]

'Modifiers' @ [417:144] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Modifiers[FakeCallableDescriptorForObject]

'Empty' @ [417:154] ==> public final val Empty: Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers.Companion[PropertyDescriptorImpl]

'assignNoPrototype' @ [417:161] ==> public fun <TElement : Element> FunctionParameter.assignNoPrototype(): FunctionParameter defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> FunctionParameter

'ParameterList' @ [418:41] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.ParameterList[FakeCallableDescriptorForObject]

'withNoPrototype' @ [418:55] ==> public final fun withNoPrototype(parameters: List<Parameter>): ParameterList defined in org.jetbrains.kotlin.j2k.ast.ParameterList.Companion[SimpleFunctionDescriptorImpl]

'listOf' @ [418:71] ==> public fun <T> listOf(element: FunctionParameter): List<FunctionParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionParameter

'parameter' @ [418:78] ==> val parameter: FunctionParameter defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'setter' @ [419:21] ==> var setter: PropertyAccessor? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'PropertyAccessor' @ [419:30] ==> public constructor PropertyAccessor(kind: AccessorKind, annotations: Annotations, modifiers: Modifiers, parameterList: ParameterList?, body: DeferredElement<Block>?) defined in org.jetbrains.kotlin.j2k.ast.PropertyAccessor[ClassConstructorDescriptorImpl]

'SETTER' @ [419:60] ==> enum entry SETTER defined in org.jetbrains.kotlin.j2k.AccessorKind[FakeCallableDescriptorForObject]

'Annotations' @ [419:68] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Annotations[FakeCallableDescriptorForObject]

'Empty' @ [419:80] ==> public final val Empty: Annotations defined in org.jetbrains.kotlin.j2k.ast.Annotations.Companion[PropertyDescriptorImpl]

'accessorModifiers' @ [419:87] ==> val accessorModifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'parameterList' @ [419:106] ==> val parameterList: ParameterList defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'deferredElement' @ [419:121] ==> public final fun <TResult : Element> deferredElement(generator: (CodeConverter) -> Block): DeferredElement<Block> defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]
Inferred types:
    <TResult : Element> -> Block

'body' @ [419:139] ==> val body: Block defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'setter' @ [420:21] ==> var setter: PropertyAccessor? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'assignNoPrototype' @ [420:28] ==> public fun <TElement : Element> PropertyAccessor.assignNoPrototype(): PropertyAccessor defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> PropertyAccessor

'setter' @ [423:21] ==> var setter: PropertyAccessor? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'PropertyAccessor' @ [423:30] ==> public constructor PropertyAccessor(kind: AccessorKind, annotations: Annotations, modifiers: Modifiers, parameterList: ParameterList?, body: DeferredElement<Block>?) defined in org.jetbrains.kotlin.j2k.ast.PropertyAccessor[ClassConstructorDescriptorImpl]

'SETTER' @ [423:60] ==> enum entry SETTER defined in org.jetbrains.kotlin.j2k.AccessorKind[FakeCallableDescriptorForObject]

'Annotations' @ [423:68] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Annotations[FakeCallableDescriptorForObject]

'Empty' @ [423:80] ==> public final val Empty: Annotations defined in org.jetbrains.kotlin.j2k.ast.Annotations.Companion[PropertyDescriptorImpl]

'accessorModifiers' @ [423:87] ==> val accessorModifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'assignNoPrototype' @ [423:118] ==> public fun <TElement : Element> PropertyAccessor.assignNoPrototype(): PropertyAccessor defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> PropertyAccessor

'field' @ [427:35] ==> val field: PsiField? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'shouldGenerateDefaultInitializer' @ [427:52] ==> public fun shouldGenerateDefaultInitializer(searcher: ReferenceSearcher, field: PsiField): Boolean defined in org.jetbrains.kotlin.j2k[SimpleFunctionDescriptorImpl]

'referenceSearcher' @ [427:85] ==> public final val referenceSearcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'field' @ [427:104] ==> val field: PsiField? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'Property' @ [428:28] ==> public constructor Property(identifier: Identifier, annotations: Annotations, modifiers: Modifiers, isVar: Boolean, type: Type, explicitType: Boolean, initializer: DeferredElement<Expression>, needInitializer: Boolean, getter: PropertyAccessor?, setter: PropertyAccessor?, isInInterface: Boolean) defined in org.jetbrains.kotlin.j2k.ast.Property[ClassConstructorDescriptorImpl]

'name' @ [428:37] ==> val name: Identifier defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'annotations' @ [429:37] ==> var annotations: Annotations defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'modifiers' @ [430:37] ==> val modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'propertyInfo' @ [431:37] ==> value-parameter propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'isVar' @ [431:50] ==> public final val isVar: Boolean defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'propertyType' @ [432:37] ==> val propertyType: Type defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'shouldDeclareType' @ [433:37] ==> val shouldDeclareType: Boolean defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'deferredElement' @ [434:37] ==> public final fun <TResult : Element> deferredElement(generator: (CodeConverter) -> Expression): DeferredElement<Expression> defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]
Inferred types:
    <TResult : Element> -> Expression

'field' @ [434:72] ==> val field: PsiField? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'let' @ [434:79] ==> @InlineOnly public inline fun <T, R> PsiField.let(block: (PsiField) -> Expression): Expression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiField
    <R> -> Expression

'codeConverter' @ [434:85] ==> value-parameter codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.Converter.convertProperty.<anonymous>[ValueParameterDescriptorImpl]

'convertExpression' @ [434:99] ==> public final fun convertExpression(expression: PsiExpression?, expectedType: PsiType?, expectedNullability: Nullability? = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'it' @ [434:117] ==> value-parameter it: PsiField defined in org.jetbrains.kotlin.j2k.Converter.convertProperty.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'initializer' @ [434:120] ==> public final var PsiField.initializer: PsiExpression?[MyPropertyDescriptor]

'it' @ [434:133] ==> value-parameter it: PsiField defined in org.jetbrains.kotlin.j2k.Converter.convertProperty.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [434:136] ==> public final val PsiField.type: PsiType[MyPropertyDescriptor]

'Empty' @ [434:158] ==> public object Empty : Expression defined in org.jetbrains.kotlin.j2k.ast.Expression[FakeCallableDescriptorForObject]

'needInitializer' @ [435:37] ==> val needInitializer: Boolean defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'getter' @ [436:37] ==> var getter: PropertyAccessor? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'setter' @ [437:37] ==> var setter: PropertyAccessor? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'classKind' @ [438:37] ==> value-parameter classKind: ClassKind defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[ValueParameterDescriptorImpl]

'INTERFACE' @ [438:60] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.j2k.ClassKind[FakeCallableDescriptorForObject]

'field' @ [441:36] ==> val field: PsiField? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'getMethod' @ [441:45] ==> val getMethod: PsiMethod? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'setMethod' @ [441:58] ==> val setMethod: PsiMethod? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'listOfNotNull' @ [442:30] ==> public fun <T : Any> listOfNotNull(vararg elements: PsiElement?): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PsiElement

'field' @ [442:56] ==> val field: PsiField? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'getMethod' @ [442:63] ==> val getMethod: PsiMethod? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'setMethod' @ [442:74] ==> val setMethod: PsiMethod? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'map' @ [443:22] ==> public inline fun <T, R> Iterable<PsiElement>.map(transform: (PsiElement) -> PrototypeInfo): List<PrototypeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> PrototypeInfo

'PrototypeInfo' @ [443:28] ==> public constructor PrototypeInfo(element: PsiElement, commentsAndSpacesInheritance: CommentsAndSpacesInheritance) defined in org.jetbrains.kotlin.j2k.ast.PrototypeInfo[ClassConstructorDescriptorImpl]

'it' @ [443:42] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.convertProperty.<anonymous>[ValueParameterDescriptorImpl]

'if (it == placementElement) CommentsAndSpacesInheritance.LINE_BREAKS else CommentsAndSpacesInheritance.NO_SPACES' @ [443:46] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CommentsAndSpacesInheritance, elseBranch: CommentsAndSpacesInheritance): CommentsAndSpacesInheritance[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CommentsAndSpacesInheritance

'it' @ [443:50] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.convertProperty.<anonymous>[ValueParameterDescriptorImpl]

'placementElement' @ [443:56] ==> val placementElement: {PsiTarget & PsiNameIdentifierOwner & PsiDocCommentOwner & PomRenameableTarget<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>}? defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'CommentsAndSpacesInheritance' @ [443:74] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance[FakeCallableDescriptorForObject]

'LINE_BREAKS' @ [443:103] ==> public final val LINE_BREAKS: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance.Companion[PropertyDescriptorImpl]

'CommentsAndSpacesInheritance' @ [443:120] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance[FakeCallableDescriptorForObject]

'NO_SPACES' @ [443:149] ==> public final val NO_SPACES: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance.Companion[PropertyDescriptorImpl]

'property' @ [444:20] ==> val property: Property defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'assignPrototypes' @ [444:29] ==> public fun <TElement : Element> Property.assignPrototypes(vararg prototypes: PrototypeInfo): Property defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Property

'prototypes' @ [444:47] ==> val prototypes: List<PrototypeInfo> defined in org.jetbrains.kotlin.j2k.Converter.convertProperty[LocalVariableDescriptor]

'toTypedArray' @ [444:58] ==> public inline fun <reified T> Collection<PrototypeInfo>.toTypedArray(): Array<PrototypeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PrototypeInfo

'getInstance' @ [450:55] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'project' @ [450:67] ==> public final val project: Project defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'findClass' @ [450:76] ==> @Nullable public abstract fun findClass(@NonNls @NotNull p0: String, @NotNull p1: GlobalSearchScope): PsiClass? defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'JAVA_IO_SERIALIZABLE' @ [450:103] ==> @NonNls public const final val JAVA_IO_SERIALIZABLE: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'field' @ [450:125] ==> value-parameter field: PsiField defined in org.jetbrains.kotlin.j2k.Converter.specialModifiersCase[ValueParameterDescriptorImpl]

'resolveScope' @ [450:131] ==> public final val PsiField.resolveScope: GlobalSearchScope[MyPropertyDescriptor]

'mutableListOf' @ [451:22] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Modifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Modifier

'javaSerializableInterface' @ [452:13] ==> val javaSerializableInterface: PsiClass? defined in org.jetbrains.kotlin.j2k.Converter.specialModifiersCase[LocalVariableDescriptor]

'field' @ [453:13] ==> value-parameter field: PsiField defined in org.jetbrains.kotlin.j2k.Converter.specialModifiersCase[ValueParameterDescriptorImpl]

'name' @ [453:19] ==> public final val PsiField.name: String?[MyPropertyDescriptor]

'field' @ [454:13] ==> value-parameter field: PsiField defined in org.jetbrains.kotlin.j2k.Converter.specialModifiersCase[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [454:19] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiField[JavaMethodDescriptor]

'FINAL' @ [454:51] ==> public const final val FINAL: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'field' @ [455:13] ==> value-parameter field: PsiField defined in org.jetbrains.kotlin.j2k.Converter.specialModifiersCase[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [455:19] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiField[JavaMethodDescriptor]

'STATIC' @ [455:51] ==> public const final val STATIC: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'field' @ [456:13] ==> value-parameter field: PsiField defined in org.jetbrains.kotlin.j2k.Converter.specialModifiersCase[ValueParameterDescriptorImpl]

'containingClass' @ [456:19] ==> public final val PsiField.containingClass: PsiClass?[MyPropertyDescriptor]

'isInheritor' @ [456:36] ==> public abstract fun isInheritor(@NotNull p0: PsiClass, p1: Boolean): Boolean defined in com.intellij.psi.PsiClass[JavaMethodDescriptor]

'javaSerializableInterface' @ [456:48] ==> val javaSerializableInterface: PsiClass? defined in org.jetbrains.kotlin.j2k.Converter.specialModifiersCase[LocalVariableDescriptor]

'output' @ [458:13] ==> val output: MutableList<Modifier> defined in org.jetbrains.kotlin.j2k.Converter.specialModifiersCase[LocalVariableDescriptor]

'add' @ [458:20] ==> public abstract fun add(element: Modifier): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'CONST' @ [458:33] ==> enum entry CONST defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'Modifiers' @ [461:16] ==> public constructor Modifiers(modifiers: Collection<Modifier>) defined in org.jetbrains.kotlin.j2k.ast.Modifiers[ClassConstructorDescriptorImpl]

'output' @ [461:26] ==> val output: MutableList<Modifier> defined in org.jetbrains.kotlin.j2k.Converter.specialModifiersCase[LocalVariableDescriptor]

'psiElements' @ [465:22] ==> value-parameter vararg psiElements: PsiElement? defined in org.jetbrains.kotlin.j2k.Converter.combinedNullability[ValueParameterDescriptorImpl]

'filterNotNull' @ [465:34] ==> public fun <T : Any> Array<out PsiElement?>.filterNotNull(): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PsiElement

'map' @ [465:50] ==> public inline fun <T, R> Iterable<PsiElement>.map(transform: (PsiElement) -> Nullability): List<Nullability> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Nullability

'when (it) {
                is PsiVariable -> typeConverter.variableNullability(it)
                is PsiMethod -> typeConverter.methodNullability(it)
                else -> throw IllegalArgumentException()
            }' @ [466:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nullability, entry1: Nullability, entry2: Nullability): Nullability[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nullability

'it' @ [466:19] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.combinedNullability.<anonymous>[ValueParameterDescriptorImpl]

'typeConverter' @ [467:35] ==> public final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'variableNullability' @ [467:49] ==> public final fun variableNullability(variable: PsiVariable): Nullability defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'it' @ [467:69] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.combinedNullability.<anonymous>[ValueParameterDescriptorImpl]

'typeConverter' @ [468:33] ==> public final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'methodNullability' @ [468:47] ==> public final fun methodNullability(method: PsiMethod): Nullability defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'it' @ [468:65] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.combinedNullability.<anonymous>[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [469:31] ==> public constructor IllegalArgumentException() defined in java.lang.IllegalArgumentException[JavaClassConstructorDescriptor]

'when {
            values.contains(Nullability.Nullable) -> Nullability.Nullable
            values.contains(Nullability.Default) -> Nullability.Default
            else -> Nullability.NotNull
        }' @ [472:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nullability, entry1: Nullability, entry2: Nullability): Nullability[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nullability

'values' @ [473:13] ==> val values: List<Nullability> defined in org.jetbrains.kotlin.j2k.Converter.combinedNullability[LocalVariableDescriptor]

'contains' @ [473:20] ==> public abstract fun contains(element: Nullability): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'Nullable' @ [473:41] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'Nullable' @ [473:66] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'values' @ [474:13] ==> val values: List<Nullability> defined in org.jetbrains.kotlin.j2k.Converter.combinedNullability[LocalVariableDescriptor]

'contains' @ [474:20] ==> public abstract fun contains(element: Nullability): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'Default' @ [474:41] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'Default' @ [474:65] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'NotNull' @ [475:33] ==> enum entry NotNull defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'psiElements' @ [480:22] ==> value-parameter vararg psiElements: PsiElement? defined in org.jetbrains.kotlin.j2k.Converter.combinedMutability[ValueParameterDescriptorImpl]

'filterNotNull' @ [480:34] ==> public fun <T : Any> Array<out PsiElement?>.filterNotNull(): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PsiElement

'map' @ [480:50] ==> public inline fun <T, R> Iterable<PsiElement>.map(transform: (PsiElement) -> Mutability): List<Mutability> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Mutability

'when (it) {
                is PsiVariable -> typeConverter.variableMutability(it)
                is PsiMethod -> typeConverter.methodMutability(it)
                else -> throw IllegalArgumentException()
            }' @ [481:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Mutability, entry1: Mutability, entry2: Mutability): Mutability[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Mutability

'it' @ [481:19] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.combinedMutability.<anonymous>[ValueParameterDescriptorImpl]

'typeConverter' @ [482:35] ==> public final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'variableMutability' @ [482:49] ==> public final fun variableMutability(variable: PsiVariable): Mutability defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'it' @ [482:68] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.combinedMutability.<anonymous>[ValueParameterDescriptorImpl]

'typeConverter' @ [483:33] ==> public final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'methodMutability' @ [483:47] ==> public final fun methodMutability(method: PsiMethod): Mutability defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'it' @ [483:64] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.combinedMutability.<anonymous>[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [484:31] ==> public constructor IllegalArgumentException() defined in java.lang.IllegalArgumentException[JavaClassConstructorDescriptor]

'when {
            values.contains(Mutability.Mutable) -> Mutability.Mutable
            values.contains(Mutability.Default) -> Mutability.Default
            else -> Mutability.NonMutable
        }' @ [487:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Mutability, entry1: Mutability, entry2: Mutability): Mutability[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Mutability

'values' @ [488:13] ==> val values: List<Mutability> defined in org.jetbrains.kotlin.j2k.Converter.combinedMutability[LocalVariableDescriptor]

'contains' @ [488:20] ==> public abstract fun contains(element: Mutability): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'Mutable' @ [488:40] ==> enum entry Mutable defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'Mutable' @ [488:63] ==> enum entry Mutable defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'values' @ [489:13] ==> val values: List<Mutability> defined in org.jetbrains.kotlin.j2k.Converter.combinedMutability[LocalVariableDescriptor]

'contains' @ [489:20] ==> public abstract fun contains(element: Mutability): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'Default' @ [489:40] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'Default' @ [489:63] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'NonMutable' @ [490:32] ==> enum entry NonMutable defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'assert' @ [495:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'invoke' @ [495:16] ==> public abstract operator fun invoke(p1: PsiElement): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'variable' @ [495:34] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.Converter.shouldDeclareVariableType[ValueParameterDescriptorImpl]

'codeConverterForType' @ [497:29] ==> public final val codeConverterForType: CodeConverter defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'variable' @ [498:27] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.Converter.shouldDeclareVariableType[ValueParameterDescriptorImpl]

'initializer' @ [498:36] ==> public final val PsiVariable.initializer: PsiExpression?[MyPropertyDescriptor]

'initializer' @ [499:13] ==> val initializer: PsiExpression? defined in org.jetbrains.kotlin.j2k.Converter.shouldDeclareVariableType[LocalVariableDescriptor]

'initializer' @ [499:36] ==> val initializer: PsiExpression? defined in org.jetbrains.kotlin.j2k.Converter.shouldDeclareVariableType[LocalVariableDescriptor]

'isNullLiteral' @ [499:48] ==> public fun PsiExpression.isNullLiteral(): Boolean defined in org.jetbrains.kotlin.j2k[SimpleFunctionDescriptorImpl]

'initializer' @ [500:13] ==> val initializer: PsiExpression? defined in org.jetbrains.kotlin.j2k.Converter.shouldDeclareVariableType[LocalVariableDescriptor]

'type' @ [500:25] ==> public final val PsiExpression.type: PsiType?[MyPropertyDescriptor]

'type' @ [500:53] ==> value-parameter type: Type defined in org.jetbrains.kotlin.j2k.Converter.shouldDeclareVariableType[ValueParameterDescriptorImpl]

'codeConverter' @ [501:17] ==> val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.Converter.shouldDeclareVariableType[LocalVariableDescriptor]

'convertedExpressionType' @ [501:31] ==> public final fun convertedExpressionType(expression: PsiExpression, expectedType: PsiType): Type defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'initializer' @ [501:55] ==> val initializer: PsiExpression? defined in org.jetbrains.kotlin.j2k.Converter.shouldDeclareVariableType[LocalVariableDescriptor]

'variable' @ [501:68] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.Converter.shouldDeclareVariableType[ValueParameterDescriptorImpl]

'type' @ [501:77] ==> public final val PsiVariable.type: PsiType[MyPropertyDescriptor]

'type' @ [501:86] ==> value-parameter type: Type defined in org.jetbrains.kotlin.j2k.Converter.shouldDeclareVariableType[ValueParameterDescriptorImpl]

'codeConverter' @ [506:31] ==> val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.Converter.shouldDeclareVariableType[LocalVariableDescriptor]

'convertedExpressionType' @ [506:45] ==> public final fun convertedExpressionType(expression: PsiExpression, expectedType: PsiType): Type defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'initializer' @ [506:69] ==> val initializer: PsiExpression? defined in org.jetbrains.kotlin.j2k.Converter.shouldDeclareVariableType[LocalVariableDescriptor]

'variable' @ [506:82] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.Converter.shouldDeclareVariableType[ValueParameterDescriptorImpl]

'type' @ [506:91] ==> public final val PsiVariable.type: PsiType[MyPropertyDescriptor]

'initializerType' @ [508:13] ==> val initializerType: Type defined in org.jetbrains.kotlin.j2k.Converter.shouldDeclareVariableType[LocalVariableDescriptor]

'shouldSpecifyTypeForAnonymousType' @ [510:13] ==> private final fun shouldSpecifyTypeForAnonymousType(variable: PsiVariable, initializerType: Type): Boolean defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'variable' @ [510:47] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.Converter.shouldDeclareVariableType[ValueParameterDescriptorImpl]

'initializerType' @ [510:57] ==> val initializerType: Type defined in org.jetbrains.kotlin.j2k.Converter.shouldDeclareVariableType[LocalVariableDescriptor]

'canChangeType' @ [512:13] ==> value-parameter canChangeType: Boolean defined in org.jetbrains.kotlin.j2k.Converter.shouldDeclareVariableType[ValueParameterDescriptorImpl]

'type' @ [514:16] ==> value-parameter type: Type defined in org.jetbrains.kotlin.j2k.Converter.shouldDeclareVariableType[ValueParameterDescriptorImpl]

'initializerType' @ [514:24] ==> val initializerType: Type defined in org.jetbrains.kotlin.j2k.Converter.shouldDeclareVariableType[LocalVariableDescriptor]

'initializerType' @ [521:13] ==> value-parameter initializerType: Type defined in org.jetbrains.kotlin.j2k.Converter.shouldSpecifyTypeForAnonymousType[ValueParameterDescriptorImpl]

'!' @ [521:46] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'initializerType' @ [521:47] ==> value-parameter initializerType: Type defined in org.jetbrains.kotlin.j2k.Converter.shouldSpecifyTypeForAnonymousType[ValueParameterDescriptorImpl]

'isAnonymous' @ [521:63] ==> public final fun isAnonymous(): Boolean defined in org.jetbrains.kotlin.j2k.ast.ClassType[SimpleFunctionDescriptorImpl]

'when {
                    variable is PsiField && variable.hasModifierProperty(PsiModifier.PRIVATE) -> variable.containingClass
                    variable is PsiLocalVariable -> variable.getContainingMethod()
                    else -> null
                }' @ [524:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'variable' @ [525:21] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.Converter.shouldSpecifyTypeForAnonymousType[ValueParameterDescriptorImpl]

'variable' @ [525:45] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.Converter.shouldSpecifyTypeForAnonymousType[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [525:54] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiVariable[JavaMethodDescriptor]

'PRIVATE' @ [525:86] ==> public const final val PRIVATE: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'variable' @ [525:98] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.Converter.shouldSpecifyTypeForAnonymousType[ValueParameterDescriptorImpl]

'containingClass' @ [525:107] ==> public final val PsiField.containingClass: PsiClass?[MyPropertyDescriptor]

'variable' @ [526:21] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.Converter.shouldSpecifyTypeForAnonymousType[ValueParameterDescriptorImpl]

'variable' @ [526:53] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.Converter.shouldSpecifyTypeForAnonymousType[ValueParameterDescriptorImpl]

'getContainingMethod' @ [526:62] ==> public fun PsiElement.getContainingMethod(): PsiMethod? defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'scope' @ [530:13] ==> val scope: PsiElement? defined in org.jetbrains.kotlin.j2k.Converter.shouldSpecifyTypeForAnonymousType[LocalVariableDescriptor]

'variable' @ [532:16] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.Converter.shouldSpecifyTypeForAnonymousType[ValueParameterDescriptorImpl]

'hasWriteAccesses' @ [532:25] ==> public fun PsiVariable.hasWriteAccesses(searcher: ReferenceSearcher, scope: PsiElement?): Boolean defined in org.jetbrains.kotlin.j2k in file ReferenceSearcher.kt[SimpleFunctionDescriptorImpl]

'referenceSearcher' @ [532:42] ==> public final val referenceSearcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'scope' @ [532:61] ==> val scope: PsiElement? defined in org.jetbrains.kotlin.j2k.Converter.shouldSpecifyTypeForAnonymousType[LocalVariableDescriptor]

'variable' @ [533:16] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.Converter.shouldSpecifyTypeForAnonymousType[ValueParameterDescriptorImpl]

'isInVariableInitializer' @ [533:25] ==> public fun PsiVariable.isInVariableInitializer(searcher: ReferenceSearcher, scope: PsiElement?): Boolean defined in org.jetbrains.kotlin.j2k in file ReferenceSearcher.kt[SimpleFunctionDescriptorImpl]

'referenceSearcher' @ [533:49] ==> public final val referenceSearcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'scope' @ [533:68] ==> val scope: PsiElement? defined in org.jetbrains.kotlin.j2k.Converter.shouldSpecifyTypeForAnonymousType[LocalVariableDescriptor]

'typeConverter' @ [543:26] ==> public final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'convertMethodReturnType' @ [543:40] ==> public final fun convertMethodReturnType(method: PsiMethod): Type defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'method' @ [543:64] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[ValueParameterDescriptorImpl]

'convertAnnotations' @ [545:27] ==> public final fun convertAnnotations(owner: PsiModifierListOwner, target: AnnotationUseTarget? = ...): Annotations defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'method' @ [545:46] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[ValueParameterDescriptorImpl]

'convertThrows' @ [545:56] ==> private final fun convertThrows(method: PsiMethod): Annotations defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'method' @ [545:70] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[ValueParameterDescriptorImpl]

'convertModifiers' @ [547:25] ==> public final fun convertModifiers(owner: PsiModifierListOwner, isMethodInOpenClass: Boolean): Modifiers defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'method' @ [547:42] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[ValueParameterDescriptorImpl]

'classKind' @ [547:50] ==> value-parameter classKind: ClassKind defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[ValueParameterDescriptorImpl]

'isOpen' @ [547:60] ==> public final fun isOpen(): Boolean defined in org.jetbrains.kotlin.j2k.ClassKind[SimpleFunctionDescriptorImpl]

'ArrayList' @ [549:34] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Statement

'method' @ [550:27] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[ValueParameterDescriptorImpl]

'parameterList' @ [550:34] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parameters' @ [550:48] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'parameter' @ [551:17] ==> val parameter: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'hasWriteAccesses' @ [551:27] ==> public fun PsiVariable.hasWriteAccesses(searcher: ReferenceSearcher, scope: PsiElement?): Boolean defined in org.jetbrains.kotlin.j2k in file ReferenceSearcher.kt[SimpleFunctionDescriptorImpl]

'referenceSearcher' @ [551:44] ==> public final val referenceSearcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'method' @ [551:63] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[ValueParameterDescriptorImpl]

'LocalVariable' @ [552:32] ==> public constructor LocalVariable(identifier: Identifier, annotations: Annotations, modifiers: Modifiers, explicitType: Type?, initializer: Expression, isVal: Boolean) defined in org.jetbrains.kotlin.j2k.ast.LocalVariable[ClassConstructorDescriptorImpl]

'parameter' @ [552:46] ==> val parameter: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'declarationIdentifier' @ [552:56] ==> public fun PsiNameIdentifierOwner.declarationIdentifier(): Identifier defined in org.jetbrains.kotlin.j2k.ast in file Identifier.kt[SimpleFunctionDescriptorImpl]

'Annotations' @ [553:46] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Annotations[FakeCallableDescriptorForObject]

'Empty' @ [553:58] ==> public final val Empty: Annotations defined in org.jetbrains.kotlin.j2k.ast.Annotations.Companion[PropertyDescriptorImpl]

'Modifiers' @ [554:46] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Modifiers[FakeCallableDescriptorForObject]

'Empty' @ [554:56] ==> public final val Empty: Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers.Companion[PropertyDescriptorImpl]

'parameter' @ [556:46] ==> val parameter: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'declarationIdentifier' @ [556:56] ==> public fun PsiNameIdentifierOwner.declarationIdentifier(): Identifier defined in org.jetbrains.kotlin.j2k.ast in file Identifier.kt[SimpleFunctionDescriptorImpl]

'assignNoPrototype' @ [557:53] ==> public fun <TElement : Element> LocalVariable.assignNoPrototype(): LocalVariable defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> LocalVariable

'statementsToInsert' @ [558:17] ==> val statementsToInsert: ArrayList<Statement> defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'add' @ [558:36] ==> public open fun add(element: Statement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'DeclarationStatement' @ [558:40] ==> public constructor DeclarationStatement(elements: List<Element>) defined in org.jetbrains.kotlin.j2k.ast.DeclarationStatement[ClassConstructorDescriptorImpl]

'listOf' @ [558:61] ==> public fun <T> listOf(element: LocalVariable): List<LocalVariable> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalVariable

'variable' @ [558:68] ==> val variable: LocalVariable defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'assignNoPrototype' @ [558:79] ==> public fun <TElement : Element> DeclarationStatement.assignNoPrototype(): DeclarationStatement defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> DeclarationStatement

'if (statementsToInsert.isEmpty()) {
                body
            }
            else {
                Block(statementsToInsert + body.statements, body.lBrace, body.rBrace).assignPrototypesFrom(body)
            }' @ [562:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Block, elseBranch: Block): Block[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Block

'statementsToInsert' @ [562:17] ==> val statementsToInsert: ArrayList<Statement> defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'isEmpty' @ [562:36] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'body' @ [563:17] ==> value-parameter body: Block defined in org.jetbrains.kotlin.j2k.Converter.convertMethod.<anonymous>[ValueParameterDescriptorImpl]

'Block' @ [566:17] ==> public constructor Block(statements: List<Statement>, lBrace: LBrace, rBrace: RBrace, notEmpty: Boolean = ...) defined in org.jetbrains.kotlin.j2k.ast.Block[ClassConstructorDescriptorImpl]

'statementsToInsert' @ [566:23] ==> val statementsToInsert: ArrayList<Statement> defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'body' @ [566:44] ==> value-parameter body: Block defined in org.jetbrains.kotlin.j2k.Converter.convertMethod.<anonymous>[ValueParameterDescriptorImpl]

'statements' @ [566:49] ==> public final val statements: List<Statement> defined in org.jetbrains.kotlin.j2k.ast.Block[PropertyDescriptorImpl]

'body' @ [566:61] ==> value-parameter body: Block defined in org.jetbrains.kotlin.j2k.Converter.convertMethod.<anonymous>[ValueParameterDescriptorImpl]

'lBrace' @ [566:66] ==> public final val lBrace: LBrace defined in org.jetbrains.kotlin.j2k.ast.Block[PropertyDescriptorImpl]

'body' @ [566:74] ==> value-parameter body: Block defined in org.jetbrains.kotlin.j2k.Converter.convertMethod.<anonymous>[ValueParameterDescriptorImpl]

'rBrace' @ [566:79] ==> public final val rBrace: RBrace defined in org.jetbrains.kotlin.j2k.ast.Block[PropertyDescriptorImpl]

'assignPrototypesFrom' @ [566:87] ==> public fun <TElement : Element> Block.assignPrototypesFrom(element: Element, inheritance: CommentsAndSpacesInheritance? = ...): Block defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Block

'body' @ [566:108] ==> value-parameter body: Block defined in org.jetbrains.kotlin.j2k.Converter.convertMethod.<anonymous>[ValueParameterDescriptorImpl]

'if (method.isConstructor && constructorConverter != null) {
            constructorConverter.convertConstructor(method, annotations, modifiers, fieldsToDrop!!, postProcessBody)
        }
        else {
            val containingClass = method.containingClass

            if (settings.openByDefault) {
                val isEffectivelyFinal = method.hasModifierProperty(PsiModifier.FINAL) ||
                                         containingClass != null && (containingClass.hasModifierProperty(PsiModifier.FINAL) || containingClass.isEnum)
                if (!isEffectivelyFinal && !modifiers.contains(Modifier.ABSTRACT) && !modifiers.isPrivate) {
                    modifiers = modifiers.with(Modifier.OPEN)
                }
            }

            val params = convertParameterList(method, overloadReducer)

            val typeParameterList = convertTypeParameterList(method.typeParameterList)
            val body = deferredElement { codeConverter: CodeConverter ->
                val body = codeConverter.withMethodReturnType(method.returnType).convertBlock(method.body)
                postProcessBody(body)
            }
            Function(method.declarationIdentifier(), annotations, modifiers, returnType, typeParameterList, params, body, classKind == ClassKind.INTERFACE)
        }' @ [570:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionLike?, elseBranch: FunctionLike?): FunctionLike?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FunctionLike?

'method' @ [570:28] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[ValueParameterDescriptorImpl]

'isConstructor' @ [570:35] ==> public final val PsiMethod.isConstructor: Boolean[MyPropertyDescriptor]

'constructorConverter' @ [570:52] ==> value-parameter constructorConverter: ConstructorConverter? defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[ValueParameterDescriptorImpl]

'constructorConverter' @ [571:13] ==> value-parameter constructorConverter: ConstructorConverter? defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[ValueParameterDescriptorImpl]

'convertConstructor' @ [571:34] ==> public final fun convertConstructor(constructor: PsiMethod, annotations: Annotations, modifiers: Modifiers, fieldsToDrop: MutableSet<PsiField>, postProcessBody: (Block) -> Block): Constructor? defined in org.jetbrains.kotlin.j2k.ConstructorConverter[SimpleFunctionDescriptorImpl]

'method' @ [571:53] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[ValueParameterDescriptorImpl]

'annotations' @ [571:61] ==> val annotations: Annotations defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'modifiers' @ [571:74] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'fieldsToDrop' @ [571:85] ==> value-parameter fieldsToDrop: MutableSet<PsiField>? defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[ValueParameterDescriptorImpl]

'postProcessBody' @ [571:101] ==> val postProcessBody: (Block) -> Block defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'method' @ [574:35] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[ValueParameterDescriptorImpl]

'containingClass' @ [574:42] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'settings' @ [576:17] ==> public final val settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'openByDefault' @ [576:26] ==> public final var openByDefault: Boolean defined in org.jetbrains.kotlin.j2k.ConverterSettings[PropertyDescriptorImpl]

'method' @ [577:42] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [577:49] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'FINAL' @ [577:81] ==> public const final val FINAL: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'containingClass' @ [578:42] ==> val containingClass: PsiClass? defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'containingClass' @ [578:70] ==> val containingClass: PsiClass? defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'hasModifierProperty' @ [578:86] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiClass[JavaMethodDescriptor]

'FINAL' @ [578:118] ==> public const final val FINAL: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'containingClass' @ [578:128] ==> val containingClass: PsiClass? defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'isEnum' @ [578:144] ==> public final val PsiClass.isEnum: Boolean[MyPropertyDescriptor]

'!' @ [579:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isEffectivelyFinal' @ [579:22] ==> val isEffectivelyFinal: Boolean defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'!' @ [579:44] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'modifiers' @ [579:45] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'contains' @ [579:55] ==> public final fun contains(modifier: Modifier): Boolean defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'ABSTRACT' @ [579:73] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'!' @ [579:86] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'modifiers' @ [579:87] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'isPrivate' @ [579:97] ==> public final val isPrivate: Boolean defined in org.jetbrains.kotlin.j2k.ast.Modifiers[PropertyDescriptorImpl]

'modifiers' @ [580:21] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'modifiers' @ [580:33] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'with' @ [580:43] ==> public final fun with(modifier: Modifier?): Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'OPEN' @ [580:57] ==> enum entry OPEN defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'convertParameterList' @ [584:26] ==> public fun Converter.convertParameterList(method: PsiMethod, overloadReducer: OverloadReducer?, convertParameter: (parameter: PsiParameter, default: DeferredElement<Expression>?) -> FunctionParameter = ..., correctCodeConverter: CodeConverter.() -> CodeConverter = ...): ParameterList defined in org.jetbrains.kotlin.j2k[SimpleFunctionDescriptorImpl]

'method' @ [584:47] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[ValueParameterDescriptorImpl]

'overloadReducer' @ [584:55] ==> value-parameter overloadReducer: OverloadReducer? defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[ValueParameterDescriptorImpl]

'convertTypeParameterList' @ [586:37] ==> public fun Converter.convertTypeParameterList(typeParameterList: PsiTypeParameterList?): TypeParameterList defined in org.jetbrains.kotlin.j2k.ast in file TypeParameters.kt[SimpleFunctionDescriptorImpl]

'method' @ [586:62] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[ValueParameterDescriptorImpl]

'typeParameterList' @ [586:69] ==> public final val PsiMethod.typeParameterList: PsiTypeParameterList?[MyPropertyDescriptor]

'deferredElement' @ [587:24] ==> public final fun <TResult : Element> deferredElement(generator: (CodeConverter) -> Block): DeferredElement<Block> defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]
Inferred types:
    <TResult : Element> -> Block

'codeConverter' @ [588:28] ==> value-parameter codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.Converter.convertMethod.<anonymous>[ValueParameterDescriptorImpl]

'withMethodReturnType' @ [588:42] ==> public final fun withMethodReturnType(methodReturnType: PsiType?): CodeConverter defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'method' @ [588:63] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[ValueParameterDescriptorImpl]

'returnType' @ [588:70] ==> public final val PsiMethod.returnType: PsiType?[MyPropertyDescriptor]

'convertBlock' @ [588:82] ==> public final fun convertBlock(block: PsiCodeBlock?, notEmpty: Boolean = ..., statementFilter: (PsiStatement) -> Boolean = ...): Block defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'method' @ [588:95] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[ValueParameterDescriptorImpl]

'body' @ [588:102] ==> public final val PsiMethod.body: PsiCodeBlock?[MyPropertyDescriptor]

'invoke' @ [589:17] ==> public abstract operator fun invoke(p1: Block): Block defined in kotlin.Function1[FunctionInvokeDescriptor]

'body' @ [589:33] ==> val body: Block defined in org.jetbrains.kotlin.j2k.Converter.convertMethod.<anonymous>[LocalVariableDescriptor]

'Function' @ [591:13] ==> public constructor Function(name: Identifier, annotations: Annotations, modifiers: Modifiers, returnType: Type, typeParameterList: TypeParameterList, parameterList: ParameterList, body: DeferredElement<Block>?, isInInterface: Boolean) defined in org.jetbrains.kotlin.j2k.ast.Function[ClassConstructorDescriptorImpl]

'method' @ [591:22] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[ValueParameterDescriptorImpl]

'declarationIdentifier' @ [591:29] ==> public fun PsiNameIdentifierOwner.declarationIdentifier(): Identifier defined in org.jetbrains.kotlin.j2k.ast in file Identifier.kt[SimpleFunctionDescriptorImpl]

'annotations' @ [591:54] ==> val annotations: Annotations defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'modifiers' @ [591:67] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'returnType' @ [591:78] ==> val returnType: Type defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'typeParameterList' @ [591:90] ==> val typeParameterList: TypeParameterList defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'params' @ [591:109] ==> val params: ParameterList defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'body' @ [591:117] ==> val body: DeferredElement<Block> defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'classKind' @ [591:123] ==> value-parameter classKind: ClassKind defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[ValueParameterDescriptorImpl]

'INTERFACE' @ [591:146] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.j2k.ClassKind[FakeCallableDescriptorForObject]

'function' @ [594:13] ==> val function: FunctionLike? defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'isMainMethod' @ [596:27] ==> public open fun isMainMethod(p0: (PsiMethod..PsiMethod?)): Boolean defined in com.intellij.psi.util.PsiMethodUtil[JavaMethodDescriptor]

'method' @ [596:40] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[ValueParameterDescriptorImpl]

'function' @ [597:13] ==> val function: FunctionLike? defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'annotations' @ [597:22] ==> public final var annotations: Annotations defined in org.jetbrains.kotlin.j2k.ast.FunctionLike[PropertyDescriptorImpl]

'Annotations' @ [597:37] ==> public constructor Annotations(annotations: List<Annotation>) defined in org.jetbrains.kotlin.j2k.ast.Annotations[ClassConstructorDescriptorImpl]

'listOf' @ [598:21] ==> public fun <T> listOf(element: Annotation): List<Annotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation

'Annotation' @ [598:28] ==> public constructor Annotation(name: Identifier, arguments: List<Pair<Identifier?, DeferredElement<Expression>>>, newLineAfter: Boolean, target: AnnotationUseTarget? = ...) defined in org.jetbrains.kotlin.j2k.ast.Annotation[ClassConstructorDescriptorImpl]

'Identifier' @ [598:39] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'withNoPrototype' @ [598:50] ==> public final fun withNoPrototype(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...): Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[SimpleFunctionDescriptorImpl]

'listOf' @ [599:39] ==> @InlineOnly public inline fun <T> listOf(): List<Pair<Identifier?, DeferredElement<Expression>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Identifier?, DeferredElement<Expression>>

'assignNoPrototype' @ [600:61] ==> public fun <TElement : Element> Annotation.assignNoPrototype(): Annotation defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Annotation

'assignNoPrototype' @ [600:83] ==> public fun <TElement : Element> Annotations.assignNoPrototype(): Annotations defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Annotations

'function' @ [603:13] ==> val function: FunctionLike? defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'parameterList' @ [603:22] ==> public open val parameterList: ParameterList? defined in org.jetbrains.kotlin.j2k.ast.FunctionLike[PropertyDescriptorImpl]

'parameters' @ [603:38] ==> public final val parameters: List<Parameter> defined in org.jetbrains.kotlin.j2k.ast.ParameterList[PropertyDescriptorImpl]

'any' @ [603:49] ==> public inline fun <T> Iterable<Parameter>.any(predicate: (Parameter) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Parameter

'it' @ [603:55] ==> value-parameter it: Parameter defined in org.jetbrains.kotlin.j2k.Converter.convertMethod.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [603:82] ==> value-parameter it: Parameter defined in org.jetbrains.kotlin.j2k.Converter.convertMethod.<anonymous>[ValueParameterDescriptorImpl]

'defaultValue' @ [603:85] ==> public final val defaultValue: DeferredElement<Expression>? defined in org.jetbrains.kotlin.j2k.ast.FunctionParameter[PropertyDescriptorImpl]

'!' @ [603:111] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'function' @ [603:112] ==> val function: FunctionLike? defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'modifiers' @ [603:121] ==> public final val modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.ast.FunctionLike[PropertyDescriptorImpl]

'isPrivate' @ [603:131] ==> public final val isPrivate: Boolean defined in org.jetbrains.kotlin.j2k.ast.Modifiers[PropertyDescriptorImpl]

'function' @ [604:13] ==> val function: FunctionLike? defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'annotations' @ [604:22] ==> public final var annotations: Annotations defined in org.jetbrains.kotlin.j2k.ast.FunctionLike[PropertyDescriptorImpl]

'Annotations' @ [604:37] ==> public constructor Annotations(annotations: List<Annotation>) defined in org.jetbrains.kotlin.j2k.ast.Annotations[ClassConstructorDescriptorImpl]

'listOf' @ [605:21] ==> public fun <T> listOf(element: Annotation): List<Annotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation

'Annotation' @ [605:28] ==> public constructor Annotation(name: Identifier, arguments: List<Pair<Identifier?, DeferredElement<Expression>>>, newLineAfter: Boolean, target: AnnotationUseTarget? = ...) defined in org.jetbrains.kotlin.j2k.ast.Annotation[ClassConstructorDescriptorImpl]

'Identifier' @ [605:39] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'withNoPrototype' @ [605:50] ==> public final fun withNoPrototype(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...): Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[SimpleFunctionDescriptorImpl]

'listOf' @ [606:39] ==> @InlineOnly public inline fun <T> listOf(): List<Pair<Identifier?, DeferredElement<Expression>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Identifier?, DeferredElement<Expression>>

'assignNoPrototype' @ [607:61] ==> public fun <TElement : Element> Annotation.assignNoPrototype(): Annotation defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Annotation

'assignNoPrototype' @ [607:83] ==> public fun <TElement : Element> Annotations.assignNoPrototype(): Annotations defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Annotations

'function' @ [610:16] ==> val function: FunctionLike? defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[LocalVariableDescriptor]

'assignPrototype' @ [610:25] ==> public fun <TElement : Element> FunctionLike.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): FunctionLike defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> FunctionLike

'method' @ [610:41] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.convertMethod[ValueParameterDescriptorImpl]

'method' @ [617:31] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.isOverride[ValueParameterDescriptorImpl]

'hierarchicalMethodSignature' @ [617:38] ==> public final val PsiMethod.hierarchicalMethodSignature: HierarchicalMethodSignature[MyPropertyDescriptor]

'superSignatures' @ [617:66] ==> public final val HierarchicalMethodSignature.superSignatures: (MutableList<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>..List<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>)[MyPropertyDescriptor]

'superSignatures' @ [619:44] ==> val superSignatures: (MutableList<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>..List<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>) defined in org.jetbrains.kotlin.j2k.Converter.isOverride[LocalVariableDescriptor]

'any' @ [619:60] ==> public inline fun <T> Iterable<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>.any(predicate: ((HierarchicalMethodSignature..HierarchicalMethodSignature?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.HierarchicalMethodSignature..com.intellij.psi.HierarchicalMethodSignature?)

'it' @ [620:13] ==> value-parameter it: (HierarchicalMethodSignature..HierarchicalMethodSignature?) defined in org.jetbrains.kotlin.j2k.Converter.isOverride.<anonymous>[ValueParameterDescriptorImpl]

'method' @ [620:16] ==> public final val HierarchicalMethodSignature.method: PsiMethod[MyPropertyDescriptor]

'containingClass' @ [620:23] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'qualifiedName' @ [620:40] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'JAVA_LANG_OBJECT' @ [620:57] ==> @NonNls public const final val JAVA_LANG_OBJECT: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'overridesMethodNotFromObject' @ [622:13] ==> val overridesMethodNotFromObject: Boolean defined in org.jetbrains.kotlin.j2k.Converter.isOverride[LocalVariableDescriptor]

'superSignatures' @ [624:41] ==> val superSignatures: (MutableList<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>..List<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>) defined in org.jetbrains.kotlin.j2k.Converter.isOverride[LocalVariableDescriptor]

'any' @ [624:57] ==> public inline fun <T> Iterable<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>.any(predicate: ((HierarchicalMethodSignature..HierarchicalMethodSignature?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.HierarchicalMethodSignature..com.intellij.psi.HierarchicalMethodSignature?)

'it' @ [625:13] ==> value-parameter it: (HierarchicalMethodSignature..HierarchicalMethodSignature?) defined in org.jetbrains.kotlin.j2k.Converter.isOverride.<anonymous>[ValueParameterDescriptorImpl]

'method' @ [625:16] ==> public final val HierarchicalMethodSignature.method: PsiMethod[MyPropertyDescriptor]

'containingClass' @ [625:23] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'qualifiedName' @ [625:40] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'JAVA_LANG_OBJECT' @ [625:57] ==> @NonNls public const final val JAVA_LANG_OBJECT: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'overridesMethodFromObject' @ [627:13] ==> val overridesMethodFromObject: Boolean defined in org.jetbrains.kotlin.j2k.Converter.isOverride[LocalVariableDescriptor]

'when (method.name) {
                "equals", "hashCode", "toString" -> return true // these methods from java.lang.Object exist in kotlin.Any

                else -> {
                    val containing = method.containingClass
                    if (containing != null) {
                        val hasOtherJavaSuperclasses = containing.superTypes.any {
                            //TODO: correctly check for kotlin class
                            val klass = it.resolve()
                            klass != null && klass.qualifiedName != JAVA_LANG_OBJECT && !inConversionScope(klass)
                        }
                        if (hasOtherJavaSuperclasses) return true
                    }
                }
            }' @ [628:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'method' @ [628:19] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.isOverride[ValueParameterDescriptorImpl]

'name' @ [628:26] ==> public final var PsiMethod.name: String[MyPropertyDescriptor]

'method' @ [632:38] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.isOverride[ValueParameterDescriptorImpl]

'containingClass' @ [632:45] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'containing' @ [633:25] ==> val containing: PsiClass? defined in org.jetbrains.kotlin.j2k.Converter.isOverride[LocalVariableDescriptor]

'containing' @ [634:56] ==> val containing: PsiClass? defined in org.jetbrains.kotlin.j2k.Converter.isOverride[LocalVariableDescriptor]

'superTypes' @ [634:67] ==> public final val PsiClass.superTypes: (Array<(PsiClassType..PsiClassType?)>..Array<out (PsiClassType..PsiClassType?)>)[MyPropertyDescriptor]

'any' @ [634:78] ==> public inline fun <T> Array<out (PsiClassType..PsiClassType?)>.any(predicate: ((PsiClassType..PsiClassType?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClassType..com.intellij.psi.PsiClassType?)

'it' @ [636:41] ==> value-parameter it: (PsiClassType..PsiClassType?) defined in org.jetbrains.kotlin.j2k.Converter.isOverride.<anonymous>[ValueParameterDescriptorImpl]

'resolve' @ [636:44] ==> @Nullable public abstract fun resolve(): PsiClass? defined in com.intellij.psi.PsiClassType[JavaMethodDescriptor]

'klass' @ [637:29] ==> val klass: PsiClass? defined in org.jetbrains.kotlin.j2k.Converter.isOverride.<anonymous>[LocalVariableDescriptor]

'klass' @ [637:46] ==> val klass: PsiClass? defined in org.jetbrains.kotlin.j2k.Converter.isOverride.<anonymous>[LocalVariableDescriptor]

'qualifiedName' @ [637:52] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'JAVA_LANG_OBJECT' @ [637:69] ==> @NonNls public const final val JAVA_LANG_OBJECT: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'!' @ [637:89] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [637:90] ==> public abstract operator fun invoke(p1: PsiElement): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'klass' @ [637:108] ==> val klass: PsiClass? defined in org.jetbrains.kotlin.j2k.Converter.isOverride.<anonymous>[LocalVariableDescriptor]

'hasOtherJavaSuperclasses' @ [639:29] ==> val hasOtherJavaSuperclasses: Boolean defined in org.jetbrains.kotlin.j2k.Converter.isOverride[LocalVariableDescriptor]

'!' @ [649:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInOpenClass' @ [649:14] ==> value-parameter isInOpenClass: Boolean defined in org.jetbrains.kotlin.j2k.Converter.needOpenModifier[ValueParameterDescriptorImpl]

'modifiers' @ [650:13] ==> value-parameter modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.needOpenModifier[ValueParameterDescriptorImpl]

'contains' @ [650:23] ==> public final fun contains(modifier: Modifier): Boolean defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'OVERRIDE' @ [650:41] ==> enum entry OVERRIDE defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'modifiers' @ [650:54] ==> value-parameter modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.needOpenModifier[ValueParameterDescriptorImpl]

'contains' @ [650:64] ==> public final fun contains(modifier: Modifier): Boolean defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'ABSTRACT' @ [650:82] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'if (settings.openByDefault) {
            !method.hasModifierProperty(PsiModifier.FINAL)
            && !method.hasModifierProperty(PsiModifier.PRIVATE)
            && !method.hasModifierProperty(PsiModifier.STATIC)
        }
        else {
            referenceSearcher.hasOverrides(method)
        }' @ [651:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'settings' @ [651:20] ==> public final val settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'openByDefault' @ [651:29] ==> public final var openByDefault: Boolean defined in org.jetbrains.kotlin.j2k.ConverterSettings[PropertyDescriptorImpl]

'!' @ [652:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'method' @ [652:14] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.needOpenModifier[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [652:21] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'FINAL' @ [652:53] ==> public const final val FINAL: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'!' @ [653:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'method' @ [653:17] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.needOpenModifier[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [653:24] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'PRIVATE' @ [653:56] ==> public const final val PRIVATE: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'!' @ [654:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'method' @ [654:17] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.needOpenModifier[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [654:24] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'STATIC' @ [654:56] ==> public const final val STATIC: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'referenceSearcher' @ [657:13] ==> public final val referenceSearcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'hasOverrides' @ [657:31] ==> public abstract fun hasOverrides(method: PsiMethod): Boolean defined in org.jetbrains.kotlin.j2k.ReferenceSearcher[SimpleFunctionDescriptorImpl]

'method' @ [657:44] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.needOpenModifier[ValueParameterDescriptorImpl]

'typeArgsConverted' @ [662:24] ==> value-parameter typeArgsConverted: List<Element>? = ... defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[ValueParameterDescriptorImpl]

'typeConverter' @ [662:45] ==> public final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'convertTypes' @ [662:59] ==> public final fun convertTypes(types: Array<PsiType>): List<Type> defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'element' @ [662:72] ==> value-parameter element: PsiJavaCodeReferenceElement defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[ValueParameterDescriptorImpl]

'typeParameters' @ [662:80] ==> public final val PsiJavaCodeReferenceElement.typeParameters: (Array<(PsiType..PsiType?)>..Array<out (PsiType..PsiType?)>)[MyPropertyDescriptor]

'element' @ [664:27] ==> value-parameter element: PsiJavaCodeReferenceElement defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[ValueParameterDescriptorImpl]

'resolve' @ [664:35] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiJavaCodeReferenceElement[JavaMethodDescriptor]

'targetClass' @ [665:13] ==> val targetClass: PsiClass? defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[LocalVariableDescriptor]

'convertToKotlinAnalogIdentifier' @ [666:13] ==> public fun Converter.convertToKotlinAnalogIdentifier(classQualifiedName: String?, mutability: Mutability): Identifier? defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'targetClass' @ [666:45] ==> val targetClass: PsiClass? defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[LocalVariableDescriptor]

'qualifiedName' @ [666:57] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'Default' @ [666:83] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Mutability[FakeCallableDescriptorForObject]

'let' @ [667:23] ==> @InlineOnly public inline fun <T, R> Identifier.let(block: (Identifier) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Identifier
    <R> -> Nothing

'ReferenceElement' @ [667:36] ==> public constructor ReferenceElement(name: Identifier, typeArgs: List<Element>) defined in org.jetbrains.kotlin.j2k.ast.ReferenceElement[ClassConstructorDescriptorImpl]

'it' @ [667:53] ==> value-parameter it: Identifier defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement.<anonymous>[ValueParameterDescriptorImpl]

'typeArgs' @ [667:57] ==> val typeArgs: List<Element> defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[LocalVariableDescriptor]

'assignNoPrototype' @ [667:67] ==> public fun <TElement : Element> ReferenceElement.assignNoPrototype(): ReferenceElement defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> ReferenceElement

'if (element.isQualified) {
            var result = Identifier.toKotlin(element.referenceName!!)
            var qualifier = element.qualifier
            while (qualifier != null) {
                val codeRefElement = qualifier as PsiJavaCodeReferenceElement
                result = Identifier.toKotlin(codeRefElement.referenceName!!) + "." + result
                qualifier = codeRefElement.qualifier
            }
            ReferenceElement(Identifier.withNoPrototype(result), typeArgs).assignPrototype(element, CommentsAndSpacesInheritance.NO_SPACES)
        }
        else {
            if (!hasExternalQualifier) {
                // references to nested classes may need correction
                if (targetClass != null) {
                    val identifier = constructNestedClassReferenceIdentifier(targetClass, element)
                    if (identifier != null) {
                        return ReferenceElement(identifier, typeArgs).assignPrototype(element, CommentsAndSpacesInheritance.NO_SPACES)
                    }
                }
            }

            ReferenceElement(Identifier.withNoPrototype(element.referenceName!!), typeArgs).assignPrototype(element, CommentsAndSpacesInheritance.NO_SPACES)
        }' @ [670:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ReferenceElement, elseBranch: ReferenceElement): ReferenceElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ReferenceElement

'element' @ [670:20] ==> value-parameter element: PsiJavaCodeReferenceElement defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[ValueParameterDescriptorImpl]

'isQualified' @ [670:28] ==> public final val PsiJavaCodeReferenceElement.isQualified: Boolean[MyPropertyDescriptor]

'Identifier' @ [671:26] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'toKotlin' @ [671:37] ==> public final fun toKotlin(name: String): String defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[SimpleFunctionDescriptorImpl]

'element' @ [671:46] ==> value-parameter element: PsiJavaCodeReferenceElement defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[ValueParameterDescriptorImpl]

'referenceName' @ [671:54] ==> public final val PsiJavaCodeReferenceElement.referenceName: String?[MyPropertyDescriptor]

'element' @ [672:29] ==> value-parameter element: PsiJavaCodeReferenceElement defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[ValueParameterDescriptorImpl]

'qualifier' @ [672:37] ==> public final val PsiJavaCodeReferenceElement.qualifier: PsiElement?[MyPropertyDescriptor]

'qualifier' @ [673:20] ==> var qualifier: PsiElement? defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[LocalVariableDescriptor]

'qualifier' @ [674:38] ==> var qualifier: PsiElement? defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[LocalVariableDescriptor]

'result' @ [675:17] ==> var result: String defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[LocalVariableDescriptor]

'Identifier' @ [675:26] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'toKotlin' @ [675:37] ==> public final fun toKotlin(name: String): String defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[SimpleFunctionDescriptorImpl]

'codeRefElement' @ [675:46] ==> val codeRefElement: PsiJavaCodeReferenceElement defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[LocalVariableDescriptor]

'referenceName' @ [675:61] ==> public final val PsiJavaCodeReferenceElement.referenceName: String?[MyPropertyDescriptor]

'result' @ [675:86] ==> var result: String defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[LocalVariableDescriptor]

'qualifier' @ [676:17] ==> var qualifier: PsiElement? defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[LocalVariableDescriptor]

'codeRefElement' @ [676:29] ==> val codeRefElement: PsiJavaCodeReferenceElement defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[LocalVariableDescriptor]

'qualifier' @ [676:44] ==> public final val PsiJavaCodeReferenceElement.qualifier: PsiElement?[MyPropertyDescriptor]

'ReferenceElement' @ [678:13] ==> public constructor ReferenceElement(name: Identifier, typeArgs: List<Element>) defined in org.jetbrains.kotlin.j2k.ast.ReferenceElement[ClassConstructorDescriptorImpl]

'Identifier' @ [678:30] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'withNoPrototype' @ [678:41] ==> public final fun withNoPrototype(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...): Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[SimpleFunctionDescriptorImpl]

'result' @ [678:57] ==> var result: String defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[LocalVariableDescriptor]

'typeArgs' @ [678:66] ==> val typeArgs: List<Element> defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[LocalVariableDescriptor]

'assignPrototype' @ [678:76] ==> public fun <TElement : Element> ReferenceElement.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): ReferenceElement defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> ReferenceElement

'element' @ [678:92] ==> value-parameter element: PsiJavaCodeReferenceElement defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[ValueParameterDescriptorImpl]

'CommentsAndSpacesInheritance' @ [678:101] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance[FakeCallableDescriptorForObject]

'NO_SPACES' @ [678:130] ==> public final val NO_SPACES: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance.Companion[PropertyDescriptorImpl]

'!' @ [681:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasExternalQualifier' @ [681:18] ==> value-parameter hasExternalQualifier: Boolean defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[ValueParameterDescriptorImpl]

'targetClass' @ [683:21] ==> val targetClass: PsiClass? defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[LocalVariableDescriptor]

'constructNestedClassReferenceIdentifier' @ [684:38] ==> private final fun constructNestedClassReferenceIdentifier(psiClass: PsiClass, context: PsiElement): Identifier? defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'targetClass' @ [684:78] ==> val targetClass: PsiClass? defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[LocalVariableDescriptor]

'element' @ [684:91] ==> value-parameter element: PsiJavaCodeReferenceElement defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[ValueParameterDescriptorImpl]

'identifier' @ [685:25] ==> val identifier: Identifier? defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[LocalVariableDescriptor]

'ReferenceElement' @ [686:32] ==> public constructor ReferenceElement(name: Identifier, typeArgs: List<Element>) defined in org.jetbrains.kotlin.j2k.ast.ReferenceElement[ClassConstructorDescriptorImpl]

'identifier' @ [686:49] ==> val identifier: Identifier? defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[LocalVariableDescriptor]

'typeArgs' @ [686:61] ==> val typeArgs: List<Element> defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[LocalVariableDescriptor]

'assignPrototype' @ [686:71] ==> public fun <TElement : Element> ReferenceElement.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): ReferenceElement defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> ReferenceElement

'element' @ [686:87] ==> value-parameter element: PsiJavaCodeReferenceElement defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[ValueParameterDescriptorImpl]

'CommentsAndSpacesInheritance' @ [686:96] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance[FakeCallableDescriptorForObject]

'NO_SPACES' @ [686:125] ==> public final val NO_SPACES: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance.Companion[PropertyDescriptorImpl]

'ReferenceElement' @ [691:13] ==> public constructor ReferenceElement(name: Identifier, typeArgs: List<Element>) defined in org.jetbrains.kotlin.j2k.ast.ReferenceElement[ClassConstructorDescriptorImpl]

'Identifier' @ [691:30] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'withNoPrototype' @ [691:41] ==> public final fun withNoPrototype(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...): Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[SimpleFunctionDescriptorImpl]

'element' @ [691:57] ==> value-parameter element: PsiJavaCodeReferenceElement defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[ValueParameterDescriptorImpl]

'referenceName' @ [691:65] ==> public final val PsiJavaCodeReferenceElement.referenceName: String?[MyPropertyDescriptor]

'typeArgs' @ [691:83] ==> val typeArgs: List<Element> defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[LocalVariableDescriptor]

'assignPrototype' @ [691:93] ==> public fun <TElement : Element> ReferenceElement.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): ReferenceElement defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> ReferenceElement

'element' @ [691:109] ==> value-parameter element: PsiJavaCodeReferenceElement defined in org.jetbrains.kotlin.j2k.Converter.convertCodeReferenceElement[ValueParameterDescriptorImpl]

'CommentsAndSpacesInheritance' @ [691:118] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance[FakeCallableDescriptorForObject]

'NO_SPACES' @ [691:147] ==> public final val NO_SPACES: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance.Companion[PropertyDescriptorImpl]

'psiClass' @ [696:26] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.constructNestedClassReferenceIdentifier[ValueParameterDescriptorImpl]

'containingClass' @ [696:35] ==> public final val PsiClass.containingClass: PsiClass?[MyPropertyDescriptor]

'outerClass' @ [697:13] ==> val outerClass: PsiClass? defined in org.jetbrains.kotlin.j2k.Converter.constructNestedClassReferenceIdentifier[LocalVariableDescriptor]

'!' @ [698:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAncestor' @ [698:29] ==> @Contract public open fun isAncestor(@Nullable p0: PsiElement?, @NotNull p1: PsiElement, p2: Boolean): Boolean defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'outerClass' @ [698:40] ==> val outerClass: PsiClass? defined in org.jetbrains.kotlin.j2k.Converter.constructNestedClassReferenceIdentifier[LocalVariableDescriptor]

'context' @ [698:52] ==> value-parameter context: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.constructNestedClassReferenceIdentifier[ValueParameterDescriptorImpl]

'!' @ [699:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'psiClass' @ [699:17] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.constructNestedClassReferenceIdentifier[ValueParameterDescriptorImpl]

'isImported' @ [699:26] ==> public fun PsiMember.isImported(file: PsiJavaFile): Boolean defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'elementToConvert' @ [699:37] ==> private final val elementToConvert: PsiElement defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'containingFile' @ [699:54] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'constructNestedClassReferenceIdentifier' @ [700:29] ==> private final fun constructNestedClassReferenceIdentifier(psiClass: PsiClass, context: PsiElement): Identifier? defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'outerClass' @ [700:69] ==> val outerClass: PsiClass? defined in org.jetbrains.kotlin.j2k.Converter.constructNestedClassReferenceIdentifier[LocalVariableDescriptor]

'context' @ [700:81] ==> value-parameter context: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.constructNestedClassReferenceIdentifier[ValueParameterDescriptorImpl]

'name' @ [700:91] ==> public final val name: String defined in org.jetbrains.kotlin.j2k.ast.Identifier[PropertyDescriptorImpl]

'outerClass' @ [700:99] ==> val outerClass: PsiClass? defined in org.jetbrains.kotlin.j2k.Converter.constructNestedClassReferenceIdentifier[LocalVariableDescriptor]

'name' @ [700:110] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'Identifier' @ [701:20] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'withNoPrototype' @ [701:31] ==> public final fun withNoPrototype(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...): Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[SimpleFunctionDescriptorImpl]

'Identifier' @ [701:47] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'toKotlin' @ [701:58] ==> public final fun toKotlin(name: String): String defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[SimpleFunctionDescriptorImpl]

'qualifier' @ [701:67] ==> val qualifier: String defined in org.jetbrains.kotlin.j2k.Converter.constructNestedClassReferenceIdentifier[LocalVariableDescriptor]

'Identifier' @ [701:86] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'toKotlin' @ [701:97] ==> public final fun toKotlin(name: String): String defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[SimpleFunctionDescriptorImpl]

'psiClass' @ [701:106] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.constructNestedClassReferenceIdentifier[ValueParameterDescriptorImpl]

'name' @ [701:115] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'if (element == null) ErrorType() else typeConverter.convertType(element.type, nullability)' @ [707:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type, elseBranch: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'element' @ [707:20] ==> value-parameter element: PsiTypeElement? defined in org.jetbrains.kotlin.j2k.Converter.convertTypeElement[ValueParameterDescriptorImpl]

'ErrorType' @ [707:37] ==> public constructor ErrorType() defined in org.jetbrains.kotlin.j2k.ast.ErrorType[ClassConstructorDescriptorImpl]

'typeConverter' @ [707:54] ==> public final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'convertType' @ [707:68] ==> public final fun convertType(type: PsiType?, nullability: Nullability = ..., mutability: Mutability = ..., inAnnotationType: Boolean = ...): Type defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'element' @ [707:80] ==> value-parameter element: PsiTypeElement? defined in org.jetbrains.kotlin.j2k.Converter.convertTypeElement[ValueParameterDescriptorImpl]

'type' @ [707:88] ==> public final val PsiTypeElement.type: PsiType[MyPropertyDescriptor]

'nullability' @ [707:94] ==> value-parameter nullability: Nullability defined in org.jetbrains.kotlin.j2k.Converter.convertTypeElement[ValueParameterDescriptorImpl]

'assignPrototype' @ [707:108] ==> public fun <TElement : Element> Type.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): Type defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Type

'element' @ [707:124] ==> value-parameter element: PsiTypeElement? defined in org.jetbrains.kotlin.j2k.Converter.convertTypeElement[ValueParameterDescriptorImpl]

'refs' @ [710:13] ==> value-parameter refs: PsiReferenceList? defined in org.jetbrains.kotlin.j2k.Converter.convertToNotNullableTypes[ValueParameterDescriptorImpl]

'emptyList' @ [710:34] ==> public fun <T> emptyList(): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'getInstance' @ [711:37] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'project' @ [711:49] ==> public final val project: Project defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'elementFactory' @ [711:58] ==> public final val JavaPsiFacade.elementFactory: PsiElementFactory[MyPropertyDescriptor]

'refs' @ [712:16] ==> value-parameter refs: PsiReferenceList? defined in org.jetbrains.kotlin.j2k.Converter.convertToNotNullableTypes[ValueParameterDescriptorImpl]

'referenceElements' @ [712:21] ==> public final val PsiReferenceList.referenceElements: (Array<(PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>..Array<out (PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>)[MyPropertyDescriptor]

'map' @ [712:39] ==> public inline fun <T, R> Array<out (PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>.map(transform: ((PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)) -> Type): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiJavaCodeReferenceElement..com.intellij.psi.PsiJavaCodeReferenceElement?)
    <R> -> Type

'typeConverter' @ [712:52] ==> public final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'convertType' @ [712:66] ==> public final fun convertType(type: PsiType?, nullability: Nullability = ..., mutability: Mutability = ..., inAnnotationType: Boolean = ...): Type defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'factory' @ [712:78] ==> val factory: PsiElementFactory defined in org.jetbrains.kotlin.j2k.Converter.convertToNotNullableTypes[LocalVariableDescriptor]

'createType' @ [712:86] ==> @NotNull public abstract fun createType(@NotNull p0: PsiJavaCodeReferenceElement): PsiClassType defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'ref' @ [712:97] ==> value-parameter ref: (PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?) defined in org.jetbrains.kotlin.j2k.Converter.convertToNotNullableTypes.<anonymous>[ValueParameterDescriptorImpl]

'NotNull' @ [712:115] ==> enum entry NotNull defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'Default' @ [717:52] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'None' @ [718:97] ==> enum entry None defined in org.jetbrains.kotlin.j2k.ast.FunctionParameter.VarValModifier[FakeCallableDescriptorForObject]

'Modifiers' @ [719:36] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Modifiers[FakeCallableDescriptorForObject]

'Empty' @ [719:46] ==> public final val Empty: Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers.Companion[PropertyDescriptorImpl]

'typeConverter' @ [722:20] ==> public final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'convertVariableType' @ [722:34] ==> public final fun convertVariableType(variable: PsiVariable): Type defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'parameter' @ [722:54] ==> value-parameter parameter: PsiParameter defined in org.jetbrains.kotlin.j2k.Converter.convertParameter[ValueParameterDescriptorImpl]

'when (nullability) {
            Nullability.NotNull -> type = type.toNotNullType()
            Nullability.Nullable -> type = type.toNullableType()
            Nullability.Default -> {}
        }' @ [723:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'nullability' @ [723:15] ==> value-parameter nullability: Nullability = ... defined in org.jetbrains.kotlin.j2k.Converter.convertParameter[ValueParameterDescriptorImpl]

'NotNull' @ [724:25] ==> enum entry NotNull defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'type' @ [724:36] ==> var type: Type defined in org.jetbrains.kotlin.j2k.Converter.convertParameter[LocalVariableDescriptor]

'type' @ [724:43] ==> var type: Type defined in org.jetbrains.kotlin.j2k.Converter.convertParameter[LocalVariableDescriptor]

'toNotNullType' @ [724:48] ==> public open fun toNotNullType(): Type defined in org.jetbrains.kotlin.j2k.ast.Type[SimpleFunctionDescriptorImpl]

'Nullable' @ [725:25] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'type' @ [725:37] ==> var type: Type defined in org.jetbrains.kotlin.j2k.Converter.convertParameter[LocalVariableDescriptor]

'type' @ [725:44] ==> var type: Type defined in org.jetbrains.kotlin.j2k.Converter.convertParameter[LocalVariableDescriptor]

'toNullableType' @ [725:49] ==> public open fun toNullableType(): Type defined in org.jetbrains.kotlin.j2k.ast.Type[SimpleFunctionDescriptorImpl]

'Default' @ [726:25] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'FunctionParameter' @ [728:16] ==> public constructor FunctionParameter(identifier: Identifier, type: Type?, varVal: FunctionParameter.VarValModifier, annotations: Annotations, modifiers: Modifiers, defaultValue: DeferredElement<Expression>? = ...) defined in org.jetbrains.kotlin.j2k.ast.FunctionParameter[ClassConstructorDescriptorImpl]

'parameter' @ [728:34] ==> value-parameter parameter: PsiParameter defined in org.jetbrains.kotlin.j2k.Converter.convertParameter[ValueParameterDescriptorImpl]

'declarationIdentifier' @ [728:44] ==> public fun PsiNameIdentifierOwner.declarationIdentifier(): Identifier defined in org.jetbrains.kotlin.j2k.ast in file Identifier.kt[SimpleFunctionDescriptorImpl]

'type' @ [728:69] ==> var type: Type defined in org.jetbrains.kotlin.j2k.Converter.convertParameter[LocalVariableDescriptor]

'varValModifier' @ [728:75] ==> value-parameter varValModifier: FunctionParameter.VarValModifier = ... defined in org.jetbrains.kotlin.j2k.Converter.convertParameter[ValueParameterDescriptorImpl]

'convertAnnotations' @ [729:34] ==> public final fun convertAnnotations(owner: PsiModifierListOwner, target: AnnotationUseTarget? = ...): Annotations defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'parameter' @ [729:53] ==> value-parameter parameter: PsiParameter defined in org.jetbrains.kotlin.j2k.Converter.convertParameter[ValueParameterDescriptorImpl]

'modifiers' @ [729:65] ==> value-parameter modifiers: Modifiers = ... defined in org.jetbrains.kotlin.j2k.Converter.convertParameter[ValueParameterDescriptorImpl]

'defaultValue' @ [729:76] ==> value-parameter defaultValue: DeferredElement<Expression>? = ... defined in org.jetbrains.kotlin.j2k.Converter.convertParameter[ValueParameterDescriptorImpl]

'assignPrototype' @ [729:90] ==> public fun <TElement : Element> FunctionParameter.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): FunctionParameter defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> FunctionParameter

'parameter' @ [729:106] ==> value-parameter parameter: PsiParameter defined in org.jetbrains.kotlin.j2k.Converter.convertParameter[ValueParameterDescriptorImpl]

'CommentsAndSpacesInheritance' @ [729:117] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance[FakeCallableDescriptorForObject]

'LINE_BREAKS' @ [729:146] ==> public final val LINE_BREAKS: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance.Companion[PropertyDescriptorImpl]

'identifier' @ [733:13] ==> value-parameter identifier: PsiIdentifier? defined in org.jetbrains.kotlin.j2k.Converter.convertIdentifier[ValueParameterDescriptorImpl]

'Identifier' @ [733:40] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'Empty' @ [733:51] ==> public final val Empty: Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[PropertyDescriptorImpl]

'Identifier' @ [735:16] ==> public constructor Identifier(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...) defined in org.jetbrains.kotlin.j2k.ast.Identifier[ClassConstructorDescriptorImpl]

'identifier' @ [735:27] ==> value-parameter identifier: PsiIdentifier? defined in org.jetbrains.kotlin.j2k.Converter.convertIdentifier[ValueParameterDescriptorImpl]

'text' @ [735:38] ==> public final val PsiIdentifier.text: (String..String?)[MyPropertyDescriptor]

'assignPrototype' @ [735:46] ==> public fun <TElement : Element> Identifier.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): Identifier defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Identifier

'identifier' @ [735:62] ==> value-parameter identifier: PsiIdentifier? defined in org.jetbrains.kotlin.j2k.Converter.convertIdentifier[ValueParameterDescriptorImpl]

'Modifiers' @ [739:25] ==> public constructor Modifiers(modifiers: Collection<Modifier>) defined in org.jetbrains.kotlin.j2k.ast.Modifiers[ClassConstructorDescriptorImpl]

'MODIFIERS_MAP' @ [739:35] ==> private final val MODIFIERS_MAP: List<Pair<String, Modifier>> defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'filter' @ [739:49] ==> public inline fun <T> Iterable<Pair<String, Modifier>>.filter(predicate: (Pair<String, Modifier>) -> Boolean): List<Pair<String, Modifier>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Modifier>

'owner' @ [739:58] ==> value-parameter owner: PsiModifierListOwner defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [739:64] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiModifierListOwner[JavaMethodDescriptor]

'it' @ [739:84] ==> value-parameter it: Pair<String, Modifier> defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [739:87] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'map' @ [739:96] ==> public inline fun <T, R> Iterable<Pair<String, Modifier>>.map(transform: (Pair<String, Modifier>) -> Modifier): List<Modifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Modifier>
    <R> -> Modifier

'it' @ [739:102] ==> value-parameter it: Pair<String, Modifier> defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [739:105] ==> public final val second: Modifier defined in kotlin.Pair[DeserializedPropertyDescriptor]

'assignPrototype' @ [740:18] ==> public fun <TElement : Element> Modifiers.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): Modifiers defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Modifiers

'owner' @ [740:34] ==> value-parameter owner: PsiModifierListOwner defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[ValueParameterDescriptorImpl]

'modifierList' @ [740:40] ==> public final val PsiModifierListOwner.modifierList: PsiModifierList?[MyPropertyDescriptor]

'CommentsAndSpacesInheritance' @ [740:54] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance[FakeCallableDescriptorForObject]

'NO_SPACES' @ [740:83] ==> public final val NO_SPACES: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance.Companion[PropertyDescriptorImpl]

'if (owner is PsiMethod) {
            val isOverride = isOverride(owner)
            if (isOverride) {
                modifiers = modifiers.with(Modifier.OVERRIDE)
            }

            if (needOpenModifier(owner, isMethodInOpenClass, modifiers)) {
                modifiers = modifiers.with(Modifier.OPEN)
            }

            if (owner.hasModifierProperty(PsiModifier.NATIVE))
                modifiers = modifiers.with(Modifier.EXTERNAL)

            modifiers = modifiers.adaptForContainingClassVisibility(owner.containingClass).adaptProtectedVisibility(owner)
        }
        else if (owner is PsiField) {
            modifiers = modifiers.adaptForContainingClassVisibility(owner.containingClass).adaptProtectedVisibility(owner)
        }
        else if (owner is PsiClass && owner.scope is PsiMethod) {
            // Local class should not have visibility modifiers
            modifiers = modifiers.without(modifiers.accessModifier())
        }' @ [742:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'owner' @ [742:13] ==> value-parameter owner: PsiModifierListOwner defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[ValueParameterDescriptorImpl]

'isOverride' @ [743:30] ==> private final fun isOverride(method: PsiMethod): Boolean defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'owner' @ [743:41] ==> value-parameter owner: PsiModifierListOwner defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[ValueParameterDescriptorImpl]

'isOverride' @ [744:17] ==> val isOverride: Boolean defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[LocalVariableDescriptor]

'modifiers' @ [745:17] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[LocalVariableDescriptor]

'modifiers' @ [745:29] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[LocalVariableDescriptor]

'with' @ [745:39] ==> public final fun with(modifier: Modifier?): Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'OVERRIDE' @ [745:53] ==> enum entry OVERRIDE defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'needOpenModifier' @ [748:17] ==> private final fun needOpenModifier(method: PsiMethod, isInOpenClass: Boolean, modifiers: Modifiers): Boolean defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'owner' @ [748:34] ==> value-parameter owner: PsiModifierListOwner defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[ValueParameterDescriptorImpl]

'isMethodInOpenClass' @ [748:41] ==> value-parameter isMethodInOpenClass: Boolean defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[ValueParameterDescriptorImpl]

'modifiers' @ [748:62] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[LocalVariableDescriptor]

'modifiers' @ [749:17] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[LocalVariableDescriptor]

'modifiers' @ [749:29] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[LocalVariableDescriptor]

'with' @ [749:39] ==> public final fun with(modifier: Modifier?): Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'OPEN' @ [749:53] ==> enum entry OPEN defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'owner' @ [752:17] ==> value-parameter owner: PsiModifierListOwner defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [752:23] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiModifierListOwner[JavaMethodDescriptor]

'NATIVE' @ [752:55] ==> public const final val NATIVE: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'modifiers' @ [753:17] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[LocalVariableDescriptor]

'modifiers' @ [753:29] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[LocalVariableDescriptor]

'with' @ [753:39] ==> public final fun with(modifier: Modifier?): Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'EXTERNAL' @ [753:53] ==> enum entry EXTERNAL defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'modifiers' @ [755:13] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[LocalVariableDescriptor]

'modifiers' @ [755:25] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[LocalVariableDescriptor]

'adaptForContainingClassVisibility' @ [755:35] ==> private final fun Modifiers.adaptForContainingClassVisibility(containingClass: PsiClass?): Modifiers defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'owner' @ [755:69] ==> value-parameter owner: PsiModifierListOwner defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[ValueParameterDescriptorImpl]

'containingClass' @ [755:75] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'adaptProtectedVisibility' @ [755:92] ==> private final fun Modifiers.adaptProtectedVisibility(member: PsiMember): Modifiers defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'owner' @ [755:117] ==> value-parameter owner: PsiModifierListOwner defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[ValueParameterDescriptorImpl]

'if (owner is PsiField) {
            modifiers = modifiers.adaptForContainingClassVisibility(owner.containingClass).adaptProtectedVisibility(owner)
        }
        else if (owner is PsiClass && owner.scope is PsiMethod) {
            // Local class should not have visibility modifiers
            modifiers = modifiers.without(modifiers.accessModifier())
        }' @ [757:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'owner' @ [757:18] ==> value-parameter owner: PsiModifierListOwner defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[ValueParameterDescriptorImpl]

'modifiers' @ [758:13] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[LocalVariableDescriptor]

'modifiers' @ [758:25] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[LocalVariableDescriptor]

'adaptForContainingClassVisibility' @ [758:35] ==> private final fun Modifiers.adaptForContainingClassVisibility(containingClass: PsiClass?): Modifiers defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'owner' @ [758:69] ==> value-parameter owner: PsiModifierListOwner defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[ValueParameterDescriptorImpl]

'containingClass' @ [758:75] ==> public final val PsiField.containingClass: PsiClass?[MyPropertyDescriptor]

'adaptProtectedVisibility' @ [758:92] ==> private final fun Modifiers.adaptProtectedVisibility(member: PsiMember): Modifiers defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'owner' @ [758:117] ==> value-parameter owner: PsiModifierListOwner defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[ValueParameterDescriptorImpl]

'owner' @ [760:18] ==> value-parameter owner: PsiModifierListOwner defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[ValueParameterDescriptorImpl]

'owner' @ [760:39] ==> value-parameter owner: PsiModifierListOwner defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[ValueParameterDescriptorImpl]

'scope' @ [760:45] ==> public final val PsiClass.scope: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'modifiers' @ [762:13] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[LocalVariableDescriptor]

'modifiers' @ [762:25] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[LocalVariableDescriptor]

'without' @ [762:35] ==> public final fun without(modifier: Modifier?): Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'modifiers' @ [762:43] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[LocalVariableDescriptor]

'accessModifier' @ [762:53] ==> public final fun accessModifier(): Modifier? defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'modifiers' @ [765:16] ==> var modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.Converter.convertModifiers[LocalVariableDescriptor]

'containingClass' @ [770:13] ==> value-parameter containingClass: PsiClass? defined in org.jetbrains.kotlin.j2k.Converter.adaptForContainingClassVisibility[ValueParameterDescriptorImpl]

'!' @ [770:40] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containingClass' @ [770:41] ==> value-parameter containingClass: PsiClass? defined in org.jetbrains.kotlin.j2k.Converter.adaptForContainingClassVisibility[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [770:57] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiClass[JavaMethodDescriptor]

'PACKAGE_LOCAL' @ [770:89] ==> public const final val PACKAGE_LOCAL: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'this' @ [770:112] ==> <this> defined in org.jetbrains.kotlin.j2k.Converter.adaptForContainingClassVisibility[ReceiverParameterDescriptorImpl]

'!' @ [771:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'contains' @ [771:14] ==> public final fun contains(modifier: Modifier): Boolean defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'INTERNAL' @ [771:32] ==> enum entry INTERNAL defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'contains' @ [771:45] ==> public final fun contains(modifier: Modifier): Boolean defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'OVERRIDE' @ [771:63] ==> enum entry OVERRIDE defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'contains' @ [771:76] ==> public final fun contains(modifier: Modifier): Boolean defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'OPEN' @ [771:94] ==> enum entry OPEN defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'contains' @ [771:103] ==> public final fun contains(modifier: Modifier): Boolean defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'ABSTRACT' @ [771:121] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'this' @ [771:139] ==> <this> defined in org.jetbrains.kotlin.j2k.Converter.adaptForContainingClassVisibility[ReceiverParameterDescriptorImpl]

'without' @ [772:16] ==> public final fun without(modifier: Modifier?): Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'INTERNAL' @ [772:33] ==> enum entry INTERNAL defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'with' @ [772:43] ==> public final fun with(modifier: Modifier?): Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'PUBLIC' @ [772:57] ==> enum entry PUBLIC defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'!' @ [776:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'member' @ [776:14] ==> value-parameter member: PsiMember defined in org.jetbrains.kotlin.j2k.Converter.adaptProtectedVisibility[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [776:21] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiMember[JavaMethodDescriptor]

'PROTECTED' @ [776:53] ==> public const final val PROTECTED: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'this' @ [776:72] ==> <this> defined in org.jetbrains.kotlin.j2k.Converter.adaptProtectedVisibility[ReceiverParameterDescriptorImpl]

'member' @ [778:29] ==> value-parameter member: PsiMember defined in org.jetbrains.kotlin.j2k.Converter.adaptProtectedVisibility[ValueParameterDescriptorImpl]

'containingClass' @ [778:36] ==> public final val PsiMember.containingClass: PsiClass?[MyPropertyDescriptor]

'this' @ [778:62] ==> <this> defined in org.jetbrains.kotlin.j2k.Converter.adaptProtectedVisibility[ReceiverParameterDescriptorImpl]

'referenceSearcher' @ [780:22] ==> public final val referenceSearcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'findUsagesForExternalCodeProcessing' @ [780:40] ==> public abstract fun findUsagesForExternalCodeProcessing(element: PsiElement, searchJava: Boolean, searchKotlin: Boolean): Collection<PsiReference> defined in org.jetbrains.kotlin.j2k.ReferenceSearcher[SimpleFunctionDescriptorImpl]

'member' @ [780:76] ==> value-parameter member: PsiMember defined in org.jetbrains.kotlin.j2k.Converter.adaptProtectedVisibility[ValueParameterDescriptorImpl]

'if (usages.any { !allowProtected(it.element, member, originalClass) })
            without(Modifier.PROTECTED).with(Modifier.PUBLIC)
        else this' @ [782:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Modifiers, elseBranch: Modifiers): Modifiers[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Modifiers

'usages' @ [782:20] ==> val usages: Collection<PsiReference> defined in org.jetbrains.kotlin.j2k.Converter.adaptProtectedVisibility[LocalVariableDescriptor]

'any' @ [782:27] ==> public inline fun <T> Iterable<PsiReference>.any(predicate: (PsiReference) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReference

'!' @ [782:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'allowProtected' @ [782:34] ==> private final fun allowProtected(element: PsiElement, member: PsiMember, originalClass: PsiClass): Boolean defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'it' @ [782:49] ==> value-parameter it: PsiReference defined in org.jetbrains.kotlin.j2k.Converter.adaptProtectedVisibility.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [782:52] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'member' @ [782:61] ==> value-parameter member: PsiMember defined in org.jetbrains.kotlin.j2k.Converter.adaptProtectedVisibility[ValueParameterDescriptorImpl]

'originalClass' @ [782:69] ==> val originalClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.adaptProtectedVisibility[LocalVariableDescriptor]

'without' @ [783:13] ==> public final fun without(modifier: Modifier?): Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'PROTECTED' @ [783:30] ==> enum entry PROTECTED defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'with' @ [783:41] ==> public final fun with(modifier: Modifier?): Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'PUBLIC' @ [783:55] ==> enum entry PUBLIC defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'this' @ [784:14] ==> <this> defined in org.jetbrains.kotlin.j2k.Converter.adaptProtectedVisibility[ReceiverParameterDescriptorImpl]

'element' @ [788:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.allowProtected[ValueParameterDescriptorImpl]

'parent' @ [788:21] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'member' @ [788:51] ==> value-parameter member: PsiMember defined in org.jetbrains.kotlin.j2k.Converter.allowProtected[ValueParameterDescriptorImpl]

'member' @ [788:74] ==> value-parameter member: PsiMember defined in org.jetbrains.kotlin.j2k.Converter.allowProtected[ValueParameterDescriptorImpl]

'isConstructor' @ [788:81] ==> public final val PsiMethod.isConstructor: Boolean[MyPropertyDescriptor]

'element' @ [790:20] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.allowProtected[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [790:28] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'contains' @ [790:44] ==> public operator fun <@OnlyInputTypes T> Sequence<PsiElement>.contains(element: PsiElement): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> PsiElement

'originalClass' @ [790:53] ==> value-parameter originalClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.allowProtected[ValueParameterDescriptorImpl]

'element' @ [793:16] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.allowProtected[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [793:24] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'filterIsInstance' @ [793:40] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<PsiClass> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> PsiClass

'any' @ [793:69] ==> public inline fun <T> Sequence<PsiClass>.any(predicate: (PsiClass) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'!' @ [794:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInheritorOrSelf' @ [794:34] ==> public open fun isInheritorOrSelf(@Nullable p0: PsiClass?, @Nullable p1: PsiClass?, p2: Boolean): Boolean defined in com.intellij.psi.util.InheritanceUtil[JavaMethodDescriptor]

'accessContainingClass' @ [794:52] ==> value-parameter accessContainingClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.allowProtected.<anonymous>[ValueParameterDescriptorImpl]

'originalClass' @ [794:75] ==> value-parameter originalClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.allowProtected[ValueParameterDescriptorImpl]

'element' @ [796:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.allowProtected[ValueParameterDescriptorImpl]

'element' @ [798:39] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.j2k.Converter.allowProtected[ValueParameterDescriptorImpl]

'qualifierExpression' @ [798:47] ==> public final var PsiReferenceExpression.qualifierExpression: PsiExpression?[MyPropertyDescriptor]

'qualifierExpression' @ [801:17] ==> val qualifierExpression: PsiExpression defined in org.jetbrains.kotlin.j2k.Converter.allowProtected.<anonymous>[LocalVariableDescriptor]

'qualifierExpression' @ [803:32] ==> val qualifierExpression: PsiExpression defined in org.jetbrains.kotlin.j2k.Converter.allowProtected.<anonymous>[LocalVariableDescriptor]

'type' @ [803:52] ==> public final val PsiExpression.type: PsiType?[MyPropertyDescriptor]

'?:' @ [804:33] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiClass?, right: PsiClass): PsiClass[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiClass

'resolveGenericsClassInType' @ [804:41] ==> @NotNull public open fun resolveGenericsClassInType(@Nullable p0: PsiType?): PsiClassType.ClassResolveResult defined in com.intellij.psi.util.PsiUtil[JavaMethodDescriptor]

'receiverType' @ [804:68] ==> val receiverType: PsiType defined in org.jetbrains.kotlin.j2k.Converter.allowProtected.<anonymous>[LocalVariableDescriptor]

'element' @ [804:82] ==> public final val PsiClassType.ClassResolveResult.element: PsiClass?[MyPropertyDescriptor]

'isInheritorOrSelf' @ [807:29] ==> public open fun isInheritorOrSelf(@Nullable p0: PsiClass?, @Nullable p1: PsiClass?, p2: Boolean): Boolean defined in com.intellij.psi.util.InheritanceUtil[JavaMethodDescriptor]

'resolvedClass' @ [807:47] ==> val resolvedClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.allowProtected.<anonymous>[LocalVariableDescriptor]

'accessContainingClass' @ [807:62] ==> value-parameter accessContainingClass: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.allowProtected.<anonymous>[ValueParameterDescriptorImpl]

'AnonymousClassBody' @ [812:16] ==> public constructor AnonymousClassBody(body: ClassBody, extendsInterface: Boolean) defined in org.jetbrains.kotlin.j2k.ast.AnonymousClassBody[ClassConstructorDescriptorImpl]

'ClassBodyConverter' @ [812:35] ==> public constructor ClassBodyConverter(psiClass: PsiClass, classKind: ClassKind, converter: Converter) defined in org.jetbrains.kotlin.j2k.ClassBodyConverter[ClassConstructorDescriptorImpl]

'anonymousClass' @ [812:54] ==> value-parameter anonymousClass: PsiAnonymousClass defined in org.jetbrains.kotlin.j2k.Converter.convertAnonymousClassBody[ValueParameterDescriptorImpl]

'ANONYMOUS_OBJECT' @ [812:80] ==> enum entry ANONYMOUS_OBJECT defined in org.jetbrains.kotlin.j2k.ClassKind[FakeCallableDescriptorForObject]

'this' @ [812:98] ==> <this> defined in org.jetbrains.kotlin.j2k.Converter[LazyClassReceiverParameterDescriptor]

'convertBody' @ [812:104] ==> public final fun convertBody(): ClassBody defined in org.jetbrains.kotlin.j2k.ClassBodyConverter[SimpleFunctionDescriptorImpl]

'anonymousClass' @ [813:35] ==> value-parameter anonymousClass: PsiAnonymousClass defined in org.jetbrains.kotlin.j2k.Converter.convertAnonymousClassBody[ValueParameterDescriptorImpl]

'baseClassType' @ [813:50] ==> public final val PsiAnonymousClass.baseClassType: PsiClassType[MyPropertyDescriptor]

'resolve' @ [813:64] ==> @Nullable public abstract fun resolve(): PsiClass? defined in com.intellij.psi.PsiClassType[JavaMethodDescriptor]

'isInterface' @ [813:75] ==> public final val PsiClass.isInterface: Boolean[MyPropertyDescriptor]

'assignPrototype' @ [813:97] ==> public fun <TElement : Element> AnonymousClassBody.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): AnonymousClassBody defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> AnonymousClassBody

'anonymousClass' @ [813:113] ==> value-parameter anonymousClass: PsiAnonymousClass defined in org.jetbrains.kotlin.j2k.Converter.convertAnonymousClassBody[ValueParameterDescriptorImpl]

'listOf' @ [816:33] ==> public fun <T> listOf(vararg elements: Pair<String, Modifier>): List<Pair<String, Modifier>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Modifier>

'to' @ [817:13] ==> public infix fun <A, B> String.to(that: Modifier): Pair<String, Modifier> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Modifier

'ABSTRACT' @ [817:25] ==> public const final val ABSTRACT: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'ABSTRACT' @ [817:46] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'to' @ [818:13] ==> public infix fun <A, B> String.to(that: Modifier): Pair<String, Modifier> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Modifier

'PUBLIC' @ [818:25] ==> public const final val PUBLIC: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'PUBLIC' @ [818:44] ==> enum entry PUBLIC defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'to' @ [819:13] ==> public infix fun <A, B> String.to(that: Modifier): Pair<String, Modifier> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Modifier

'PROTECTED' @ [819:25] ==> public const final val PROTECTED: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'PROTECTED' @ [819:47] ==> enum entry PROTECTED defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'to' @ [820:13] ==> public infix fun <A, B> String.to(that: Modifier): Pair<String, Modifier> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Modifier

'PRIVATE' @ [820:25] ==> public const final val PRIVATE: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'PRIVATE' @ [820:45] ==> enum entry PRIVATE defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'to' @ [821:13] ==> public infix fun <A, B> String.to(that: Modifier): Pair<String, Modifier> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Modifier

'PACKAGE_LOCAL' @ [821:25] ==> public const final val PACKAGE_LOCAL: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'INTERNAL' @ [821:51] ==> enum entry INTERNAL defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'method' @ [825:26] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.convertThrows[ValueParameterDescriptorImpl]

'throwsList' @ [825:33] ==> public final val PsiMethod.throwsList: PsiReferenceList[MyPropertyDescriptor]

'throwsList' @ [826:21] ==> val throwsList: PsiReferenceList defined in org.jetbrains.kotlin.j2k.Converter.convertThrows[LocalVariableDescriptor]

'referencedTypes' @ [826:32] ==> public final val PsiReferenceList.referencedTypes: (Array<(PsiClassType..PsiClassType?)>..Array<out (PsiClassType..PsiClassType?)>)[MyPropertyDescriptor]

'throwsList' @ [827:27] ==> val throwsList: PsiReferenceList defined in org.jetbrains.kotlin.j2k.Converter.convertThrows[LocalVariableDescriptor]

'referenceElements' @ [827:38] ==> public final val PsiReferenceList.referenceElements: (Array<(PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>..Array<out (PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>)[MyPropertyDescriptor]

'assert' @ [828:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'types' @ [828:16] ==> val types: (Array<(PsiClassType..PsiClassType?)>..Array<out (PsiClassType..PsiClassType?)>) defined in org.jetbrains.kotlin.j2k.Converter.convertThrows[LocalVariableDescriptor]

'size' @ [828:22] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'refElements' @ [828:30] ==> val refElements: (Array<(PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>..Array<out (PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>) defined in org.jetbrains.kotlin.j2k.Converter.convertThrows[LocalVariableDescriptor]

'size' @ [828:42] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'types' @ [829:13] ==> val types: (Array<(PsiClassType..PsiClassType?)>..Array<out (PsiClassType..PsiClassType?)>) defined in org.jetbrains.kotlin.j2k.Converter.convertThrows[LocalVariableDescriptor]

'isEmpty' @ [829:19] ==> @InlineOnly public inline fun <T> Array<out (PsiClassType..PsiClassType?)>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClassType..com.intellij.psi.PsiClassType?)

'Annotations' @ [829:37] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Annotations[FakeCallableDescriptorForObject]

'Empty' @ [829:49] ==> public final val Empty: Annotations defined in org.jetbrains.kotlin.j2k.ast.Annotations.Companion[PropertyDescriptorImpl]

'types' @ [830:25] ==> val types: (Array<(PsiClassType..PsiClassType?)>..Array<out (PsiClassType..PsiClassType?)>) defined in org.jetbrains.kotlin.j2k.Converter.convertThrows[LocalVariableDescriptor]

'indices' @ [830:31] ==> public val <T> Array<out (PsiClassType..PsiClassType?)>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClassType..com.intellij.psi.PsiClassType?)

'map' @ [830:39] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> Pair<Nothing?, DeferredElement<Expression>>): List<Pair<Nothing?, DeferredElement<Expression>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Pair<Nothing?, DeferredElement<Expression>>

'typeConverter' @ [831:33] ==> public final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'convertType' @ [831:47] ==> public final fun convertType(type: PsiType?, nullability: Nullability = ..., mutability: Mutability = ..., inAnnotationType: Boolean = ...): Type defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'types' @ [831:59] ==> val types: (Array<(PsiClassType..PsiClassType?)>..Array<out (PsiClassType..PsiClassType?)>) defined in org.jetbrains.kotlin.j2k.Converter.convertThrows[LocalVariableDescriptor]

'index' @ [831:65] ==> value-parameter index: Int defined in org.jetbrains.kotlin.j2k.Converter.convertThrows.<anonymous>[ValueParameterDescriptorImpl]

'NotNull' @ [831:85] ==> enum entry NotNull defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'to' @ [832:13] ==> public infix fun <A, B> Nothing?.to(that: DeferredElement<Expression>): Pair<Nothing?, DeferredElement<Expression>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Nothing?
    <B> -> DeferredElement<Expression>

'deferredElement' @ [832:21] ==> public final fun <TResult : Element> deferredElement(generator: (CodeConverter) -> Expression): DeferredElement<Expression> defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]
Inferred types:
    <TResult : Element> -> Expression

'ClassLiteralExpression' @ [832:51] ==> public constructor ClassLiteralExpression(type: Type) defined in org.jetbrains.kotlin.j2k.ast.ClassLiteralExpression[ClassConstructorDescriptorImpl]

'convertedType' @ [832:74] ==> val convertedType: Type defined in org.jetbrains.kotlin.j2k.Converter.convertThrows.<anonymous>[LocalVariableDescriptor]

'assignPrototype' @ [832:88] ==> public fun <TElement : Element> Type.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): Type defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Type

'refElements' @ [832:104] ==> val refElements: (Array<(PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>..Array<out (PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>) defined in org.jetbrains.kotlin.j2k.Converter.convertThrows[LocalVariableDescriptor]

'index' @ [832:116] ==> value-parameter index: Int defined in org.jetbrains.kotlin.j2k.Converter.convertThrows.<anonymous>[ValueParameterDescriptorImpl]

'Annotation' @ [834:26] ==> public constructor Annotation(name: Identifier, arguments: List<Pair<Identifier?, DeferredElement<Expression>>>, newLineAfter: Boolean, target: AnnotationUseTarget? = ...) defined in org.jetbrains.kotlin.j2k.ast.Annotation[ClassConstructorDescriptorImpl]

'Identifier' @ [834:37] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'withNoPrototype' @ [834:48] ==> public final fun withNoPrototype(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...): Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[SimpleFunctionDescriptorImpl]

'arguments' @ [834:75] ==> val arguments: List<Pair<Nothing?, DeferredElement<Expression>>> defined in org.jetbrains.kotlin.j2k.Converter.convertThrows[LocalVariableDescriptor]

'Annotations' @ [835:16] ==> public constructor Annotations(annotations: List<Annotation>) defined in org.jetbrains.kotlin.j2k.ast.Annotations[ClassConstructorDescriptorImpl]

'listOf' @ [835:28] ==> public fun <T> listOf(element: Annotation): List<Annotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation

'annotation' @ [835:35] ==> val annotation: Annotation defined in org.jetbrains.kotlin.j2k.Converter.convertThrows[LocalVariableDescriptor]

'assignPrototype' @ [835:46] ==> public fun <TElement : Element> Annotation.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): Annotation defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Annotation

'throwsList' @ [835:62] ==> val throwsList: PsiReferenceList defined in org.jetbrains.kotlin.j2k.Converter.convertThrows[LocalVariableDescriptor]

'assignPrototype' @ [835:76] ==> public fun <TElement : Element> Annotations.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): Annotations defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Annotations

'throwsList' @ [835:92] ==> val throwsList: PsiReferenceList defined in org.jetbrains.kotlin.j2k.Converter.convertThrows[LocalVariableDescriptor]

'searcher' @ [838:108] ==> value-parameter searcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.Converter.CachingReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'HashMap' @ [839:43] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiClass
    <V : (Any..Any?)> -> Boolean

'HashMap' @ [840:42] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiMethod
    <V : (Any..Any?)> -> Boolean

'hasInheritorsCached' @ [843:26] ==> private final val hasInheritorsCached: HashMap<PsiClass, Boolean> defined in org.jetbrains.kotlin.j2k.Converter.CachingReferenceSearcher[PropertyDescriptorImpl]

'`class`' @ [843:46] ==> value-parameter `class`: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.CachingReferenceSearcher.hasInheritors[ValueParameterDescriptorImpl]

'cached' @ [844:17] ==> val cached: Boolean? defined in org.jetbrains.kotlin.j2k.Converter.CachingReferenceSearcher.hasInheritors[LocalVariableDescriptor]

'cached' @ [844:40] ==> val cached: Boolean? defined in org.jetbrains.kotlin.j2k.Converter.CachingReferenceSearcher.hasInheritors[LocalVariableDescriptor]

'searcher' @ [845:26] ==> private final val searcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.Converter.CachingReferenceSearcher[PropertyDescriptorImpl]

'hasInheritors' @ [845:35] ==> public abstract fun hasInheritors(`class`: PsiClass): Boolean defined in org.jetbrains.kotlin.j2k.ReferenceSearcher[SimpleFunctionDescriptorImpl]

'`class`' @ [845:49] ==> value-parameter `class`: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.CachingReferenceSearcher.hasInheritors[ValueParameterDescriptorImpl]

'hasInheritorsCached' @ [846:13] ==> private final val hasInheritorsCached: HashMap<PsiClass, Boolean> defined in org.jetbrains.kotlin.j2k.Converter.CachingReferenceSearcher[PropertyDescriptorImpl]

'`class`' @ [846:33] ==> value-parameter `class`: PsiClass defined in org.jetbrains.kotlin.j2k.Converter.CachingReferenceSearcher.hasInheritors[ValueParameterDescriptorImpl]

'result' @ [846:44] ==> val result: Boolean defined in org.jetbrains.kotlin.j2k.Converter.CachingReferenceSearcher.hasInheritors[LocalVariableDescriptor]

'result' @ [847:20] ==> val result: Boolean defined in org.jetbrains.kotlin.j2k.Converter.CachingReferenceSearcher.hasInheritors[LocalVariableDescriptor]

'hasOverridesCached' @ [851:26] ==> private final val hasOverridesCached: HashMap<PsiMethod, Boolean> defined in org.jetbrains.kotlin.j2k.Converter.CachingReferenceSearcher[PropertyDescriptorImpl]

'method' @ [851:45] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.CachingReferenceSearcher.hasOverrides[ValueParameterDescriptorImpl]

'cached' @ [852:17] ==> val cached: Boolean? defined in org.jetbrains.kotlin.j2k.Converter.CachingReferenceSearcher.hasOverrides[LocalVariableDescriptor]

'cached' @ [852:40] ==> val cached: Boolean? defined in org.jetbrains.kotlin.j2k.Converter.CachingReferenceSearcher.hasOverrides[LocalVariableDescriptor]

'searcher' @ [853:26] ==> private final val searcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.Converter.CachingReferenceSearcher[PropertyDescriptorImpl]

'hasOverrides' @ [853:35] ==> public abstract fun hasOverrides(method: PsiMethod): Boolean defined in org.jetbrains.kotlin.j2k.ReferenceSearcher[SimpleFunctionDescriptorImpl]

'method' @ [853:48] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.CachingReferenceSearcher.hasOverrides[ValueParameterDescriptorImpl]

'hasOverridesCached' @ [854:13] ==> private final val hasOverridesCached: HashMap<PsiMethod, Boolean> defined in org.jetbrains.kotlin.j2k.Converter.CachingReferenceSearcher[PropertyDescriptorImpl]

'method' @ [854:32] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.Converter.CachingReferenceSearcher.hasOverrides[ValueParameterDescriptorImpl]

'result' @ [854:42] ==> val result: Boolean defined in org.jetbrains.kotlin.j2k.Converter.CachingReferenceSearcher.hasOverrides[LocalVariableDescriptor]

'result' @ [855:20] ==> val result: Boolean defined in org.jetbrains.kotlin.j2k.Converter.CachingReferenceSearcher.hasOverrides[LocalVariableDescriptor]

'mapOf' @ [860:55] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [861:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'BYTE' @ [861:19] ==> public final val BYTE: (Name..Name?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'asString' @ [861:24] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'to' @ [862:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'SHORT' @ [862:20] ==> public final val SHORT: (Name..Name?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'asString' @ [862:26] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'to' @ [863:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'INT' @ [863:18] ==> public final val INT: (Name..Name?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'asString' @ [863:22] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'to' @ [864:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'LONG' @ [864:19] ==> public final val LONG: (Name..Name?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'asString' @ [864:24] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'to' @ [865:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'FLOAT' @ [865:20] ==> public final val FLOAT: (Name..Name?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'asString' @ [865:26] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'to' @ [866:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'DOUBLE' @ [866:21] ==> public final val DOUBLE: (Name..Name?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'asString' @ [866:28] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'to' @ [867:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'CHAR' @ [867:19] ==> public final val CHAR: (Name..Name?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'asString' @ [867:24] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'JAVA_LANG_BYTE' @ [868:9] ==> @NonNls public const final val JAVA_LANG_BYTE: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'BYTE' @ [868:27] ==> public final val BYTE: (Name..Name?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'asString' @ [868:32] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'JAVA_LANG_SHORT' @ [869:9] ==> @NonNls public const final val JAVA_LANG_SHORT: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'SHORT' @ [869:28] ==> public final val SHORT: (Name..Name?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'asString' @ [869:34] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'JAVA_LANG_INTEGER' @ [870:9] ==> @NonNls public const final val JAVA_LANG_INTEGER: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'INT' @ [870:30] ==> public final val INT: (Name..Name?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'asString' @ [870:34] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'JAVA_LANG_LONG' @ [871:9] ==> @NonNls public const final val JAVA_LANG_LONG: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'LONG' @ [871:27] ==> public final val LONG: (Name..Name?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'asString' @ [871:32] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'JAVA_LANG_FLOAT' @ [872:9] ==> @NonNls public const final val JAVA_LANG_FLOAT: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'FLOAT' @ [872:28] ==> public final val FLOAT: (Name..Name?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'asString' @ [872:34] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'JAVA_LANG_DOUBLE' @ [873:9] ==> @NonNls public const final val JAVA_LANG_DOUBLE: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'DOUBLE' @ [873:29] ==> public final val DOUBLE: (Name..Name?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'asString' @ [873:36] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'JAVA_LANG_CHARACTER' @ [874:9] ==> @NonNls public const final val JAVA_LANG_CHARACTER: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'CHAR' @ [874:32] ==> public final val CHAR: (Name..Name?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'asString' @ [874:37] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

