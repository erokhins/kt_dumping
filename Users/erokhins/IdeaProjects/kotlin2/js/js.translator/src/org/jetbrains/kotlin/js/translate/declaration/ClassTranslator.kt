'AbstractTranslator' @ [61:5] ==> protected/*protected and package*/ constructor AbstractTranslator(@NotNull context: TranslationContext) defined in org.jetbrains.kotlin.js.translate.general.AbstractTranslator[JavaClassConstructorDescriptor]

'context' @ [61:24] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.<init>[ValueParameterDescriptorImpl]

'getClassDescriptor' @ [63:30] ==> @NotNull public open fun getClassDescriptor(@NotNull context: BindingContext, @NotNull declaration: KtClassOrObject): ClassDescriptor defined in org.jetbrains.kotlin.js.translate.utils.BindingUtils[JavaMethodDescriptor]

'context' @ [63:49] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.<init>[ValueParameterDescriptorImpl]

'bindingContext' @ [63:57] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'classDeclaration' @ [63:75] ==> private final val classDeclaration: KtClassOrObject defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'mutableListOf' @ [64:41] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<ClassTranslator.ConstructorInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstructorInfo

'JsObjectLiteral' @ [67:35] ==> public constructor JsObjectLiteral(p0: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsObjectLiteral[JavaClassConstructorDescriptor]

'descriptor' @ [69:38] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'kind' @ [69:49] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [69:67] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'context' @ [72:23] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[JavaMethodDescriptor]

'newDeclaration' @ [72:33] ==> @NotNull public open fun newDeclaration(@NotNull descriptor: DeclarationDescriptor): TranslationContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [72:48] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'descriptor' @ [74:35] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'unsubstitutedPrimaryConstructor' @ [74:46] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'let' @ [74:79] ==> @InlineOnly public inline fun <T, R> ClassConstructorDescriptor.let(block: (ClassConstructorDescriptor) -> JsFunction): JsFunction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassConstructorDescriptor
    <R> -> JsFunction

'context' @ [74:85] ==> val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'getFunctionObject' @ [74:93] ==> @NotNull public open fun getFunctionObject(@NotNull descriptor: CallableDescriptor): JsFunction defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'it' @ [74:111] ==> value-parameter it: ClassConstructorDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [75:35] ==> val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'createRootScopedFunction' @ [75:43] ==> @NotNull public open fun createRootScopedFunction(@NotNull descriptor: DeclarationDescriptor): JsFunction defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [75:68] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'constructorFunction' @ [76:9] ==> val constructorFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'name' @ [76:29] ==> public final var JsFunction.name: (JsName..JsName?)[MyPropertyDescriptor]

'context' @ [76:36] ==> val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'getInnerNameForDescriptor' @ [76:44] ==> @NotNull public open fun getInnerNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [76:70] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'context' @ [77:9] ==> val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'addDeclarationStatement' @ [77:17] ==> public open fun addDeclarationStatement(@NotNull statement: JsStatement): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'constructorFunction' @ [77:41] ==> val constructorFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'makeStmt' @ [77:61] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsFunction[JavaMethodDescriptor]

'if (descriptor.kind == ClassKind.ENUM_CLASS) createEnumInitFunction() else null' @ [78:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsFunction?, elseBranch: JsFunction?): JsFunction?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsFunction?

'descriptor' @ [78:36] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'kind' @ [78:47] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_CLASS' @ [78:65] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'createEnumInitFunction' @ [78:77] ==> private final fun createEnumInitFunction(): JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]

'context' @ [80:37] ==> val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'withUsageTrackerIfNecessary' @ [80:45] ==> private final fun TranslationContext.withUsageTrackerIfNecessary(innerDescriptor: MemberDescriptor): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]

'descriptor' @ [80:73] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'nonConstructorContext' @ [81:9] ==> val nonConstructorContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'startDeclaration' @ [81:31] ==> public open fun startDeclaration(): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'DelegationTranslator' @ [82:36] ==> public constructor DelegationTranslator(classDeclaration: KtClassOrObject, context: TranslationContext) defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[ClassConstructorDescriptorImpl]

'classDeclaration' @ [82:57] ==> private final val classDeclaration: KtClassOrObject defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'nonConstructorContext' @ [82:75] ==> val nonConstructorContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'translatePropertiesAsConstructorParameters' @ [83:9] ==> private final fun translatePropertiesAsConstructorParameters(classDeclarationContext: TranslationContext): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]

'nonConstructorContext' @ [83:52] ==> val nonConstructorContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'DeclarationBodyVisitor' @ [84:27] ==> public constructor DeclarationBodyVisitor(containingClass: ClassDescriptor, context: TranslationContext, enumInitializer: JsFunction?) defined in org.jetbrains.kotlin.js.translate.declaration.DeclarationBodyVisitor[ClassConstructorDescriptorImpl]

'descriptor' @ [84:50] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'nonConstructorContext' @ [84:62] ==> val nonConstructorContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'enumInitFunction' @ [84:85] ==> val enumInitFunction: JsFunction? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'bodyVisitor' @ [85:9] ==> val bodyVisitor: DeclarationBodyVisitor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'traverseContainer' @ [85:21] ==> public final fun traverseContainer(@NotNull jetClass: KtDeclarationContainer, @NotNull context: TranslationContext): Unit defined in org.jetbrains.kotlin.js.translate.declaration.DeclarationBodyVisitor[JavaMethodDescriptor]

'classDeclaration' @ [85:39] ==> private final val classDeclaration: KtClassOrObject defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'nonConstructorContext' @ [85:57] ==> val nonConstructorContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'mayBeAddThrowableProperties' @ [86:9] ==> private final fun mayBeAddThrowableProperties(context: TranslationContext): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]

'context' @ [86:37] ==> val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'constructorFunction' @ [87:9] ==> val constructorFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'body' @ [87:29] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [87:34] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'bodyVisitor' @ [87:48] ==> val bodyVisitor: DeclarationBodyVisitor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'initializerStatements' @ [87:60] ==> public final val initializerStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.declaration.DeclarationBodyVisitor[PropertyDescriptorImpl]

'delegationTranslator' @ [88:9] ==> val delegationTranslator: DelegationTranslator defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'generateDelegated' @ [88:30] ==> public final fun generateDelegated(): Unit defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[SimpleFunctionDescriptorImpl]

'descriptor' @ [90:35] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'companionObjectDescriptor' @ [90:46] ==> public final val ClassDescriptor.companionObjectDescriptor: ClassDescriptor?[MyPropertyDescriptor]

'enumInitFunction' @ [91:13] ==> val enumInitFunction: JsFunction? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'companionDescriptor' @ [91:41] ==> val companionDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'JsInvocation' @ [92:34] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'pureFqn' @ [92:58] ==> @NotNull public open fun pureFqn(@NotNull identifier: JsName, @Nullable qualifier: JsExpression?): JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'context' @ [92:66] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[JavaMethodDescriptor]

'getNameForObjectInstance' @ [92:76] ==> @NotNull public open fun getNameForObjectInstance(@NotNull descriptor: ClassDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'companionDescriptor' @ [92:101] ==> val companionDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'enumInitFunction' @ [93:13] ==> val enumInitFunction: JsFunction? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'body' @ [93:30] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [93:35] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'asSyntheticStatement' @ [93:60] ==> public open fun asSyntheticStatement(@NotNull expression: JsExpression): (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'initInvocation' @ [93:81] ==> val initInvocation: JsInvocation defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'source' @ [93:96] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaMethodDescriptor]

'companionDescriptor' @ [93:103] ==> val companionDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'source' @ [93:123] ==> public final val ClassDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [93:130] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'translatePrimaryConstructor' @ [96:9] ==> private final fun translatePrimaryConstructor(constructorFunction: JsFunction, classContext: TranslationContext, delegationTranslator: DelegationTranslator): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]

'constructorFunction' @ [96:37] ==> val constructorFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'context' @ [96:58] ==> val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'delegationTranslator' @ [96:67] ==> val delegationTranslator: DelegationTranslator defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'addMetadataObject' @ [97:9] ==> private final fun addMetadataObject(): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]

'addMetadataType' @ [98:9] ==> private final fun addMetadataType(): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]

'context' @ [99:9] ==> val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'addClass' @ [99:17] ==> public open fun addClass(@NotNull classDescriptor: ClassDescriptor): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [99:26] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'addSuperclassReferences' @ [100:9] ==> private final fun addSuperclassReferences(): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]

'classDeclaration' @ [101:9] ==> private final val classDeclaration: KtClassOrObject defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'secondaryConstructors' @ [101:26] ==> public final val KtClassOrObject.secondaryConstructors: List<KtSecondaryConstructor>[MyPropertyDescriptor]

'forEach' @ [101:48] ==> @HidesMembers public inline fun <T> Iterable<KtSecondaryConstructor>.forEach(action: (KtSecondaryConstructor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSecondaryConstructor

'generateSecondaryConstructor' @ [101:58] ==> private final fun generateSecondaryConstructor(classContext: TranslationContext, constructor: KtSecondaryConstructor): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]

'context' @ [101:87] ==> val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'it' @ [101:96] ==> value-parameter it: KtSecondaryConstructor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [103:13] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'isData' @ [103:24] ==> public final val ClassDescriptor.isData: Boolean[MyPropertyDescriptor]

'JsDataClassGenerator' @ [104:13] ==> public/*package*/ constructor JsDataClassGenerator(klass: (KtClassOrObject..KtClassOrObject?), context: (TranslationContext..TranslationContext?)) defined in org.jetbrains.kotlin.js.translate.declaration.JsDataClassGenerator[JavaClassConstructorDescriptor]

'classDeclaration' @ [104:34] ==> private final val classDeclaration: KtClassOrObject defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'context' @ [104:52] ==> val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'generate' @ [104:61] ==> public final fun generate(): Unit defined in org.jetbrains.kotlin.js.translate.declaration.JsDataClassGenerator[DeserializedSimpleFunctionDescriptor]

'emitConstructors' @ [107:9] ==> private final fun emitConstructors(nonConstructorContext: TranslationContext, callSites: List<DeferredCallSite>): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]

'nonConstructorContext' @ [107:26] ==> val nonConstructorContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'nonConstructorContext' @ [107:49] ==> val nonConstructorContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'endDeclaration' @ [107:71] ==> @NotNull public open fun endDeclaration(): (MutableList<(DeferredCallSite..DeferredCallSite?)>..List<(DeferredCallSite..DeferredCallSite?)>) defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'allConstructors' @ [108:29] ==> private final val allConstructors: Sequence<ClassTranslator.ConstructorInfo> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'addClosureParameters' @ [109:13] ==> private final fun addClosureParameters(constructor: ClassTranslator.ConstructorInfo, nonConstructorContext: TranslationContext): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]

'constructor' @ [109:34] ==> val constructor: ClassTranslator.ConstructorInfo defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'nonConstructorContext' @ [109:47] ==> val nonConstructorContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'isObjectLike' @ [112:13] ==> private final fun isObjectLike(): Boolean defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]

'addObjectMethods' @ [113:13] ==> private final fun addObjectMethods(): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]

'descriptor' @ [116:13] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'kind' @ [116:24] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_CLASS' @ [116:42] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'generateEnumStandardMethods' @ [117:13] ==> private final fun generateEnumStandardMethods(entries: List<ClassDescriptor>): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]

'bodyVisitor' @ [117:41] ==> val bodyVisitor: DeclarationBodyVisitor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'enumEntries' @ [117:53] ==> public final val enumEntries: MutableList<ClassDescriptor> defined in org.jetbrains.kotlin.js.translate.declaration.DeclarationBodyVisitor[PropertyDescriptorImpl]

'descriptor' @ [122:9] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'getSuperClassNotAny' @ [122:20] ==> public fun ClassDescriptor.getSuperClassNotAny(): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'let' @ [122:43] ==> @InlineOnly public inline fun <T, R> ClassDescriptor.let(block: (ClassDescriptor) -> JsExpression): JsExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> JsExpression

'translateAsTypeReference' @ [122:69] ==> @NotNull public open fun translateAsTypeReference(@NotNull descriptor: ClassDescriptor, @NotNull context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.ReferenceTranslator[JavaMethodDescriptor]

'it' @ [122:94] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [122:98] ==> val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translate[LocalVariableDescriptor]

'if (isLocalClass) {
            innerWithUsageTracker(innerDescriptor)
        }
        else {
            inner(innerDescriptor)
        }' @ [126:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TranslationContext, elseBranch: TranslationContext): TranslationContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TranslationContext

'isLocalClass' @ [126:20] ==> private final val isLocalClass: Boolean defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'innerWithUsageTracker' @ [127:13] ==> @NotNull public open fun innerWithUsageTracker(@NotNull descriptor: MemberDescriptor): TranslationContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'innerDescriptor' @ [127:35] ==> value-parameter innerDescriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.withUsageTrackerIfNecessary[ValueParameterDescriptorImpl]

'inner' @ [130:13] ==> @NotNull public open fun inner(@NotNull descriptor: MemberDescriptor): TranslationContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'innerDescriptor' @ [130:19] ==> value-parameter innerDescriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.withUsageTrackerIfNecessary[ValueParameterDescriptorImpl]

'descriptor' @ [135:17] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'containingDeclaration' @ [135:28] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'!' @ [142:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isTrait' @ [142:14] ==> private final fun isTrait(): Boolean defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]

'classContext' @ [143:38] ==> value-parameter classContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translatePrimaryConstructor[ValueParameterDescriptorImpl]

'innerWithUsageTracker' @ [143:51] ==> @NotNull public open fun innerWithUsageTracker(@NotNull descriptor: MemberDescriptor): TranslationContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [143:73] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'isObjectLike' @ [144:17] ==> private final fun isObjectLike(): Boolean defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]

'addObjectCache' @ [145:17] ==> private final fun addObjectCache(statements: MutableList<JsStatement>): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]

'constructorFunction' @ [145:32] ==> value-parameter constructorFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translatePrimaryConstructor[ValueParameterDescriptorImpl]

'body' @ [145:52] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [145:57] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'ClassInitializerTranslator' @ [147:13] ==> public constructor ClassInitializerTranslator(@NotNull classDeclaration: KtClassOrObject, @NotNull context: TranslationContext, @NotNull initFunction: JsFunction) defined in org.jetbrains.kotlin.js.translate.initializer.ClassInitializerTranslator[JavaClassConstructorDescriptor]

'classDeclaration' @ [147:40] ==> private final val classDeclaration: KtClassOrObject defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'constructorContext' @ [147:58] ==> val constructorContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translatePrimaryConstructor[LocalVariableDescriptor]

'constructorFunction' @ [147:78] ==> value-parameter constructorFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translatePrimaryConstructor[ValueParameterDescriptorImpl]

'apply' @ [147:99] ==> @InlineOnly public inline fun <T> ClassInitializerTranslator.apply(block: ClassInitializerTranslator.() -> Unit): ClassInitializerTranslator defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassInitializerTranslator

'ordinal' @ [148:21] ==> private final val ordinal: Int? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'setOrdinal' @ [149:21] ==> public open fun setOrdinal(ordinal: Int): Unit defined in org.jetbrains.kotlin.js.translate.initializer.ClassInitializerTranslator[JavaMethodDescriptor]

'ordinal' @ [149:32] ==> private final val ordinal: Int? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'generateInitializeMethod' @ [151:17] ==> public open fun generateInitializeMethod(delegationTranslator: (DelegationTranslator..DelegationTranslator?)): Unit defined in org.jetbrains.kotlin.js.translate.initializer.ClassInitializerTranslator[JavaMethodDescriptor]

'delegationTranslator' @ [151:42] ==> value-parameter delegationTranslator: DelegationTranslator defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translatePrimaryConstructor[ValueParameterDescriptorImpl]

'primaryConstructor' @ [154:13] ==> private final var primaryConstructor: ClassTranslator.ConstructorInfo? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'ConstructorInfo' @ [154:34] ==> public constructor ConstructorInfo(function: JsFunction, context: TranslationContext, descriptor: MemberDescriptor, superCallGenerator: () -> Unit = ...) defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.ConstructorInfo[ClassConstructorDescriptorImpl]

'constructorFunction' @ [154:50] ==> value-parameter constructorFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translatePrimaryConstructor[ValueParameterDescriptorImpl]

'constructorContext' @ [154:71] ==> val constructorContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translatePrimaryConstructor[LocalVariableDescriptor]

'descriptor' @ [154:91] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'context' @ [159:24] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[JavaMethodDescriptor]

'createRootScopedFunction' @ [159:34] ==> @NotNull public open fun createRootScopedFunction(@NotNull descriptor: DeclarationDescriptor): JsFunction defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [159:59] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'withDefaultLocation' @ [159:71] ==> private final fun <T : JsNode> JsFunction.withDefaultLocation(): JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : JsNode> -> JsFunction

'function' @ [160:9] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.createEnumInitFunction[LocalVariableDescriptor]

'name' @ [160:18] ==> public final var JsFunction.name: (JsName..JsName?)[MyPropertyDescriptor]

'declareTemporaryName' @ [160:33] ==> @NotNull public open fun declareTemporaryName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'+' @ [160:54] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getSuggestedName' @ [160:68] ==> @NotNull public open fun getSuggestedName(@NotNull descriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'descriptor' @ [160:85] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'context' @ [161:29] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[JavaMethodDescriptor]

'createRootScopedFunction' @ [161:39] ==> @NotNull public open fun createRootScopedFunction(@NotNull descriptor: DeclarationDescriptor): JsFunction defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [161:64] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'withDefaultLocation' @ [161:76] ==> private final fun <T : JsNode> JsFunction.withDefaultLocation(): JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : JsNode> -> JsFunction

'function' @ [162:9] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.createEnumInitFunction[LocalVariableDescriptor]

'body' @ [162:18] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [162:23] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'assignment' @ [162:48] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'pureFqn' @ [162:70] ==> @NotNull public open fun pureFqn(@NotNull identifier: JsName, @Nullable qualifier: JsExpression?): JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'function' @ [162:78] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.createEnumInitFunction[LocalVariableDescriptor]

'name' @ [162:87] ==> public final var JsFunction.name: (JsName..JsName?)[MyPropertyDescriptor]

'emptyFunction' @ [162:100] ==> val emptyFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.createEnumInitFunction[LocalVariableDescriptor]

'withDefaultLocation' @ [163:18] ==> private final fun <T : JsNode> JsBinaryOperation.withDefaultLocation(): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : JsNode> -> JsBinaryOperation

'makeStmt' @ [163:40] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'context' @ [164:9] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[JavaMethodDescriptor]

'addDeclarationStatement' @ [164:19] ==> public open fun addDeclarationStatement(@NotNull statement: JsStatement): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'function' @ [164:43] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.createEnumInitFunction[LocalVariableDescriptor]

'makeStmt' @ [164:52] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsFunction[JavaMethodDescriptor]

'function' @ [165:16] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.createEnumInitFunction[LocalVariableDescriptor]

'when (descriptor.kind) {
        ClassKind.OBJECT,
        ClassKind.ENUM_ENTRY -> true
        else -> false
    }' @ [168:34] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'descriptor' @ [168:40] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'kind' @ [168:51] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'OBJECT' @ [169:19] ==> enum entry OBJECT defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'ENUM_ENTRY' @ [170:19] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'context' @ [175:9] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[JavaMethodDescriptor]

'addDeclarationStatement' @ [175:19] ==> public open fun addDeclarationStatement(@NotNull statement: JsStatement): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'assignment' @ [175:54] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'createMetadataRef' @ [175:65] ==> private final fun createMetadataRef(): JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]

'metadataLiteral' @ [175:86] ==> private final val metadataLiteral: JsObjectLiteral defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'makeStmt' @ [175:103] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'JsNameRef' @ [178:39] ==> public constructor JsNameRef(@NotNull p0: String, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'METADATA' @ [178:55] ==> public const final val METADATA: String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaPropertyDescriptor]

'context' @ [178:65] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[JavaMethodDescriptor]

'getInnerReference' @ [178:75] ==> @NotNull public open fun getInnerReference(@NotNull descriptor: DeclarationDescriptor): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [178:93] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'JsNameRef' @ [181:26] ==> public constructor JsNameRef(@NotNull p0: String, @NotNull p1: String) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'CLASS_KIND_ENUM' @ [181:42] ==> public const final val CLASS_KIND_ENUM: String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaPropertyDescriptor]

'KOTLIN_NAME' @ [181:65] ==> public const final val KOTLIN_NAME: String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaPropertyDescriptor]

'when {
            DescriptorUtils.isInterface(descriptor) -> JsNameRef(Namer.CLASS_KIND_INTERFACE, kotlinType)
            DescriptorUtils.isObject(descriptor) -> JsNameRef(Namer.CLASS_KIND_OBJECT, kotlinType)
            else -> JsNameRef(Namer.CLASS_KIND_CLASS, kotlinType)
        }' @ [182:23] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsNameRef, entry1: JsNameRef, entry2: JsNameRef): JsNameRef[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsNameRef

'isInterface' @ [183:29] ==> public open fun isInterface(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [183:41] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'JsNameRef' @ [183:56] ==> public constructor JsNameRef(@NotNull p0: String, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'CLASS_KIND_INTERFACE' @ [183:72] ==> public const final val CLASS_KIND_INTERFACE: String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaPropertyDescriptor]

'kotlinType' @ [183:94] ==> val kotlinType: JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addMetadataType[LocalVariableDescriptor]

'isObject' @ [184:29] ==> public open fun isObject(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [184:38] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'JsNameRef' @ [184:53] ==> public constructor JsNameRef(@NotNull p0: String, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'CLASS_KIND_OBJECT' @ [184:69] ==> public const final val CLASS_KIND_OBJECT: String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaPropertyDescriptor]

'kotlinType' @ [184:88] ==> val kotlinType: JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addMetadataType[LocalVariableDescriptor]

'JsNameRef' @ [185:21] ==> public constructor JsNameRef(@NotNull p0: String, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'CLASS_KIND_CLASS' @ [185:37] ==> public const final val CLASS_KIND_CLASS: String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaPropertyDescriptor]

'kotlinType' @ [185:55] ==> val kotlinType: JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addMetadataType[LocalVariableDescriptor]

'metadataLiteral' @ [188:9] ==> private final val metadataLiteral: JsObjectLiteral defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'propertyInitializers' @ [188:25] ==> public final val JsObjectLiteral.propertyInitializers: (MutableList<(JsPropertyInitializer..JsPropertyInitializer?)>..List<(JsPropertyInitializer..JsPropertyInitializer?)>?)[MyPropertyDescriptor]

'JsPropertyInitializer' @ [188:49] ==> public constructor JsPropertyInitializer(@NotNull p0: JsExpression, @NotNull p1: JsExpression) defined in org.jetbrains.kotlin.js.backend.ast.JsPropertyInitializer[JavaClassConstructorDescriptor]

'JsNameRef' @ [188:71] ==> public constructor JsNameRef(@NotNull p0: String) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'METADATA_CLASS_KIND' @ [188:87] ==> public const final val METADATA_CLASS_KIND: String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaPropertyDescriptor]

'typeRef' @ [188:109] ==> val typeRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addMetadataType[LocalVariableDescriptor]

'descriptor' @ [190:26] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'name' @ [190:37] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'!' @ [191:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'simpleName' @ [191:14] ==> val simpleName: Name defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addMetadataType[LocalVariableDescriptor]

'isSpecial' @ [191:25] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'JsPropertyInitializer' @ [192:34] ==> public constructor JsPropertyInitializer(@NotNull p0: JsExpression, @NotNull p1: JsExpression) defined in org.jetbrains.kotlin.js.backend.ast.JsPropertyInitializer[JavaClassConstructorDescriptor]

'JsNameRef' @ [192:56] ==> public constructor JsNameRef(@NotNull p0: String) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'METADATA_SIMPLE_NAME' @ [192:72] ==> public const final val METADATA_SIMPLE_NAME: String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaPropertyDescriptor]

'JsStringLiteral' @ [192:95] ==> public constructor JsStringLiteral(p0: (String..String?)) defined in org.jetbrains.kotlin.js.backend.ast.JsStringLiteral[JavaClassConstructorDescriptor]

'simpleName' @ [192:111] ==> val simpleName: Name defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addMetadataType[LocalVariableDescriptor]

'identifier' @ [192:122] ==> public final val Name.identifier: String[MyPropertyDescriptor]

'metadataLiteral' @ [193:13] ==> private final val metadataLiteral: JsObjectLiteral defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'propertyInitializers' @ [193:29] ==> public final val JsObjectLiteral.propertyInitializers: (MutableList<(JsPropertyInitializer..JsPropertyInitializer?)>..List<(JsPropertyInitializer..JsPropertyInitializer?)>?)[MyPropertyDescriptor]

'simpleNameProp' @ [193:53] ==> val simpleNameProp: JsPropertyInitializer defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addMetadataType[LocalVariableDescriptor]

'getDescriptorForElement' @ [199:50] ==> @NotNull public open fun getDescriptorForElement(@NotNull context: BindingContext, @NotNull element: PsiElement): DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.utils.BindingUtils[JavaMethodDescriptor]

'classContext' @ [199:74] ==> value-parameter classContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[ValueParameterDescriptorImpl]

'bindingContext' @ [199:87] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'constructor' @ [199:105] ==> value-parameter constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[ValueParameterDescriptorImpl]

'constructorDescriptor' @ [201:31] ==> val constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'containingDeclaration' @ [201:53] ==> public final val ClassConstructorDescriptor.containingDeclaration: ClassDescriptor[MyPropertyDescriptor]

'declareTemporaryName' @ [203:32] ==> @NotNull public open fun declareTemporaryName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'ANOTHER_THIS_PARAMETER_NAME' @ [203:59] ==> public const final val ANOTHER_THIS_PARAMETER_NAME: String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaPropertyDescriptor]

'thisName' @ [204:27] ==> val thisName: JsName defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'makeRef' @ [204:36] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'classDescriptor' @ [205:34] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'thisAsReceiverParameter' @ [205:50] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'classContext' @ [207:23] ==> value-parameter classContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[ValueParameterDescriptorImpl]

'innerWithUsageTracker' @ [208:18] ==> @NotNull public open fun innerWithUsageTracker(@NotNull descriptor: MemberDescriptor): TranslationContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'constructorDescriptor' @ [208:40] ==> val constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'innerContextWithAliased' @ [209:18] ==> @NotNull public open fun innerContextWithAliased(@NotNull correspondingDescriptor: DeclarationDescriptor, @NotNull alias: JsExpression): TranslationContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'receiverDescriptor' @ [209:42] ==> val receiverDescriptor: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'thisNameRef' @ [209:62] ==> val thisNameRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'context' @ [211:30] ==> var context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'getOuterClassReference' @ [211:38] ==> @Nullable public open fun getOuterClassReference(descriptor: (ClassDescriptor..ClassDescriptor?)): JsName? defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'classDescriptor' @ [211:61] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'getContainingClass' @ [212:42] ==> @Nullable public open fun getContainingClass(@NotNull p0: DeclarationDescriptor): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [212:61] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'outerClassName' @ [213:13] ==> val outerClassName: JsName? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'outerClass' @ [214:38] ==> val outerClass: ClassDescriptor? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'thisAsReceiverParameter' @ [214:51] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'context' @ [215:13] ==> var context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'context' @ [215:23] ==> var context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'innerContextWithAliased' @ [215:31] ==> @NotNull public open fun innerContextWithAliased(@NotNull correspondingDescriptor: DeclarationDescriptor, @NotNull alias: JsExpression): TranslationContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'outerClassReceiver' @ [215:55] ==> val outerClassReceiver: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'outerClassName' @ [215:75] ==> val outerClassName: JsName? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'makeRef' @ [215:90] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'context' @ [219:38] ==> var context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'getFunctionObject' @ [219:46] ==> @NotNull public open fun getFunctionObject(@NotNull descriptor: CallableDescriptor): JsFunction defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'constructorDescriptor' @ [219:64] ==> val constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'constructorInitializer' @ [220:9] ==> val constructorInitializer: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'name' @ [220:32] ==> public final var JsFunction.name: (JsName..JsName?)[MyPropertyDescriptor]

'context' @ [220:39] ==> var context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'getInnerNameForDescriptor' @ [220:47] ==> @NotNull public open fun getInnerNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'constructorDescriptor' @ [220:73] ==> val constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'context' @ [221:9] ==> var context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'addDeclarationStatement' @ [221:17] ==> public open fun addDeclarationStatement(@NotNull statement: JsStatement): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'constructorInitializer' @ [221:41] ==> val constructorInitializer: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'makeStmt' @ [221:64] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsFunction[JavaMethodDescriptor]

'context' @ [223:9] ==> var context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'context' @ [223:19] ==> var context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'contextWithScope' @ [223:27] ==> @NotNull public open fun contextWithScope(@NotNull `fun`: JsFunction): TranslationContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'constructorInitializer' @ [223:44] ==> val constructorInitializer: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'context' @ [224:9] ==> var context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'translateAndAliasParameters' @ [224:17] ==> public fun TranslationContext.translateAndAliasParameters(descriptor: FunctionDescriptor, targetList: MutableList<JsParameter>): TranslationContext defined in org.jetbrains.kotlin.js.translate.expression in file FunctionTranslator.kt[SimpleFunctionDescriptorImpl]

'constructorDescriptor' @ [224:45] ==> val constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'constructorInitializer' @ [224:68] ==> val constructorInitializer: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'parameters' @ [224:91] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'translateFunction' @ [225:18] ==> public fun TranslationContext.translateFunction(declaration: KtDeclarationWithBody, function: JsFunction): Unit defined in org.jetbrains.kotlin.js.translate.expression in file FunctionTranslator.kt[SimpleFunctionDescriptorImpl]

'constructor' @ [225:36] ==> value-parameter constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[ValueParameterDescriptorImpl]

'constructorInitializer' @ [225:49] ==> val constructorInitializer: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'mutableListOf' @ [228:35] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<(MutableList<JsStatement>) -> Unit> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function1<MutableList<JsStatement>, Unit>

'context' @ [229:32] ==> var context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'getInnerReference' @ [229:40] ==> @NotNull public open fun getInnerReference(@NotNull descriptor: DeclarationDescriptor): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'classDescriptor' @ [229:58] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'superCallGenerators' @ [231:9] ==> val superCallGenerators: MutableList<(MutableList<JsStatement>) -> Unit> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'it' @ [231:34] ==> value-parameter it: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor.<anonymous>[ValueParameterDescriptorImpl]

'setDefaultValueForArguments' @ [231:63] ==> @NotNull public open fun setDefaultValueForArguments(@NotNull descriptor: FunctionDescriptor, @NotNull functionBodyContext: TranslationContext): (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>) defined in org.jetbrains.kotlin.js.translate.utils.FunctionBodyTranslator[JavaMethodDescriptor]

'constructorDescriptor' @ [231:91] ==> val constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'context' @ [231:114] ==> var context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'createObjectWithPrototypeFrom' @ [233:36] ==> @NotNull public open fun createObjectWithPrototypeFrom(@NotNull referenceToClass: JsExpression): JsInvocation defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'referenceToClass' @ [233:66] ==> val referenceToClass: JsExpression defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'assignment' @ [234:38] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'thisNameRef' @ [234:49] ==> val thisNameRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'deepCopy' @ [234:61] ==> @NotNull public open fun deepCopy(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaMethodDescriptor]

'or' @ [234:84] ==> @NotNull public open fun or(@NotNull op1: JsExpression, @NotNull op2: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'thisNameRef' @ [234:87] ==> val thisNameRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'deepCopy' @ [234:99] ==> @NotNull public open fun deepCopy(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaMethodDescriptor]

'createInstance' @ [234:111] ==> val createInstance: JsInvocation defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'source' @ [235:18] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'constructor' @ [235:25] ==> value-parameter constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[ValueParameterDescriptorImpl]

'makeStmt' @ [235:38] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'superCallGenerators' @ [236:9] ==> val superCallGenerators: MutableList<(MutableList<JsStatement>) -> Unit> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'it' @ [236:34] ==> value-parameter it: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor.<anonymous>[ValueParameterDescriptorImpl]

'instanceVar' @ [236:40] ==> val instanceVar: JsStatement defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'mutableListOf' @ [239:27] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression

'descriptor' @ [241:13] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'kind' @ [241:24] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_CLASS' @ [241:42] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'declareTemporaryName' @ [242:41] ==> @NotNull public open fun declareTemporaryName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'declareTemporaryName' @ [243:44] ==> @NotNull public open fun declareTemporaryName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'constructorInitializer' @ [244:13] ==> val constructorInitializer: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'parameters' @ [244:36] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'addAll' @ [244:47] ==> public abstract fun addAll(index: Int, elements: Collection<(JsParameter..JsParameter?)>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'listOf' @ [244:57] ==> public fun <T> listOf(vararg elements: JsParameter): List<JsParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsParameter

'JsParameter' @ [244:64] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'nameParamName' @ [244:76] ==> val nameParamName: JsName defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'JsParameter' @ [244:92] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'ordinalParamName' @ [244:104] ==> val ordinalParamName: JsName defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'leadingArgs' @ [245:13] ==> val leadingArgs: MutableList<JsExpression> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'listOf' @ [245:28] ==> public fun <T> listOf(vararg elements: JsNameRef): List<JsNameRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNameRef

'nameParamName' @ [245:35] ==> val nameParamName: JsName defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'makeRef' @ [245:49] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'withDefaultLocation' @ [245:59] ==> private final fun <T : JsNode> JsNameRef.withDefaultLocation(): JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : JsNode> -> JsNameRef

'ordinalParamName' @ [245:82] ==> val ordinalParamName: JsName defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'makeRef' @ [245:99] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'withDefaultLocation' @ [245:109] ==> private final fun <T : JsNode> JsNameRef.withDefaultLocation(): JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : JsNode> -> JsNameRef

'outerClassName' @ [247:13] ==> val outerClassName: JsName? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'constructorInitializer' @ [248:13] ==> val constructorInitializer: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'parameters' @ [248:36] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'add' @ [248:47] ==> public abstract fun add(index: Int, element: (JsParameter..JsParameter?)): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'JsParameter' @ [248:54] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'outerClassName' @ [248:66] ==> val outerClassName: JsName? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'leadingArgs' @ [249:13] ==> val leadingArgs: MutableList<JsExpression> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'outerClassName' @ [249:28] ==> val outerClassName: JsName? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'makeRef' @ [249:43] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'constructorInitializer' @ [252:9] ==> val constructorInitializer: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'parameters' @ [252:32] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'JsParameter' @ [252:46] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'thisName' @ [252:58] ==> val thisName: JsName defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'getDelegationConstructorCall' @ [255:48] ==> @Nullable public open fun getDelegationConstructorCall(@NotNull p0: BindingContext, @NotNull p1: ConstructorDescriptor): ResolvedCall<(ConstructorDescriptor..ConstructorDescriptor?)>? defined in org.jetbrains.kotlin.resolve.BindingContextUtils[JavaMethodDescriptor]

'context' @ [255:77] ==> var context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'bindingContext' @ [255:85] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'constructorDescriptor' @ [255:103] ==> val constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'resolvedCall' @ [256:42] ==> val resolvedCall: ResolvedCall<(ConstructorDescriptor..ConstructorDescriptor?)>? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'resultingDescriptor' @ [256:56] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<(ConstructorDescriptor..ConstructorDescriptor?)>.resultingDescriptor: ConstructorDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.ConstructorDescriptor..org.jetbrains.kotlin.descriptors.ConstructorDescriptor?)

'constructedClass' @ [256:109] ==> public final val ClassConstructorDescriptor.constructedClass: ClassDescriptor[MyPropertyDescriptor]

'resolvedCall' @ [258:13] ==> val resolvedCall: ResolvedCall<(ConstructorDescriptor..ConstructorDescriptor?)>? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'!' @ [258:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAny' @ [258:53] ==> public open fun isAny(@NotNull p0: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'delegationClassDescriptor' @ [258:59] ==> val delegationClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'if (JsDescriptorUtils.isImmediateSubtypeOfError(classDescriptor)) {
                superCallGenerators += {
                    val innerContext = context().innerBlock()
                    ClassInitializerTranslator.emulateSuperCallToNativeError(
                            innerContext, classDescriptor, resolvedCall, thisNameRef.deepCopy())
                    it += innerContext.currentBlock.statements
                }
            }
            else {
                superCallGenerators += {
                    val delegationConstructor = resolvedCall.resultingDescriptor
                    val innerContext = context.innerBlock()
                    val statement = CallTranslator.translate(innerContext, resolvedCall).toInvocationWith(
                            leadingArgs, delegationConstructor.valueParameters.size, thisNameRef.deepCopy())
                            .source(resolvedCall.call.callElement)
                            .makeStmt()
                    it += innerContext.currentBlock.statements
                    it += statement
                }
            }' @ [259:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isImmediateSubtypeOfError' @ [259:35] ==> public open fun isImmediateSubtypeOfError(@NotNull descriptor: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.JsDescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [259:61] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'superCallGenerators' @ [260:17] ==> val superCallGenerators: MutableList<(MutableList<JsStatement>) -> Unit> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'context' @ [261:40] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[JavaMethodDescriptor]

'innerBlock' @ [261:50] ==> @NotNull public open fun innerBlock(): TranslationContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'emulateSuperCallToNativeError' @ [262:48] ==> public open fun emulateSuperCallToNativeError(@NotNull context: TranslationContext, @NotNull classDescriptor: ClassDescriptor, @NotNull superCall: ResolvedCall<out (FunctionDescriptor..FunctionDescriptor?)>, @NotNull receiver: JsExpression): Unit defined in org.jetbrains.kotlin.js.translate.initializer.ClassInitializerTranslator[JavaMethodDescriptor]

'innerContext' @ [263:29] ==> val innerContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor.<anonymous>[LocalVariableDescriptor]

'classDescriptor' @ [263:43] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'resolvedCall' @ [263:60] ==> val resolvedCall: ResolvedCall<(ConstructorDescriptor..ConstructorDescriptor?)>? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'thisNameRef' @ [263:74] ==> val thisNameRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'deepCopy' @ [263:86] ==> @NotNull public open fun deepCopy(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaMethodDescriptor]

'it' @ [264:21] ==> value-parameter it: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor.<anonymous>[ValueParameterDescriptorImpl]

'innerContext' @ [264:27] ==> val innerContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor.<anonymous>[LocalVariableDescriptor]

'currentBlock' @ [264:40] ==> public final val TranslationContext.currentBlock: JsBlock[MyPropertyDescriptor]

'statements' @ [264:53] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'superCallGenerators' @ [268:17] ==> val superCallGenerators: MutableList<(MutableList<JsStatement>) -> Unit> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'resolvedCall' @ [269:49] ==> val resolvedCall: ResolvedCall<(ConstructorDescriptor..ConstructorDescriptor?)>? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'resultingDescriptor' @ [269:62] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<(ConstructorDescriptor..ConstructorDescriptor?)>.resultingDescriptor: ConstructorDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.ConstructorDescriptor..org.jetbrains.kotlin.descriptors.ConstructorDescriptor?)

'context' @ [270:40] ==> var context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'innerBlock' @ [270:48] ==> @NotNull public open fun innerBlock(): TranslationContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'CallTranslator' @ [271:37] ==> public object CallTranslator defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallTranslator.kt[FakeCallableDescriptorForObject]

'translate' @ [271:52] ==> @JvmOverloads @JvmStatic public final fun translate(context: TranslationContext, resolvedCall: ResolvedCall<out FunctionDescriptor>, extensionOrDispatchReceiver: JsExpression? = ...): JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.CallTranslator[SimpleFunctionDescriptorImpl]

'innerContext' @ [271:62] ==> val innerContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor.<anonymous>[LocalVariableDescriptor]

'resolvedCall' @ [271:76] ==> val resolvedCall: ResolvedCall<(ConstructorDescriptor..ConstructorDescriptor?)>? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'toInvocationWith' @ [271:90] ==> public fun JsExpression.toInvocationWith(leadingExtraArgs: List<JsExpression>, parameterCount: Int, thisExpr: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils in file astUtils.kt[SimpleFunctionDescriptorImpl]

'leadingArgs' @ [272:29] ==> val leadingArgs: MutableList<JsExpression> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'delegationConstructor' @ [272:42] ==> val delegationConstructor: ConstructorDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor.<anonymous>[LocalVariableDescriptor]

'valueParameters' @ [272:64] ==> public final val ConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [272:80] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'thisNameRef' @ [272:86] ==> val thisNameRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'deepCopy' @ [272:98] ==> @NotNull public open fun deepCopy(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaMethodDescriptor]

'source' @ [273:30] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'resolvedCall' @ [273:37] ==> val resolvedCall: ResolvedCall<(ConstructorDescriptor..ConstructorDescriptor?)>? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'call' @ [273:50] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<(ConstructorDescriptor..ConstructorDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.ConstructorDescriptor..org.jetbrains.kotlin.descriptors.ConstructorDescriptor?)

'callElement' @ [273:55] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'makeStmt' @ [274:30] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'it' @ [275:21] ==> value-parameter it: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor.<anonymous>[ValueParameterDescriptorImpl]

'innerContext' @ [275:27] ==> val innerContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor.<anonymous>[LocalVariableDescriptor]

'currentBlock' @ [275:40] ==> public final val TranslationContext.currentBlock: JsBlock[MyPropertyDescriptor]

'statements' @ [275:53] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'it' @ [276:21] ==> value-parameter it: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor.<anonymous>[ValueParameterDescriptorImpl]

'statement' @ [276:27] ==> val statement: JsStatement defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor.<anonymous>[LocalVariableDescriptor]

'delegationClassDescriptor' @ [281:44] ==> val delegationClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'classDescriptor' @ [281:73] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'!' @ [282:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'delegationCtorInTheSameClass' @ [282:14] ==> val delegationCtorInTheSameClass: Boolean defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'!' @ [282:46] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [282:47] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'hasPrimaryConstructor' @ [282:63] ==> public fun ClassDescriptor.hasPrimaryConstructor(): Boolean defined in org.jetbrains.kotlin.js.descriptorUtils[DeserializedSimpleFunctionDescriptor]

'superCallGenerators' @ [283:13] ==> val superCallGenerators: MutableList<(MutableList<JsStatement>) -> Unit> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'context' @ [284:36] ==> var context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'usageTracker' @ [284:44] ==> @Nullable public open fun usageTracker(): UsageTracker? defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'context' @ [285:31] ==> var context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'getClassOrConstructorClosure' @ [285:39] ==> @Nullable public open fun getClassOrConstructorClosure(@NotNull classOrConstructor: MemberDescriptor): (MutableList<(DeclarationDescriptor..DeclarationDescriptor?)>?..List<(DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'classDescriptor' @ [285:68] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'orEmpty' @ [285:85] ==> @InlineOnly public inline fun <T> List<(DeclarationDescriptor..DeclarationDescriptor?)>?.orEmpty(): List<(DeclarationDescriptor..DeclarationDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'map' @ [285:95] ==> public inline fun <T, R> Iterable<(DeclarationDescriptor..DeclarationDescriptor?)>.map(transform: ((DeclarationDescriptor..DeclarationDescriptor?)) -> JsNameRef): List<JsNameRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)
    <R> -> JsNameRef

'usageTracker' @ [286:21] ==> val usageTracker: UsageTracker defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor.<anonymous>[LocalVariableDescriptor]

'getNameForCapturedDescriptor' @ [286:34] ==> public fun UsageTracker.getNameForCapturedDescriptor(descriptor: DeclarationDescriptor): JsName? defined in org.jetbrains.kotlin.js.translate.context in file UsageTracker.kt[SimpleFunctionDescriptorImpl]

'it' @ [286:63] ==> value-parameter it: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'makeRef' @ [286:69] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'it' @ [288:17] ==> value-parameter it: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor.<anonymous>[ValueParameterDescriptorImpl]

'JsInvocation' @ [288:23] ==> public constructor JsInvocation(@NotNull p0: JsExpression, @NotNull p1: (MutableList<out (JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'getFunctionCallRef' @ [288:42] ==> @NotNull public open fun getFunctionCallRef(@NotNull functionExpression: JsExpression): JsNameRef defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'referenceToClass' @ [288:61] ==> val referenceToClass: JsExpression defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'listOf' @ [288:80] ==> public fun <T> listOf(element: JsNameRef): List<JsNameRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNameRef

'thisNameRef' @ [288:87] ==> val thisNameRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'deepCopy' @ [288:99] ==> @NotNull public open fun deepCopy(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaMethodDescriptor]

'closure' @ [288:113] ==> val closure: List<JsNameRef> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor.<anonymous>[LocalVariableDescriptor]

'leadingArgs' @ [288:123] ==> val leadingArgs: MutableList<JsExpression> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'withDefaultLocation' @ [289:26] ==> private final fun <T : JsNode> JsInvocation.withDefaultLocation(): JsInvocation defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : JsNode> -> JsInvocation

'makeStmt' @ [289:48] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaMethodDescriptor]

'constructorInitializer' @ [293:9] ==> val constructorInitializer: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'body' @ [293:32] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [293:37] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'JsReturn' @ [293:51] ==> public constructor JsReturn(p0: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsReturn[JavaClassConstructorDescriptor]

'thisNameRef' @ [293:60] ==> val thisNameRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'deepCopy' @ [293:72] ==> @NotNull public open fun deepCopy(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaMethodDescriptor]

'apply' @ [293:84] ==> @InlineOnly public inline fun <T> JsReturn.apply(block: JsReturn.() -> Unit): JsReturn defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsReturn

'source' @ [294:13] ==> public final var JsReturn.source: (Any..Any?)[MyPropertyDescriptor]

'constructor' @ [294:22] ==> value-parameter constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[ValueParameterDescriptorImpl]

'mutableListOf' @ [298:40] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<JsStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement

'superCallGenerators' @ [299:35] ==> val superCallGenerators: MutableList<(MutableList<JsStatement>) -> Unit> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'invoke' @ [300:17] ==> public abstract operator fun invoke(p1: MutableList<JsStatement>): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'additionalStatements' @ [300:31] ==> val additionalStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor.<anonymous>[LocalVariableDescriptor]

'constructorInitializer' @ [302:13] ==> val constructorInitializer: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'body' @ [302:36] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [302:41] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'addAll' @ [302:52] ==> public abstract fun addAll(index: Int, elements: Collection<(JsStatement..JsStatement?)>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'additionalStatements' @ [302:62] ==> val additionalStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor.<anonymous>[LocalVariableDescriptor]

'secondaryConstructors' @ [305:9] ==> private final val secondaryConstructors: MutableList<ClassTranslator.ConstructorInfo> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'ConstructorInfo' @ [305:34] ==> public constructor ConstructorInfo(function: JsFunction, context: TranslationContext, descriptor: MemberDescriptor, superCallGenerator: () -> Unit = ...) defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.ConstructorInfo[ClassConstructorDescriptorImpl]

'constructorInitializer' @ [305:50] ==> val constructorInitializer: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'context' @ [305:74] ==> var context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'constructorDescriptor' @ [305:83] ==> val constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'compositeSuperCallGenerator' @ [305:106] ==> val compositeSuperCallGenerator: () -> Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'context' @ [307:9] ==> var context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'export' @ [307:17] ==> public open fun export(@NotNull descriptor: MemberDescriptor): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'constructorDescriptor' @ [307:24] ==> val constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateSecondaryConstructor[LocalVariableDescriptor]

'primaryConstructor' @ [312:27] ==> private final var primaryConstructor: ClassTranslator.ConstructorInfo? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'if (primary != null) sequenceOf(primary) + secondaryConstructors else secondaryConstructors.asSequence()' @ [313:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Sequence<ClassTranslator.ConstructorInfo>, elseBranch: Sequence<ClassTranslator.ConstructorInfo>): Sequence<ClassTranslator.ConstructorInfo>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Sequence<ConstructorInfo>

'primary' @ [313:24] ==> val primary: ClassTranslator.ConstructorInfo? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.<get-allConstructors>[LocalVariableDescriptor]

'sequenceOf' @ [313:41] ==> public fun <T> sequenceOf(vararg elements: ClassTranslator.ConstructorInfo): Sequence<ClassTranslator.ConstructorInfo> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstructorInfo

'primary' @ [313:52] ==> val primary: ClassTranslator.ConstructorInfo? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.<get-allConstructors>[LocalVariableDescriptor]

'secondaryConstructors' @ [313:63] ==> private final val secondaryConstructors: MutableList<ClassTranslator.ConstructorInfo> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'secondaryConstructors' @ [313:90] ==> private final val secondaryConstructors: MutableList<ClassTranslator.ConstructorInfo> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'asSequence' @ [313:112] ==> public fun <T> Iterable<ClassTranslator.ConstructorInfo>.asSequence(): Sequence<ClassTranslator.ConstructorInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstructorInfo

'allConstructors' @ [318:30] ==> private final val allConstructors: Sequence<ClassTranslator.ConstructorInfo> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'map' @ [318:46] ==> public fun <T, R> Sequence<ClassTranslator.ConstructorInfo>.map(transform: (ClassTranslator.ConstructorInfo) -> Pair<MemberDescriptor, ClassTranslator.ConstructorInfo>): Sequence<Pair<MemberDescriptor, ClassTranslator.ConstructorInfo>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstructorInfo
    <R> -> Pair<MemberDescriptor, ConstructorInfo>

'it' @ [318:52] ==> value-parameter it: ClassTranslator.ConstructorInfo defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [318:55] ==> public final val descriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.ConstructorInfo[PropertyDescriptorImpl]

'it' @ [318:69] ==> value-parameter it: ClassTranslator.ConstructorInfo defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors.<anonymous>[ValueParameterDescriptorImpl]

'toMap' @ [318:74] ==> public fun <K, V> Sequence<Pair<MemberDescriptor, ClassTranslator.ConstructorInfo>>.toMap(): Map<MemberDescriptor, ClassTranslator.ConstructorInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> MemberDescriptor
    <V> -> ConstructorInfo

'callSites' @ [320:27] ==> value-parameter callSites: List<DeferredCallSite> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[ValueParameterDescriptorImpl]

'groupBy' @ [320:37] ==> public inline fun <T, K> Iterable<DeferredCallSite>.groupBy(keySelector: (DeferredCallSite) -> DeclarationDescriptor): Map<DeclarationDescriptor, List<DeferredCallSite>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeferredCallSite
    <K> -> DeclarationDescriptor

'it' @ [321:31] ==> value-parameter it: DeferredCallSite defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [321:34] ==> public final val constructor: ConstructorDescriptor defined in org.jetbrains.kotlin.js.translate.context.DeferredCallSite[PropertyDescriptorImpl]

'if (constructor.isPrimary) constructor.containingDeclaration else constructor' @ [322:49] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DeclarationDescriptor, elseBranch: DeclarationDescriptor): DeclarationDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DeclarationDescriptor

'constructor' @ [322:53] ==> val constructor: ConstructorDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors.<anonymous>[LocalVariableDescriptor]

'isPrimary' @ [322:65] ==> public final val ConstructorDescriptor.isPrimary: Boolean[MyPropertyDescriptor]

'constructor' @ [322:76] ==> val constructor: ConstructorDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors.<anonymous>[LocalVariableDescriptor]

'containingDeclaration' @ [322:88] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'constructor' @ [322:115] ==> val constructor: ConstructorDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors.<anonymous>[LocalVariableDescriptor]

'result' @ [323:13] ==> val result: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors.<anonymous>[LocalVariableDescriptor]

'secondaryConstructors' @ [326:25] ==> private final val secondaryConstructors: MutableList<ClassTranslator.ConstructorInfo> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'map' @ [326:47] ==> public inline fun <T, R> Iterable<ClassTranslator.ConstructorInfo>.map(transform: (ClassTranslator.ConstructorInfo) -> Pair<ClassTranslator.ConstructorInfo, MutableSet<ClassTranslator.ConstructorInfo>>): List<Pair<ClassTranslator.ConstructorInfo, MutableSet<ClassTranslator.ConstructorInfo>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstructorInfo
    <R> -> Pair<ConstructorInfo, MutableSet<ConstructorInfo>>

'mutableSetOf' @ [327:23] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<ClassTranslator.ConstructorInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstructorInfo

'it' @ [328:30] ==> value-parameter it: ClassTranslator.ConstructorInfo defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [328:33] ==> public final val descriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.ConstructorInfo[PropertyDescriptorImpl]

'descriptor' @ [329:17] ==> val descriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors.<anonymous>[LocalVariableDescriptor]

'getDelegationConstructorCall' @ [330:56] ==> @Nullable public open fun getDelegationConstructorCall(@NotNull p0: BindingContext, @NotNull p1: ConstructorDescriptor): ResolvedCall<(ConstructorDescriptor..ConstructorDescriptor?)>? defined in org.jetbrains.kotlin.resolve.BindingContextUtils[JavaMethodDescriptor]

'context' @ [330:85] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[JavaMethodDescriptor]

'bindingContext' @ [330:95] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [330:113] ==> val descriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors.<anonymous>[LocalVariableDescriptor]

'resolvedCall' @ [331:21] ==> val resolvedCall: ResolvedCall<(ConstructorDescriptor..ConstructorDescriptor?)>? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors.<anonymous>[LocalVariableDescriptor]

'constructorMap' @ [332:34] ==> val constructorMap: Map<MemberDescriptor, ClassTranslator.ConstructorInfo> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[LocalVariableDescriptor]

'resolvedCall' @ [332:49] ==> val resolvedCall: ResolvedCall<(ConstructorDescriptor..ConstructorDescriptor?)>? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors.<anonymous>[LocalVariableDescriptor]

'resultingDescriptor' @ [332:62] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<(ConstructorDescriptor..ConstructorDescriptor?)>.resultingDescriptor: ConstructorDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.ConstructorDescriptor..org.jetbrains.kotlin.descriptors.ConstructorDescriptor?)

'callee' @ [333:25] ==> val callee: ClassTranslator.ConstructorInfo? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors.<anonymous>[LocalVariableDescriptor]

'set' @ [334:25] ==> val set: MutableSet<ClassTranslator.ConstructorInfo> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors.<anonymous>[LocalVariableDescriptor]

'callee' @ [334:32] ==> val callee: ClassTranslator.ConstructorInfo? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors.<anonymous>[LocalVariableDescriptor]

'Pair' @ [338:13] ==> public constructor Pair<out A, out B>(first: ClassTranslator.ConstructorInfo, second: MutableSet<ClassTranslator.ConstructorInfo>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> ConstructorInfo
    <out B> -> MutableSet<ConstructorInfo>

'it' @ [338:18] ==> value-parameter it: ClassTranslator.ConstructorInfo defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors.<anonymous>[ValueParameterDescriptorImpl]

'set' @ [338:22] ==> val set: MutableSet<ClassTranslator.ConstructorInfo> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors.<anonymous>[LocalVariableDescriptor]

'toMap' @ [339:11] ==> public fun <K, V> Iterable<Pair<ClassTranslator.ConstructorInfo, MutableSet<ClassTranslator.ConstructorInfo>>>.toMap(): Map<ClassTranslator.ConstructorInfo, MutableSet<ClassTranslator.ConstructorInfo>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ConstructorInfo
    <V> -> MutableSet<ConstructorInfo>

'topologicalOrder' @ [341:38] ==> public final fun <N : (Any..Any?)> topologicalOrder(@NotNull p0: (MutableIterable<(ClassTranslator.ConstructorInfo..ClassTranslator.ConstructorInfo?)>..Iterable<(ClassTranslator.ConstructorInfo..ClassTranslator.ConstructorInfo?)>), @NotNull p1: ((ClassTranslator.ConstructorInfo..ClassTranslator.ConstructorInfo?)) -> (MutableIterable<(ClassTranslator.ConstructorInfo..ClassTranslator.ConstructorInfo?)>..Iterable<(ClassTranslator.ConstructorInfo..ClassTranslator.ConstructorInfo?)>)): (MutableList<(ClassTranslator.ConstructorInfo..ClassTranslator.ConstructorInfo?)>..List<(ClassTranslator.ConstructorInfo..ClassTranslator.ConstructorInfo?)>?) defined in org.jetbrains.kotlin.utils.DFS[SamAdapterFunctionDescriptor]
Inferred types:
    <N : (Any..Any?)> -> (org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.ConstructorInfo..org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.ConstructorInfo?)

'allConstructors' @ [341:55] ==> private final val allConstructors: Sequence<ClassTranslator.ConstructorInfo> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'asIterable' @ [341:71] ==> public fun <T> Sequence<ClassTranslator.ConstructorInfo>.asIterable(): Iterable<ClassTranslator.ConstructorInfo> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstructorInfo

'thisCalls' @ [341:87] ==> val thisCalls: Map<ClassTranslator.ConstructorInfo, MutableSet<ClassTranslator.ConstructorInfo>> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[LocalVariableDescriptor]

'it' @ [341:97] ==> value-parameter it: (ClassTranslator.ConstructorInfo..ClassTranslator.ConstructorInfo?) defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors.<anonymous>[ValueParameterDescriptorImpl]

'orEmpty' @ [341:101] ==> @InlineOnly public inline fun <T> Set<ClassTranslator.ConstructorInfo>?.orEmpty(): Set<ClassTranslator.ConstructorInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstructorInfo

'reversed' @ [341:113] ==> public fun <T> Iterable<(ClassTranslator.ConstructorInfo..ClassTranslator.ConstructorInfo?)>.reversed(): List<(ClassTranslator.ConstructorInfo..ClassTranslator.ConstructorInfo?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.ConstructorInfo..org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.ConstructorInfo?)

'sortedConstructors' @ [342:29] ==> val sortedConstructors: List<(ClassTranslator.ConstructorInfo..ClassTranslator.ConstructorInfo?)> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[LocalVariableDescriptor]

'constructor' @ [343:13] ==> val constructor: (ClassTranslator.ConstructorInfo..ClassTranslator.ConstructorInfo?) defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[LocalVariableDescriptor]

'invoke' @ [343:25] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'nonConstructorContext' @ [345:46] ==> value-parameter nonConstructorContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[ValueParameterDescriptorImpl]

'usageTracker' @ [345:68] ==> @Nullable public open fun usageTracker(): UsageTracker? defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'constructor' @ [346:32] ==> val constructor: (ClassTranslator.ConstructorInfo..ClassTranslator.ConstructorInfo?) defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[LocalVariableDescriptor]

'context' @ [346:44] ==> public final val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.ConstructorInfo[PropertyDescriptorImpl]

'usageTracker' @ [346:52] ==> @Nullable public open fun usageTracker(): UsageTracker? defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'if (isLocalClass) nonConstructorUsageTracker!!.capturedDescriptors else setOf()' @ [348:46] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Set<DeclarationDescriptor>, elseBranch: Set<DeclarationDescriptor>): Set<DeclarationDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Set<DeclarationDescriptor>

'isLocalClass' @ [348:50] ==> private final val isLocalClass: Boolean defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'nonConstructorUsageTracker' @ [348:64] ==> val nonConstructorUsageTracker: UsageTracker? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[LocalVariableDescriptor]

'capturedDescriptors' @ [348:93] ==> public final val capturedDescriptors: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'setOf' @ [348:118] ==> @InlineOnly public inline fun <T> setOf(): Set<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'usageTracker' @ [349:43] ==> val usageTracker: UsageTracker defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[LocalVariableDescriptor]

'capturedDescriptors' @ [349:56] ==> public final val capturedDescriptors: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'nonConstructorCapturedVars' @ [351:33] ==> val nonConstructorCapturedVars: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[LocalVariableDescriptor]

'constructorCapturedVars' @ [351:62] ==> val constructorCapturedVars: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[LocalVariableDescriptor]

'distinct' @ [351:87] ==> public fun <T> Iterable<DeclarationDescriptor>.distinct(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'constructor' @ [353:30] ==> val constructor: (ClassTranslator.ConstructorInfo..ClassTranslator.ConstructorInfo?) defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[LocalVariableDescriptor]

'descriptor' @ [353:42] ==> public final val descriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.ConstructorInfo[PropertyDescriptorImpl]

'!!' @ [354:35] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: ClassDescriptor?): ClassDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> ClassDescriptor

'getParentOfType' @ [354:51] ==> @Nullable public open fun <D : (DeclarationDescriptor..DeclarationDescriptor?)> getParentOfType(@Nullable p0: DeclarationDescriptor?, @NotNull p1: Class<(ClassDescriptor..ClassDescriptor?)>, p2: Boolean): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]
Inferred types:
    <D : (DeclarationDescriptor..DeclarationDescriptor?)> -> (org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)

'descriptor' @ [354:67] ==> val descriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[LocalVariableDescriptor]

'java' @ [354:102] ==> public val <T> KClass<ClassDescriptor>.java: Class<ClassDescriptor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'nonConstructorContext' @ [355:13] ==> value-parameter nonConstructorContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[ValueParameterDescriptorImpl]

'putClassOrConstructorClosure' @ [355:35] ==> public open fun putClassOrConstructorClosure(@NotNull descriptor: MemberDescriptor, @NotNull closure: (MutableList<(DeclarationDescriptor..DeclarationDescriptor?)>..List<(DeclarationDescriptor..DeclarationDescriptor?)>)): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [355:64] ==> val descriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[LocalVariableDescriptor]

'capturedVars' @ [355:76] ==> val capturedVars: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[LocalVariableDescriptor]

'callSiteMap' @ [357:40] ==> val callSiteMap: Map<DeclarationDescriptor, List<DeferredCallSite>> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[LocalVariableDescriptor]

'constructor' @ [357:52] ==> val constructor: (ClassTranslator.ConstructorInfo..ClassTranslator.ConstructorInfo?) defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[LocalVariableDescriptor]

'descriptor' @ [357:64] ==> public final val descriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.ConstructorInfo[PropertyDescriptorImpl]

'orEmpty' @ [357:76] ==> @InlineOnly public inline fun <T> List<DeferredCallSite>?.orEmpty(): List<DeferredCallSite> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeferredCallSite

'constructorCallSites' @ [359:30] ==> val constructorCallSites: List<DeferredCallSite> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[LocalVariableDescriptor]

'callSite' @ [360:40] ==> val callSite: DeferredCallSite defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[LocalVariableDescriptor]

'context' @ [360:49] ==> public final val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.context.DeferredCallSite[PropertyDescriptorImpl]

'getArgumentForClosureConstructor' @ [360:57] ==> @NotNull public open fun getArgumentForClosureConstructor(@NotNull descriptor: DeclarationDescriptor): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'classDescriptor' @ [360:90] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[LocalVariableDescriptor]

'thisAsReceiverParameter' @ [360:106] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'capturedVars' @ [361:17] ==> val capturedVars: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[LocalVariableDescriptor]

'forEach' @ [361:30] ==> @HidesMembers public inline fun <T> Iterable<DeclarationDescriptor>.forEach(action: (DeclarationDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'nonConstructorUsageTracker' @ [361:40] ==> val nonConstructorUsageTracker: UsageTracker? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[LocalVariableDescriptor]

'used' @ [361:69] ==> public final fun used(descriptor: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[SimpleFunctionDescriptorImpl]

'it' @ [361:74] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors.<anonymous>[ValueParameterDescriptorImpl]

'capturedVars' @ [362:35] ==> val capturedVars: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[LocalVariableDescriptor]

'map' @ [362:48] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.map(transform: (DeclarationDescriptor) -> JsNameRef): List<JsNameRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> JsNameRef

'nonConstructorUsageTracker' @ [363:32] ==> val nonConstructorUsageTracker: UsageTracker? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[LocalVariableDescriptor]

'getNameForCapturedDescriptor' @ [363:61] ==> public fun UsageTracker.getNameForCapturedDescriptor(descriptor: DeclarationDescriptor): JsName? defined in org.jetbrains.kotlin.js.translate.context in file UsageTracker.kt[SimpleFunctionDescriptorImpl]

'it' @ [363:90] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors.<anonymous>[ValueParameterDescriptorImpl]

'pureFqn' @ [364:32] ==> @NotNull public open fun pureFqn(@NotNull identifier: JsName, @Nullable qualifier: JsExpression?): JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'name' @ [364:40] ==> val name: JsName defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors.<anonymous>[LocalVariableDescriptor]

'closureQualifier' @ [364:46] ==> val closureQualifier: JsExpression defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[LocalVariableDescriptor]

'callSite' @ [366:17] ==> val callSite: DeferredCallSite defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[LocalVariableDescriptor]

'invocationArgs' @ [366:26] ==> public final val invocationArgs: MutableList<JsExpression> defined in org.jetbrains.kotlin.js.translate.context.DeferredCallSite[PropertyDescriptorImpl]

'addAll' @ [366:41] ==> public abstract fun addAll(index: Int, elements: Collection<JsExpression>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'closureArgs' @ [366:51] ==> val closureArgs: List<JsNameRef> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.emitConstructors[LocalVariableDescriptor]

'constructor' @ [372:28] ==> value-parameter constructor: ClassTranslator.ConstructorInfo defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addClosureParameters[ValueParameterDescriptorImpl]

'context' @ [372:40] ==> public final val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.ConstructorInfo[PropertyDescriptorImpl]

'usageTracker' @ [372:48] ==> @Nullable public open fun usageTracker(): UsageTracker? defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'context' @ [373:28] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[JavaMethodDescriptor]

'getClassOrConstructorClosure' @ [373:38] ==> @Nullable public open fun getClassOrConstructorClosure(@NotNull classOrConstructor: MemberDescriptor): (MutableList<(DeclarationDescriptor..DeclarationDescriptor?)>?..List<(DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'constructor' @ [373:67] ==> value-parameter constructor: ClassTranslator.ConstructorInfo defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addClosureParameters[ValueParameterDescriptorImpl]

'descriptor' @ [373:79] ==> public final val descriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.ConstructorInfo[PropertyDescriptorImpl]

'nonConstructorContext' @ [374:42] ==> value-parameter nonConstructorContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addClosureParameters[ValueParameterDescriptorImpl]

'usageTracker' @ [374:64] ==> @Nullable public open fun usageTracker(): UsageTracker? defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'constructor' @ [376:24] ==> value-parameter constructor: ClassTranslator.ConstructorInfo defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addClosureParameters[ValueParameterDescriptorImpl]

'function' @ [376:36] ==> public final val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.ConstructorInfo[PropertyDescriptorImpl]

'mutableListOf' @ [377:36] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<JsStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement

'component1' @ [378:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [378:18] ==> public final operator fun component2(): (DeclarationDescriptor..DeclarationDescriptor?) defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'capturedVars' @ [378:34] ==> val capturedVars: (MutableList<(DeclarationDescriptor..DeclarationDescriptor?)>..List<(DeclarationDescriptor..DeclarationDescriptor?)>) defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addClosureParameters[LocalVariableDescriptor]

'withIndex' @ [378:47] ==> public fun <T> Iterable<(DeclarationDescriptor..DeclarationDescriptor?)>.withIndex(): Iterable<IndexedValue<(DeclarationDescriptor..DeclarationDescriptor?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'nonConstructorUsageTracker' @ [379:29] ==> val nonConstructorUsageTracker: UsageTracker? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addClosureParameters[LocalVariableDescriptor]

'capturedDescriptorToJsName' @ [379:57] ==> public final val capturedDescriptorToJsName: Map<DeclarationDescriptor, JsName> defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'get' @ [379:85] ==> public abstract operator fun get(key: DeclarationDescriptor): JsName? defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'capturedVar' @ [379:89] ==> val capturedVar: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addClosureParameters[LocalVariableDescriptor]

'usageTracker' @ [380:24] ==> val usageTracker: UsageTracker defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addClosureParameters[LocalVariableDescriptor]

'capturedDescriptorToJsName' @ [380:37] ==> public final val capturedDescriptorToJsName: Map<DeclarationDescriptor, JsName> defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'capturedVar' @ [380:64] ==> val capturedVar: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addClosureParameters[LocalVariableDescriptor]

'fieldName' @ [380:80] ==> val fieldName: JsName? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addClosureParameters[LocalVariableDescriptor]

'function' @ [382:13] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addClosureParameters[LocalVariableDescriptor]

'parameters' @ [382:22] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'add' @ [382:33] ==> public abstract fun add(index: Int, element: (JsParameter..JsParameter?)): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'i' @ [382:37] ==> val i: Int defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addClosureParameters[LocalVariableDescriptor]

'JsParameter' @ [382:40] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'name' @ [382:52] ==> val name: JsName defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addClosureParameters[LocalVariableDescriptor]

'fieldName' @ [383:17] ==> val fieldName: JsName? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addClosureParameters[LocalVariableDescriptor]

'constructor' @ [383:38] ==> value-parameter constructor: ClassTranslator.ConstructorInfo defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addClosureParameters[ValueParameterDescriptorImpl]

'primaryConstructor' @ [383:53] ==> private final var primaryConstructor: ClassTranslator.ConstructorInfo? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'constructor' @ [384:31] ==> value-parameter constructor: ClassTranslator.ConstructorInfo defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addClosureParameters[ValueParameterDescriptorImpl]

'descriptor' @ [384:43] ==> public final val descriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.ConstructorInfo[PropertyDescriptorImpl]

'source' @ [384:92] ==> public final val DeclarationDescriptorWithSource.source: SourceElement[MyPropertyDescriptor]

'additionalStatements' @ [385:17] ==> val additionalStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addClosureParameters[LocalVariableDescriptor]

'defineSimpleProperty' @ [385:52] ==> @NotNull public open fun defineSimpleProperty(@NotNull name: String, @NotNull value: JsExpression, @Nullable source: SourceElement?): JsStatement defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'fieldName' @ [385:73] ==> val fieldName: JsName? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addClosureParameters[LocalVariableDescriptor]

'ident' @ [385:83] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'name' @ [385:90] ==> val name: JsName defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addClosureParameters[LocalVariableDescriptor]

'makeRef' @ [385:95] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'source' @ [385:106] ==> val source: SourceElement? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addClosureParameters[LocalVariableDescriptor]

'function' @ [389:9] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addClosureParameters[LocalVariableDescriptor]

'body' @ [389:18] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [389:23] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'addAll' @ [389:34] ==> public abstract fun addAll(index: Int, elements: Collection<(JsStatement..JsStatement?)>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'additionalStatements' @ [389:44] ==> val additionalStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addClosureParameters[LocalVariableDescriptor]

'JsArrayLiteral' @ [393:35] ==> public constructor JsArrayLiteral(p0: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>?)) defined in org.jetbrains.kotlin.js.backend.ast.JsArrayLiteral[JavaClassConstructorDescriptor]

'getSupertypesNameReferences' @ [393:50] ==> private final fun getSupertypesNameReferences(): List<JsExpression> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]

'metadataLiteral' @ [394:9] ==> private final val metadataLiteral: JsObjectLiteral defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'propertyInitializers' @ [394:25] ==> public final val JsObjectLiteral.propertyInitializers: (MutableList<(JsPropertyInitializer..JsPropertyInitializer?)>..List<(JsPropertyInitializer..JsPropertyInitializer?)>?)[MyPropertyDescriptor]

'JsPropertyInitializer' @ [394:49] ==> public constructor JsPropertyInitializer(@NotNull p0: JsExpression, @NotNull p1: JsExpression) defined in org.jetbrains.kotlin.js.backend.ast.JsPropertyInitializer[JavaClassConstructorDescriptor]

'JsNameRef' @ [394:71] ==> public constructor JsNameRef(@NotNull p0: String) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'METADATA_SUPERTYPES' @ [394:87] ==> public const final val METADATA_SUPERTYPES: String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaPropertyDescriptor]

'supertypeReferences' @ [394:109] ==> val supertypeReferences: JsArrayLiteral defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addSuperclassReferences[LocalVariableDescriptor]

'getSupertypesWithoutFakes' @ [398:26] ==> @NotNull public open fun getSupertypesWithoutFakes(descriptor: (ClassDescriptor..ClassDescriptor?)): (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.js.translate.utils.JsDescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [398:52] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'filter' @ [399:18] ==> public inline fun <T> Iterable<(KotlinType..KotlinType?)>.filter(predicate: ((KotlinType..KotlinType?)) -> Boolean): List<(KotlinType..KotlinType?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'it' @ [399:27] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.getSupertypesNameReferences.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [399:30] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [399:42] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'supertypes' @ [400:13] ==> val supertypes: List<(KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.getSupertypesNameReferences[LocalVariableDescriptor]

'isEmpty' @ [400:24] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [401:20] ==> public fun <T> emptyList(): List<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression

'supertypes' @ [403:13] ==> val supertypes: List<(KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.getSupertypesNameReferences[LocalVariableDescriptor]

'size' @ [403:24] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'supertypes' @ [404:24] ==> val supertypes: List<(KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.getSupertypesNameReferences[LocalVariableDescriptor]

'getClassDescriptorForType' @ [405:39] ==> @NotNull public open fun getClassDescriptorForType(@NotNull p0: KotlinType): ClassDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'type' @ [405:65] ==> val type: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.getSupertypesNameReferences[LocalVariableDescriptor]

'if (!AnnotationsUtils.isNativeObject(supertypeDescriptor)) {
                listOf(ReferenceTranslator.translateAsTypeReference(supertypeDescriptor, context()))
            }
            else {
                listOf()
            }' @ [406:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<JsExpression>, elseBranch: List<JsExpression>): List<JsExpression>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<JsExpression>

'!' @ [406:24] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNativeObject' @ [406:42] ==> public open fun isNativeObject(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.AnnotationsUtils[JavaMethodDescriptor]

'supertypeDescriptor' @ [406:57] ==> val supertypeDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.getSupertypesNameReferences[LocalVariableDescriptor]

'listOf' @ [407:17] ==> public fun <T> listOf(element: JsExpression): List<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression

'translateAsTypeReference' @ [407:44] ==> @NotNull public open fun translateAsTypeReference(@NotNull descriptor: ClassDescriptor, @NotNull context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.ReferenceTranslator[JavaMethodDescriptor]

'supertypeDescriptor' @ [407:69] ==> val supertypeDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.getSupertypesNameReferences[LocalVariableDescriptor]

'context' @ [407:90] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[JavaMethodDescriptor]

'listOf' @ [410:17] ==> @InlineOnly public inline fun <T> listOf(): List<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression

'mutableSetOf' @ [414:37] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<TypeConstructor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeConstructor

'supertypes' @ [415:22] ==> val supertypes: List<(KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.getSupertypesNameReferences[LocalVariableDescriptor]

'supertypeConstructors' @ [416:13] ==> val supertypeConstructors: MutableSet<TypeConstructor> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.getSupertypesNameReferences[LocalVariableDescriptor]

'type' @ [416:38] ==> val type: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.getSupertypesNameReferences[LocalVariableDescriptor]

'constructor' @ [416:43] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'topologicallySortSuperclassesAndRecordAllInstances' @ [418:35] ==> @NotNull public open fun topologicallySortSuperclassesAndRecordAllInstances(@NotNull p0: SimpleType, @NotNull p1: (MutableMap<(TypeConstructor..TypeConstructor?), (MutableSet<(SimpleType..SimpleType?)>..Set<(SimpleType..SimpleType?)>?)>..Map<(TypeConstructor..TypeConstructor?), (MutableSet<(SimpleType..SimpleType?)>..Set<(SimpleType..SimpleType?)>?)>), @NotNull p2: (MutableSet<(TypeConstructor..TypeConstructor?)>..Set<(TypeConstructor..TypeConstructor?)>)): (MutableList<(TypeConstructor..TypeConstructor?)>..List<(TypeConstructor..TypeConstructor?)>) defined in org.jetbrains.kotlin.types.CommonSupertypes[JavaMethodDescriptor]

'descriptor' @ [419:13] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'defaultType' @ [419:24] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'mutableMapOf' @ [420:13] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<TypeConstructor, Set<SimpleType>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeConstructor
    <V> -> Set<SimpleType>

'mutableSetOf' @ [421:13] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<TypeConstructor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeConstructor

'mutableListOf' @ [423:30] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression

'sortedAllSuperTypes' @ [424:33] ==> val sortedAllSuperTypes: (MutableList<(TypeConstructor..TypeConstructor?)>..List<(TypeConstructor..TypeConstructor?)>) defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.getSupertypesNameReferences[LocalVariableDescriptor]

'supertypeConstructors' @ [425:17] ==> val supertypeConstructors: MutableSet<TypeConstructor> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.getSupertypesNameReferences[LocalVariableDescriptor]

'contains' @ [425:39] ==> public abstract fun contains(element: TypeConstructor): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'typeConstructor' @ [425:48] ==> val typeConstructor: (TypeConstructor..TypeConstructor?) defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.getSupertypesNameReferences[LocalVariableDescriptor]

'getClassDescriptorForTypeConstructor' @ [426:43] ==> @NotNull public open fun getClassDescriptorForTypeConstructor(@NotNull p0: TypeConstructor): ClassDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'typeConstructor' @ [426:80] ==> val typeConstructor: (TypeConstructor..TypeConstructor?) defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.getSupertypesNameReferences[LocalVariableDescriptor]

'!' @ [427:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNativeObject' @ [427:39] ==> public open fun isNativeObject(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.AnnotationsUtils[JavaMethodDescriptor]

'supertypeDescriptor' @ [427:54] ==> val supertypeDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.getSupertypesNameReferences[LocalVariableDescriptor]

'supertypesRefs' @ [428:21] ==> val supertypesRefs: MutableList<JsExpression> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.getSupertypesNameReferences[LocalVariableDescriptor]

'translateAsTypeReference' @ [428:59] ==> @NotNull public open fun translateAsTypeReference(@NotNull descriptor: ClassDescriptor, @NotNull context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.ReferenceTranslator[JavaMethodDescriptor]

'supertypeDescriptor' @ [428:84] ==> val supertypeDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.getSupertypesNameReferences[LocalVariableDescriptor]

'context' @ [428:105] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[JavaMethodDescriptor]

'supertypesRefs' @ [432:16] ==> val supertypesRefs: MutableList<JsExpression> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.getSupertypesNameReferences[LocalVariableDescriptor]

'getPrimaryConstructorParameters' @ [436:27] ==> @NotNull public open fun getPrimaryConstructorParameters(@NotNull classDeclaration: KtClassOrObject): (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.js.translate.utils.PsiUtils[JavaMethodDescriptor]

'classDeclaration' @ [436:59] ==> private final val classDeclaration: KtClassOrObject defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'getPropertyDescriptorForConstructorParameter' @ [437:30] ==> @Nullable public open fun getPropertyDescriptorForConstructorParameter(@NotNull context: BindingContext, @NotNull parameter: KtParameter): PropertyDescriptor? defined in org.jetbrains.kotlin.js.translate.utils.BindingUtils[JavaMethodDescriptor]

'bindingContext' @ [437:75] ==> @NotNull protected/*protected and package*/ open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[JavaMethodDescriptor]

'parameter' @ [437:93] ==> val parameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translatePropertiesAsConstructorParameters[LocalVariableDescriptor]

'descriptor' @ [438:17] ==> val descriptor: PropertyDescriptor? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translatePropertiesAsConstructorParameters[LocalVariableDescriptor]

'JsObjectLiteral' @ [439:31] ==> public constructor JsObjectLiteral(p0: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsObjectLiteral[JavaClassConstructorDescriptor]

'translateAccessors' @ [440:17] ==> public fun translateAccessors(descriptor: VariableDescriptorWithAccessors, result: MutableList<JsPropertyInitializer>, context: TranslationContext): Unit defined in org.jetbrains.kotlin.js.translate.declaration in file PropertyTranslator.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [440:36] ==> val descriptor: PropertyDescriptor? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translatePropertiesAsConstructorParameters[LocalVariableDescriptor]

'literal' @ [440:48] ==> val literal: JsObjectLiteral defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translatePropertiesAsConstructorParameters[LocalVariableDescriptor]

'propertyInitializers' @ [440:56] ==> public final val JsObjectLiteral.propertyInitializers: (MutableList<(JsPropertyInitializer..JsPropertyInitializer?)>..List<(JsPropertyInitializer..JsPropertyInitializer?)>?)[MyPropertyDescriptor]

'classDeclarationContext' @ [440:78] ==> value-parameter classDeclarationContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translatePropertiesAsConstructorParameters[ValueParameterDescriptorImpl]

'literal' @ [441:21] ==> val literal: JsObjectLiteral defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translatePropertiesAsConstructorParameters[LocalVariableDescriptor]

'propertyInitializers' @ [441:29] ==> public final val JsObjectLiteral.propertyInitializers: (MutableList<(JsPropertyInitializer..JsPropertyInitializer?)>..List<(JsPropertyInitializer..JsPropertyInitializer?)>?)[MyPropertyDescriptor]

'isNotEmpty' @ [441:50] ==> @InlineOnly public inline fun <T> Collection<(JsPropertyInitializer..JsPropertyInitializer?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsPropertyInitializer..org.jetbrains.kotlin.js.backend.ast.JsPropertyInitializer?)

'classDeclarationContext' @ [442:21] ==> value-parameter classDeclarationContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translatePropertiesAsConstructorParameters[ValueParameterDescriptorImpl]

'addAccessorsToPrototype' @ [442:45] ==> public fun TranslationContext.addAccessorsToPrototype(containingClass: ClassDescriptor, propertyDescriptor: PropertyDescriptor, literal: JsObjectLiteral): Unit defined in org.jetbrains.kotlin.js.translate.utils in file utils.kt[SimpleFunctionDescriptorImpl]

'this' @ [442:69] ==> <this> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[LazyClassReceiverParameterDescriptor]

'descriptor' @ [442:74] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'descriptor' @ [442:86] ==> val descriptor: PropertyDescriptor? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translatePropertiesAsConstructorParameters[LocalVariableDescriptor]

'literal' @ [442:98] ==> val literal: JsObjectLiteral defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.translatePropertiesAsConstructorParameters[LocalVariableDescriptor]

'cachedInstanceName' @ [449:9] ==> private final lateinit var cachedInstanceName: JsName defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'declareTemporaryName' @ [449:38] ==> @NotNull public open fun declareTemporaryName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'+' @ [449:59] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getSuggestedName' @ [449:73] ==> @NotNull public open fun getSuggestedName(@NotNull descriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.js.translate.context.StaticContext[JavaMethodDescriptor]

'descriptor' @ [449:90] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'OBJECT_INSTANCE_VAR_SUFFIX' @ [449:110] ==> public const final val OBJECT_INSTANCE_VAR_SUFFIX: String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaPropertyDescriptor]

'statements' @ [450:9] ==> value-parameter statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addObjectCache[ValueParameterDescriptorImpl]

'assignment' @ [450:34] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'cachedInstanceName' @ [450:45] ==> private final lateinit var cachedInstanceName: JsName defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'makeRef' @ [450:64] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'JsThisRef' @ [450:75] ==> public constructor JsThisRef() defined in org.jetbrains.kotlin.js.backend.ast.JsThisRef[JavaClassConstructorDescriptor]

'withDefaultLocation' @ [450:88] ==> private final fun <T : JsNode> JsBinaryOperation.withDefaultLocation(): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : JsNode> -> JsBinaryOperation

'makeStmt' @ [450:110] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'context' @ [454:9] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[JavaMethodDescriptor]

'addDeclarationStatement' @ [454:19] ==> public open fun addDeclarationStatement(@NotNull statement: JsStatement): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'newVar' @ [454:54] ==> @NotNull public open fun newVar(@NotNull name: JsName, @Nullable expr: JsExpression?): JsVars defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'cachedInstanceName' @ [454:61] ==> private final lateinit var cachedInstanceName: JsName defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'JsNullLiteral' @ [454:81] ==> public constructor JsNullLiteral() defined in org.jetbrains.kotlin.js.backend.ast.JsNullLiteral[JavaClassConstructorDescriptor]

'context' @ [456:27] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[JavaMethodDescriptor]

'createRootScopedFunction' @ [456:37] ==> @NotNull public open fun createRootScopedFunction(@NotNull description: String): JsFunction defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'+' @ [456:62] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [456:86] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'withDefaultLocation' @ [456:98] ==> private final fun <T : JsNode> JsFunction.withDefaultLocation(): JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : JsNode> -> JsFunction

'instanceFun' @ [457:9] ==> val instanceFun: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addObjectMethods[LocalVariableDescriptor]

'name' @ [457:21] ==> public final var JsFunction.name: (JsName..JsName?)[MyPropertyDescriptor]

'context' @ [457:28] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[JavaMethodDescriptor]

'getNameForObjectInstance' @ [457:38] ==> @NotNull public open fun getNameForObjectInstance(@NotNull descriptor: ClassDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [457:63] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'enumInitializerName' @ [459:13] ==> private final val enumInitializerName: JsName? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'instanceFun' @ [460:13] ==> val instanceFun: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addObjectMethods[LocalVariableDescriptor]

'body' @ [460:25] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [460:30] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'JsInvocation' @ [460:44] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'pureFqn' @ [460:57] ==> @NotNull public open fun pureFqn(@NotNull identifier: JsName, @Nullable qualifier: JsExpression?): JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'enumInitializerName' @ [460:65] ==> private final val enumInitializerName: JsName? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'withDefaultLocation' @ [460:93] ==> private final fun <T : JsNode> JsInvocation.withDefaultLocation(): JsInvocation defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : JsNode> -> JsInvocation

'makeStmt' @ [460:115] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaMethodDescriptor]

'descriptor' @ [462:13] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'kind' @ [462:24] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_ENTRY' @ [462:42] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'equality' @ [463:55] ==> @NotNull public open fun equality(@NotNull arg1: JsExpression, @NotNull arg2: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'cachedInstanceName' @ [463:64] ==> private final lateinit var cachedInstanceName: JsName defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'makeRef' @ [463:83] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'JsNullLiteral' @ [463:94] ==> public constructor JsNullLiteral() defined in org.jetbrains.kotlin.js.backend.ast.JsNullLiteral[JavaClassConstructorDescriptor]

'withDefaultLocation' @ [463:111] ==> private final fun <T : JsNode> JsBinaryOperation.withDefaultLocation(): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : JsNode> -> JsBinaryOperation

'JsBlock' @ [464:41] ==> public constructor JsBlock() defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'JsIf' @ [465:40] ==> public constructor JsIf(@NotNull p0: JsExpression, @NotNull p1: JsStatement) defined in org.jetbrains.kotlin.js.backend.ast.JsIf[JavaClassConstructorDescriptor]

'instanceCreatedCondition' @ [465:45] ==> val instanceCreatedCondition: JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addObjectMethods[LocalVariableDescriptor]

'instanceCreationBlock' @ [465:71] ==> val instanceCreationBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addObjectMethods[LocalVariableDescriptor]

'withDefaultLocation' @ [465:94] ==> private final fun <T : JsNode> JsIf.withDefaultLocation(): JsIf defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : JsNode> -> JsIf

'instanceFun' @ [466:13] ==> val instanceFun: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addObjectMethods[LocalVariableDescriptor]

'body' @ [466:25] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [466:30] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'instanceCreatedGuard' @ [466:44] ==> val instanceCreatedGuard: JsIf defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addObjectMethods[LocalVariableDescriptor]

'context' @ [468:29] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[JavaMethodDescriptor]

'getInnerReference' @ [468:39] ==> @NotNull public open fun getInnerReference(@NotNull descriptor: DeclarationDescriptor): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [468:57] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'instanceCreationBlock' @ [469:13] ==> val instanceCreationBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addObjectMethods[LocalVariableDescriptor]

'statements' @ [469:35] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'JsNew' @ [469:49] ==> public constructor JsNew(p0: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNew[JavaClassConstructorDescriptor]

'objectRef' @ [469:55] ==> val objectRef: JsExpression defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addObjectMethods[LocalVariableDescriptor]

'withDefaultLocation' @ [469:66] ==> private final fun <T : JsNode> JsNew.withDefaultLocation(): JsNew defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : JsNode> -> JsNew

'makeStmt' @ [469:88] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsNew[JavaMethodDescriptor]

'instanceFun' @ [472:9] ==> val instanceFun: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addObjectMethods[LocalVariableDescriptor]

'body' @ [472:21] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [472:26] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'JsReturn' @ [472:40] ==> public constructor JsReturn(p0: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsReturn[JavaClassConstructorDescriptor]

'cachedInstanceName' @ [472:49] ==> private final lateinit var cachedInstanceName: JsName defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'makeRef' @ [472:68] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'withDefaultLocation' @ [472:78] ==> private final fun <T : JsNode> JsNameRef.withDefaultLocation(): JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : JsNode> -> JsNameRef

'withDefaultLocation' @ [472:101] ==> private final fun <T : JsNode> JsReturn.withDefaultLocation(): JsReturn defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : JsNode> -> JsReturn

'context' @ [474:9] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[JavaMethodDescriptor]

'addDeclarationStatement' @ [474:19] ==> public open fun addDeclarationStatement(@NotNull statement: JsStatement): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'instanceFun' @ [474:43] ==> val instanceFun: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.addObjectMethods[LocalVariableDescriptor]

'makeStmt' @ [474:55] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsFunction[JavaMethodDescriptor]

'EnumTranslator' @ [478:9] ==> public constructor EnumTranslator(context: TranslationContext, descriptor: ClassDescriptor, entries: List<ClassDescriptor>, psi: PsiElement) defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[ClassConstructorDescriptorImpl]

'context' @ [478:24] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[JavaMethodDescriptor]

'descriptor' @ [478:35] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'entries' @ [478:47] ==> value-parameter entries: List<ClassDescriptor> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.generateEnumStandardMethods[ValueParameterDescriptorImpl]

'classDeclaration' @ [478:56] ==> private final val classDeclaration: KtClassOrObject defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'generateStandardMethods' @ [478:74] ==> public final fun generateStandardMethods(): Unit defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[SimpleFunctionDescriptorImpl]

'!' @ [482:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isImmediateSubtypeOfError' @ [482:32] ==> public open fun isImmediateSubtypeOfError(@NotNull descriptor: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.JsDescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [482:58] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'listOf' @ [484:26] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [485:18] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> Name): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Name

'identifier' @ [485:29] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'it' @ [485:40] ==> value-parameter it: String defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.mayBeAddThrowableProperties.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [486:18] ==> public inline fun <T, R> Iterable<Name>.map(transform: (Name) -> PropertyDescriptor): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name
    <R> -> PropertyDescriptor

'getPropertyByName' @ [486:40] ==> @NotNull public open fun getPropertyByName(@NotNull p0: MemberScope, @NotNull p1: Name): PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [486:58] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'unsubstitutedMemberScope' @ [486:69] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'it' @ [486:95] ==> value-parameter it: Name defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.mayBeAddThrowableProperties.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [487:18] ==> public inline fun <T> Iterable<PropertyDescriptor>.filter(predicate: (PropertyDescriptor) -> Boolean): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'!' @ [487:27] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [487:28] ==> value-parameter it: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.mayBeAddThrowableProperties.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [487:31] ==> public final val PropertyDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'isReal' @ [487:36] ==> public final val CallableMemberDescriptor.Kind.isReal: Boolean[MyPropertyDescriptor]

'properties' @ [488:26] ==> val properties: List<PropertyDescriptor> defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.mayBeAddThrowableProperties[LocalVariableDescriptor]

'DefaultPropertyTranslator' @ [489:38] ==> public constructor DefaultPropertyTranslator(descriptor: VariableDescriptorWithAccessors, context: TranslationContext, delegateReference: JsExpression) defined in org.jetbrains.kotlin.js.translate.declaration.DefaultPropertyTranslator[ClassConstructorDescriptorImpl]

'property' @ [489:64] ==> val property: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.mayBeAddThrowableProperties[LocalVariableDescriptor]

'context' @ [489:74] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.mayBeAddThrowableProperties[ValueParameterDescriptorImpl]

'JsNullLiteral' @ [489:83] ==> public constructor JsNullLiteral() defined in org.jetbrains.kotlin.js.backend.ast.JsNullLiteral[JavaClassConstructorDescriptor]

'JsObjectLiteral' @ [490:27] ==> public constructor JsObjectLiteral(p0: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsObjectLiteral[JavaClassConstructorDescriptor]

'context' @ [491:34] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.mayBeAddThrowableProperties[ValueParameterDescriptorImpl]

'getFunctionObject' @ [491:42] ==> @NotNull public open fun getFunctionObject(@NotNull descriptor: CallableDescriptor): JsFunction defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'property' @ [491:60] ==> val property: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.mayBeAddThrowableProperties[LocalVariableDescriptor]

'getter' @ [491:69] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'propertyTranslator' @ [492:13] ==> val propertyTranslator: DefaultPropertyTranslator defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.mayBeAddThrowableProperties[LocalVariableDescriptor]

'generateDefaultGetterFunction' @ [492:32] ==> public final fun generateDefaultGetterFunction(getterDescriptor: VariableAccessorDescriptor, function: JsFunction): Unit defined in org.jetbrains.kotlin.js.translate.declaration.DefaultPropertyTranslator[SimpleFunctionDescriptorImpl]

'property' @ [492:62] ==> val property: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.mayBeAddThrowableProperties[LocalVariableDescriptor]

'getter' @ [492:71] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'getterFunction' @ [492:81] ==> val getterFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.mayBeAddThrowableProperties[LocalVariableDescriptor]

'literal' @ [493:13] ==> val literal: JsObjectLiteral defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.mayBeAddThrowableProperties[LocalVariableDescriptor]

'propertyInitializers' @ [493:21] ==> public final val JsObjectLiteral.propertyInitializers: (MutableList<(JsPropertyInitializer..JsPropertyInitializer?)>..List<(JsPropertyInitializer..JsPropertyInitializer?)>?)[MyPropertyDescriptor]

'JsPropertyInitializer' @ [493:45] ==> public constructor JsPropertyInitializer(@NotNull p0: JsExpression, @NotNull p1: JsExpression) defined in org.jetbrains.kotlin.js.backend.ast.JsPropertyInitializer[JavaClassConstructorDescriptor]

'JsStringLiteral' @ [493:67] ==> public constructor JsStringLiteral(p0: (String..String?)) defined in org.jetbrains.kotlin.js.backend.ast.JsStringLiteral[JavaClassConstructorDescriptor]

'getterFunction' @ [493:91] ==> val getterFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.mayBeAddThrowableProperties[LocalVariableDescriptor]

'context' @ [494:13] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.mayBeAddThrowableProperties[ValueParameterDescriptorImpl]

'addAccessorsToPrototype' @ [494:21] ==> public fun TranslationContext.addAccessorsToPrototype(containingClass: ClassDescriptor, propertyDescriptor: PropertyDescriptor, literal: JsObjectLiteral): Unit defined in org.jetbrains.kotlin.js.translate.utils in file utils.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [494:45] ==> private final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'property' @ [494:57] ==> val property: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.mayBeAddThrowableProperties[LocalVariableDescriptor]

'literal' @ [494:67] ==> val literal: JsObjectLiteral defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.mayBeAddThrowableProperties[LocalVariableDescriptor]

'apply' @ [498:59] ==> @InlineOnly public inline fun <T> T.apply(block: T.() -> Unit): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'source' @ [498:67] ==> public final var JsNode.source: (Any..Any?)[MyPropertyDescriptor]

'classDeclaration' @ [498:76] ==> private final val classDeclaration: KtClassOrObject defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[PropertyDescriptorImpl]

'JvmStatic' @ [501:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'ClassTranslator' @ [502:20] ==> private constructor ClassTranslator(classDeclaration: KtClassOrObject, context: TranslationContext, enumInitializerName: JsName?, ordinal: Int?) defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[ClassConstructorDescriptorImpl]

'classDeclaration' @ [502:36] ==> value-parameter classDeclaration: KtClassOrObject defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.Companion.translate[ValueParameterDescriptorImpl]

'context' @ [502:54] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.Companion.translate[ValueParameterDescriptorImpl]

'enumInitializerName' @ [502:63] ==> value-parameter enumInitializerName: JsName? defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.Companion.translate[ValueParameterDescriptorImpl]

'translate' @ [502:90] ==> private final fun translate(): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]

'JvmStatic' @ [505:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'ClassTranslator' @ [506:20] ==> private constructor ClassTranslator(classDeclaration: KtClassOrObject, context: TranslationContext, enumInitializerName: JsName?, ordinal: Int?) defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[ClassConstructorDescriptorImpl]

'classDeclaration' @ [506:36] ==> value-parameter classDeclaration: KtEnumEntry defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.Companion.translate[ValueParameterDescriptorImpl]

'context' @ [506:54] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.Companion.translate[ValueParameterDescriptorImpl]

'enumInitializerName' @ [506:63] ==> value-parameter enumInitializerName: JsName defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.Companion.translate[ValueParameterDescriptorImpl]

'ordinal' @ [506:84] ==> value-parameter ordinal: Int defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator.Companion.translate[ValueParameterDescriptorImpl]

'translate' @ [506:93] ==> private final fun translate(): Unit defined in org.jetbrains.kotlin.js.translate.declaration.ClassTranslator[SimpleFunctionDescriptorImpl]

