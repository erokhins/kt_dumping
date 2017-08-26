'environment' @ [29:9] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.common.checkKotlinPackageUsage[ValueParameterDescriptorImpl]

'configuration' @ [29:21] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'getBoolean' @ [29:35] ==> public open fun getBoolean(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'ALLOW_KOTLIN_PACKAGE' @ [29:67] ==> public final val ALLOW_KOTLIN_PACKAGE: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'environment' @ [32:28] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.common.checkKotlinPackageUsage[ValueParameterDescriptorImpl]

'configuration' @ [32:40] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'get' @ [32:54] ==> @NotNull public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(MessageCollector..MessageCollector?)>, @NotNull p1: MessageCollector): MessageCollector defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MessageCollector

'MESSAGE_COLLECTOR_KEY' @ [32:79] ==> public final val MESSAGE_COLLECTOR_KEY: (CompilerConfigurationKey<(MessageCollector..MessageCollector?)>..CompilerConfigurationKey<(MessageCollector..MessageCollector?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'MessageCollector' @ [32:102] ==> public companion object defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[FakeCallableDescriptorForObject]

'NONE' @ [32:119] ==> public final val NONE: MessageCollector defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector.Companion[DeserializedPropertyDescriptor]

'topLevel' @ [33:32] ==> @NotNull public open fun topLevel(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'identifier' @ [33:46] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'files' @ [34:5] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.cli.common.checkKotlinPackageUsage[ValueParameterDescriptorImpl]

'forEach' @ [34:11] ==> @HidesMembers public inline fun <T> Iterable<KtFile>.forEach(action: (KtFile) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'it' @ [35:13] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.cli.common.checkKotlinPackageUsage.<anonymous>[ValueParameterDescriptorImpl]

'packageFqName' @ [35:16] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'isSubpackageOf' @ [35:30] ==> public fun FqName.isSubpackageOf(packageName: FqName): Boolean defined in org.jetbrains.kotlin.name[DeserializedSimpleFunctionDescriptor]

'kotlinPackage' @ [35:45] ==> val kotlinPackage: FqName defined in org.jetbrains.kotlin.cli.common.checkKotlinPackageUsage[LocalVariableDescriptor]

'messageCollector' @ [36:13] ==> val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.common.checkKotlinPackageUsage[LocalVariableDescriptor]

'report' @ [36:30] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'ERROR' @ [36:61] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'psiElementToMessageLocation' @ [38:49] ==> @Nullable public open fun psiElementToMessageLocation(@Nullable element: PsiElement?): CompilerMessageLocation? defined in org.jetbrains.kotlin.cli.common.messages.MessageUtil[JavaMethodDescriptor]

'it' @ [38:77] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.cli.common.checkKotlinPackageUsage.<anonymous>[ValueParameterDescriptorImpl]

'packageDirective' @ [38:80] ==> public final val KtFile.packageDirective: KtPackageDirective?[MyPropertyDescriptor]

