// @ts-ignore
import * as project from "~root/package.json";

export const environment: any = {
    production: false,
    version: (project as any).version,
    name: (project as any).name,
    project: (project as any).project,
    ignorePermissions: false,
};